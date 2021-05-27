package entity;

public class Manager extends User {
	private int ExpInYear;

	public Manager(int userID, String fullName, String email, String password, Role role, int expInYear) {
		super(userID, fullName, email, password);
		ExpInYear = expInYear;
	}

	@Override
	public String toString() {
		return "Manager [ExpInYear=" + ExpInYear + ", userID=" + userID + ", fullName=" + fullName + ", email=" + email
				+ ", password=" + password + "]";
	}

}
