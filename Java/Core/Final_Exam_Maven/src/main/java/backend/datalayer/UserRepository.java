package backend.datalayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import entity.Project;
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

	public UserRepository() throws FileNotFoundException, IOException, ClassNotFoundException, SQLException {
		jdbcUtils = new JdbcUtils();
		connection = jdbcUtils.connect();
		databaseProperties = new DatabaseProperties();
	}

	public Project getProjectByName(String nameOfProject) throws Exception {
		String sql = "SELECT p.projectID, p.projectName, p.teamSize, m.*, u.fullName AS managerFullName, u.email AS managerEmail, u.`password` AS managerPassword, u.`role` AS managerRole, GROUP_CONCAT(e.employeeID) AS membersID, GROUP_CONCAT(s.fullName) AS membersName, GROUP_CONCAT(s.email) AS membersEmail, GROUP_CONCAT(s.`password`) AS membersPassword, GROUP_CONCAT(s.`role`) AS membersRole, GROUP_CONCAT(e.proSkill) AS membersProSkill FROM Project p INNER JOIN Manager m ON p.idManager = m.managerID LEFT JOIN `User` u ON m.managerID = u.userID INNER JOIN Employee e ON p.projectID = e.projectID LEFT JOIN `User` s ON e.employeeID = s.userID WHERE projectName = ?";
		preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setString(1, nameOfProject);
		resultSet = preparedStatement.executeQuery();
		if (resultSet.next()) {
			int projectID = resultSet.getInt("projectID");
			String projectName = resultSet.getString("projectName");
			int managerID = resultSet.getInt("managerID");
			int ExpInYear = resultSet.getInt("ExpInYear");
			String managerFullName = resultSet.getString("managerFullName");
			String managerEmail = resultSet.getString("managerEmail");
			String managerPassword = resultSet.getString("managerPassword");
			String managerRole = resultSet.getString("managerRole");
			String[] membersID = new String[3];
			for (int i = 0; i < 3; i++) {
				membersID[i] = resultSet.getString("membersID");
			}
			String[] membersName = new String[3];
			for (int i = 0; i < 3; i++) {
				membersName[i] = resultSet.getString("membersName");
			}
			String[] membersEmail = new String[3];
			for (int i = 0; i < 3; i++) {
				membersEmail[i] = resultSet.getString("membersEmail");
			}
			String[] memberPassword = new String[3];
			for (int i = 0; i < 3; i++) {
				memberPassword[i] = resultSet.getString("membersPassword");
			}
			String[] memberRole = new String[3];
			for (int i = 0; i < 3; i++) {
				memberRole[i] = resultSet.getString("membersRole");
			}
			String[] membersProSkill = new String[3];
			for (int i = 0; i < 3; i++) {
				membersProSkill[i] = resultSet.getString("membersProSkill");
			}
			Project project = new Project(projectID, projectName, managerID, ExpInYear, managerFullName, managerEmail,
					managerPassword, managerRole, membersID, membersName, membersEmail, memberPassword, memberRole,
					membersProSkill);
			return project;
		} else {
			System.out.println(databaseProperties.getProperty("CANNOT_FIND_PROJECT_BY_NAME") + nameOfProject);
			return null;
		}
	}

	public boolean isProjectExists(String projectName) throws SQLException {
		String sql = "SELECT * FROM Project WHERE projectName = ?;";
		preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setString(1, projectName);
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
}
