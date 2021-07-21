package Excercise_2_q2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main { 
	private List<Student> newsList = new ArrayList<>();
	public void input() {
		Student[] students = new Student[11];
		Person person = new Person();
		Student student = new Student();
		person.inputInfo();
		student.inputInfo(); 
		
	}
	public static void main (String[] args) {
		
//		Scanner scanner = new Scanner(System.in);
//		Student student = new Student();
//		int i = 0;
//		System.out.println("1 - Nhap thong tin");
//		System.out.println("2 - Xem danh sach sinh vien");
//		System.out.println("3 - Xet hoc bong");
//		System.out.println("4 - Thoat chuong trinh");
//		do {
//			System.out.println("Nhap lua chon: ");
//			i = scanner.nextInt();
//			scanner.nextLine();
//			switch (i) {
//			case 1:
//				student.inputInfo();
//				newsList.add(new Student());
//				break;
//			case 2:
//				for (Student newslist : newsList) {
//					newslist.showInfo();
//				}
//				break;
//			case 3:
//				for (Student newslist : newsList) {
//					newslist.scholarship();
//				}
//				break;
//			case 4:
//				System.out.println("Ket thuc chuong trinh");
//				return;
//			default:
//				System.out.println("Nhap sai moi nhap lai");
//			}
//		}
//		while (true);
//		
		
		
		
		
	}
}
