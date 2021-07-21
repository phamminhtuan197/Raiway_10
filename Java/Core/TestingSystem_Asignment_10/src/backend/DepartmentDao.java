package backend;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import entity.Account;
import entity.Department;

public class DepartmentDao {

	private static Connection connection;
	private static Statement statement;
	private static ResultSet resultSet;
	private static PreparedStatement preparedStatement;
	private static Scanner scanner = new Scanner(System.in);

	public static Connection connect() throws ClassNotFoundException, SQLException {

		String url = "jdbc:mysql://localhost:3306/testing_system?autoReconnect=true&useSSL=false&characterEncoding=latin1";
		String username = "root";
		String password = "root";

		Class.forName("com.mysql.cj.jdbc.Driver");

		connection = DriverManager.getConnection(url, username, password);
		return connection;
	}

	public static ArrayList<Department> getDepartment() throws SQLException, ClassNotFoundException {
		connect();
		ArrayList<Department> departments = new ArrayList<Department>();

		statement = connection.createStatement();
		String printDepartment = "SELECT * FROM department ORDER BY departmentID;";
		resultSet = statement.executeQuery(printDepartment);

		while (resultSet.next()) {
			Department department = new Department(resultSet.getInt("departmentID"),
					resultSet.getString("departmentname"));
			departments.add(department);
		}

		return departments;
	}

	public static Department getDepartmentid5() throws ClassNotFoundException, SQLException {
		connect();

		statement = connection.createStatement();
		String printDepartmentID5 = "SELECT * FROM department WHERE departmentID = 5;";
		resultSet = statement.executeQuery(printDepartmentID5);

		if (resultSet.next()) {
			Department departmentid5 = new Department(resultSet.getInt("departmentID"),
					resultSet.getString("departmentname"));
			return departmentid5;
		} else {
			System.out.println("Cannot find department which has id = 5");
			return null;
		}
	}

	public static Department getDepartmentByID(int departmentID) throws ClassNotFoundException, SQLException {
		connect();

		String printDepartmentByID = "SELECT * FROM department WHERE departmentID = ?;";
		preparedStatement = connection.prepareStatement(printDepartmentByID);
		preparedStatement.setInt(1, departmentID);
		resultSet = preparedStatement.executeQuery();

		if (resultSet.next()) {
			Department department = new Department(resultSet.getInt("departmentID"),
					resultSet.getString("departmentname"));
			return department;
		} else {
			System.out.println("Cannot find department which has id = " + departmentID);
			return null;
		}
	}

	public static boolean isDepartmentExists(String departmentname) throws ClassNotFoundException, SQLException {
		connect();

		String searchDepartment = "SELECT * FROM department WHERE departmentname = ?;";
		preparedStatement = connection.prepareStatement(searchDepartment);
		preparedStatement.setString(1, departmentname);
		resultSet = preparedStatement.executeQuery();

		if (resultSet.next()) {
			return true;
		} else {
			return false;
		}
	}

	public static void createDepartment(String departmentname) throws ClassNotFoundException, SQLException, Exception {
		connect();
		if (isDepartmentExists(departmentname)) {
			throw new Exception("Department Name is Exists!");
		} else {
			String createDepartment = "INSERT INTO department (departmentname) VALUES (?);";
			preparedStatement = connection.prepareStatement(createDepartment);
			preparedStatement.setString(1, departmentname);
			preparedStatement.executeUpdate();
			System.out.println("Create Department complete");
		}
	}

	public static boolean isDepartmentExists(int id) throws SQLException, ClassNotFoundException {
		connect();

		String sql = "SELECT * FROM Department WHERE departmentID = ?";
		preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setInt(1, id);
		resultSet = preparedStatement.executeQuery();
		if (resultSet.next()) {
			return true;
		} else {
			return false;
		}
	}

	public static void updateDepartmentName(int departmentID, String newDepartmentName)
			throws ClassNotFoundException, SQLException, Exception {
		connect();

		if (!isDepartmentExists(departmentID)) {
			throw new Exception("Cannot find department which has id = " + departmentID);
		} else {
			if (isDepartmentExists(newDepartmentName)) {
				throw new Exception("Department Name is Exists!");
			} else {
				String updateDepartmentName = "UPDATE department SET departmentname = ? WHERE departmentID = ?;";
				preparedStatement = connection.prepareStatement(updateDepartmentName);
				preparedStatement.setString(1, newDepartmentName);
				preparedStatement.setInt(2, departmentID);
				preparedStatement.executeUpdate();
				System.out.println("Update success");
			}
		}
	}

