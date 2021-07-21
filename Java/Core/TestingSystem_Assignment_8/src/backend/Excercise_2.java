package backend;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import entity.Student_2;

public class Excercise_2 {
	private static ArrayList<Student_2> students = new ArrayList<>();

	public static void addStudent() {
		students.add(new Student_2(1, "Callida Kemmer", LocalDate.parse("1997-09-27"), 5f));
		students.add(new Student_2(2, "Vidovic Daud", LocalDate.parse("1998-08-09"), 4f));
		students.add(new Student_2(3, "Elenore Tillot", LocalDate.parse("1999-04-07"), 10f));
		students.add(new Student_2(4, "Torie Copnall", LocalDate.parse("1996-06-23"), 9f));
		students.add(new Student_2(5, "Justinian Gurry", LocalDate.parse("2000-08-18"), 8f));
	}

	public static void printSortedByName() {
		Collections.sort(students, new Comparator<Student_2>() {
			public int compare(Student_2 o1, Student_2 o2) {
				return o1.getName().compareTo(o2.getName());
			}
		});
	}

	public static void sortStudent() {

		Collections.sort(students, new Comparator<Student_2>() {
			public int compare(Student_2 o1, Student_2 o2) {

				if (o1.getName().equals(o2.getName())) {
					return o1.getBirthday().compareTo(o2.getBirthday());
				} else if (o1.getName().equals(o2.getName()) && o1.getBirthday() == o2.getBirthday()) {
					return o1.getScores() > o2.getScores() ? 1 : -1;
				} else {
					return o1.getName().compareTo(o2.getName());
				}
			}
		});
	}

	public static void printStudent() {
		for (Student_2 student : students) {
			System.out.println(student.toString());
		}
	}

}
