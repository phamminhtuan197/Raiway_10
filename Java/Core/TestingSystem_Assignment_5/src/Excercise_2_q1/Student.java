package Excercise_2_q1;

public class Student implements IStudent {
	String id;
	String name;
	int group;
	
	
	public Student(String id, String name, int group) {
		super();
		this.id = id;
		this.name = name;
		this.group = group;
	}

	public Student() {
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getGroup() {
		return group;
	}
	public void setGroup(int group) {
		this.group = group;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", group= group " + group + "]";
	}
	@Override
	public void diemDanh() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void hocBai() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void donVeSinh() {
		// TODO Auto-generated method stub
		
	}
}
