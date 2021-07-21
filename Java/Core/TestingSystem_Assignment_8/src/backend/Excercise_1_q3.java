package backend;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import entity.Student;

public class Excercise_1_q3 {
	private static Set<Student> students = new LinkedHashSet<>();
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
		System.out.println("Tong so hoc sinh: " + students.size());
	}

	public static void get4thElement() {
		Iterator<Student> studentIterator = students.iterator();
		for (int i = 0; i < 3; i++) {
			studentIterator.next();
		}
		System.out.println("Hoc sinh thu 4 la: " + studentIterator.next());
	}

	public static void printFirstAndLastStudent() {
		Iterator<Student> studentIterator = students.iterator();
		System.out.println("Hoc sinh dau tien la: " + studentIterator.next());
		for (int i = 1; i < students.size() - 1; i++) {
			studentIterator.next();
		}
		System.out.println("Hoc sinh cuoi cung la: " + studentIterator.next());
	}

	public static void addStudentToTheFirstPosition() {
		List<Student> listStudent = new ArrayList<Student>();
		listStudent.addAll(students);
		listStudent.add(0, new Student(0, "Nguyen Minh Tuan"));
		System.out.println(listStudent);
	}

	public static void addStudentToTheLastPosition() {
		students.add(new Student(7, "Nguyen Minh Tu"));
	}

	public static void reverseStudents() {
		List<Student> listStudent = new ArrayList<Student>();
		listStudent.addAll(students);
		Collections.reverse(listStudent);

		System.out.println("Danh sach hoc sinh dao nguoc:");
		System.out.println(listStudent);
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
		List<Student> listStudent = new ArrayList<Student>();
		listStudent.addAll(students);
		for (int i = 0; i < listStudent.size(); i++) {
			for (int j = 0; j < listStudent.size(); j++) {
				if (listStudent.get(i).getName().equals(listStudent.get(j).getName())
						&& listStudent.get(i).getId() != listStudent.get(j).getId()) {
					System.out.println("Cac hoc sinh co ten giong nhau: ");
					System.out.println(listStudent.get(i) + " va " + listStudent.get(j));
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
	
	public static void namesNotOverlap() {
		
	}	
}
