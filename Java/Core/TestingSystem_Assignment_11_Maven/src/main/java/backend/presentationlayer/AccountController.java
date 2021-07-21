package backend.presentationlayer;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import backend.IAccount;
import backend.businesslayer.AccountService;
import database.Account;

public class AccountController implements IAccount {

	private static AccountService accountService;

	public AccountController() throws ClassNotFoundException, IOException, SQLException {
		accountService = new AccountService();
	}

	public ArrayList<Account> getListAccount() throws SQLException, IOException, ClassNotFoundException {
		return accountService.getListAccount();
	}

	public void createAccount(String email, String username, String fullname, int departmentID, int positionID,
			String createdate, String gender) throws Exception {
		accountService.createAccount(email, username, fullname, departmentID, positionID, createdate, gender);
	}

	public Account getAccountByID(int accountID) throws SQLException {
		return accountService.getAccountByID(accountID);
	}

	public boolean isAccountExists(String username) throws SQLException {
		return accountService.isAccountExists(username);
	}

	public boolean isAccountExists(int accountID) throws SQLException {
		return accountService.isAccountExists(accountID);
	}

	public void updateAccountByID(int accountID, String newUserName) throws SQLException, Exception {
		accountService.updateAccountByID(accountID, newUserName);
	}

	public void deleteAccount(int accountID) throws Exception {
		accountService.deleteAccount(accountID);
	}

}
