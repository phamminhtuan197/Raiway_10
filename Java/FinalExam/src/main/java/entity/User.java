package entity;

public class User {
	int userID;
	String fullName;
	String email;
	String password;

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public User(int userID, String fullName, String email, String password) {
		super();
		this.userID = userID;
		this.fullName = fullName;
		this.email = email;
		this.password = password;
	}

	public User() {
		super();
	}

	@Override
	public String toString() {
		return "User [userID=" + userID + ", fullName=" + fullName + ", email=" + email + ", password=" + password
				+ "]";
	}

}
