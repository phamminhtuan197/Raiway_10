package entity;

public class Employee extends User {
	private String proSkill;

	public Employee(int id, String fullName, String email, String password, Role role, String proSkill) {
		super(id, fullName, email, password, role.EMPLOYEE);
		this.proSkill = proSkill;
	}

	@Override
	public String toString() {
		return "Employee [proSkill=" + proSkill + ", id=" + id + ", fullName=" + fullName + ", email=" + email
				+ ", password=" + password + ", role=" + role + "]";
	}

}
