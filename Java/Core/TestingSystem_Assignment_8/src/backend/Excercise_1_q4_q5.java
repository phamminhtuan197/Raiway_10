package backend;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Excercise_1_q4_q5 {
	private static HashSet<String> students = new HashSet<String>();

	public static void addStudent() {
		students.add("Pham Minh Tuan");
		students.add("Pham Minh Tu");
		students.add("Pham Minh Tai");
		students.add("Pham Minh Tuan");
		students.add("Pham Minh Tinh");
		students.add("Pham Minh Tuan");
	}

	public static void printStudentNameNotOverlap() {
		for (String student : students) {
			System.out.println(student);
		}
	}

	public static void sortByName() {
		Set<String> setStudent = new LinkedHashSet<String>(students);
		List<String> listStudent = new ArrayList<String>(setStudent);
		Collections.sort(listStudent);
		setStudent = new LinkedHashSet<>(listStudent);
		System.out.println(setStudent);
	}
}
