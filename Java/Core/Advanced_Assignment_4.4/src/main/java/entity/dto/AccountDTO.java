package entity.dto;

import javax.persistence.Entity;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Positive;

import org.hibernate.validator.constraints.Length;

import backend.datalayer.DepartmentRepository;
import backend.datalayer.PositionRepository;
import entity.Account;
import entity.Department;
import entity.Position;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import validation.CheckDepartmentExists;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
public class AccountDTO {
	@NotEmpty(message = "Email khong duoc de trong")
	@Length(min = 6, max = 50, message = "Do dai email khong hop le")
	@Email(message = "Dinh dang email khong hop le")
	private String email;
	
	@NotEmpty(message = "UserName khong duoc de trong")
	@Length(min = 6, max = 50, message = "Do dai UserName khong hop le")
	private String userName;
	
	@NotEmpty(message = "FullName khong duoc de trong")
	@Length(min = 6, max = 50, message = "Do dai lastname khong hop le")
	private String fullName;
	
	@Positive(message = "Lựa chọn ID là số dương")
	@CheckDepartmentExists
	private int departmentID;
	
	@Positive(message = "Lựa chọn ID là số dương")
	@CheckDepartmentExists
	private int positionID;

	public Account toEntity() {
		DepartmentRepository departmentRepository = new DepartmentRepository();
		PositionRepository positionRepository = new PositionRepository();
		Department department = departmentRepository.getDepartmentByID((short) departmentID);
		Position position = positionRepository.getPositionByID((short) positionID);
		return new Account(email, userName, fullName, department, position);
	}
}
