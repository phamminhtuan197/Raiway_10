package com.vti.service;

import java.util.List;

import com.vti.datalayer.AccountRepository;
import com.vti.datalayer.DepartmentRepository;
import com.vti.entity.Account;
import com.vti.entity.Department;
import com.vti.entity.dto.AccountDTO;

public class DepartmentService {
	private DepartmentRepository DepRepository;

	public DepartmentService() {
		DepRepository = new DepartmentRepository();
	}

	@SuppressWarnings("unchecked")
	public List<Department> getAllDepartmentAccounts() {

		return DepRepository.getAllDepartment();
	}

}
