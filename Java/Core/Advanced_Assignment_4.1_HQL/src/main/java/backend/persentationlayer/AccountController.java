package backend.persentationlayer;

import java.util.List;

import backend.businesslayer.AccountService;
import backend.businesslayer.IAccountService;
import entity.Account;

public class AccountController {
	private IAccountService accountService;

	public AccountController() {
		accountService = new AccountService();
	}

	public List<Account> getAllAccount() {
		return accountService.getAllAccount();
	}

	public Account getAccountByID(short accountID) {
		return accountService.getAccountByID(accountID);
	}

	public Account getAccountByUserName(String userName) {
		return accountService.getAccountByUserName(userName);
	}

	public void createAccount(Account account) {
		accountService.createAccount(account);

	}

	public boolean isAccountExistsByID(short accountID) {
		return accountService.isAccountExistsByID(accountID);
	}

	public boolean isAccountExistsByName(String userName) {
		return accountService.isAccountExistsByName(userName);
	}

	public boolean isAccountExistsByEmail(String email) {
		return accountService.isAccountExistsByEmail(email);
	}

	public short getAccountIDByEmail(String email) {
		return accountService.getAccountIDByEmail(email);
	}

	public String getFullName(short accountID) {
		return accountService.getFullName(accountID);
	}

	public List<Account> getByCurrentMonth() {
		return accountService.getByCurrentMonth();
	}

	public List<Account> getByCurrentMonthOrderByCreateDate() {
		return accountService.getByCurrentMonthOrderByCreateDate();
	}

	public List<Object[]> getCountAccountByMonthOfYearNow() {
		return accountService.getCountAccountByMonthOfYearNow();
	}

	public void updateEmailUsernameAccountByID(String newEmail, String newUserName, short accountID) {
		accountService.updateEmailUsernameAccountByID(newEmail, newUserName, accountID);
	}

	public void deleteAccountByEmail(String email) {
		accountService.deleteAccountByEmail(email);
	}

	public List<Account> getAccountByPaging() {
		return accountService.getAccountByPaging();
	}

}
