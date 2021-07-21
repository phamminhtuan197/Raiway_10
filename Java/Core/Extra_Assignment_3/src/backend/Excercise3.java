package backend;

import java.util.Scanner;

public class Excercise3 {
	private static Scanner scanner = new Scanner(System.in);

	static int giaiDacBiet = 83572;
	static int[] ketQua = { 83572, 70723, 14308, 19786, 93904, 24623, 11719, 71671, 18292, 11387, 6970, 4346, 6358,
			1736, 9739, 4459, 1481, 5172, 8040, 9893, 224, 131, 499, 01, 80, 65, 12 };

	public static void danhLo() {
		int amount = 0;
		System.out.print("Ghi anh con lô: ");
		int lo = scanner.nextInt();
		System.out.print("Mấy điểm? (1 điểm = 23.000VND): ");
		int diem = scanner.nextInt();
		for (int i = 0; i < ketQua.length; i++) {
			int a = ketQua[i] % 100;
			if (lo == a) {
				amount++;
			}
		}
		if (amount != 0) {
			System.out.println("Lô " + lo + " về " + amount + " nháy");
			System.out.println("Bạn trúng " + (diem * 80000 * amount) + " VNĐ tiền lô");
		} else {
			System.out.println("Tạch!!!Tạch!!!Tạch!!!Tạch!!!Tạch!!!Tạch!!!");
			System.out.println("Còn thở còn gỡ bạn ơi");
		}
	}

	public static void danhDe() {

		System.out.print("Ghi anh con đề: ");
		int de = scanner.nextInt();
		System.out.print("Mấy điểm? (1 điểm = 23.000VND): ");
		int diem = scanner.nextInt();
		int a = giaiDacBiet % 100;
		if (de == a) {
			System.out.println("Bạn trúng " + (diem * 23 * 70 * 1000) + " VNĐ tiền đề");
		} else {
			System.out.println("Tạch!!!Tạch!!!Tạch!!!Tạch!!!Tạch!!!Tạch!!!");
			System.out.println("Còn thở còn gỡ bạn ơi");
		}

	}

	public static void danhLoXien() {
		System.out.print("Xiên mấy? ");
		int n = scanner.nextInt();
		int[] count = new int[n];
		for (int m = 0; m < n; m++) {
			int[] lo = new int[n];
			System.out.print("Ghi anh con lô: ");
			lo[m] = scanner.nextInt();
			for (int i = 0; i < ketQua.length; i++) {
				int a = ketQua[i] % 100;
				if (lo[m] == a) {
					count[m]++;
				}
			}
		}

		int min = count[0];
		for (int i = 0; i < count.length; i++) {
			if (count[i] < min) {
				min = count[i];
			}
		}
		System.out.print("Mấy điểm? (1 điểm = 23.000VND): ");
		int diem = scanner.nextInt();

		if (min != 0) {
			System.out.println("Bộ lô xiên " + n + " của bạn về " + min + " nháy");

			System.out.println("Bạn trúng " + (diem * 23000 * heSo(n) * min) + " VNĐ tiền lô");
		} else {
			System.out.println("Tạch!!!Tạch!!!Tạch!!!Tạch!!!Tạch!!!Tạch!!!");
			System.out.println("Còn thở còn gỡ bạn ơi");
		}
	}

	public static int heSo(int n) {
		int heSo = -10;
		return heSo += heSo + (15 * Math.pow(2, (n - 1)));
	}

	public static void soXo() {

		while (true) {
			System.out.println("1 - Đánh lô");
			System.out.println("2 - Đánh lô xiên");
			System.out.println("3 - Đánh đề");
			System.out.print("Chơi gì?  ");
			int i = scanner.nextInt();
			scanner.nextLine();
			if (i == 1 || i == 2 || i == 3) {
				switch (i) {
				case 1:
					danhLo();
					break;
				case 2:
					danhLoXien();
					break;
				case 3:
					danhDe();
					break;
				}
				System.out.print("Chơi tiếp đi bạn ơi (Y/N): ");
				String yesNo = scanner.next().toUpperCase();
				if (yesNo.trim().equals("Y")) {
					System.out.println("Nghiện là dở rồi !!!!");
				} else if (yesNo.trim().equals("N")) {
					System.out.println("Kết thúc chương trình.");
					return;
				}
			} else {
				System.out.println("Nhập 1, 2 hoặc 3 thôi");
			}
		}
	}
}
