package com.vti.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vti.entity.Department;

public interface IDepartmentRepository extends JpaRepository<Department, Short> {
	public Department findByDepartmentName(String departmentName);

	public boolean existsByDepartmentName(String departmentName);

}
