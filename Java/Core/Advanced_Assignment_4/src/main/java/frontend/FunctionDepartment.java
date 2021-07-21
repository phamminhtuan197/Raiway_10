package frontend;

import java.util.List;

import backend.datalayer.DepartmentRepository;
import entity.Account;
import entity.Department;
import utils.ScannerUtils;

public class FunctionDepartment {
	public void createDepartment() {
		do {
			DepartmentRepository depRepository = new DepartmentRepository();
			System.out.print("Nhập tên phòng cần tạo:");
			String nameDepCreate = ScannerUtils.inputName();
			if (depRepository.isDepartmentExistsByName(nameDepCreate)) {
				System.out.println("Phong ban da ton tai. Moi nhap lai ten khac");
			} else {
				Department dep = new Department();
				dep.setDepartmentName(nameDepCreate);
				depRepository.createDepartment(dep);
				System.out.println("Tao phong ban thanh cong!");
				break;
			}
		} while (true);
	}

	public void showDepartmentByName() {
		do {
			System.out.print("Nhap ten phong ban can tim: ");
			String nameDep = ScannerUtils.inputName();
			DepartmentRepository depRepository = new DepartmentRepository();
			if (!depRepository.isDepartmentExistsByName(nameDep)) {
				System.out.println("Không có phòng ban này trên hệ thống");
			} else {
				Department depByName = depRepository.getDepartmentByName(nameDep);
				System.out.println(depByName.toString());
				break;
			}
		} while (true);

	}

	public void showDepartmentByID() {
		do {
			System.out.print("Nhap ID cua phong ban can tim: ");
			short id = (short) ScannerUtils.inputID();
			DepartmentRepository depRepository = new DepartmentRepository();
			if (!depRepository.isDepartmentExistsByID(id)) {
				System.out.println("Khong co phong ban nay tren he thong");
			} else {
				Department dep = depRepository.getDepartmentByID(id);
				System.out.println(dep.toString());
				break;
			}
		} while (true);
	}

	public void showAllDepartment() {
		System.out.println("Danh sach tat ca phong ban: ");
		DepartmentRepository departmentRepository = new DepartmentRepository();
		List<Department> listDepartments = departmentRepository.getAllDepartments();
		for (Department department : listDepartments) {
			System.out.println("ID=" + department.getDepartmentID() + ", Name=" + department.getDepartmentName());
		}
	}

	public void updateDepartment() {
		do {
			DepartmentRepository departmentRepository = new DepartmentRepository();
			System.out.print("Nhap ID phong can update: ");
			short departmentID = (short) ScannerUtils.inputID();
			if (!departmentRepository.isDepartmentExistsByID(departmentID)) {
				System.out.println("Khong co phong ban nay tren he thong");
			} else {
				do {
					System.out.print("Nhap ten phong ban moi: ");
					String newName = ScannerUtils.inputName();
					if (departmentRepository.isDepartmentExistsByName(newName)) {
						System.out.println("Ten nay da ton tai, moi nhap ten khac");
					} else {
						Department dep = new Department();
						dep.setDepartmentID(departmentID);
						dep.setDepartmentName(newName);
						departmentRepository.updateDepartment(dep);
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
			DepartmentRepository departmentRepository = new DepartmentRepository();
			System.out.print("Nhap ID cua phong can xoa: ");
			short departmentID = (short) ScannerUtils.inputID();
			if (!departmentRepository.isDepartmentExistsByID(departmentID)) {
				System.out.println("Khong co phong ban nay tren he thong");
			} else {
				departmentRepository.deleteDepartment(departmentID);
				System.out.println("Delete complete");
				break;
			}
		} while (true);
	}

	public void showAccountDepartmentByID() {
		do {
			DepartmentRepository departmentRepository = new DepartmentRepository();
			System.out.print("Nhap ID phong ban can lay danh sach nhan vien: ");
			short departmentID = (short) ScannerUtils.inputID();
			if (!departmentRepository.isDepartmentExistsByID(departmentID)) {
				System.out.println("Khong co phong ban nay tren he thong");
			} else {
				Department department = departmentRepository.getDepartmentByID(departmentID);
				List<Account> listAccounts = department.getAccount();
				for (Account account : listAccounts) {
					System.out.println(account.toString());
				}
				break;
			}
		} while (true);
	}
}
