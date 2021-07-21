package entity.Excercise2;

public final class PrimaryStudent extends Student {

	public PrimaryStudent(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public PrimaryStudent() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "PrimaryStudent [ ID="+ ID + ", name=" + name + ", " + study() + "]";
	}
	
}
