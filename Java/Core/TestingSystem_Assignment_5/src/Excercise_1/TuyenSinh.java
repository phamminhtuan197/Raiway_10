package Excercise_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TuyenSinh {
	private static List<QLTS> newsList;

	public static void question2() {
		newsList = new ArrayList<>();

		Scanner scanner = new Scanner(System.in);
		int i = 0;
		System.out.println("1 - Them thi sinh moi");
		System.out.println("2 - Hien thong tin cac thi sinh");
		System.out.println("3 - Tim kiem thi sinh");
		System.out.println("4 - Thoat chuong trinh");
		do {
			System.out.print("Nhap lua chon: ");
			i = scanner.nextInt();
			switch (i) {
			case 1:
				QLTS qlts = new QLTS();
				System.out.print("Nhap so bao danh: ");
				qlts.setSbd(scanner.nextInt());
				scanner.nextLine();
				System.out.print("Nhap Ho va Ten: ");
				qlts.setName(scanner.nextLine());
				System.out.print("Nhap dia chi: ");
				qlts.setAdress(scanner.nextLine());
				System.out.print("Nhap muc do uu tien: ");
				qlts.setPriorityLevel(scanner.nextLine());
				System.out.print("Nhap khoi thi: ");
				qlts.setGrade(scanner.next());
				System.out.println("Da nhap xong");

				newsList.add(qlts);
				break;
			case 2:
//				for (QLTS newslist : newsList) {
//					System.out.println(newslist.toString());
//					}
				viewListThiSinh();
				break;
			case 3:
//				System.out.print("Nhap SBD cua thi sinh can tim: ");
//				int a = scanner.nextInt();
//				scanner.nextLine();
//				for (QLTS quanli : newsList) {
//					if (quanli.getSbd() == a) {
//						System.out.println(quanli);
//					}
//				}
				searchThiSinh();
				break;
			case 4:
				System.out.println("Ket thuc chuong trinh");
				return;
			}
		} while (true);
	}

	public static void addThiSinh() {
		QLTS qlts = new QLTS();
		qlts.addThiSinh();
	}

	public static void viewListThiSinh() {
		for (QLTS newslist : newsList) {
			System.out.println(newslist.toString());
		}
	}

	public static void searchThiSinh() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap SBD cua thi sinh can tim: ");
		int a = scanner.nextInt();
		scanner.nextLine();
		for (QLTS quanli : newsList) {
			if (quanli.getSbd() == a) {
				System.out.println(quanli);
			}
		}
	}

	public static void main(String[] args) {
		question2();
	}
}
