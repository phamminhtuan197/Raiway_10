package backend.persentationlayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

import backend.businesslayer.IUserService;
import backend.businesslayer.UserService;
import entity.Project;
import entity.User;

public class UserController {
	private IUserService userService;

	public UserController() throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		userService = new UserService();
	}

	public Project getProjectByName(String projectName) throws SQLException, Exception {
		return userService.getProjectByName(projectName);
	}

	public boolean isProjectExists(String projectName) throws SQLException {
		return userService.isProjectExists(projectName);
	}

	public User login(String email, String password) throws SQLException, Exception {
		return userService.login(email, password);
	}

	public boolean isUserExists(String email) throws SQLException {
		return userService.isUserExists(email);
	}

	public void createUser(String fullName, String email, String password, String role) throws Exception {
		userService.createUser(fullName, email, password, role);
	}
}
