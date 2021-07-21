package backend.datalayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import backend.IAccount;
import database.Account;
import utils.DatabaseProperties;
import utils.JdbcUtils;

public class AccountRepository implements IAccount {
	private JdbcUtils jdbcUtils;
	private static Connection connection;
	private static Statement statement;
	private static ResultSet resultSet;
	private static PreparedStatement preparedStatement;
	private static DatabaseProperties databaseProperties;

	public AccountRepository() throws FileNotFoundException, IOException, ClassNotFoundException, SQLException {
		jdbcUtils = new JdbcUtils();
		connection = jdbcUtils.connect();
		databaseProperties = new DatabaseProperties();
	}

	public ArrayList<Account> getListAccount() throws SQLException, IOException, ClassNotFoundException {
		ArrayList<Account> accounts = new ArrayList<Account>();

		String sql = "SELECT * FROM `account`;";
		statement = connection.createStatement();
		resultSet = statement.executeQuery(sql);
		while (resultSet.next()) {
			Account account = new Account(resultSet.getInt("accountID"), resultSet.getString("email"),
					resultSet.getString("username"), resultSet.getString("fullname"), resultSet.getInt("departmentID"),
					resultSet.getInt("positionID"), resultSet.getString("createdate"), resultSet.getString("gender"));

			accounts.add(account);
		}
		return accounts;
	}

	public void createAccount(String email, String username, String fullname, int departmentID, int positionID,
			String createdate, String gender) throws Exception {
		if (isAccountExists(username)) {
			throw new Exception(databaseProperties.getProperty("ACCOUNT_IS_EXISTS"));
		} else {
			String createAccount = "INSERT INTO `account` (email, username, fullname, departmentID, positionID, createdate, gender) VALUES (?,?,?,?,?,?,?);";
			preparedStatement = connection.prepareStatement(createAccount);
			preparedStatement.setString(1, email);
			preparedStatement.setString(2, username);
			preparedStatement.setString(3, fullname);
			preparedStatement.setInt(4, departmentID);
			preparedStatement.setInt(5, positionID);
			preparedStatement.setString(6, createdate);
			preparedStatement.setString(7, gender);
			preparedStatement.executeUpdate();
			System.out.println(databaseProperties.getProperty("CREATE_ACCOUNT_COMPLETE"));
		}

	}

	public Account getAccountByID(int accountID) throws SQLException {
		String printAccountByID = "SELECT * FROM `account` INNER JOIN department USING(departmentID) WHERE accountID = ?;";
		preparedStatement = connection.prepareStatement(printAccountByID);
		preparedStatement.setInt(1, accountID);
		resultSet = preparedStatement.executeQuery();

		if (resultSet.next()) {
			Account account = new Account(resultSet.getInt("accountID"), resultSet.getString("email"),
					resultSet.getString("username"), resultSet.getString("fullname"), resultSet.getInt("departmentID"),
					resultSet.getInt("positionID"), resultSet.getString("createdate"), resultSet.getString("gender"),
					resultSet.getString("departmentname"));

			return account;
		} else {
			System.out.println(databaseProperties.getProperty("CANNOT_FIND_ACCOUNT_BY_ID") + accountID);
			return null;
		}

	}

	public boolean isAccountExists(String username) throws SQLException {
		String searchAccount = "SELECT * FROM `account` WHERE username = ?;";
		preparedStatement = connection.prepareStatement(searchAccount);
		preparedStatement.setString(1, username);
		resultSet = preparedStatement.executeQuery();

		if (resultSet.next()) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isAccountExists(int accountID) throws SQLException {
		String sql = "SELECT * FROM `account` WHERE accountID = ?";
		preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setInt(1, accountID);
		resultSet = preparedStatement.executeQuery();
		if (resultSet.next()) {
			return true;
		} else {
			return false;
		}
	}

	public void updateAccountByID(int accountID, String newUserName) throws SQLException, Exception {
		if (!isAccountExists(accountID)) {
			throw new Exception(databaseProperties.getProperty("CANNOT_FIND_ACCOUNT_BY_ID") + accountID);
		} else {
			if (isAccountExists(newUserName)) {
				throw new Exception(databaseProperties.getProperty("ACCOUNT_NAME_IS_EXISTS"));
			} else {
				String updateAccountUserName = "UPDATE `account` SET username = ? WHERE accountID = ?;";
				preparedStatement = connection.prepareStatement(updateAccountUserName);
				preparedStatement.setString(1, newUserName);
				preparedStatement.setInt(2, accountID);
				preparedStatement.executeUpdate();
				System.out.println(databaseProperties.getProperty("UPDATE_SUCCESS"));
			}
		}

	}

	public void deleteAccount(int accountID) throws Exception {
		if (!isAccountExists(accountID)) {
			throw new Exception(databaseProperties.getProperty("CANNOT_FIND_ACCOUNT_BY_ID") + accountID);
		} else {
			String deleteAccount = "DELETE FROM `account` WHERE accountID = ?;";
			preparedStatement = connection.prepareStatement(deleteAccount);
			preparedStatement.setInt(1, accountID);
			preparedStatement.executeUpdate();
			System.out.println(databaseProperties.getProperty("DELETE_ACCOUNT_COMPLETE"));
		}
	}
}
