package backend;

import java.util.ArrayList;

import entity.MyMath;
import entity.MyNumber;
import entity.Salary;

public class Excercise_4 {
	public static void question1() {
		ArrayList<Salary> salarys = new ArrayList<>();
		Salary<Integer> salary1 = new Salary<Integer>(12345);
		
		salarys.add(salary1);
		
		for (Salary salary : salarys) {
			System.out.println(salary);
		}
	}
	public static void question2() {
		ArrayList<MyNumber> myNumbers = new ArrayList<>();
		MyNumber<Integer> myNumber1 = new MyNumber<Integer>(12345);
		
		myNumbers.add(myNumber1);
		
		for (MyNumber myNumber : myNumbers) {
			System.out.println(myNumber);
		}
	}
	public static void question3() {
		Integer[] arrInt = { 1, 2, 3 };
		int maxInt = arrInt[0];
		for (Integer arrint : arrInt) {
			if (maxInt < arrint) {
				maxInt = arrint;
			}
		}
		System.out.println("So lon nhat la: " + maxInt);
		
		Float[] arrFloat = { 10f, 22f, 32f };
		Float maxFloat = arrFloat[0];
		for (Float arrfloat : arrFloat) {
			if (maxFloat < arrfloat) {
				maxFloat = arrfloat;
			}
		}
		System.out.println("So lon nhat la: " + maxFloat);
	}
	public static void question4() {
		MyMath<Integer> mathInt = new MyMath<>();
		Integer sumInt1 = mathInt.add(1, 10);
		System.out.println(sumInt1);

	}
	
	public static void question5() {
		ArrayList <Object> infoCustomer = new ArrayList<>();
		infoCustomer.add("Nguyen Van Nam");
		infoCustomer.add(30);
		infoCustomer.add("Ha Dong, Ha Noi");
		
		for (Object info : infoCustomer) {
			System.out.println(info);
		}
	}
	public static void main (String[] args) {
		question4();
	}
}
