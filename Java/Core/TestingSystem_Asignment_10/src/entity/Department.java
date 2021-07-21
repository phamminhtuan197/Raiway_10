package entity;

public class Department {
	int departmentID;
	String departmentname;
	public int getDepartmentID() {
		return departmentID;
	}
	public void setDepartmentID(int departmentID) {
		this.departmentID = departmentID;
	}
	public String getDepartmentname() {
		return departmentname;
	}
	public void setDepartmentname(String departmentname) {
		this.departmentname = departmentname;
	}
	public Department(int departmentID, String departmentname) {
		super();
		this.departmentID = departmentID;
		this.departmentname = departmentname;
	}
	public Department() {
		super();
	}
	@Override
	public String toString() {
		return "Department [departmentID=" + departmentID + ", departmentname=" + departmentname + "]";
	}
	
	
}
