package backend;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class Excercise_1_q6_q7 {
	private static Map<Integer, String> students = new HashMap<>();

	public static void addStudent() {
		students.put(1, "Pham Minh Tuan");
		students.put(2, "Pham Minh Tu");
		students.put(3, "Pham Minh Tai");
		students.put(4, "Pham Minh Tuan");
		students.put(5, "Pham Minh Tinh");
		students.put(6, "Pham Minh Tuan");
	}

	public static void printKey() {
//		Set<Integer> keys = students.keySet();
//        for (Integer key : keys) {
//            System.out.println(key + " " + students.get(key));
//        }
		for (Map.Entry<Integer, String> entry : students.entrySet()) {
			System.out.println(entry.getKey());
		}
	}

	public static void printValue() {
		for (Map.Entry<Integer, String> entry : students.entrySet()) {
			System.out.println(entry.getValue());
		}
	}

	public static void sortByName() {
//		Khoi tao Set entry
		Set<Entry<Integer, String>> setStudent = students.entrySet();
//		Tao custom Comparator
		Comparator<Entry<Integer, String>> comparator = new Comparator<Entry<Integer, String>>() {
			public int compare(Entry<Integer, String> e1, Entry<Integer, String> e2) {
				String v1 = e1.getValue();
				String v2 = e2.getValue();
				return v1.compareTo(v2);
			}
		};
//		Convert Set thanh List
		List<Entry<Integer, String>> listStudent = new ArrayList<>(setStudent);
//		Sap xep List
		Collections.sort(listStudent, comparator);
//		Tao LinkedHashMap roi put cac entry tu List da sap xep sang
		LinkedHashMap<Integer, String> sortedStudent = new LinkedHashMap<>(listStudent.size());
		for (Entry<Integer, String> entry : listStudent) {
			sortedStudent.put(entry.getKey(), entry.getValue());
		}
//	    In ra
		Set<Entry<Integer, String>> sortedStudents = sortedStudent.entrySet();
		System.out.println("Danh sach da sap xep theo ten:");
		for (Entry<Integer, String> sortedstudents : sortedStudents) {
			System.out.println(sortedstudents.getKey() + " " + sortedstudents.getValue());
		}
	}

	public static void convertMapToSet() {
		Set<Entry<Integer, String>> setStudent = students.entrySet();
		for (Entry<Integer, String> entry : setStudent) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}

	public static void main(String[] args) {
		addStudent();
		printKey();
		convertMapToSet();
	}
}
