package backend;

import java.util.Scanner;

public class Excercise1 {
	private static Scanner scanner = new Scanner(System.in);
	private static float[] arrFloat = { 1f, 2f, 3.5f, 4.7f, -5.2f, -6.8f, 7.9f, 3.5f, 9.1f, 10.12f };
	private static int[][] arrInt2Way = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };

	public static void question1() {

		float sum = 0;
		for (float arrfloat : arrFloat) {
			sum = sum + arrfloat;
		}
		System.out.println("Tong cac so trong day= " + sum);

		float average = sum / arrFloat.length;
		System.out.println("Trung binh cong cac so trong day= " + average);

		float sumNegative = 0;
		for (float arrfloat : arrFloat) {
			if (arrfloat < 0) {
				sumNegative = sumNegative + arrfloat;
			}
		}
		System.out.println("Tong cac so am= " + sumNegative);

		float sumPositive = 0;
		for (float arrfloat : arrFloat) {
			if (arrfloat > 0) {
				sumPositive = sumPositive + arrfloat;
			}
		}
		System.out.println("Tong cac so duong= " + sumPositive);

		float sumLocationEven = 0;
		for (int i = 0; i < arrFloat.length; i++) {
			if (i % 2 == 0) {
				sumLocationEven = sumLocationEven + arrFloat[i];
			}
		}
		System.out.println("Tong cac so o vi tri chan= " + sumLocationEven);

		float sumLocationOdd = 0;
		for (int i = 0; i < arrFloat.length; i++) {
			if (i % 2 != 0) {
				sumLocationOdd = sumLocationOdd + arrFloat[i];
			}
		}
		System.out.println("Tong cac so o vi tri le= " + sumLocationOdd);
	}

	public static int question2(float x) {
		int location = 0;
		int i = 0;
		for (i = arrFloat.length - 1; i >= 0; i--) {
			if (arrFloat[i] == x) {
				location = i + 1;
			}
		}
		return location;
	}

//	Mang 2 chieu : so dong * so cot = so phan tu
	public static void question3() {
		System.out.println("Mang da nhap");
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.printf(arrInt2Way[i][j] + "\t");
			}
			System.out.println("\n");
		}
	}

	public static void question4() {
		float a;
		for (int i = 0; i < arrFloat.length - 1; i++) {
			for (int j = 0; j < arrFloat.length - 1 - i; j++) {
				if (arrFloat[j] > arrFloat[j + 1]) {
					a = arrFloat[j];
					arrFloat[j] = arrFloat[j + 1];
					arrFloat[j + 1] = a;
				}
			}
		}
		System.out.println("Sap xep theo thu tu tang dan:");
		for (int i = 0; i < arrFloat.length; i++) {
			System.out.printf(arrFloat[i] + "\t");
		}
		System.out.println();

		for (int i = 0; i < arrFloat.length - 1; i++) {
			for (int j = 0; j < arrFloat.length - 1 - i; j++) {
				if (arrFloat[j] < arrFloat[j + 1]) {
					a = arrFloat[j];
					arrFloat[j] = arrFloat[j + 1];
					arrFloat[j + 1] = a;
				}
			}
		}
		System.out.println("Sap xep theo thu tu giam dan:");
		for (int i = 0; i < arrFloat.length; i++) {
			System.out.printf(arrFloat[i] + "\t");
		}
		System.out.println();
	}

	public static void question5() {
		int a;
//		Tao chuoi so
		System.out.print("Nhap vao so phan tu cua chuoi: ");
		int amount = scanner.nextInt();
		scanner.nextLine();
		int[] arrInt = new int[amount];
		for (int i = 0; i < amount; i++) {
			System.out.print("Nhap vao phan tu thu " + (i + 1) + " = ");
			int element = scanner.nextInt();
			arrInt[i] = element;
		}
		for (int i = 0; i < amount; i++) {
			System.out.print(arrInt[i] + "\t");
		}
		System.out.println();

//		Sx tang dan:
		for (int i = 0; i < arrInt.length - 1; i++) {
			for (int j = 0; j < arrInt.length - 1 - i; j++) {
				if (arrInt[j] > arrInt[j + 1]) {
					a = arrInt[j];
					arrInt[j] = arrInt[j + 1];
					arrInt[j + 1] = a;
				}
			}
		}
		System.out.println("Sap xep theo thu tu tang dan:");
		for (int i = 0; i < arrInt.length; i++) {
			System.out.printf(arrInt[i] + "\t");
		}
		System.out.println();

//		Sx giam dan
		for (int i = 0; i < arrInt.length - 1; i++) {
			for (int j = 0; j < arrInt.length - 1 - i; j++) {
				if (arrInt[j] < arrInt[j + 1]) {
					a = arrInt[j];
					arrInt[j] = arrInt[j + 1];
					arrInt[j + 1] = a;
				}
			}
		}
		System.out.println("Sap xep theo thu tu giam dan:");
		for (int i = 0; i < arrInt.length; i++) {
			System.out.printf(arrInt[i] + "\t");
		}
		System.out.println();
	}
}
