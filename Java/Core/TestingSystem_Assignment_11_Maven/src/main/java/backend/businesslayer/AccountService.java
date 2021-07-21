package backend.businesslayer;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import backend.IAccount;
import backend.datalayer.AccountRepository;
import database.Account;

public class AccountService implements IAccount {
	private static AccountRepository accountRepository;

	public AccountService() throws IOException, ClassNotFoundException, SQLException {
		accountRepository = new AccountRepository();
	}

	public ArrayList<Account> getListAccount() throws SQLException, IOException, ClassNotFoundException {

		return accountRepository.getListAccount();
	}

	public void createAccount(String email, String username, String fullname, int departmentID, int positionID,
			String createdate, String gender) throws Exception {
		accountRepository.createAccount(email, username, fullname, departmentID, positionID, createdate, gender);
	}

	public Account getAccountByID(int accountID) throws SQLException {
		return accountRepository.getAccountByID(accountID);
	}

	public boolean isAccountExists(String username) throws SQLException {
		return accountRepository.isAccountExists(username);
	}

	public boolean isAccountExists(int accountID) throws SQLException {
		return accountRepository.isAccountExists(accountID);
	}

	public void updateAccountByID(int accountID, String newUserName) throws SQLException, Exception {
		accountRepository.updateAccountByID(accountID, newUserName);
	}

	public void deleteAccount(int accountID) throws Exception {
		accountRepository.deleteAccount(accountID);
	}

}
