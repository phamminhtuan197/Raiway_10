package backend;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import database.Account;

public interface IAccount {
	ArrayList<Account> getListAccount() throws SQLException, IOException, ClassNotFoundException;

	void createAccount(String email, String username, String fullname, int departmentID, int positionID,
			String createdate, String gender) throws Exception;

	Account getAccountByID(int accountID) throws SQLException;

	boolean isAccountExists(String username) throws SQLException;

	boolean isAccountExists(int accountID) throws SQLException;

	void updateAccountByID(int accountID, String newUserName) throws SQLException, Exception;

	void deleteAccount(int accountID) throws Exception;
}
