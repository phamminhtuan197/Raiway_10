package entity.Excercise2;

public class MyMath {
	public static final float PI = 3.14f;
	int a;
	
	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	@Override
	public String toString() {
		return "MyMath [a=" + a + "]";
	}

	public float sum(int a) {
		return a + PI;
	}
}
