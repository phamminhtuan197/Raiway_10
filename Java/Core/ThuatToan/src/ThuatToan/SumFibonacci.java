package ThuatToan;

import java.util.Scanner;

public class SumFibonacci {
	private static Scanner scanner = new Scanner(System.in);

//Tinh tong n so Fibonacci dau tien
//	B1: Tim n so Fibonacci dau tien
//	public static void main(String[] args) {
//		System.out.println("Nhap so so dau tien cua day Fibonacci: ");
//		int n = scanner.nextInt();
//		System.out.print("Tong cua " + n + " so dau tien cua day Fibonacci la: " + sum(n));
//
//	}

	public static void main(String[] args) {

		System.out.print("Nhap so so dau tien cua day Fibonacci can tinh tong: ");
		int n = inputId();
		Integer[] arr = new Integer[n];
		int total = 0;
//		System.out.println(n + " so dau tien cua day Fibonacci: ");
		for (int i = 0; i < n; i++) {
//			System.out.print(fibonacci(i) + " ");
//			Day Fibonacci bat dau tu 0
			arr[i] = fibonacci(i);
//			Day Fibonacci bat dau tu 1
//			arr[i] = fibonacci(i+1);
		}
		for (int i = 0; i < arr.length; i++) {
			total = total + arr[i];
		}
		System.out.print("Tong " + n + " so dau tien cua day Fibonacci la: " + total);
	}

	public static int fibonacci(int n) {
		if (n == 0 || n == 1) {
			return n;
		} else {
			return fibonacci(n - 1) + fibonacci(n - 2);
		}
	}

	public static int inputId() {
		while (true) {
			int id = inputInt("Hay nhap vao so nguyen, moi nhap lai: ");
			if (id >= 0) {
				return id;
			}
			// else
			System.out.print("Nhap vao mot so nguyen khong am, moi nhap lai:");
		}
	}

	public static int inputInt(String errorMessage) {
		while (true) {
			try {
				return Integer.parseInt(scanner.nextLine().trim());
			} catch (Exception e) {
				System.err.println(errorMessage);
			}
		}
	}
}
