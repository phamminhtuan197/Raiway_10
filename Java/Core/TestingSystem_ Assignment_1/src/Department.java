
public class Department {
	int 			id;
	DepartmentName	name;
	
	Department(int id, DepartmentName name) {
		this.id=id;
		this.name=name;
	}
	
	public String toString() {
		return "[id=" + id + ", name=" + name + "]";
	}
}

