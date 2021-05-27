package entity;

import java.util.ArrayList;

public class Project {
	int projectID;
	int teamSize;
	int idManager;
	ArrayList<Integer> idEmployees;

	public int getProjectID() {
		return projectID;
	}

	public void setProjectID(int projectID) {
		this.projectID = projectID;
	}

	public int getTeamSize() {
		return teamSize;
	}

	public void setTeamSize(int teamSize) {
		this.teamSize = teamSize;
	}

	public int getIdManager() {
		return idManager;
	}

	public void setIdManager(int idManager) {
		this.idManager = idManager;
	}

	public ArrayList<Integer> getIdEmployees() {
		return idEmployees;
	}

	public void setIdEmployees(ArrayList<Integer> idEmployees) {
		this.idEmployees = idEmployees;
	}

	public Project(int projectID, int teamSize, int idManager, ArrayList<Integer> idEmployees) {
		super();
		this.projectID = projectID;
		this.teamSize = teamSize;
		this.idManager = idManager;
		this.idEmployees = idEmployees;
	}

	@Override
	public String toString() {
		return "Project [projectID=" + projectID + ", teamSize=" + teamSize + ", idManager=" + idManager
				+ ", idEmployees=" + idEmployees + "]";
	}
}