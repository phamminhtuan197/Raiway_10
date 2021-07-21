package validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import backend.datalayer.PositionRepository;

public class CheckPositionExistsValidator implements ConstraintValidator<CheckPositionExists, Integer> {
	private PositionRepository positionRepository;

	public void initialize(CheckPositionExists constraintAnnotation) {
		positionRepository = new PositionRepository();
	}

	public boolean isValid(Integer depID, ConstraintValidatorContext context) {
		Boolean flag = positionRepository.isPositionExistsByID((short) depID.intValue());
		return flag;
	}
}
