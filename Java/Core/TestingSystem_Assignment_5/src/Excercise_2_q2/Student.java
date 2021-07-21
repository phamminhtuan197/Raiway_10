package Excercise_2_q2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Excercise_1.News;

public class Student extends Person {
	int maSV;
	float diemTB;
	String email;
	
	public int getMaSV() {
		return maSV;
	}
	public void setMaSV(int maSV) {
		this.maSV = maSV;
	}
	public float getDiemTB() {
		return diemTB;
	}
	public void setDiemTB(float diemTB) {
		this.diemTB = diemTB;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Student(String name, Gender gender, String birthday, String adress, int maSV, float diemTB, String email) {
		super(name, gender, birthday, adress);
		this.maSV = maSV;
		this.diemTB = diemTB;
		this.email = email;
	}
	
	public Student() {
		inputInfo();
	}
	
	@Override
	public String toString() {
		return "Student [maSV=" + maSV + ", diemTB=" + diemTB + ", email=" + email + "]";
	}
	private List<Student> students = new ArrayList<>();
	public void inputInfo() {
		super.inputInfo();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap ma sinh vien: ");
		setMaSV(scanner.nextInt());
		System.out.print("Nhap diem trung binh: ");
		setDiemTB(scanner.nextFloat());
		scanner.nextLine();
		System.out.print("Nhap Email: ");
		setEmail(scanner.nextLine());
		System.out.println("Da nhap xong");
		
		
	}
	public void showInfo() {
		super.showInfo();
		System.out.println("Ma sinh vien: " + getMaSV());
		System.out.println("Diem trung binh: " + getDiemTB());
		System.out.println("Email: " + getEmail());
	}
	public void scholarship() {
		if (diemTB >= 8f) {
			System.out.println("Sinh vien "+ name + " duoc hoc bong");
		}
		else {
			System.out.println("Sinh vien "+ name + " khong duoc hoc bong");
		}
	}
}
