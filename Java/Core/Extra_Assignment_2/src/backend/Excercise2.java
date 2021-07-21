package backend;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Excercise2 {
	private static float[] arr = { 10, 4.5f, 2, 4.5f, 3.2f, 7, 8, 4.5f, 7, 10 };
	private static Scanner scanner = new Scanner(System.in);

	public static int countElement(int n, float arr2) {
		int count = 0;
		for (int j = 0; j < n; j++) {
			if (arr[j] == arr2)
				count++;
		}
		return (count);
	}

	public static void question1() {
		int i;
		System.out.print("Cac phan tu trong day xuat hien 1 lan: ");
		for (i = 0; i < arr.length; i++) {
			if (countElement(arr.length, arr[i]) == 1)
				System.out.print(arr[i] + "; ");
		}
	}

	public static void question2() {
		int i;
		System.out.print("Cac phan tu trong day xuat hien 2 lan: ");
		for (i = 0; i < arr.length; i++) {
			if (countElement(arr.length, arr[i]) == 2 && countElement(i, arr[i]) == 0) {
				System.out.print(arr[i] + "; ");
			}
		}
	}

	public static void question3() {
		int i;
		for (i = 0; i < arr.length; i++) {
			if (countElement(i, arr[i]) == 0) {
				System.out.println("Phan tu " + arr[i] + " xuat hien " + countElement(arr.length, arr[i]) + " lan");
			}
		}

	}

	public static void question4() {
		int sum = 0;
		int n;
		System.out.print("Nhap vao so nguyen: ");
		int i = scanner.nextInt();
		while (i != 0) {
			n = i % 10;
			sum += n;
			i /= 10;
		}
		System.out.println("Tong cac chu so cua so da nhap la: " + sum);
	}

	public static void question5() {
		System.out.print("Nhap n = ");
		int n = scanner.nextInt();
		// phân tích số nguyên dương n
		List<Integer> listNumbers = phanTichSoNguyen(n);
		// in kết quả ra màn hình
		System.out.printf("Kết quả: %d = ", n);
		int size = listNumbers.size();
		for (int i = 0; i < size - 1; i++) {
			System.out.print(listNumbers.get(i) + " x ");
		}
		System.out.print(listNumbers.get(size - 1));
	}

	public static List<Integer> phanTichSoNguyen(int n) {
		int i = 2;
		List<Integer> listNumbers = new ArrayList<Integer>();
		// phân tích
		while (n > 1) {
			if (n % i == 0) {
				n = n / i;
				listNumbers.add(i);
			} else {
				i++;
			}
		}
		// nếu listNumbers trống thì add n vào listNumbers
		if (listNumbers.isEmpty()) {
			listNumbers.add(n);
		}
		return listNumbers;
	}

	public static void main(String[] args) {
		question4();
	}
}
