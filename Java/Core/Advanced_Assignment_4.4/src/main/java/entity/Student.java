package entity;

import javax.persistence.Entity;
import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Student {
	@Min(value = 1, message = "ID không nho hon 1!!")
	@Max(value = 100, message = "ID không vuot qua 100!")
	@Positive
//	@Size(min = 1, max = 3, message = "ID không hợp lệ")
	private int id;
	@Size(min = 3, max = 20, message = "Ten không hợp lệ")
//	@Max(value = 12, message = "Tên không hợp lệ!")
	private String name;
	@Email(message = "Thông tin email không hợp lệ!")
	private String email;
	@Min(value = 18, message = "Tuổi không hợp lệ!")
	private int age;
}
