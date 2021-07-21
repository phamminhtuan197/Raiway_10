package backend.businesslayer;

import java.text.ParseException;
import java.util.List;

import backend.datalayer.AccountRepository;
import backend.datalayer.IAccountRepository;
import entity.Account;

public class AccountService implements IAccountService {

	private IAccountRepository accountRepository;

	public AccountService() {
		accountRepository = new AccountRepository();
	}

	public List<Account> getAllAccount() throws ParseException {
		return accountRepository.getAllAccount();
	}

	public Account getAccountByID(short accountID) throws ParseException {
		return accountRepository.getAccountByID(accountID);
	}

	public Account getAccountByUserName(String userName) throws ParseException {
		return accountRepository.getAccountByUserName(userName);
	}

	public void createAccount(Account account) {
		accountRepository.createAccount(account);
	}

	public boolean isAccountExistsByID(short accountID) throws ParseException {
		return accountRepository.isAccountExistsByID(accountID);
	}

	public boolean isAccountExistsByName(String userName) throws ParseException {
		return accountRepository.isAccountExistsByName(userName);
	}

	public boolean isAccountExistsByEmail(String email) throws ParseException {
		return accountRepository.isAccountExistsByEmail(email);
	}

	public short getAccountIDByEmail(String email) {
		return accountRepository.getAccountIDByEmail(email);
	}

	public String getFullName(short accountID) {
		return accountRepository.getFullName(accountID);
	}

	public List<Account> getByCurrentMonth() throws ParseException {
		return accountRepository.getByCurrentMonth();
	}

	public List<Account> getByCurrentMonthOrderByCreateDate() throws ParseException {
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

	public List<Account> getAccountByPaging() throws ParseException {
		return accountRepository.getAccountByPaging();
	}

}
