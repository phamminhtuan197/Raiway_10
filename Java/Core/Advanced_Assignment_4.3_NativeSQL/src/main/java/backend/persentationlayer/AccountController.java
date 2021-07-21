package backend.persentationlayer;

import java.text.ParseException;
import java.util.List;

import backend.businesslayer.AccountService;
import backend.businesslayer.IAccountService;
import entity.Account;

public class AccountController {
	private IAccountService accountService;

	public AccountController() {
		accountService = new AccountService();
	}

	public List<Account> getAllAccount() throws ParseException {
		return accountService.getAllAccount();
	}

	public Account getAccountByID(short accountID) throws ParseException {
		return accountService.getAccountByID(accountID);
	}

	public Account getAccountByUserName(String userName) throws ParseException {
		return accountService.getAccountByUserName(userName);
	}

	public void createAccount(Account account) {
		accountService.createAccount(account);

	}

	public boolean isAccountExistsByID(short accountID) throws ParseException {
		return accountService.isAccountExistsByID(accountID);
	}

	public boolean isAccountExistsByName(String userName) throws ParseException {
		return accountService.isAccountExistsByName(userName);
	}

	public boolean isAccountExistsByEmail(String email) throws ParseException {
		return accountService.isAccountExistsByEmail(email);
	}

	public short getAccountIDByEmail(String email) {
		return accountService.getAccountIDByEmail(email);
	}

	public String getFullName(short accountID) {
		return accountService.getFullName(accountID);
	}

	public List<Account> getByCurrentMonth() throws ParseException {
		return accountService.getByCurrentMonth();
	}

	public List<Account> getByCurrentMonthOrderByCreateDate() throws ParseException {
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

	public List<Account> getAccountByPaging() throws ParseException {
		return accountService.getAccountByPaging();
	}

}
