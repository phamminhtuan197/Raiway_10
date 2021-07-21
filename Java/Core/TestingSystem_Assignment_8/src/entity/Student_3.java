package entity;

public class Student_3<T> {
	T id;
	String name;

	public T getId() {
		return id;
	}

	public void setId(T id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Student_3(T id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Student_3() {
	}

	@Override
	public String toString() {
		return "Student_3 [id=" + id + ", name=" + name + "]";
	}
	public void print(int id, String name) {
		System.out.println(id + " " + name);
	}
	public void print(float id, String name) {
		System.out.println(id + " " + name);
	}
	public void print(double id, String name) {
		System.out.println(id + " " + name);
	}
}
