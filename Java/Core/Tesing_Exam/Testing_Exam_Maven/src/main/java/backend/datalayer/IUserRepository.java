package backend.datalayer;

import java.sql.SQLException;
import java.util.ArrayList;

import entity.Role;
import entity.User;

public interface IUserRepository {
	ArrayList<User> getListUser() throws SQLException;

	User getUserByID(int userID) throws SQLException;

	void deleteUser(int userID) throws Exception;

	boolean isUserExists(int userID) throws SQLException;

	boolean isUserExists(String email) throws SQLException;

	User login(String email, String password) throws SQLException, Exception;
	
	void createUser(String fullName, String email, String password, String role) throws SQLException, Exception;
}
