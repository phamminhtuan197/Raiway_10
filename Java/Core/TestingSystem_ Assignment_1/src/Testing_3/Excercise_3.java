package Testing_3;

public class Excercise_3 {
	public static void question1() {
		int salary = 5000;
		float salaryF = (float) salary;
		System.out.printf("%1.2f%n", salaryF);
	}
	
	public static void question2() {
		String stringNumber = "1234567";
		int number = Integer.parseInt(stringNumber);
		System.out.println(number);
	}
	
	public static void question3() {
		Integer a2 = 1234567;
		int a3 = a2.intValue();
		System.out.println(a3);
	}
	
	public static void main(String[] args) {}
}
