package Excercise_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MyNews {
	private static List<News> newsList;

	public static void question1() {
		newsList = new ArrayList<>();
		int i = -1;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Menu:");
		System.out.println("1 - Insert news");
		System.out.println("2 - View list news");
		System.out.println("3 - Average rate");
		System.out.println("4 - Exit");
		do {
			System.out.print("Nhap lua chon: ");
			i = scanner.nextInt();
			scanner.nextLine();
			switch (i) {
			case 1:
				News news = new News();
				int[] rates = new int[3];
				System.out.print("Nhap vao tieu de: ");
				news.setTitle(scanner.nextLine());
				System.out.print("Nhap vao ngay xuat ban: ");
				news.setPublishDate(scanner.nextLine());
				System.out.print("Nhap vao ten tac gia: ");
				news.setAuthor(scanner.nextLine());
				System.out.print("Nhap vao noi dung: ");
				news.setContent(scanner.nextLine());
				System.out.println("Nhap vao 3 diem danh gia (thang diem 10): ");
				for (int e = 0; e < 3; e++) {
					rates[e] = scanner.nextInt();

				}
				news.setRates(rates);

				newsList.add(news);

				break;
			case 2:
				for (News newslist : newsList) {
					newslist.displays();
				}
				break;
			case 3:
				for (News newslist : newsList) {
					System.out.println("Title: " + newslist.getTitle() + "  Average Rate: " + newslist.calculate());
				}
				break;
			case 4:
				System.out.println("Ket thuc chuong trinh");
				return;
			default:
				System.out.println("Nhap sai moi nhap lai");
			}
		} while (true);
	}

	public static void main(String[] args) {
		question1();
	}
}
