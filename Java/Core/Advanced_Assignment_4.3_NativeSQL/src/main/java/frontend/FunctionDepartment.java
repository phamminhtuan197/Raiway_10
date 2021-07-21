package frontend;

import java.util.List;

import backend.persentationlayer.DepartmentController;
import entity.Account;
import entity.Department;
import utils.ScannerUtils;

public class FunctionDepartment {
	public void createDepartment() {
		do {
			DepartmentController depController = new DepartmentController();
			System.out.print("Nhập tên phòng cần tạo:");
			String nameDepCreate = ScannerUtils.inputName();
			if (depController.isDepartmentExistsByName(nameDepCreate)) {
				System.out.println("Phong ban da ton tai. Moi nhap lai ten khac");
			} else {
				Department dep = new Department();
				dep.setDepartmentName(nameDepCreate);
				depController.createDepartment(dep);
				System.out.println("Tao phong ban thanh cong!");
				break;
			}
		} while (true);
	}

	public void showDepartmentByName() {
		do {
			System.out.print("Nhap ten phong ban can tim: ");
			String nameDep = ScannerUtils.inputName();
			DepartmentController depController = new DepartmentController();
			if (!depController.isDepartmentExistsByName(nameDep)) {
				System.out.println("Không có phòng ban này trên hệ thống");
			} else {
				Department depByName = depController.getDepartmentByName(nameDep);
				System.out.println(depByName.toString());
				break;
			}
		} while (true);

	}

	public void showDepartmentByID() {
		do {
			System.out.print("Nhap ID cua phong ban can tim: ");
			short id = (short) ScannerUtils.inputID();
			DepartmentController depController = new DepartmentController();
			if (!depController.isDepartmentExistsByID(id)) {
				System.out.println("Khong co phong ban nay tren he thong");
			} else {
				Department dep = depController.getDepartmentByID(id);
				System.out.println(dep.toString());
				break;
			}
		} while (true);
	}

	public void showAllDepartment() {
		System.out.println("Danh sach tat ca phong ban: ");
		DepartmentController departmentController = new DepartmentController();
		List<Department> listDepartments = departmentController.getAllDepartments();
		for (Department department : listDepartments) {
			System.out.println("ID=" + department.getDepartmentID() + ", Name=" + department.getDepartmentName());
		}
	}

	public void updateDepartment() {
		do {
			DepartmentController departmentController = new DepartmentController();
			System.out.print("Nhap ID phong can update: ");
			short departmentID = (short) ScannerUtils.inputID();
			if (!departmentController.isDepartmentExistsByID(departmentID)) {
				System.out.println("Khong co phong ban nay tren he thong");
			} else {
				do {
					System.out.print("Nhap ten phong ban moi: ");
					String newName = ScannerUtils.inputName();
					if (departmentController.isDepartmentExistsByName(newName)) {
						System.out.println("Ten nay da ton tai, moi nhap ten khac");
					} else {
						departmentController.updateDepartmentNameByID(departmentID, newName);
						System.out.println("Update complete");
						break;
					}
				} while (true);
				break;
			}
		} while (true);
	}

	public void deleteDepartment() {
		do {
			DepartmentController departmentController = new DepartmentController();
			System.out.print("Nhap ID cua phong can xoa: ");
			short departmentID = (short) ScannerUtils.inputID();
			if (!departmentController.isDepartmentExistsByID(departmentID)) {
				System.out.println("Khong co phong ban nay tren he thong");
			} else {
				departmentController.deleteDepartment(departmentID);
				System.out.println("Delete complete");
				break;
			}
		} while (true);
	}

	public void showAccountDepartmentByID() {
		do {
			DepartmentController departmentController = new DepartmentController();
			System.out.print("Nhap ID phong ban can lay danh sach nhan vien: ");
			short departmentID = (short) ScannerUtils.inputID();
			if (!departmentController.isDepartmentExistsByID(departmentID)) {
				System.out.println("Khong co phong ban nay tren he thong");
			} else {
				Department department = departmentController.getDepartmentByID(departmentID);
				List<Account> listAccounts = department.getAccount();
				for (Account account : listAccounts) {
					System.out.println(account.toString());
				}
				break;
			}
		} while (true);
	}
}
