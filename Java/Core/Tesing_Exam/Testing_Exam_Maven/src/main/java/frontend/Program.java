package frontend;

import entity.Role;
import entity.User;
import utils.ScannerUtils;

public class Program {
	private static Function function = new Function();

	public static void menuAdmin() throws Exception {
		int choose;
		do {
			System.out.println("-------ADMIN-------");
			System.out.println("1 - Get list users");
			System.out.println("2 - Get user by ID");
			System.out.println("3 - Create User");
			System.out.println("4 - Delete user");
			System.out.println("5 - Logout");
			System.out.println("-------------------");
			System.out.print("Enter your choice: ");
			choose = ScannerUtils.inputInt();
			switch (choose) {
			case 1:
				System.out.println("-----List Users-----");
				function.getListUser();
				break;
			case 2:
				System.out.println("-----User by ID-----");
				function.getUserByID();
				break;
			case 3:
				System.out.println("-----Create User-----");
				function.createUser();
				break;
			case 4:
				System.out.println("-----Delete User-----");
				function.deleteUser();
				break;
			case 5:
				System.out.println("logout success");
				break;
			default:
				System.out.println("input wrong ! please input again (1-->5).");
				break;
			}
		} while (choose != 5);
	}

	public static void menuEmployee() throws Exception {
		int choose;
		do {
			System.out.println("-------EMPLOYEE-------");
			System.out.println("1 - Get list users");
			System.out.println("2 - Get user by ID");
			System.out.println("3 - Delete user");
			System.out.println("4 - Logout");
			System.out.println("-------------------");
			System.out.print("Enter your choice: ");
			choose = ScannerUtils.inputInt();
			switch (choose) {
			case 1:
				System.out.println("-----List Users-----");
				function.getListUser();
				break;
			case 2:
				System.out.println("-----User by ID-----");
				function.getUserByID();
				break;
			case 3:
				System.out.println("-----Delete User-----");
				function.deleteUser();
				break;
			case 4:
				System.out.println("logout success");
				break;
			default:
				System.out.println("input wrong ! please input again (1-->4).");
				break;
			}
		} while (choose != 4);
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
				User user = function.login();
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
		menu();
	}
}
