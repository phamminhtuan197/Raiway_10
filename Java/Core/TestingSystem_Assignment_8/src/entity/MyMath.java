package entity;

public class MyMath<N extends Number> {
	N number;

	public N getNumber() {
		return number;
	}

	public void setNumber(N number) {
		this.number = number;
	}

	public MyMath(N number) {
		super();
		this.number = number;
	}

	public MyMath() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "MyMath [number=" + number + "]";
	}

	@SuppressWarnings({ "unchecked" })
	public N add(N... numbers) {
		Double sum = 0d;
		for (N number : numbers) {
			 sum += number.doubleValue();
		}
		return (N) sum;
	}
}
