package backend;

import java.util.ArrayList;
import java.util.Scanner;

import entity.Excercise1.HinhChuNhat;
import entity.Excercise1.HinhHocException;
import entity.Excercise1.HinhTron;
import entity.Excercise1.MyMath;
import entity.Excercise1.PrimaryStudent;
import entity.Excercise1.SecondaryStudent;
import entity.Excercise1.Student;
public class Excercise1 {
	private static ArrayList<Student> students = new ArrayList<>();
	private static Scanner scanner = new Scanner(System.in);
	public static void question1() {
		students.add(new Student("Nguyen Van A"));
		students.add(new Student("Nguyen Van B"));
		students.add(new Student("Nguyen Van C"));
		
		for (Student student : students) {
			System.out.println(student);
		}
		Student.college = "Dai hoc cong nghe";
		
		System.out.println("Chuyen truong:");
		for (Student student : students) {
			System.out.println(student);
		}
	}
	public static void question2() {
		
		float totalMoneyGroup = Student.moneyGroup*students.size();
		System.out.println("Tong so tien quy lop la: " + totalMoneyGroup);
		System.out.println("Student 1 lay 50k di mua keo.So tien con lai la: " + (totalMoneyGroup -= 50f));
		System.out.println("Student 2 lay 20k di mua banh mi.So tien con lai la: " + (totalMoneyGroup -= 20f));
		System.out.println("Student 3 lay 150k di mua do dung.So tien con lai la: " + (totalMoneyGroup -= 150f));
		System.out.println("Ca nhom dong them quy moi nguoi 50k.So tien quy lop la: " + (totalMoneyGroup += students.size()*50f));
	}
	public static void question3() {
		System.out.print("Nhap so a: ");
		int a = scanner.nextInt();
		scanner.nextLine();
		System.out.print("Nhap so b: ");
		int b = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Max cua a va b la: " + MyMath.max(a,b));
		System.out.println("Min cua a va b la: " + MyMath.min(a,b));
		System.out.println("Tong cua a va b la: " + MyMath.sum(a,b));
	}
	public static void question4() {
		Student student = new Student();
		System.out.println("Ten truong ban dau: " + student.getCollege());
		System.out.print("Nhap vao ten truong thay the:");
		student.setCollege(scanner.nextLine().trim());
		System.out.println("Da thay the ten truong");
		System.out.println(students);
	}
	public static void question5() {
		System.out.println("So sinh vien co trong danh sach la: " + Student.count);
	}
	public static void question6() {
		PrimaryStudent pri1 = new PrimaryStudent();
		PrimaryStudent pri2 = new PrimaryStudent();
		SecondaryStudent sec1 = new SecondaryStudent();
		SecondaryStudent sec2 = new SecondaryStudent();
		SecondaryStudent sec3 = new SecondaryStudent();
		SecondaryStudent sec4 = new SecondaryStudent();
		
		System.out.println("So hoc sinh tieu hoc " + PrimaryStudent.count );
		System.out.println("So hoc sinh trung hoc " + SecondaryStudent.count );
	}
	
	public static void question7() {
		for (int i = 0; i < 10; i++) {
			Student st = new Student();
		}
		System.out.println("So sinh vien co trong danh sach la: " + Student.count);
	}
	
	public static void question8() {
		ArrayList<HinhChuNhat> hcns = new ArrayList<>();
		ArrayList<HinhTron> hts = new ArrayList<>();
		try {
		for (int i =1; i <9; i++) {
			hcns.add(new HinhChuNhat());
			hts.add(new HinhTron());
			
		}
		}
		catch (HinhHocException e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println(hcns);
			System.out.println(hts);
		}
	}
}
