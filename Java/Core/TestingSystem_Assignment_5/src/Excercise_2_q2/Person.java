package Excercise_2_q2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Person {
	String name;
	Gender gender;
	String birthday;
	String adress;

	public Person() {
		inputInfo();
	}

	public Person(String name, Gender gender, String birthday, String adress) {
		super();
		this.name = name;
		this.gender = gender;
		this.birthday = birthday;
		this.adress = adress;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public String getBirthday() {
		return birthday;
	}

	public String setBirthday(String birthday) {
		return this.birthday = birthday;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", gender=" + gender + ", birthday=" + birthday + ", adress=" + adress + "]";
	}

	public void inputInfo() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap ho ten: ");
		setName(scanner.nextLine());
		System.out.print("Nhap gioi tinh(M/F): ");
		String a = scanner.next().toUpperCase();
			switch (a) {
			case "M":
				gender = Gender.valueOf("Male");
				break;
			case "F":
				gender = Gender.valueOf("Female");
				break;
			default:
				gender = Gender.valueOf("Unknow");
				break;	
			}
		scanner.nextLine();
		System.out.print("Nhap ngay sinh (yyyy/MM/dd): ");
		
//		setBirthday(scanner.nextLine());
		SimpleDateFormat formatter = new SimpleDateFormat ("yyyy/MM/dd");
		try {
		Date date = formatter.parse(setBirthday(scanner.nextLine()));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		System.out.print("Nhap dia chi: ");
		setAdress(scanner.nextLine());

	}

	public void showInfo() {
			System.out.println("Ho va ten: " + getName());
			System.out.println("Gioi tinh: " + getGender());
			System.out.println("Ngay sinh: " + getBirthday());
			System.out.println("Dia chi: " + getAdress());
	}
}
