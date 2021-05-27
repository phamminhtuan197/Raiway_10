package backend.datalayer;

import java.sql.SQLException;

import entity.ProjectAndUser;
import entity.User;

public interface IUserRepository {

	void getProjectByID(int IdOfProject) throws SQLException, Exception;

	boolean isProjectExists(int projectID) throws SQLException;

	User login(String email, String password) throws SQLException, Exception;

	void getManagerOfAllProject() throws SQLException;

}
