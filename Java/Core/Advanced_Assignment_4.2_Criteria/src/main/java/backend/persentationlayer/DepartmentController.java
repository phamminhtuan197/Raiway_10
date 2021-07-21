package backend.persentationlayer;

import java.util.List;

import backend.businesslayer.DepartmentService;
import backend.businesslayer.IDepartmentService;
import entity.Department;

public class DepartmentController {
	private IDepartmentService departmentService;

	public DepartmentController() {
		departmentService = new DepartmentService();
	}

	public List<Department> getAllDepartments() {
		return departmentService.getAllDepartments();
	}

	public Department getDepartmentByID(short departmentID) {
		return departmentService.getDepartmentByID(departmentID);
	}

	public Department getDepartmentByName(String departmentName) {
		return departmentService.getDepartmentByName(departmentName);
	}

	public void createDepartment(Department department) {
		departmentService.createDepartment(department);
	}

	public boolean isDepartmentExistsByID(short departmentID) {
		return departmentService.isDepartmentExistsByID(departmentID);
	}

	public boolean isDepartmentExistsByName(String departmentName) {
		return departmentService.isDepartmentExistsByName(departmentName);
	}

	public void updateDepartmentNameByID(short departmentID, String newName) {
		departmentService.updateDepartmentNameByID(departmentID, newName);

	}

	public void deleteDepartment(short departmentID) {
		departmentService.deleteDepartment(departmentID);
	}

}
