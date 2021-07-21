package entity.Excercise2;

public class Student {
	static final int ID = 0;
	String name;
	public Student(String name) {
		super();
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [ ID=" + ID + " name=" + name + "]";
	}
	public final String study() {
		return "dang hoc bai";
	}
	public Student() {
	}
}
