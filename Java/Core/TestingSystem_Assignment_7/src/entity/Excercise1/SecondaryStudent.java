package entity.Excercise1;

public class SecondaryStudent extends Student {
	public static int count = 0;
	public SecondaryStudent() {
		super();
		count++;
	}
	@Override
	public String toString() {
		return "SecondaryStudent [id=" + id + ", name=" + name + "]";
	}
	
}
