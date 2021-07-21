package Testing_3;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Excercise_1 {
	static Scanner scanner = new Scanner(System.in);
	static Random random = new Random();

	public static void question1() {
		float salary1;
		float salary2;

		salary1 = (float) 5240.5;
		salary2 = (float) 10970.055;

		int luong1 = (int) salary1;
		int luong2 = (int) salary2;

		System.out.println("Luong so 1: " + luong1 + ", luong so 2: " + luong2);
	}

	public static void question2() {
		int a = random.nextInt(99998);
		if (a < 10) {
			System.out.println("So lay duoc la: 0000" + a);
		} else if (a >= 10 && a < 100) {
			System.out.println("So lay duoc la: 000" + a);
		} else if (a >= 100 && a < 1000) {
			System.out.println("So lay duoc la: 00" + a);
		} else if (a >= 1000 && a < 10000) {
			System.out.println("So lay duoc la: 0" + a);
		} else {
			System.out.println("So lay duoc la: " + a);
		}
	}

	public static void question3() {
		int a = random.nextInt(99998);
		if (a < 10) {
			System.out.println("So lay duoc la: 0000" + a);
		} else if (a >= 10 && a < 100) {
			System.out.println("So lay duoc la: 000" + a);
		} else if (a >= 100 && a < 1000) {
			System.out.println("So lay duoc la: 00" + a);
		} else if (a >= 1000 && a < 10000) {
			System.out.println("So lay duoc la: 0" + a);
		} else {
			System.out.println("So lay duoc la: " + a);
		}
		int a1 = a % 100;
		System.out.println(a1);
	}

	public static void question4() {
		System.out.print("Nhap vao so nguyen a:");
		int a = scanner.nextInt();
		System.out.print("Nhap vao so nguyen b:");
		int b = scanner.nextInt();
		float c = (float) a / (float) b;
		System.out.println("a/b = " + c);
	}

	public static void main(String[] args) {
//		System.out.print("Nhap vao so nguyen a:");
//		int a = scanner.nextInt();
//		System.out.print("Nhap vao so nguyen b:");
//		int b = scanner.nextInt();
//		float c = (float) a / (float) b;
//		System.out.println("a/b = " + c);
//		
//		int[] mang = {1, 2, 3, 4, 5, 6, 7, 8};
//		for (int i = 0; i < mang.length; i++) {
//			System.out.println("mang la " + mang[i]);
//		}
		
//		int a = 0;
//		int b = 0;
//		System.out.print("Nhap vao so nguyen b:");
//		try {
//		 b = scanner.nextInt();
//		 if (b < 0) {
//			 throw new ChecktuoiException("Tuoi khong dc am");
//		 }
//		 scanner.nextLine();
//		}
//		catch (ChecktuoiException e) {
//			System.out.println(e.getMessage());
//		}
////		catch (ArithmeticException e) {
////			System.out.println("message = " + e.getMessage() + "\n");
////		}
////		catch (InputMismatchException e) {
////			System.out.println("nhap sai kieu du lieu nhap lai b:");
////			scanner.nextLine();
////			b = scanner.nextInt();
////		}
//		catch (Exception e) {
//			System.out.println("message = " + e.getMessage());
//		}
//		finally {
//			System.out.println("b = " + b);
//		}
	}
}