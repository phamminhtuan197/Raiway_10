package utils;

import java.io.Serializable;

public class Student implements Serializable {
	private int id;
	private String name;

	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Student => id = " + id + ", name = " + name;
	}
}
