package backend;

import java.util.ArrayList;
import java.util.Scanner;

import entity.Excercise2.MyMath;
import entity.Excercise2.PrimaryStudent;
import entity.Excercise2.SecondaryStudent;
import entity.Excercise2.Student;

public class Excercise2 {
	private static ArrayList<Student> students = new ArrayList<>();
	private static Scanner scanner = new Scanner(System.in);

	public static void question1() {
		MyMath mymap = new MyMath();
		System.out.print("Nhap vao so a= ");
		int a = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Tong cua a va PI la: " + mymap.sum(a));
	}

	public static void question2() {

		students.add(new Student("Pham Minh Tuan"));
		students.add(new Student("Pham Minh Tu"));
		students.add(new Student("Pham Minh T"));

		for (Student student : students) {
			System.out.println(student);
		}
	}

	public static void question3() {
		PrimaryStudent pri = new PrimaryStudent("Pham Minh Tuan");
		SecondaryStudent sec = new SecondaryStudent("Pham Minh Tu");
		System.out.println(pri);
		System.out.println(sec);
	}
}
