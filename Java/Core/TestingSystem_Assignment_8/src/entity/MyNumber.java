package entity;

public class MyNumber<N extends Number> {
	N number;

	public N getNumber() {
		return number;
	}

	public void setNumber(N number) {
		this.number = number;
	}

	public MyNumber(N number) {
		super();
		this.number = number;
	}

	@Override
	public String toString() {
		return "MyNumber [number=" + number + "]";
	}
	
}
