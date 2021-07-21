package entity.Excercise1;

public class MyMath {
	int n1;
	int n2;
	public int getN1() {
		return n1;
	}
	public void setN1(int n1) {
		this.n1 = n1;
	}
	public int getN2() {
		return n2;
	}
	public void setN2(int n2) {
		this.n2 = n2;
	}
	public MyMath(int n1, int n2) {
		super();
		this.n1 = n1;
		this.n2 = n2;
	}
	@Override
	public String toString() {
		return "MyMath [n1=" + n1 + ", n2=" + n2 + "]";
	}
	public static int max(int n1, int n2) {
		if (n1 >= n2) {
			return n1;
		}
		else {
			return n2;
		}
	}
	public static int min(int n1, int n2) {
		if (n1 <= n2) {
			return n1;
		}
		else {
			return n2;
		}
	}
	public static int sum(int n1, int n2) {
		return n1+n2;
	}
}
