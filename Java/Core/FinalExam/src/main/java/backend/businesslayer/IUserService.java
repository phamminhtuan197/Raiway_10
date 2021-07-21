package backend.businesslayer;

import java.sql.SQLException;

import entity.User;

public interface IUserService {
	void getProjectByID(int IdOfProject) throws SQLException, Exception;

	boolean isProjectExists(int projectID) throws SQLException;

	User login(String email, String password) throws SQLException, Exception;

	void getManagerOfAllProject() throws SQLException;

}
