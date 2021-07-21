package backend.datalayer;

import java.util.List;

import entity.Account;

public interface IAccountRepository {
	List<Account> getAllAccount();

	Account getAccountByID(short accountID);

	Account getAccountByUserName(String userName);

	void createAccount(Account account);

	boolean isAccountExistsByID(short accountID);

	boolean isAccountExistsByName(String userName);

	boolean isAccountExistsByEmail(String email);

	short getAccountIDByEmail(String email);

	String getFullName(short accountID);

	List<Account> getByCurrentMonth();

	List<Account> getByCurrentMonthOrderByCreateDate();

	List<Object[]> getCountAccountByMonthOfYearNow();

	void updateEmailUsernameAccountByID(String newEmail, String newUserName, short accountID);

	void deleteAccountByEmail(String email);

	List<Account> getAccountByPaging();

}
