package com.vti.controller;

import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.vti.dto.AccountDto;
import com.vti.entity.Account;
import com.vti.form.AccountForm;
import com.vti.service.IAccountService;

@RestController
@RequestMapping(value = "api/v1/accounts")
@CrossOrigin("*")
public class AccountController {
	@Autowired
	private IAccountService accountService;

//	@GetMapping()
//	public ResponseEntity<?> getAllAccount() {
//		List<Account> entities = accountService.getAllAccount();
//		List<AccountDto> dtos = new ArrayList<>();
//		for (Account account : entities) {
//			AccountDto dto = new AccountDto(account.getAccountID(), account.getEmail(), account.getUserName(),
//					account.getFullName(), account.getDepartment().getDepartmentName(),
//					account.getPosition().getPositionName().toString(), account.getCreateDate());
//			dtos.add(dto);
//		}
//		return new ResponseEntity<List<AccountDto>>(dtos, HttpStatus.OK);
//	}
	@GetMapping()
	public ResponseEntity<?> getAllAccount(Pageable pageable, @RequestParam(required = false) String search) {
		Page<Account> entities = accountService.getAllAccount(pageable, search);
		Page<AccountDto> dtoPage = entities.map(new Function<Account, AccountDto>() {
			@Override
			public AccountDto apply(Account account) {
				AccountDto dto = new AccountDto(account.getAccountID(), account.getEmail(), account.getUserName(),
						account.getFullName(), account.getDepartment().getDepartmentName(),
						account.getPosition().getPositionName().toString(), account.getCreateDate());
				return dto;
			}
		});
		return new ResponseEntity<Page<AccountDto>>(dtoPage, HttpStatus.OK);
	}

	@GetMapping(value = "/accountID/{accountID}")
	public ResponseEntity<?> getAccountByID(@PathVariable short accountID) {
		Account account = accountService.getAccountByID(accountID);
		AccountDto dto = new AccountDto(account.getAccountID(), account.getEmail(), account.getUserName(),
				account.getFullName(), account.getDepartment().getDepartmentName(),
				account.getPosition().getPositionName().toString(), account.getCreateDate());
		return new ResponseEntity<AccountDto>(dto, HttpStatus.OK);
	}

	@GetMapping(value = "/userName/{userName}")
	public ResponseEntity<?> getAccountByUserName(@PathVariable String userName) {
		Account account = accountService.getAccountByUserName(userName);
		AccountDto dto = new AccountDto(account.getAccountID(), account.getEmail(), account.getUserName(),
				account.getFullName(), account.getDepartment().getDepartmentName(),
				account.getPosition().getPositionName().toString(), account.getCreateDate());
		return new ResponseEntity<AccountDto>(dto, HttpStatus.OK);
	}

	@PostMapping()
	public ResponseEntity<?> createAccount(@RequestBody AccountForm accountFrom) {
		accountService.createAccount(accountFrom);
		return new ResponseEntity<String>("Create success", HttpStatus.CREATED);
	}

//	@GetMapping()
//	public ResponseEntity<?> getByCurrentMonth() throws ParseException {
//		return new ResponseEntity<List<Account>>(accountService.getByCurrentMonth(), HttpStatus.OK);
//	}
//
//	@GetMapping()
//	public ResponseEntity<?> getByCurrentMonthOrderByCreateDate() throws ParseException {
//		return new ResponseEntity<List<Account>>(accountService.getByCurrentMonthOrderByCreateDate(), HttpStatus.OK);
//	}
//
//	@GetMapping()
//	public ResponseEntity<?> getCountAccountByMonthOfYearNow() {
//		return new ResponseEntity<List<Object[]>>(accountService.getCountAccountByMonthOfYearNow(), HttpStatus.OK);
//	}

	@PutMapping(value = "/accountID/{accountID}")
	public ResponseEntity<?> updateAccount(@PathVariable(name = "accountID") short accountID,
			@RequestBody AccountForm accountForm) {
		accountService.updateAccount(accountID, accountForm);
		return new ResponseEntity<String>("Update success", HttpStatus.OK);
	}

	@DeleteMapping(value = "/accountID/{accountID}")
	public ResponseEntity<?> deleteAccount(@PathVariable(name = "accountID") short accountID) {
		accountService.deleteAccount(accountID);
		return new ResponseEntity<String>("Delete success", HttpStatus.OK);
	}

	@GetMapping(value = "/email/{email}")
	public ResponseEntity<?> getAccountByEmail(@PathVariable String email) {
		Account account = accountService.getAccountByEmail(email);
		AccountDto dto = new AccountDto(account.getAccountID(), account.getEmail(), account.getUserName(),
				account.getFullName(), account.getDepartment().getDepartmentName(),
				account.getPosition().getPositionName().toString(), account.getCreateDate());
		return new ResponseEntity<AccountDto>(dto, HttpStatus.OK);
	}

	@GetMapping(value = "/UserNameExists/{userName}")
	public ResponseEntity<?> existsByName(@PathVariable(name = "userName") String userName) {
		return new ResponseEntity<>(accountService.existsByUserName(userName), HttpStatus.OK);
	}

	@GetMapping(value = "/EmailExists/{email}")
	public ResponseEntity<?> existsByEmail(@PathVariable(name = "email") String email) {
		return new ResponseEntity<>(accountService.existsByEmail(email), HttpStatus.OK);
	}
}
