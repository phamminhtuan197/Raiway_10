package frontend;

import java.util.List;

import backend.datalayer.AccountRepository;
import backend.datalayer.DepartmentRepository;
import backend.datalayer.PositionRepository;
import entity.Account;
import entity.Department;
import entity.Position;
import utils.ScannerUtils;

public class FunctionAccount {
	public void createAccount() {
		do {
			AccountRepository accRepository = new AccountRepository();
			System.out.print("Nhập email cần tạo:");
			String email = ScannerUtils.inputEmail("Nhap sai dinh dang Email");
			System.out.print("Nhap Username can tao: ");
			String userName = ScannerUtils.inputUserName();
			System.out.print("Nhap FullName: ");
			String fullName = ScannerUtils.inputfullName("Name chi chua chu");
			Department department = getDepartment();
			Position position = getPosition();
			if (accRepository.isAccountExistsByName(userName)) {
				System.out.println("Account da ton tai. Moi nhap lai ten khac");
			} else {
				Account account = new Account();
				account.setEmail(email);
				account.setUserName(userName);
				account.setFullName(fullName);
				account.setDepartment(department);
				account.setPosition(position);
				accRepository.createAccount(account);
				System.out.println("Tao tai khoan thanh cong!");
				break;
			}
		} while (true);
	}

	private Position getPosition() {
		while (true) {
			PositionRepository positionRepository = new PositionRepository();
			System.out.print("Nhap positionID: ");
			short positionID = (short) ScannerUtils.inputID();
			if (!positionRepository.isPositionExistsByID(positionID)) {
				System.out.println("Khong ton tai chuc vu tren he thong");
			} else {
				Position pos = positionRepository.getPositionByID(positionID);
				return pos;
			}
		}
	}

	public Department getDepartment() {
		while (true) {
			DepartmentRepository depRepository = new DepartmentRepository();
			System.out.print("Nhap departmentID: ");
			short departmentID = (short) ScannerUtils.inputID();
			if (!depRepository.isDepartmentExistsByID(departmentID)) {
				System.out.println("Phong ban khong ton tai tren he thong. Nhap lai");
			} else {
				Department dep = depRepository.getDepartmentByID(departmentID);
				return dep;
			}
		}
	}

	public void showAccountByName() {
		do {
			System.out.print("Nhap UserName can tim: ");
			String userName = ScannerUtils.inputUserName();
			AccountRepository accountRepository = new AccountRepository();
			if (!accountRepository.isAccountExistsByName(userName)) {
				System.out.println("Không có tai khoan này trên hệ thống");
			} else {
				Account account = accountRepository.getAccountByUserName(userName);
				System.out.println(account.toString());
				break;
			}
		} while (true);

	}

	public void showAccountByID() {
		do {
			System.out.print("Nhap ID cua tai khoan can tim: ");
			short id = (short) ScannerUtils.inputID();
			AccountRepository accountRepository = new AccountRepository();
			if (!accountRepository.isAccountExistsByID(id)) {
				System.out.println("Khong co tai khoan nay tren he thong");
			} else {
				Account account = accountRepository.getAccountByID(id);
				System.out.println(account.toString());
				break;
			}
		} while (true);
	}

	public void showAllAccount() {
		System.out.println("Danh sach tat ca tai khoan: ");
		AccountRepository accountRepository = new AccountRepository();
		List<Account> listAccounts = accountRepository.getAllAccount();
		for (Account account : listAccounts) {
			System.out.println(account.toString());
		}
	}

	public void updateAccount() {
		do {
			AccountRepository accountRepository = new AccountRepository();
			System.out.print("Nhap ID tai khoan can update: ");
			short accountID = (short) ScannerUtils.inputID();
			if (!accountRepository.isAccountExistsByID(accountID)) {
				System.out.println("Khong co tai khoan nay tren he thong");
			} else {
				do {
					System.out.print("Nhap UserName moi: ");
					String newName = ScannerUtils.inputUserName();
					if (accountRepository.isAccountExistsByName(newName)) {
						System.out.println("Ten nay da ton tai, moi nhap ten khac");
					} else if (newName == null) {
						System.out.println("UserName khong duoc de trong");
					} else {
						Account account = accountRepository.getAccountByID(accountID);
						account.setUserName(newName);
						accountRepository.updateAccount(account);
						System.out.println("Update complete");
						break;
					}
				} while (true);
				break;
			}
		} while (true);
	}

	public void deleteAccount() {
		do {
			AccountRepository accountRepository = new AccountRepository();
			System.out.print("Nhap ID cua tai khoan can xoa: ");
			short accountID = (short) ScannerUtils.inputID();
			if (!accountRepository.isAccountExistsByID(accountID)) {
				System.out.println("Khong co tai khoan nay tren he thong");
			} else {
				accountRepository.deleteAccount(accountID);
				System.out.println("Delete complete");
				break;
			}
		} while (true);
	}
}
