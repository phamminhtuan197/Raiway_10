package backend;

import java.util.ArrayList;

import entity.Employee;
import entity.MyMap;
import entity.Phone;
import entity.Staff;
import entity.Student_3;

public class Excercise_3 {
	public static void question1_2_3() {
		Student_3<Integer> student1 = new Student_3<Integer>(1, "Pham Minh Tuan");
		Student_3<Float> student2 = new Student_3<Float>(2f, "Pham Minh Tu");
		Student_3<Double> student3 = new Student_3<Double>(3.0, "Pham Minh T");

		print(student1);
		print(student2);
		print(student3);
	}

	public static <T> void print(T a) {
		System.out.println(a);
	}

	public static void question4() {
		Integer[] arrInt = { 1, 2, 3, 4 };
		Float[] arrFloat = { 10f, 20f, 30f, 40f };
		Double[] arrDouble = { 5.5, 6.6, 7.7, 8.8 };

		printArray(arrInt);
		printArray(arrFloat);
		printArray(arrDouble);
	}

	public static <T> void printArray(T[] array) {
		for (T arr : array) {
			System.out.println(arr);
		}
	}

	public static void question5() {
		ArrayList<Employee> employees = new ArrayList<>();
		Integer[] salaryInt = { 10, 20, 30 };
		Float[] salaryFloat = { 12f, 22f, 33f };
		Double[] salaryDouble = { 15.5, 20.5, 30.5 };

		Employee<Integer> employee1 = new Employee<Integer>(1, "Pham Minh Tuan", salaryInt);
		Employee<Float> employee2 = new Employee<Float>(2, "Pham Minh Tu", salaryFloat);
		Employee<Double> employee3 = new Employee<Double>(3, "Pham Minh T", salaryDouble);

		employees.add(employee1);
		employees.add(employee2);
		employees.add(employee3);

		for (Employee employee : employees) {
			System.out.println(employee);
			System.out.println("Thang luong cuoi cung cua " + employee.getName() + " la: "
					+ employee.getSalaries()[employee.getSalaries().length - 1]);
		}
	}
	public static void question6() {
		ArrayList<MyMap> myMaps = new ArrayList<>();
		MyMap<Integer, String> student1 = new MyMap<Integer, String>(1, "Pham Minh Tuan");
		myMaps.add(student1);
		
		for (MyMap myMap : myMaps) {
			System.out.println("ID = " + myMap.getKey() + ", Name: " + myMap.getValue());
		}
	}
	public static void question7() {
		ArrayList<Phone> phones = new ArrayList<>();
		Phone<String, String> student1 = new Phone<String, String>("phamminhtuan197@gmail.com", "0666666666");
		Phone<Integer, String> student2 = new Phone<Integer, String>(2, "0888888888");
		Phone<String, String> student3 = new Phone<String, String>("Pham Minh Tu", "0999999999");
		
		phones.add(student1);
		phones.add(student2);
		phones.add(student3);
		
		for (Phone phone : phones) {
			System.out.println("Key = " + phone.getKey() + ", Phone Number = " + phone.getValue());
		}
	}
	
	public static void question8() {
		ArrayList<Staff> staffs = new ArrayList<>();
		Staff<Long, String> staff1 = new Staff<Long, String>(1L, "Pham Minh Tuan");
		Staff<Integer, String> staff2 = new Staff<Integer, String>(2, "Pham Minh Tu");
		
		staffs.add(staff1);
		staffs.add(staff2);
		
		for (Staff staff : staffs) {
			System.out.println("ID = " + staff.getKey() + ", Name = " + staff.getValue());
		}
	}
	public static void main(String[] args) {
		question8();
	}
}
