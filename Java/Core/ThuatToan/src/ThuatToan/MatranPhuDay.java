package ThuatToan;

import java.util.Scanner;

public class MatranPhuDay {
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Nhap so dong cua ma tran: ");
		int m = inputId();
		System.out.print("Nhap vao so cot cua ma tran: ");
		int n = inputId();

		int[][] A = new int[m][n];

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("Nhap phan tu dong " + (i + 1) + " cot " + (j + 1) + ": ");
				A[i][j] = scanner.nextInt();
			}
		}
		System.out.println("Ma tran vua nhap: ");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(A[i][j] + "\t");
			}
			// xuong dong
			System.out.println("\n");
		}
		int a = 0;
		Integer[] arr = new Integer[n];
		for (int i = 0; i < m - 1; i++) {

			for (int j = 0; j < n; j++) {
				arr[j] = (A[i][j] * A[i][j]) + (A[i + 1][j] * A[i + 1][j]);
			}

		}
		int c = 1;
		for (int b : arr) {
			c *= b;
		}
		if (c == 0) {
			System.out.println("Ma tran khong phu day");
		} else {
			System.out.println("Ma tran phu day");
		}

	}

	public static int inputId() {
		while (true) {
			int id = inputInt("Hay nhap vao so nguyen, moi nhap lai: ");
			if (id > 0) {
				return id;
			}
			System.out.print("Nhap vao mot so nguyen duong, moi nhap lai:");
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