	public static void deleteDepartmentByID(int departmentID) throws Exception {
		connect();

		if (!isDepartmentExists(departmentID)) {
			throw new Exception("Cannot find department which has id = " + departmentID);
		} else {
			String deleteDepartment = "DELETE FROM department WHERE departmentID = ?;";
			preparedStatement = connection.prepareStatement(deleteDepartment);
			preparedStatement.setInt(1, departmentID);
			preparedStatement.executeUpdate();
			System.out.println("Delete Department complete");
		}
	}

	public static ArrayList<Account> getAccount() throws SQLException, ClassNotFoundException {
		connect();

		ArrayList<Account> accounts = new ArrayList<Account>();

		statement = connection.createStatement();
		String printAccount = "SELECT * FROM `account` INNER JOIN department USING(departmentID) ORDER BY accountID;";
		resultSet = statement.executeQuery(printAccount);

		while (resultSet.next()) {

			Account account = new Account(resultSet.getInt("accountID"), resultSet.getString("email"),
					resultSet.getString("username"), resultSet.getString("fullname"), resultSet.getInt("departmentID"),
					resultSet.getInt("positionID"), resultSet.getString("createdate"), resultSet.getString("gender"),
					resultSet.getString("departmentname"));

			accounts.add(account);
		}

		return accounts;
	}

	public static Account getAccountid5() throws ClassNotFoundException, SQLException {
		connect();

		statement = connection.createStatement();
		String printAccountID5 = "SELECT * FROM `account` WHERE accountID = 5;";
		resultSet = statement.executeQuery(printAccountID5);

		if (resultSet.next()) {
			Account accountid5 = new Account(resultSet.getInt("accountID"), resultSet.getString("email"),
					resultSet.getString("username"), resultSet.getString("fullname"), resultSet.getInt("departmentID"),
					resultSet.getInt("positionID"), resultSet.getString("createdate"), resultSet.getString("gender"));

			return accountid5;
		} else {
			System.out.println("Cannot find account which has id = 5");
			return null;
		}
	}

	public static Account getAccountByID(int accountID) throws ClassNotFoundException, SQLException {
		connect();

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
			System.out.println("Cannot find account which has id = " + accountID);
			return null;
		}
	}

	public static boolean isAccountExists(String username) throws ClassNotFoundException, SQLException {
		connect();

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

	public static void createAccount(String email, String username, String fullname, int departmentID, int positionID,
			String createdate, String gender) throws ClassNotFoundException, SQLException, Exception {
		connect();
		if (isAccountExists(username)) {
			throw new Exception("Account is Exists!");
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
			System.out.println("Create Account complete");
		}
	}

	public static boolean isAccountExists(int accountID) throws SQLException, ClassNotFoundException {
		connect();

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

	public static void updateAccountUserName(int accountID, String newUserName)
			throws ClassNotFoundException, SQLException, Exception {
		connect();

		if (!isAccountExists(accountID)) {
			throw new Exception("Cannot find account which has id = " + accountID);
		} else {
			if (isAccountExists(newUserName)) {
				throw new Exception("Account Name is Exists!");
			} else {
				String updateAccountUserName = "UPDATE `account` SET username = ? WHERE accountID = ?;";
				preparedStatement = connection.prepareStatement(updateAccountUserName);
				preparedStatement.setString(1, newUserName);
				preparedStatement.setInt(2, accountID);
				preparedStatement.executeUpdate();
				System.out.println("Update success");
			}
		}
	}

	public static void deleteAccountByID(int accountID) throws Exception {
		connect();

		if (!isAccountExists(accountID)) {
			throw new Exception("Cannot find account which has id = " + accountID);
		} else {
			String deleteAccount = "DELETE FROM `account` WHERE accountID = ?;";
			preparedStatement = connection.prepareStatement(deleteAccount);
			preparedStatement.setInt(1, accountID);
			preparedStatement.executeUpdate();
			System.out.println("Delete Account complete");
		}
	}

}
