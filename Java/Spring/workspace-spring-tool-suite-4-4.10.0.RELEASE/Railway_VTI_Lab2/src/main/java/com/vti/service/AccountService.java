package com.vti.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.vti.entity.Account;
import com.vti.entity.AccountStatus;
import com.vti.entity.Department;
import com.vti.entity.Position;
import com.vti.entity.RegistrationUserToken;
import com.vti.event.OnSendRegistrationUserConfirmViaEmailEvent;
import com.vti.form.AccountForm;
import com.vti.form.AccountFormForCreatingRegister;
import com.vti.repository.IAccountRepository;
import com.vti.repository.IDepartmentRepository;
import com.vti.repository.IPositionRepository;
import com.vti.repository.IRegistrationUserTokenRepository;
import com.vti.specification.AccountSpecification;

@Service
public class AccountService implements IAccountService {
	@Autowired
	private IAccountRepository accountRepository;
	@Autowired
	private IDepartmentRepository departmentRepository;
	@Autowired
	private IPositionRepository positionRepository;

	@Autowired
	private ApplicationEventPublisher eventPublisher;

	@Autowired
	private IRegistrationUserTokenRepository registrationUserTokenRepository;

//	Dùng để mã hóa Password
	@Autowired
	private PasswordEncoder passwordEncoder;

	@Override
	public List<Account> getAllAccount() {
		// TODO Auto-generated method stub
		return accountRepository.findAll();
	}

	@Override
	public Account getAccountByID(short accountID) {
		// TODO Auto-generated method stub
		return accountRepository.findById(accountID).get();
	}

	@Override
	public Account getAccountByUserName(String userName) {
		// TODO Auto-generated method stub
		return accountRepository.findByUserName(userName);
	}

	@Override
	public void createAccount(AccountForm accountForm) {
		// TODO Auto-generated method stub
		Account account = new Account();
		Department department = departmentRepository.getById(accountForm.getDepartmentID());
		Position position = positionRepository.getById(accountForm.getPositionID());
		account.setEmail(accountForm.getEmail());
		account.setUserName(accountForm.getUserName());
		account.setFullName(accountForm.getFullName());
		account.setDepartment(department);
		account.setPosition(position);
		accountRepository.save(account);
	}

	@Override
	public void updateAccount(short accountID, AccountForm accountForm) {
		// TODO Auto-generated method stub
		Account account = accountRepository.getById(accountID);
		Department department = departmentRepository.getById(accountForm.getDepartmentID());
		Position position = positionRepository.getById(accountForm.getPositionID());
		account.setEmail(accountForm.getEmail());
		account.setUserName(accountForm.getUserName());
		account.setFullName(accountForm.getFullName());
		account.setDepartment(department);
		account.setPosition(position);
		accountRepository.save(account);
	}

	@Override
	public void deleteAccount(short accountID) {
		// TODO Auto-generated method stub
		accountRepository.deleteById(accountID);
	}

	@SuppressWarnings("deprecation")
	@Override
	public Page<Account> getAllAccount(Pageable pageable, String search) {
		// TODO Auto-generated method stub
		Specification<Account> where = null;
		if (!StringUtils.isEmpty(search)) {
			AccountSpecification fullNameSpecification = new AccountSpecification("fullName", "LIKE", search);
			AccountSpecification emaiSpecification = new AccountSpecification("email", "LIKE", search);
			AccountSpecification departmentSpecification = new AccountSpecification("department.departmentName", "LIKE",
					search);
			AccountSpecification userNameSpecification = new AccountSpecification("userName", "LIKE", search);
//			AccountSpecification positionSpecification = new AccountSpecification("position.positionName.toString()", "LIKE", search);
			where = Specification.where(fullNameSpecification).or(emaiSpecification).or(departmentSpecification)
					.or(userNameSpecification);
		}
		return accountRepository.findAll(where, pageable);
	}

	@Override
	public Page<Account> getAllAccount(Pageable pageable) {
		// TODO Auto-generated method stub
		return accountRepository.findAll(pageable);
	}

	@Override
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		Account account = accountRepository.findByUserName(userName);
		if (account == null) {
			throw new UsernameNotFoundException(userName);
		}

		return new User(account.getUserName(), account.getPassword(), AuthorityUtils.createAuthorityList("user"));
	}

	@Override
	public Account getAccountByEmail(String email) {

		return accountRepository.findByEmail(email);
	}

	@Override
	public boolean existsByUserName(String userName) {
		// TODO Auto-generated method stub
		return accountRepository.existsByUserName(userName);
	}

	@Override
	public boolean existsByEmail(String email) {
		// TODO Auto-generated method stub
		return accountRepository.existsByEmail(email);
	}

	@Override
	public void createAccountRegister(AccountFormForCreatingRegister form) {
		Account account = new Account();
		Department department = departmentRepository.getById(form.getDepartmentID());
		Position position = positionRepository.getById(form.getPositionID());
		account.setEmail(form.getEmail());
		account.setUserName(form.getUserName());
		account.setFullName(form.getFullName());
		account.setDepartment(department);
		account.setPosition(position);
		account.setPassword(passwordEncoder.encode(form.getPassword()));
		accountRepository.save(account);

		// create new user registration token
		createNewRegistrationUserToken(account);

		// send email to confirm
		sendConfirmUserRegistrationViaEmail(account.getEmail());
	}

	private void createNewRegistrationUserToken(Account account) {

		// create new token for confirm Registration
		final String newToken = UUID.randomUUID().toString();
		RegistrationUserToken token = new RegistrationUserToken(newToken, account);

		registrationUserTokenRepository.save(token);
	}

	private void sendConfirmUserRegistrationViaEmail(String email) {
		eventPublisher.publishEvent(new OnSendRegistrationUserConfirmViaEmailEvent(email));
	}

	@Override
	public void activeUser(String token) {
		RegistrationUserToken registrationUserToken = registrationUserTokenRepository.findByToken(token);

		Account account = registrationUserToken.getAccount();
		account.setStatus(AccountStatus.ACTIVE);

		accountRepository.save(account);

		// remove Registration User Token
		registrationUserTokenRepository.deleteById(registrationUserToken.getId());

	}
}
