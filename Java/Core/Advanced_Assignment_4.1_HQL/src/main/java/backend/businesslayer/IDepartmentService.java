package backend.businesslayer;

import java.util.List;

import entity.Department;

public interface IDepartmentService {
	List<Department> getAllDepartments();

	Department getDepartmentByID(short departmentID);

	Department getDepartmentByName(String departmentName);

	void createDepartment(Department department);

	boolean isDepartmentExistsByID(short departmentID);

	boolean isDepartmentExistsByName(String departmentName);

	void updateDepartmentNameByID(short departmentID, String newName);

	void deleteDepartment(short departmentID);
}
