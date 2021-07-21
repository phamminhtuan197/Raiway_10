package entity;

public class Admin extends User {
	private int ExpInYear;

	public Admin(int userID, String fullName, String email, String password, Role role, int expInYear) {
		super(userID, fullName, email, password, role.ADMIN);
		ExpInYear = expInYear;
	}

	@Override
	public String toString() {
		return "Manager [ExpInYear=" + ExpInYear + ", userID=" + userID + ", fullName=" + fullName + ", email=" + email
				+ ", password=" + password + ", role=" + role + "]";
	}

}
