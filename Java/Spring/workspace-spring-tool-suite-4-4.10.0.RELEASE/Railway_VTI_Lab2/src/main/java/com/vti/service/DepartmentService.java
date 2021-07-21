package com.vti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vti.entity.Department;
import com.vti.repository.IDepartmentRepository;

@Service
public class DepartmentService implements IDepartmentService {
	@Autowired
	private IDepartmentRepository departmentRepository;

	@Override
	public List<Department> getAllDepartments() {
		// TODO Auto-generated method stub
		return departmentRepository.findAll();
	}

	@Override
	public Department getDepartmentByID(short departmentID) {
		// TODO Auto-generated method stub
		return departmentRepository.findById(departmentID).get();
	}

	@Override
	public Department getDepartmentByName(String departmentName) {
		// TODO Auto-generated method stub
		return departmentRepository.findByDepartmentName(departmentName);
	}

	@Override
	public void createDepartment(Department department) {
		// TODO Auto-generated method stub
		departmentRepository.save(department);

	}

	@Override
	public boolean isDepartmentExistsByID(short departmentID) {
		// TODO Auto-generated method stub
		return departmentRepository.existsById(departmentID);
	}

	@Override
	public boolean isDepartmentExistsByName(String departmentName) {
		// TODO Auto-generated method stub
		return departmentRepository.existsByDepartmentName(departmentName);
	}

	@Override
	public void updateDepartment(Department department) {
		// TODO Auto-generated method stub
		departmentRepository.save(department);
	}

	@Override
	public void deleteDepartment(short departmentID) {
		// TODO Auto-generated method stub
		departmentRepository.deleteById(departmentID);
		;
	}

//	@Override
//	public Page<Department> getAllDepartments(Pageable pageable) {
//		// TODO Auto-generated method stub
//		return departmentRepository.findAll(pageable);
//	}

}
