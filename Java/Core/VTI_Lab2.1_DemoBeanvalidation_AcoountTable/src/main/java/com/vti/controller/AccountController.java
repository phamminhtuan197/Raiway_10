package com.vti.controller;

import java.util.List;
import java.util.Locale;

import javax.validation.Valid;

import com.vti.entity.Account;
import com.vti.entity.dto.AccountDTO;
import com.vti.service.AccountService;
import com.vti.utils.ValidationUtils;

public class AccountController {
	private AccountService accService;

	public AccountController() {
		accService = new AccountService();
	}

	@SuppressWarnings("unchecked")
	public List<Account> getAllAccount() {

		return accService.getAllAccount();
	}

	public void createAccount(@Valid AccountDTO accDTO) {
		if (ValidationUtils.validate(accDTO)) {
			accService.createAccount(accDTO);
		}

	}

}
