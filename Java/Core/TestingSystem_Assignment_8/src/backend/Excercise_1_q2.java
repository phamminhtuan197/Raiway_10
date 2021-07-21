package backend;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

import entity.Student;

public class Excercise_1_q2 {
	private static Stack<Student> studentInterview = new Stack<>();
	private static Stack<Student> studentLatestToEarliest = new Stack<Student>();
	private static Queue<Student> studentEarliestToLatest = new LinkedList<Student>();
	private static Scanner scanner = new Scanner(System.in);

	public static void StudentInterview() {
		studentInterview.push(new Student("Nguyen Van Nam"));
		studentInterview.push(new Student("Nguyen Van Huyen"));
		studentInterview.push(new Student("Tran Van Nam"));
		studentInterview.push(new Student("Nguyen Van A"));
	}

	public static void printStudentInterview() {
		for (Student studentinterview : studentInterview) {
			System.out.println(studentinterview);
		}
	}

	public static void printOutStudentLatestToEarliest() {

		studentLatestToEarliest.push(studentInterview.pop());
		studentLatestToEarliest.push(studentInterview.pop());
		studentLatestToEarliest.push(studentInterview.pop());
		studentLatestToEarliest.push(studentInterview.pop());

		System.out.println("Danh sach hoc sinh den muon nhat toi som nhat:");
		for (Student studentlatesttoearliest : studentLatestToEarliest) {
			System.out.println(studentlatesttoearliest);
		}
	}

	public static void printOutStudentEarliestToLatest() {
		studentEarliestToLatest.add(studentLatestToEarliest.pop());
		studentEarliestToLatest.add(studentLatestToEarliest.pop());
		studentEarliestToLatest.add(studentLatestToEarliest.pop());
		studentEarliestToLatest.add(studentLatestToEarliest.pop());

		System.out.println("Danh sach hoc sinh den som nhat toi muon nhat:");
		for (Student studentearliesttolatest : studentEarliestToLatest) {
			System.out.println(studentearliesttolatest);
		}
	}
//	public static void main (String[] args) {
//		StudentInterview();
//		printStudentInterview();
//	}
}
