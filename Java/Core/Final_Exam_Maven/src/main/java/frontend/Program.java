package frontend;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

import backend.persentationlayer.UserController;
import entity.Project;
import entity.Role;
import entity.User;
import utils.ScannerUtils;

public class Program {
	private static UserController userController;

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

	public static void getProjectByName() throws Exception {

		System.out.print("Input project name: ");
		String projectName = ScannerUtils.inputName();

		Project project = userController.getProjectByName(projectName);
		System.out.println(project);
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
		String role = ScannerUtils.inputString("Admin or Employee?: ").toUpperCase();
		userController.createUser(fullName, email, password, role);
	}

	public static void menuAdmin() throws Exception {
		int choose;
		do {
			System.out.println("---------ADMIN---------");
			System.out.println("1 - Get project by name");
			System.out.println("2 - Create User");
			System.out.println("3 - Logout");
			System.out.println("-----------------------");
			System.out.print("Enter your choice: ");
			choose = ScannerUtils.inputInt();
			switch (choose) {
			case 1:
				System.out.println("-----Get project by name-----");
				getProjectByName();
				break;
			case 2:
				System.out.println("-----Create User-----");
				createUser();
				break;
			case 3:
				System.out.println("logout success");
				break;
			default:
				System.out.println("input wrong ! please input again (1-->5).");
				break;
			}
		} while (choose != 3);
	}

	public static void menuEmployee() throws Exception {
		int choose;
		do {
			System.out.println("-------EMPLOYEE-------");
			System.out.println("1 - Get project by name");
			System.out.println("2 - Logout");
			System.out.println("-------------------");
			System.out.print("Enter your choice: ");
			choose = ScannerUtils.inputInt();
			switch (choose) {
			case 1:
				System.out.println("-----Get project by name-----");
				getProjectByName();
				break;
			case 2:
				System.out.println("logout success");
				break;
			default:
				System.out.println("input wrong ! please input again (1-->4).");
				break;
			}
		} while (choose != 2);
	}

	public static void menu() throws Exception {
		int choose;
		do {
			System.out.println("-----MENU-----");
			System.out.println("1 - Login");
			System.out.println("2 - Exit");
			System.out.println("--------------");
			System.out.print("Input your choice: ");
			choose = ScannerUtils.inputInt("just 1 or 2");
			switch (choose) {
			case 1:
				System.out.println("-----LOGIN-----");
				User user = login();
				System.out.println("Login Successfull!");
				if (user.getRole() == Role.ADMIN) {
					menuAdmin();
				} else {
					menuEmployee();
				}
				break;
			case 2:
				System.out.println("-----End program-----");
				break;
			default:
				System.out.println("input wrong ! please input again (1 or 2).");
				break;
			}

		} while (choose != 2);
	}

	public static void main(String[] args) throws Exception {
		
//		menu();
	}
}
