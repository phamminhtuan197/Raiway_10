package backend.businesslayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

import backend.datalayer.IUserRepository;
import backend.datalayer.UserRepository;
import entity.Project;
import entity.User;

public class UserService implements IUserService {
	private IUserRepository userRepository;
	
	public Project getProjectByName(String projectName) throws SQLException, Exception {
		return userRepository.getProjectByName(projectName);
	}

	public UserService() throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		userRepository = new UserRepository();
	}

	public boolean isProjectExists(String projectName) throws SQLException {
		return userRepository.isProjectExists(projectName);
	}

	public User login(String email, String password) throws SQLException, Exception {
		return userRepository.login(email, password);
	}

	public boolean isUserExists(String email) throws SQLException {
		return userRepository.isUserExists(email);
	}

	public void createUser(String fullName, String email, String password, String role) throws Exception {
		userRepository.createUser(fullName, email, password, role);
	}

}
