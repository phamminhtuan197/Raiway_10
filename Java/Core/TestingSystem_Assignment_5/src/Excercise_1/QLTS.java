package Excercise_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QLTS implements ITuyenSinh {
		int sbd;
		String name;
		String adress;
		String priorityLevel;
		String	grade;
		
		public QLTS() {
		}
		
		public QLTS(int sbd, String hoTen, String diaChi, String mucUuTien, String khoiThi) {
			super();
			this.sbd = sbd;
			this.name = hoTen;
			this.adress = diaChi;
			this.priorityLevel = mucUuTien;
			this.grade = khoiThi;
		}
		
		@Override
		public String toString() {
			return "QLTS [sbd=" + sbd + ", name=" + name + ", adress=" + adress + ", priorityLevel=" + priorityLevel
					+ ", grade=" + grade + "]";
		}
		
		public int getSbd() {
			return sbd;
		}

		public void setSbd(int sbd) {
			this.sbd = sbd;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getAdress() {
			return adress;
		}

		public void setAdress(String adress) {
			this.adress = adress;
		}

		public String getPriorityLevel() {
			return priorityLevel;
		}

		public void setPriorityLevel(String priorityLevel) {
			this.priorityLevel = priorityLevel;
		}

		public String getGrade() {
			return grade;
		}

		public void setGrade(String grade) {
			this.grade = grade;
		}

		@Override
		public void display() {
			System.out.println(toString());
		}
		@Override
		public void addThiSinh() {
			
			Scanner scanner = new Scanner(System.in);
			QLTS qlts = new QLTS();
			System.out.print("Nhap so bao danh: ");
			qlts.setSbd(scanner.nextInt());
			scanner.nextLine();
			System.out.print("Nhap Ho va Ten: ");
			qlts.setName(scanner.nextLine());
			System.out.print("Nhap dia chi: ");
			qlts.setAdress(scanner.nextLine());
			System.out.print("Nhap muc do uu tien: ");
			qlts.setPriorityLevel(scanner.nextLine());
			System.out.print("Nhap khoi thi: ");
			qlts.setGrade(scanner.next());
			System.out.println("Da nhap xong");
		}

		@Override
		public void search() {
		}
}
