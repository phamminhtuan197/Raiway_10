package entity;

public class ProjectAndUser {
	int projectID;
	int userID;
	Role role;

	public int getProjectID() {
		return projectID;
	}

	public void setProjectID(int projectID) {
		this.projectID = projectID;
	}

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public ProjectAndUser(int projectID, int userID, Role role) {
		super();
		this.projectID = projectID;
		this.userID = userID;
		this.role = role;
	}

	@Override
	public String toString() {
		return "ProjectAndUser [projectID=" + projectID + ", userID=" + userID + ", role=" + role + "]";
	}

}
