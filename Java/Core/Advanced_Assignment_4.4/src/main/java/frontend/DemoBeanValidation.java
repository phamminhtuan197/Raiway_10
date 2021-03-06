package frontend;

import java.util.Scanner;
import java.util.Set;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import entity.Student;

public class DemoBeanValidation {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Student student = new Student();
		System.out.println("Chương trình quản lý sinh viên");
		System.out.println("Nhập vào ID");
		student.setId(scanner.nextInt());
		scanner.nextLine();
		System.out.println("Nhập vào Name");
		student.setName(scanner.nextLine());
		System.out.println("Nhập vào Email");
		student.setEmail(scanner.next());
		System.out.println("Nhập vào Age");
		student.setAge(scanner.nextInt());
//		System.out.println(student);

		// Validation

		ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
		Validator validator = validatorFactory.getValidator();
		Set<ConstraintViolation<Student>> violations = validator.validate(student);
		if (violations == null || violations.size() == 0) {
			System.out.println("Thông tin sinh viên vừa nhập là: " +

					student.toString());
		} else {
			for (ConstraintViolation<Student> constraintViolation : violations) {
				System.out.println(constraintViolation.getMessage());
			}
		}
	}
}
