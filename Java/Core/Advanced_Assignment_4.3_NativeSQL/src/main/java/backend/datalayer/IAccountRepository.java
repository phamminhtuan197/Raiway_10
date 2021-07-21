package backend.datalayer;

import java.text.ParseException;
import java.util.List;

import entity.Account;

public interface IAccountRepository {
	List<Account> getAllAccount() throws ParseException;

	Account getAccountByID(short accountID) throws ParseException;

	Account getAccountByUserName(String userName) throws ParseException;

	void createAccount(Account account);

	boolean isAccountExistsByID(short accountID) throws ParseException;

	boolean isAccountExistsByName(String userName) throws ParseException;

	boolean isAccountExistsByEmail(String email) throws ParseException;

	short getAccountIDByEmail(String email);

	String getFullName(short accountID);

	List<Account> getByCurrentMonth() throws ParseException;

	List<Account> getByCurrentMonthOrderByCreateDate() throws ParseException;

	List<Object[]> getCountAccountByMonthOfYearNow();

	void updateEmailUsernameAccountByID(String newEmail, String newUserName, short accountID);

	void deleteAccountByEmail(String email);

	List<Account> getAccountByPaging() throws ParseException;

}
