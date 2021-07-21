package entity;

public class Admin extends User {
	private int expInYear;

	public Admin(int id, String fullName, String email, String password, Role role, int expInYear) {
		super(id, fullName, email, password, role.ADMIN);
		this.expInYear = expInYear;
	}

	@Override
	public String toString() {
		return "Admin [expInYear=" + expInYear + ", id=" + id + ", fullName=" + fullName + ", email=" + email
				+ ", password=" + password + ", role=" + role + "]";
	}

}
