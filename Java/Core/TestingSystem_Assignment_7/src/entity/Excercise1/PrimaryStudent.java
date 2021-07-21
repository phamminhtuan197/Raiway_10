package entity.Excercise1;

public class PrimaryStudent extends Student {
	public static int count = 0;
	@Override
	public String toString() {
		return "PrimaryStudent [id=" + id + ", name=" + name + "]";
	}
	public PrimaryStudent() {
		super();
		count++;
	}
}
