package backend.persentationlayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import backend.businesslayer.UserService;
import entity.User;

public class UserController {
	private UserService userService;

	public UserController() throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		userService = new UserService();
	}

	public ArrayList<User> getListUser() throws SQLException, ClassNotFoundException {

		return userService.getListUser();
	}

	public User getUserByID(int userID) throws SQLException, ClassNotFoundException {
		return userService.getUserByID(userID);
	}

	public void deleteUser(int userID) throws Exception {
		userService.deleteUser(userID);
	}

	public boolean isUserExits(int userID) throws SQLException, ClassNotFoundException {
		return userService.isUserExists(userID);
	}

	public boolean isUserExists(String email) throws SQLException {
		return userService.isUserExists(email);
	}

	public User login(String email, String password) throws Exception {
		return userService.login(email, password);
	}

	public void createUser(String fullName, String email, String password, String role) throws Exception {
		userService.createUser(fullName, email, password, role);
	}
}
