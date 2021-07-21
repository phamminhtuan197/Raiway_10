package backend.datalayer;

import java.sql.SQLException;

import entity.Project;
import entity.User;

public interface IUserRepository {
	Project getProjectByName(String projectName) throws SQLException, Exception;

	boolean isProjectExists(String projectName) throws SQLException;

	User login(String email, String password) throws SQLException, Exception;
	
	boolean isUserExists(String email) throws SQLException;

	void createUser(String fullName, String email, String password, String role) throws Exception;
}
