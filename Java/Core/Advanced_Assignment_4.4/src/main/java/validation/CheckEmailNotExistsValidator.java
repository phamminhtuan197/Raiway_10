package validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.mysql.cj.util.StringUtils;

import backend.datalayer.AccountRepository;

public class CheckEmailNotExistsValidator implements ConstraintValidator<CheckEmailNotExists, String> {
	private AccountRepository accRepository;

	public void initialize(CheckEmailNotExists constraintAnnotation) {
		accRepository = new AccountRepository();
	}

	public boolean isValid(String email, ConstraintValidatorContext context) {
		if (StringUtils.isNullOrEmpty(email)) {
			return false;
		}
		Boolean flag = accRepository.isAccountExistsByEmail(email);
		return !flag;
	}
}
