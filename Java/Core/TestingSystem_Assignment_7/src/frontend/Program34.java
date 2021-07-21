package frontend;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import utils.FileManager;
import utils.IOManager;
import utils.Student;

public class Program34 {
	
	public static ArrayList<Student> students = new ArrayList<>();
	public static Scanner scanner = new Scanner(System.in);
	
	public static void addStudent() {
		System.out.print("So Student can nhap: ");
		int amountStudent = scanner.nextInt();
		for (int i = 0; i < amountStudent; i++) {
			System.out.print("Nhap ID Student so " + (i+1) + ": ");
			int id = scanner.nextInt();
			scanner.nextLine();
			System.out.print("Nhap ten Student so " + (i+1) + ": ");
			String name = scanner.nextLine();
			char[] charArray = name.trim().toCharArray();
			boolean foundSpace = true;
			for (int a = 0; a < charArray.length; a++) {
				if (Character.isLetter(charArray[a])) {
					if (foundSpace) {
						charArray[a] = Character.toUpperCase(charArray[a]);
						foundSpace = false;
					}
				} else {
					foundSpace = true;
				}
			}
			name = String.valueOf(charArray);
			
			students.add(new Student(id, name));
		}
		System.out.println("Da nhap xong!");
	}
	public static void main (String[] args) throws Exception {
		addStudent();
		FileManager.createFile("C:\\Users\\Public\\new", "StudentInformation.txt");
		IOManager.<ArrayList<Student>>writeObject(students,"C:\\Users\\Public\\new\\StudentInformation.txt");
//		IOManager.<ArrayList<Student>>readObject("C:\\Users\\Public\\new\\StudentInformation.txt");
		FileManager.deleteFile("C:\\Users\\Public\\new\\StudentInformation.txt");
	}
}
