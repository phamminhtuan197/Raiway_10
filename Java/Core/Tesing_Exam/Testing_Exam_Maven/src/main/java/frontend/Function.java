package frontend;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

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
	public static User login() throws Exception {
		while (true) {
			System.out.print("Input email: ");
			String email = ScannerUtils.inputEmail("email form: abcd@gmail.com");
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

	public static void getListUser() throws IOException, SQLException, ClassNotFoundException {

		ArrayList<User> users = userController.getListUser();

		for (User user : users) {
			System.out.println(user);
		}
	}

	public static void getUserByID() throws Exception {

		System.out.println("Input userID: ");
		int userID = ScannerUtils.inputID();

		User user = userController.getUserByID(userID);
		System.out.println(user);
	}

	public static void createUser() throws Exception {
		System.out.print("Input Full Name: ");
		String fullName = ScannerUtils
				.inputfullName("only contain letters, does not contain any special characters or numbers");
		System.out.print("Input email: ");
		String email = ScannerUtils.inputEmail("correct email format. (Example: nguyen.vannam@vti.com.vn)");
		System.out.print("Input Password: ");
		String password = ScannerUtils
				.inputPassword("Enter between 6 and 12 characters, with at least 1 uppercase character");
		System.out.print("Input Role: ");
		String role = ScannerUtils.inputString("Admin or Employee?: ");
		userController.createUser(fullName, email, password, role);
	}

	public static void deleteUser() throws Exception {
		System.out.print("Input userID: ");
		int userID = ScannerUtils.inputID();
		userController.deleteUser(userID);
	}
}
