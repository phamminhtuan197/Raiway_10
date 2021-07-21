package entity.Excercise1;

public class Student {
	int id;
	String name;
	public static String college = "Dai hoc bach khoa";
	static int i = 1;
	public static float moneyGroup = 100f;
	public static int count = 0;

	public Student(int id, String name) {
		super();
		this.id = i++;
		this.name = name;
		count++;
	}
	
	public Student() {
		count++;
		if (count > 7) {
			System.out.print("khong duoc tao them sinh vien ");		
		}
	}
	
	public Student(String name) {
		super();
		count++;
		this.id = i++;
		this.name = name;
		if (count > 7) {
			System.out.print("khong duoc tao them sinh vien ");		
		}
	}
	
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

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", college=" + college + ", moneyGroup=" + moneyGroup + "]";
	}
	
	public String getCollege() {
		return college;
	}
	
	public void setCollege(String college) {
		this.college = college;
	}
}
