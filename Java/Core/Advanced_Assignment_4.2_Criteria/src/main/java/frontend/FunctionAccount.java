package frontend;

import java.util.List;

import backend.persentationlayer.AccountController;
import backend.persentationlayer.DepartmentController;
import backend.persentationlayer.PositionController;
import entity.Account;
import entity.Department;
import entity.Position;
import utils.ScannerUtils;

public class FunctionAccount {
	public void createAccount() {
		do {
			AccountController accController = new AccountController();
			System.out.print("Nhập email cần tạo:");
			String email = ScannerUtils.inputEmail("Nhap sai dinh dang Email");
			System.out.print("Nhap Username can tao: ");
			String userName = ScannerUtils.inputUserName();
			System.out.print("Nhap FullName: ");
			String fullName = ScannerUtils.inputfullName("Name chi chua chu");
			Department department = getDepartment();
			Position position = getPosition();
			if (accController.isAccountExistsByName(userName)) {
				System.out.println("Account da ton tai. Moi nhap lai ten khac");
			} else {
				Account account = new Account();
				account.setEmail(email);
				account.setUserName(userName);
				account.setFullName(fullName);
				account.setDepartment(department);
				account.setPosition(position);
				accController.createAccount(account);
				System.out.println("Tao tai khoan thanh cong!");
				break;
			}
		} while (true);
	}

	private Position getPosition() {
		while (true) {
			PositionController positionController = new PositionController();
			System.out.print("Nhap positionID: ");
			short positionID = (short) ScannerUtils.inputID();
			if (!positionController.isPositionExistsByID(positionID)) {
				System.out.println("Khong ton tai chuc vu tren he thong");
			} else {
				Position pos = positionController.getPositionByID(positionID);
				return pos;
			}
		}
	}

	public Department getDepartment() {
		while (true) {
			DepartmentController depController = new DepartmentController();
			System.out.print("Nhap departmentID: ");
			short departmentID = (short) ScannerUtils.inputID();
			if (!depController.isDepartmentExistsByID(departmentID)) {
				System.out.println("Phong ban khong ton tai tren he thong. Nhap lai");
			} else {
				Department dep = depController.getDepartmentByID(departmentID);
				return dep;
			}
		}
	}

	public void showAccountByName() {
		do {
			System.out.print("Nhap UserName can tim: ");
			String userName = ScannerUtils.inputUserName();
			AccountController accountController = new AccountController();
			if (!accountController.isAccountExistsByName(userName)) {
				System.out.println("Không có tai khoan này trên hệ thống");
			} else {
				Account account = accountController.getAccountByUserName(userName);
				System.out.println(account.toString());
				break;
			}
		} while (true);

	}

	public void showAccountByID() {
		do {
			System.out.print("Nhap ID cua tai khoan can tim: ");
			short id = (short) ScannerUtils.inputID();
			AccountController accountController = new AccountController();
			if (!accountController.isAccountExistsByID(id)) {
				System.out.println("Khong co tai khoan nay tren he thong");
			} else {
				Account account = accountController.getAccountByID(id);
				System.out.println(account.toString());
				break;
			}
		} while (true);
	}

	public void showAllAccount() {
		System.out.println("Danh sach tat ca tai khoan: ");
		AccountController accountController = new AccountController();
		List<Account> listAccounts = accountController.getAllAccount();
		for (Account account : listAccounts) {
			System.out.println(account.toString());
		}
	}

	public void showFullNameOfAccount() {
		do {
			AccountController accountController = new AccountController();
			System.out.print("Nhap ID cua tai khoan can lay firstname: ");
			short accountID = (short) ScannerUtils.inputID();
			if (!accountController.isAccountExistsByID(accountID)) {
				System.out.println("Khong co tai khoan nay tren he thong");
			} else {
				System.out.println("Ten cua nhan vien la");
				System.out.println(accountController.getFullName(accountID));
				break;
			}
		} while (true);
	}

	public void showAccountByCurrentMonth() {
		System.out.println("Danh sach account duoc tao trong thang nay");
		AccountController accountController = new AccountController();
		List<Account> listAccounts = accountController.getByCurrentMonthOrderByCreateDate();
		for (Account account : listAccounts) {
			System.out.println(account.toString());
		}
	}

	public void countAccountByMonthOfYearNow() {
		AccountController accountController = new AccountController();
		List<Object[]> listObjects = accountController.getCountAccountByMonthOfYearNow();
		for (Object[] object : listObjects) {
			System.out.println("Month: " + object[0] + "   Amount: " + object[1]);
		}
	}

	public void updateEmailUsernameAccountByID() {
		do {
			AccountController accountController = new AccountController();
			System.out.print("Nhap ID account can update: ");
			short accountID = (short) ScannerUtils.inputID();
			System.out.print("Nhap Email moi: ");
			String newEmail = ScannerUtils.inputEmail("Sai dinh dang Email");
			System.out.print("Nhap UserName moi: ");
			String newUserName = ScannerUtils.inputUserName();
			if (!accountController.isAccountExistsByID(accountID)) {
				System.out.println("Account khong ton tai tren he thong");
			} else if (accountController.isAccountExistsByName(newUserName)) {
				System.out.println("UserName nay da ton tai");
			} else {
				accountController.updateEmailUsernameAccountByID(newEmail, newUserName, accountID);
				System.out.println("Update complete");
				break;
			}
		} while (true);
	}

	public void deleteAccountByEmail() {
		do {
			AccountController accountController = new AccountController();
			System.out.print("Nhap Email cua account can xoa: ");
			String email = ScannerUtils.inputEmail("Nhap sai dinh dang Email");
			if (!accountController.isAccountExistsByEmail(email)) {
				System.out.println("Khong co account nay tren he thong");
			} else {
				accountController.deleteAccountByEmail(email);
				System.out.println("Delete complete");
				break;
			}
		} while (true);
	}

}
