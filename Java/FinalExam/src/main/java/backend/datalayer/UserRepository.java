package backend.datalayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import entity.ProjectAndUser;
import entity.Role;
import entity.User;
import utils.DatabaseProperties;
import utils.JdbcUtils;

public class UserRepository implements IUserRepository {

	private JdbcUtils jdbcUtils;
	private static Connection connection;
	private static ResultSet resultSet;
	private static PreparedStatement preparedStatement;
	private static DatabaseProperties databaseProperties;
	private static Statement statement;

	public UserRepository() throws FileNotFoundException, IOException, ClassNotFoundException, SQLException {
		jdbcUtils = new JdbcUtils();
		connection = jdbcUtils.connect();
		databaseProperties = new DatabaseProperties();
	}

	public void getProjectByID(int IdOfProject) throws SQLException, Exception {
		String sql = "SELECT pau.projectId, u.`fullName`, pau.`Role` FROM `ProjectAndUser` pau JOIN	`User` u ON u.id = pau.userId WHERE projectId = ?;";
		preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setInt(1, IdOfProject);
		resultSet = preparedStatement.executeQuery();
		while (resultSet.next()) {
			System.out.println("ProjectID = " + resultSet.getInt("projectId") + ", fullName = "
					+ resultSet.getString("fullName") + ", role = " + resultSet.getString("Role"));
		}
	}

	public boolean isProjectExists(int projectID) throws SQLException {
		String sql = "SELECT * FROM Project WHERE projectId = ?;";
		preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setInt(1, projectID);
		resultSet = preparedStatement.executeQuery();
		if (resultSet.next()) {
			return true;
		} else {
			return false;
		}
	}

	public User login(String email, String password) throws SQLException, Exception {
		String sql = "SELECT * FROM `User` WHERE `email` = ? AND `password` = ?;";
		preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setString(1, email);
		preparedStatement.setString(2, password);
		resultSet = preparedStatement.executeQuery();
		if (resultSet.next()) {
			int userID = resultSet.getInt("id");
			String fullName = resultSet.getString("fullName");

			User user = new User(userID, fullName, email, password);
			return user;
		} else {
			throw new Exception(databaseProperties.getProperty("ACCOUNT_OR_PASSWORD_WRONG"));
		}
	}

	public void getManagerOfAllProject() throws SQLException {
		String sql = "SELECT pau.projectId, u.`fullName`, pau.`Role`"
				+ " FROM `ProjectAndUser` pau INNER JOIN `User` u ON u.id = pau.userId" + " WHERE `Role` = 'MANAGER';";
		statement = connection.createStatement();
		resultSet = statement.executeQuery(sql);
		while (resultSet.next()) {
			System.out.println("ProjectID = " + resultSet.getInt("projectId") + ", fullName = "
					+ resultSet.getString("fullName") + ", role = " + resultSet.getString("Role"));
		}
	}

}
