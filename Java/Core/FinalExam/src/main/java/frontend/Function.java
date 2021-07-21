package frontend;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

import backend.persentationlayer.UserController;
import entity.User;
import utils.ScannerUtils;

public class Function {
	private static UserController userController;

	public Function() {
		try {
			userController = new UserController();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public User login() throws Exception {
		while (true) {
			System.out.print("Input email: ");
			String email = ScannerUtils.inputEmail("email form: abcd@gmail.com OR abcd@vti.com");
			System.out.print("Input password: ");
			String password = ScannerUtils
					.inputPassword("Enter between 6 and 12 characters, with at least 1 uppercase character");
			try {
				return userController.login(email, password);
			} catch (Exception e) {
				System.err.println(e.getMessage() + "\n");
			}
		}
	}

	public void getAllManagerOfProject() throws Exception {
		userController.getManagerOfAllProject();
	}

	public void getManagerEmployeeOfProject() throws SQLException, Exception {
		System.out.print("Input projectID: ");
		int projectID = ScannerUtils.inputID();
		userController.getProjectByID(projectID);
	}

}
