package entity;

public class Employee extends User {
	private int projectID;
	private ProSkill proSkill;
	public Employee(int userID, String fullName, String email, String password, Role role, int projectID,
			ProSkill proSkill) {
		super(userID, fullName, email, password, role.EMPLOYEE);
		this.projectID = projectID;
		this.proSkill = proSkill;
	}
	@Override
	public String toString() {
		return "Employee [projectID=" + projectID + ", proSkill=" + proSkill + ", userID=" + userID + ", fullName="
				+ fullName + ", email=" + email + ", password=" + password + ", role=" + role + "]";
	}
	
	
}
