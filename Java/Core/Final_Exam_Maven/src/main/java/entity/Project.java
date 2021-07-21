package entity;

import java.util.Arrays;

public class Project {
	int projectID;
	String projectName;
	final int teamSize = 4;
	int managerID;
	int ExpInYear;
	String managerFullName;
	String managerEmail;
	String managerPassword;
	String managerRole;
	String[] membersID;
	String[] membersName;
	String[] membersEmail;
	String[] memberPassword;
	String[] memberRole;
	String[] membersProSkill;

	public int getProjectID() {
		return projectID;
	}

	public void setProjectID(int projectID) {
		this.projectID = projectID;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public int getTeamSize() {
		return teamSize;
	}

	public int getManagerID() {
		return managerID;
	}

	public void setManagerID(int managerID) {
		this.managerID = managerID;
	}

	public int getExpInYear() {
		return ExpInYear;
	}

	public void setExpInYear(int expInYear) {
		ExpInYear = expInYear;
	}

	public String getManagerFullName() {
		return managerFullName;
	}

	public void setManagerFullName(String managerFullName) {
		this.managerFullName = managerFullName;
	}

	public String getManagerEmail() {
		return managerEmail;
	}

	public void setManagerEmail(String managerEmail) {
		this.managerEmail = managerEmail;
	}

	public String getManagerPassword() {
		return managerPassword;
	}

	public void setManagerPassword(String managerPassword) {
		this.managerPassword = managerPassword;
	}

	public String getManagerRole() {
		return managerRole;
	}

	public void setManagerRole(String managerRole) {
		this.managerRole = managerRole;
	}

	public String[] getMembersID() {
		return membersID;
	}

	public void setMembersID(String[] membersID) {
		this.membersID = membersID;
	}

	public String[] getMembersName() {
		return membersName;
	}

	public void setMembersName(String[] membersName) {
		this.membersName = membersName;
	}

	public String[] getMembersEmail() {
		return membersEmail;
	}

	public void setMembersEmail(String[] membersEmail) {
		this.membersEmail = membersEmail;
	}

	public String[] getMemberPassword() {
		return memberPassword;
	}

	public void setMemberPassword(String[] memberPassword) {
		this.memberPassword = memberPassword;
	}

	public String[] getMemberRole() {
		return memberRole;
	}

	public void setMemberRole(String[] memberRole) {
		this.memberRole = memberRole;
	}

	public String[] getMembersProSkill() {
		return membersProSkill;
	}

	public void setMembersProSkill(String[] membersProSkill) {
		this.membersProSkill = membersProSkill;
	}

	public Project() {
		super();
	}

	public Project(int projectID, String projectName, int managerID, int expInYear, String managerFullName,
			String managerEmail, String managerPassword, String managerRole, String[] membersID, String[] membersName,
			String[] membersEmail, String[] memberPassword, String[] memberRole, String[] membersProSkill) {
		super();
		this.projectID = projectID;
		this.projectName = projectName;
		this.managerID = managerID;
		ExpInYear = expInYear;
		this.managerFullName = managerFullName;
		this.managerEmail = managerEmail;
		this.managerPassword = managerPassword;
		this.managerRole = managerRole;
		this.membersID = membersID;
		this.membersName = membersName;
		this.membersEmail = membersEmail;
		this.memberPassword = memberPassword;
		this.memberRole = memberRole;
		this.membersProSkill = membersProSkill;
	}

	@Override
	public String toString() {
		return "Project [projectID=" + projectID + ", projectName=" + projectName + ", teamSize=" + teamSize
				+ ", managerID=" + managerID + ", ExpInYear=" + ExpInYear + ", managerFullName=" + managerFullName
				+ ", managerEmail=" + managerEmail + ", managerPassword=" + managerPassword + ", managerRole="
				+ managerRole + ", membersID=" + Arrays.toString(membersID) + ", membersName="
				+ Arrays.toString(membersName) + ", membersEmail=" + Arrays.toString(membersEmail) + ", memberPassword="
				+ Arrays.toString(memberPassword) + ", memberRole=" + Arrays.toString(memberRole) + ", membersProSkill="
				+ Arrays.toString(membersProSkill) + "]";
	}

}
