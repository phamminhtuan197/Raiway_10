package backend.persentationlayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

import backend.businesslayer.IUserService;
import backend.businesslayer.UserService;
import entity.ProjectAndUser;
import entity.User;

public class UserController {
	private IUserService userService;

	public UserController() throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		userService = new UserService();
	}

	public void getProjectByID(int IdOfProject) throws SQLException, Exception {
		userService.getProjectByID(IdOfProject);
	}

	public boolean isProjectExists(int projectID) throws SQLException {
		return userService.isProjectExists(projectID);
	}

	public User login(String email, String password) throws SQLException, Exception {
		return userService.login(email, password);
	}

	public void getManagerOfAllProject() throws SQLException {
		userService.getManagerOfAllProject();
	}
}
