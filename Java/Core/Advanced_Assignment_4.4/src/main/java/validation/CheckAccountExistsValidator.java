package validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import backend.datalayer.AccountRepository;

public class CheckAccountExistsValidator implements ConstraintValidator<CheckAccountExists, Integer> {
	private AccountRepository accountRepository;

	public void initialize(CheckAccountExists constraintAnnotation) {
		accountRepository = new AccountRepository();
	}

	public boolean isValid(Integer depID, ConstraintValidatorContext context) {
		Boolean flag = accountRepository.isAccountExistsByID((short) depID.intValue());
		return flag;
	}
}
