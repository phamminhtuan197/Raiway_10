package backend.datalayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import entity.Role;
import entity.User;
import utils.DatabaseProperties;
import utils.JdbcUtils;

public class UserRepository implements IUserRepository {

	private JdbcUtils jdbcUtils;
	private static Connection connection;
	private static Statement statement;
	private static ResultSet resultSet;
	private static PreparedStatement preparedStatement;
	private static DatabaseProperties databaseProperties;

	public UserRepository() throws FileNotFoundException, IOException, ClassNotFoundException, SQLException {
		jdbcUtils = new JdbcUtils();
		connection = jdbcUtils.connect();
		databaseProperties = new DatabaseProperties();
	}

	public ArrayList<User> getListUser() throws SQLException {
		ArrayList<User> users = new ArrayList<User>();

		String sql = "SELECT * FROM `User`;";
		statement = connection.createStatement();
		resultSet = statement.executeQuery(sql);
		while (resultSet.next()) {
			int userID = resultSet.getInt("UserID");
			String fullName = resultSet.getString("FullName");
			String email = resultSet.getString("Email");
			String password = resultSet.getString("Password");
			Role role = Role.valueOf(resultSet.getString("Role"));
			User user = new User(userID, fullName, email, password, role);
			users.add(user);
		}
		return users;
	}

	public User getUserByID(int userID) throws SQLException {
		String sql = "SELECT * FROM `User` WHERE userID = ?;";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setInt(1, userID);
		resultSet = preparedStatement.executeQuery();
		if (resultSet.next()) {
			int userId = resultSet.getInt("UserID");
			String fullName = resultSet.getString("FullName");
			String email = resultSet.getString("Email");
			String password = resultSet.getString("Password");
			Role role = Role.valueOf(resultSet.getString("Role").toUpperCase());

			User user = new User(userId, fullName, email, password, role);
			return user;
		} else {
			System.out.println(databaseProperties.getProperty("CANNOT_FIND_USER_BY_ID") + userID);
			return null;
		}
	}

	public void deleteUser(int userID) throws Exception {
		if (!isUserExists(userID)) {
			throw new Exception(databaseProperties.getProperty("CANNOT_FIND_USER_BY_ID") + userID);
		} else {
			String sql = "DELETE FROM `User` WHERE userID = ?;";
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, userID);
			preparedStatement.executeUpdate();
			System.out.println(databaseProperties.getProperty("DELETE_USER_COMPLETE"));
		}
	}

	public boolean isUserExists(int userID) throws SQLException {
		String sql = "SELECT * FROM `User` WHERE userID = ?;";
		preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setInt(1, userID);
		resultSet = preparedStatement.executeQuery();
		if (resultSet.next()) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isUserExists(String email) throws SQLException {
		String sql = "SELECT * FROM `User` WHERE email = ?;";
		preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setString(1, email);
		resultSet = preparedStatement.executeQuery();
		if (resultSet.next()) {
			return true;
		} else {
			return false;
		}
	}

	public User login(String email, String password) throws Exception {
		String sql = "SELECT * FROM `User` WHERE email = ? AND password = ?;";
		preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setString(1, email);
		preparedStatement.setString(2, password);
		resultSet = preparedStatement.executeQuery();
		if (resultSet.next()) {
			int userID = resultSet.getInt("userID");
			String fullName = resultSet.getString("FullName");
			Role role = Role.valueOf(resultSet.getString("Role").toUpperCase());

			User user = new User(userID, fullName, email, password, role);
			return user;
		} else {
			throw new Exception(databaseProperties.getProperty("ACCOUNT_OR_PASSWORD_WRONG"));
		}
	}

	public void createUser(String fullName, String email, String password, String role) throws Exception {
		if (isUserExists(email)) {
			throw new Exception(databaseProperties.getProperty("USER_IS_EXISTS"));
		} else {
			String sql = "INSERT INTO `User` (fullName, email, password, role) VALUES (?,?,?,?);";
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, fullName);
			preparedStatement.setString(2, email);
			preparedStatement.setString(3, password);
			preparedStatement.setString(4, role.toUpperCase());
			preparedStatement.executeUpdate();
			System.out.println(databaseProperties.getProperty("CREATE_USER_COMPLETE"));
		}
	}
}
