package backend;

import java.util.Scanner;

public class Excercise1 {
	private static Scanner scanner = new Scanner(System.in);

	public static void question1() {
		System.out.print("Nhap do dai can chuyen doi (cm): ");
		double cm = scanner.nextDouble();
		double inch = (double) Math.ceil((cm / 2.54) * 100) / 100;
		double foot = (double) Math.ceil((inch / 12) * 100) / 100;
		System.out.println(cm + " (cm) = " + inch + "(inch)");
		System.out.println(cm + " (cm) = " + foot + "(foot)");
	}

	public static void question2() {
		System.out.print("Nhap so giay (0 --> 68399): ");
		int n = scanner.nextInt();

		int hour = n / 3600;
		int minute = (n % 3600) / 60;
		int second = (n % 3600 % 60);

		System.out.println(n + "s = " + hour + "h:" + minute + "m:" + second + "s");
	}

	public static void question3() {
		int[] arr = new int[4];
		for (int i = 0; i < 4; i++) {
			System.out.print("Nhap so nguyen thu " + (i + 1) + ": ");
			arr[i] = scanner.nextInt();
		}

		int min = arr[0];
		int max = arr[0];

		for (int i = 0; i < 4; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println("So lon nhat la: " + max);
		System.out.println("So nho nhat la: " + min);
	}

	public static void question4() {
		System.out.print("Nhap so tu nhien thu nhat: ");
		int a = scanner.nextInt();
		System.out.print("Nhap so tu nhien thu hai: ");
		int b = scanner.nextInt();

		int c = a - b;
		System.out.println("Hieu cua so thu nhat voi so thu hai la: " + c);
		if (c > 0) {
			System.out.println("So thu nhat lon hon so thu hai");
		} else if (c < 0) {
			System.out.println("So thu nhat nho hon so thu hai");
		} else {
			System.out.println("So thu nhat bang so thu hai");
		}
	}

	public static void question5() {
		System.out.print("Nhap so a= ");
		int a = scanner.nextInt();
		System.out.print("Nhap so b= ");
		int b = scanner.nextInt();

		int c = a % b;
		if (c == 0) {
			System.out.println("a chia het cho b");
		} else {
			System.out.println("a khong chia het cho b");
		}
	}

	public static void question6() {
		System.out.print("Nhap diem phay mon Toan: ");
		float toan = scanner.nextFloat();
		System.out.print("Nhap diem phay mon Ly: ");
		float ly = scanner.nextFloat();
		System.out.print("Nhap diem phay mon Hoa: ");
		float hoa = scanner.nextFloat();

		float average = ((toan * 2) + ly + hoa) / 4;
		System.out.println("Diem trung binh= " + average);
		if (average >= 9.0f) {
			System.out.println("Hoc sinh xuat sac");
		} else if (average >= 8.0f && average < 9.0f) {
			System.out.println("Hoc sinh gioi");
		} else if (average >= 7.0f && average < 8.0f) {
			System.out.println("Hoc sinh kha");
		} else if (average >= 6.0f && average < 7.0f) {
			System.out.println("Hoc sinh trung binh kha");
		} else if (average >= 5.0f && average < 6.0f) {
			System.out.println("Hoc sinh trung binh");
		} else {
			System.out.println("Hoc sinh kem");
		}
	}
}
