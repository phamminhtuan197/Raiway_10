package backend.businesslayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

import backend.datalayer.IUserRepository;
import backend.datalayer.UserRepository;
import entity.ProjectAndUser;
import entity.User;

public class UserService implements IUserService {

	private IUserRepository userRepository;

	public UserService() throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		userRepository = new UserRepository();
	}

	public void getProjectByID(int IdOfProject) throws SQLException, Exception {
		userRepository.getProjectByID(IdOfProject);
	}

	public boolean isProjectExists(int projectID) throws SQLException {
		return userRepository.isProjectExists(projectID);
	}

	public User login(String email, String password) throws SQLException, Exception {
		return userRepository.login(email, password);
	}

	public void getManagerOfAllProject() throws SQLException {
		userRepository.getManagerOfAllProject();
	}

}
