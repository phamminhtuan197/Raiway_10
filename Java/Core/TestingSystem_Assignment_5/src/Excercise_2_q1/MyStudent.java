package Excercise_2_q1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class MyStudent {
	private static List<Student> newsList;
	public static void question1() {
		newsList = new ArrayList<>();
		int i = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("1 - Them hoc sinh");
		System.out.println("2 - Diem danh");
		System.out.println("3 - Hoc bai");
		System.out.println("4 - Don ve sinh");
		System.out.println("5 - Thoat chuong trinh");
		do {
			System.out.print("Nhap lua chon: ");
			 i = scanner.nextInt();
			scanner.nextLine();
			switch (i) {
			case 1:
				Student student = new Student();
				System.out.print("Nhap ID: ");
				student.setId(scanner.next());
				scanner.nextLine();
				System.out.print("Nhap ho va ten: ");
				student.setName(scanner.nextLine());
				System.out.print("Nhap group: ");
				student.setGroup(scanner.nextInt());
				scanner.nextLine();
				
				newsList.add(student);
//				System.out.println(newsList);
				break;
				
			case 2:
				for (Student newslist : newsList) {
					System.out.println(newslist.name + " diem danh");
				}
				break;
				
			case 3:
				for (Student newslist : newsList) {
					if (newslist.group == 1) {
						System.out.println(newslist.name + " dang hoc bai");
					}
				}
				break;
			case 4:
				for (Student newslist : newsList) {
					if (newslist.group == 2) {
						System.out.println(newslist.name + " dang di don ve sinh");
					}
				}
				break;
			case 5:
				System.out.println("Ket thuc chuong trinh");
				return;
			default:
				System.out.println("Nhap sai moi nhap lai");
			}
		}
		while (true);
	}
	
	public static void main (String[] args) {
		question1();
	}
}
