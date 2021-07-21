package backend.businesslayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import backend.datalayer.UserRepository;
import entity.User;

public class UserService implements IUserService {

	private static UserRepository userRepository;

	public UserService() throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		userRepository = new UserRepository();
	}

	public ArrayList<User> getListUser() throws SQLException {
		return userRepository.getListUser();
	}

	public User getUserByID(int userID) throws SQLException {
		return userRepository.getUserByID(userID);
	}

	public void deleteUser(int userID) throws Exception {
		userRepository.deleteUser(userID);
	}

	public boolean isUserExists(int userID) throws SQLException {
		return userRepository.isUserExists(userID);
	}

	public boolean isUserExists(String email) throws SQLException {
		return userRepository.isUserExists(email);
	}

	public User login(String email, String password) throws SQLException, Exception {
		return userRepository.login(email, password);
	}

	public void createUser(String fullName, String email, String password, String role) throws Exception {
		userRepository.createUser(fullName, email, password, role);
	}

}
