package com.vti.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.security.core.userdetails.UserDetailsService;

import com.vti.entity.Account;
import com.vti.form.AccountForm;
import com.vti.form.AccountFormForCreatingRegister;

public interface IAccountService extends UserDetailsService {
	public Page<Account> getAllAccount(Pageable pageable, String search);
	
	public Page<Account> getAllAccount(Pageable pageable);

	public List<Account> getAllAccount();

	public Account getAccountByID(short accountID);

	public Account getAccountByUserName(String userName);

	public void createAccount(AccountForm accountForm);

//	public List<Account> getByCurrentMonth();
//
//	public List<Account> getByCurrentMonthOrderByCreateDate();
//
//	public List<Object[]> getCountAccountByMonthOfYearNow();

	public void updateAccount(short accountID, AccountForm accountForm);

	public void deleteAccount(short accountID);
	
	public Account getAccountByEmail(String email);
	
	public boolean existsByUserName(String userName);
	
	public boolean existsByEmail(String email);
	
	public void createAccountRegister(AccountFormForCreatingRegister form);

	public void activeUser(String token);

}
