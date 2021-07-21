package entity.Excercise2;

public final class SecondaryStudent extends Student {

	public SecondaryStudent(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public SecondaryStudent() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "SecondaryStudent [ID="+ ID + ", name=" + name + ", " + study() + "]";
	}
	
}
