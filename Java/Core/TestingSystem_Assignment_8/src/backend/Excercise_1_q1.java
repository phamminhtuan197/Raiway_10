package backend;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import entity.Student;

public class Excercise_1_q1 {
	private static ArrayList<Student> students = new ArrayList<>();;
	private static Scanner scanner = new Scanner(System.in);

	public static void addStudent() {
		students.add(new Student(1, "Pham Minh Tuan"));
		students.add(new Student(2, "Pham Minh Tu"));
		students.add(new Student(3, "Pham Minh Tai"));
		students.add(new Student(4, "Pham Minh Tuan"));
		students.add(new Student(5, "Pham Minh Tinh"));
		students.add(new Student(6, "Pham Minh Tuan"));
	}

	public static void printStudent() {
		for (Student student : students) {
			System.out.println(student);
		}
	}

	public static void printSizeStudent() {
		int size = students.size();
		System.out.println("Tong so hoc sinh: " + size);
	}

	public static void get4thElement() {
		System.out.println("Hoc sinh thu 4 la: " + students.get(4));
	}

	public static void get1stAndLastElement() {
		System.out.println("Hoc sinh thu nhat la: " + students.get(0));
		System.out.println("Hoc sinh cuoi cung la: " + students.get(students.size() - 1));
	}

	public static void add1ElementToTheFirstPosition() {
		students.add(0, new Student(7, "Nguyen Minh Tuan"));
	}

	public static void add1ElementToTheLastPosition() {
		students.add(students.size(), new Student(8, "Nguyen Minh Tu"));
	}

	public static void reversePositionElement() {
		Collections.reverse(students);
		System.out.println("Danh sach hoc sinh sau khi dao nguoc:");
		printStudent();
	}

	public static void searchStudentById() {
		System.out.print("Nhap ID hoc sinh can tim: ");
		int id = scanner.nextInt();
		for (Student student : students) {
			if (student.getId() == id) {
				System.out.println(student);
			}
		}
	}

	public static void searchStudentByName() {
		System.out.print("Nhap ten hoc sinh can tim: ");
		String name = scanner.nextLine();
		char[] charArray = name.trim().toCharArray();
		boolean foundSpace = true;
		for (int i = 0; i < charArray.length; i++) {
			if (Character.isLetter(charArray[i])) {
				if (foundSpace) {
					charArray[i] = Character.toUpperCase(charArray[i]);
					foundSpace = false;
				}
			} else {
				foundSpace = true;
			}
		}
		name = String.valueOf(charArray);
		for (Student student : students) {
			if (student.getName().equals(name.trim())) {
				System.out.println(student);
			}
		}
	}

	public static void printOutStudentsWithTheSameName() {
		for (int i = 0; i < students.size(); i++) {
			for (int j = 0; j < students.size(); j++) {
				if (students.get(i).getName().equals(students.get(j).getName())
						&& students.get(i).getId() != students.get(j).getId()) {
					System.out.println("Cac hoc sinh co ten giong nhau: ");
					System.out.println(students.get(i) + " va " + students.get(j));
				}
			}
		}
	}

	public static void deleteNameOfStudent() {
		for (Student student : students) {
			if (student.getId() == 2) {
				student.setName(null);
			}
		}
	}

	public static void deleteStudent() {
		for (Student student : students) {
			if (student.getId() == 5) {
				students.remove(student);
			}
		}
	}

	public static void studentCopies() {
		ArrayList<Student> studentCopies = new ArrayList<Student>();
		for (Student student : students) {
			studentCopies.add(student);
		}
		System.out.println(studentCopies);
	}
//	public static void main (String[] args) {
//		addStudent();
//		printStudent();
//		printOutStudentsWithTheSameName();
//		
//	}
}
