package frontend;

import entity.Role;
import entity.User;
import utils.ScannerUtils;

public class Program {
	private static Function function = new Function();

	private static void menu() throws Exception {
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
				if (user.getEmail() != null) {
					menuUser();
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

	private static void menuUser() throws Exception {
		int choose;
		do {
			System.out.println("-------------------------User---------------------------");
			System.out.println("1 - Get Manager and Employee of Project by Id of Project");
			System.out.println("2 - Get Manager of All Project");
			System.out.println("3 - Logout");
			System.out.println("--------------------------------------------------------");
			System.out.print("Input your choice: ");
			choose = ScannerUtils.inputInt();
			switch (choose) {
			case 1:
				System.out.println("--Get Manager and Employee of Project by Id of Project--");
				function.getManagerEmployeeOfProject();
				break;
			case 2:
				System.out.println("--------------Get Manager of All Project----------------");
				function.getAllManagerOfProject();
				break;
			case 3:
				System.out.println("logout success");
				break;
			default:
				System.out.println("input wrong ! please input again (1-->3).");
				break;
			}
		} while (choose != 3);
	}

	public static void main(String[] args) throws Exception {
		menu();
	}
}
