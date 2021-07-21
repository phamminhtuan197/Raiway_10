package entity;


import java.time.LocalDate;


public class Account {
	int accountID;
	String email;
	String username;
	String fullname;
	int departmentID;
	int positionID;
	LocalDate createdate;
	String gender;
	String departmentname;
	public String getDepartment() {
		return departmentname;
	}
	public void setDepartment(String departmentname) {
		this.departmentname = departmentname;
	}
	public int getAccountID() {
		return accountID;
	}
	public void setAccountID(int accountID) {
		this.accountID = accountID;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public int getDepartmentID() {
		return departmentID;
	}
	public void setDepartmentID(int departmentID) {
		this.departmentID = departmentID;
	}
	public int getPositionID() {
		return positionID;
	}
	public void setPositionID(int positionID) {
		this.positionID = positionID;
	}
	public LocalDate getCreatedate() {
		return createdate;
	}
	public void setCreatedate(String createdate) {
		this.createdate = LocalDate.parse(createdate);
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Account(int accountID, String email, String username, String fullname, int departmentID, int positionID,
			String createdate, String gender, String departmentname) {
		super();
		this.accountID = accountID;
		this.email = email;
		this.username = username;
		this.fullname = fullname;
		this.departmentID = departmentID;
		this.positionID = positionID;
		this.createdate = LocalDate.parse(createdate);
		this.gender = gender;
		this.departmentname = departmentname;
	}
	public Account() {
		super();
	}
	@Override
	public String toString() {
		return "Account [accountID=" + accountID + ", email=" + email + ", username=" + username + ", fullname="
				+ fullname + ", departmentID=" + departmentID + ", positionID=" + positionID + ", createdate="
				+ createdate + ", gender=" + gender + ", DepartmentName=" + departmentname+"]";
	}
	public Account(int accountID, String email, String username, String fullname, int departmentID, int positionID,
			String createdate, String gender) {
		super();
		this.accountID = accountID;
		this.email = email;
		this.username = username;
		this.fullname = fullname;
		this.departmentID = departmentID;
		this.positionID = positionID;
		this.createdate = LocalDate.parse(createdate);
		this.gender = gender;
	}
	public Account(String email, String username, String fullname, int departmentID, int positionID, String createdate,
			String gender) {
		super();
		this.email = email;
		this.username = username;
		this.fullname = fullname;
		this.departmentID = departmentID;
		this.positionID = positionID;
		this.createdate = LocalDate.parse(createdate);
		this.gender = gender;
	}
	
	
}
