package frontend;

public class A {
	public static int count = 0;
	public int tuoi = 0;
	String name;
	
	public A (String name) {
		count++;
		tuoi++;
		this.name = name;
	}

	@Override
	public String toString() {
		return "count = " + count + " tuoi " + tuoi + " name = " + name;
	}
	
}
