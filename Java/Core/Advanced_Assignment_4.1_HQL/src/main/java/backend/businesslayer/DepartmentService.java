package backend.businesslayer;

import java.util.List;

import backend.datalayer.DepartmentRepository;
import backend.datalayer.IDepartmentRepository;
import entity.Department;

public class DepartmentService implements IDepartmentService {
	private IDepartmentRepository departmentRepository;

	public DepartmentService() {
		departmentRepository = new DepartmentRepository();
	}

	public List<Department> getAllDepartments() {
		return departmentRepository.getAllDepartments();
	}

	public Department getDepartmentByID(short departmentID) {
		return departmentRepository.getDepartmentByID(departmentID);
	}

	public Department getDepartmentByName(String departmentName) {
		return departmentRepository.getDepartmentByName(departmentName);
	}

	public void createDepartment(Department department) {
		departmentRepository.createDepartment(department);
	}

	public boolean isDepartmentExistsByID(short departmentID) {
		return departmentRepository.isDepartmentExistsByID(departmentID);
	}

	public boolean isDepartmentExistsByName(String departmentName) {
		return departmentRepository.isDepartmentExistsByName(departmentName);
	}

	public void updateDepartmentNameByID(short departmentID, String newName) {
		departmentRepository.updateDepartmentNameByID(departmentID, newName);

	}

	public void deleteDepartment(short departmentID) {
		departmentRepository.deleteDepartment(departmentID);
	}

}
