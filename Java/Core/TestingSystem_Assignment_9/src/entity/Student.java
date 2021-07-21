package entity;

public class Student {
	static int id = 0;
	String name;
	public static int getId() {
		return id;
	}
//	new getID
	public String getId2() {
		return "MSV: " + id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Student(String name) {
		super();
		id++;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [ID= " + id + ", name= " + name + "]";
	}
	
	
}
