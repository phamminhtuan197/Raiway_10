package backend.businesslayer;

import java.util.List;

import backend.datalayer.AccountRepository;
import backend.datalayer.IAccountRepository;
import entity.Account;
import entity.dto.AccountDTO;

public class AccountService implements IAccountService {

	private IAccountRepository accountRepository;

	public AccountService() {
		accountRepository = new AccountRepository();
	}

	public List<Account> getAllAccount() {
		return accountRepository.getAllAccount();
	}

	public Account getAccountByID(short accountID) {
		return accountRepository.getAccountByID(accountID);
	}

	public Account getAccountByUserName(String userName) {
		return accountRepository.getAccountByUserName(userName);
	}

	public void createAccount(AccountDTO accountDTO) {
		Account entity = accountDTO.toEntity();
		accountRepository.createAccount(entity);
	}

	public boolean isAccountExistsByID(short accountID) {
		return accountRepository.isAccountExistsByID(accountID);
	}

	public boolean isAccountExistsByName(String userName) {
		return accountRepository.isAccountExistsByName(userName);
	}

	public boolean isAccountExistsByEmail(String email) {
		return accountRepository.isAccountExistsByEmail(email);
	}

	public short getAccountIDByEmail(String email) {
		return accountRepository.getAccountIDByEmail(email);
	}

	public String getFullName(short accountID) {
		return accountRepository.getFullName(accountID);
	}

	public List<Account> getByCurrentMonth() {
		return accountRepository.getByCurrentMonth();
	}

	public List<Account> getByCurrentMonthOrderByCreateDate() {
		return accountRepository.getByCurrentMonthOrderByCreateDate();
	}

	public List<Object[]> getCountAccountByMonthOfYearNow() {
		return accountRepository.getCountAccountByMonthOfYearNow();
	}

	public void updateEmailUsernameAccountByID(String newEmail, String newUserName, short accountID) {
		accountRepository.updateEmailUsernameAccountByID(newEmail, newUserName, accountID);
	}

	public void deleteAccountByEmail(String email) {
		accountRepository.deleteAccountByEmail(email);
	}

	public List<Account> getAccountByPaging() {
		return accountRepository.getAccountByPaging();
	}

}
