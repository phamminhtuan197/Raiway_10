package frontend;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import backend.presentationlayer.AccountController;
import database.Account;
import utils.ScannerUtils;

public class ProgramAccount {
	private static AccountController accountController;

	public static void menuAccount() {
		System.out.println("---------MENU----------");
		System.out.println("1. Get list account");
		System.out.println("2. Create account");
		System.out.println("3. Get account by ID");
		System.out.println("4. Update account by ID");
		System.out.println("5. Delete account by ID");
		System.out.println("6. Exit");
		System.out.println("-----------------------");
	}

	public static void getListAccount() throws IOException, SQLException, ClassNotFoundException {

		ArrayList<Account> accounts = accountController.getListAccount();

		for (Account account : accounts) {
			System.out.println(account);
		}
	}

	public static void createAccount() throws Exception {

		System.out.println("Input email: ");
		String email = ScannerUtils.inputString("Please input email as String!");

		System.out.println("Input username: ");
		String username = ScannerUtils.inputString("Please input username as String!");

		System.out.println("Input full name: ");
		String fullname = ScannerUtils.inputString("Please input full name as String!");

		System.out.println("Input departmentID:");
		int departmentID = ScannerUtils.inputId();
		System.out.println("Input positionID:");
		int positionID = ScannerUtils.inputId();
		System.out.println("Input createdate (yyy-MM-dd):");
		String createdate = ScannerUtils.inputString("Please input createdate as yyy-MM-dd !");
		System.out.println("Input gender (F/M/U):");
		String gender = ScannerUtils.inputString("Please input createdate as String!").toUpperCase();

		accountController.createAccount(email, username, fullname, departmentID, positionID, createdate, gender);
	}

	public static void getAccountByID() throws Exception {

		System.out.println("Input accountID: ");
		int accountID = ScannerUtils.inputId();

		Account account = accountController.getAccountByID(accountID);
		System.out.println(account);
	}

	public static void updateAccount() throws Exception {
		System.out.println("Input accountID: ");
		int accountID = ScannerUtils.inputId();

		System.out.println("Input new username: ");
		String newUserName = ScannerUtils.inputString("Please input username as String and don't use space !");

		accountController.updateAccountByID(accountID, newUserName);
	}

	public static void deleteAccount() throws Exception {
		System.out.println("Input accountID: ");
		int accountID = ScannerUtils.inputId();

		accountController.deleteAccount(accountID);
	}

	public static void main(String[] args) throws Exception {
		accountController = new AccountController();

		int choose;
		do {
			menuAccount();
			System.out.print("Enter your choice: ");
			choose = ScannerUtils.inputInt();
			switch (choose) {
			case 1:
				System.out.println("-----List account-----");
				getListAccount();
				break;

			case 2:
				System.out.println("-----Get account by id-----");
				getAccountByID();
				break;

			case 3:
				System.out.println("-----Create account-----");
				createAccount();
				break;

			case 4:
				System.out.println("-----Update account-----");
				updateAccount();
				break;

			case 5:
				System.out.println("-----Delete account-----");
				deleteAccount();
				break;

			case 6:
				System.out.println("End program!");
				break;

			default:
				System.out.println("input wrong ! please input again (1-->6).");
				break;
			}
		} while (choose != 6);
	}
}
