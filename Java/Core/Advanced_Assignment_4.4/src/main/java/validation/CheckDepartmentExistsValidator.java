package validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import backend.datalayer.DepartmentRepository;

public class CheckDepartmentExistsValidator implements ConstraintValidator<CheckDepartmentExists, Integer> {
	private DepartmentRepository depRepository;

	public void initialize(CheckDepartmentExists constraintAnnotation) {
		depRepository = new DepartmentRepository();
	}

	public boolean isValid(Integer depID, ConstraintValidatorContext context) {
		Boolean flag = depRepository.isDepartmentExistsByID((short) depID.intValue());
		return flag;
	}
}
