package Testing_1_2;

public class Department {
	int 			id;
	DepartmentName	name;
	
	public Department(int id, DepartmentName name) {
		this.id=id;
		this.name=name;
	}
	
	public String toString() {
		return "[id=" + id + ", name=" + name + "]";
	}
}

