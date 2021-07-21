package entity;

import java.time.LocalDate;


public class Student_2 {
	int id;
	String name;
	LocalDate birthday;
	float scores;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getBirthday() {
		return birthday;
	}
	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}
	public float getScores() {
		return scores;
	}
	public void setScores(float scores) {
		this.scores = scores;
	}
	public Student_2(int id, String name, LocalDate birthday, float scores) {
		super();
		this.id = id;
		this.name = name;
		this.birthday = birthday;
		this.scores = scores;
	}
	
	public Student_2() {
	}
	@Override
	public String toString() {
		return "Student_2 [id=" + id + ", name=" + name + ", birthday=" + birthday + ", scores=" + scores + "]";
	}
	
}
