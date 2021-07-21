package backend.datalayer;

import java.util.List;

import entity.Department;

public interface IDepartmentRepository {
	List<Department> getAllDepartments();

	Department getDepartmentByID(short departmentID);

	Department getDepartmentByName(String departmentName);

	void createDepartment(Department department);

	boolean isDepartmentExistsByID(short departmentID);

	boolean isDepartmentExistsByName(String departmentName);

	void updateDepartmentNameByID(short departmentID, String newName);

	void deleteDepartment(short departmentID);
}
