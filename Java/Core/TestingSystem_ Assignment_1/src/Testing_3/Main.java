package Testing_3;

import java.util.Random;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.time.LocalDate;
import Testing_1_2.*;
public class Main extends Program {
	static Scanner scanner = new Scanner(System.in);
	static Random random = new Random();
	
	public static void main (String[] args) {
//	EXERCISE 1
//		question1:
/*			float salary1;
			float salary2;
			
			salary1 = (float) 5240.5;
			salary2 = (float) 10970.055;
			
			int luong1 = (int) salary1;
			int luong2 = (int) salary2;
			
			System.out.println("Luong so 1: "+ luong1 + ", luong so 2: " + luong2);
*/			
//		question2:
			
/*			
			int a = random.nextInt(99998);
			if (a < 10) {
				System.out.println("So lay duoc la: 0000"+ a);
			}
			else if(a >= 10 && a < 100) {
				System.out.println("So lay duoc la: 000"+ a);
			}
			else if (a >= 100 && a < 1000) {
				System.out.println("So lay duoc la: 00"+ a);
			}
			else if (a >= 1000 && a < 10000) {
				System.out.println("So lay duoc la: 0"+ a);
			}
			else {
				System.out.println("So lay duoc la: "+ a);
			}
*/			
//		question3:
/*			int a1 = a % 100;
			System.out.println(a1);
*/			
//		question4:
/*			System.out.print("Nhap vao so nguyen a:");
			int a = scanner.nextInt();
			System.out.print("Nhap vao so nguyen b:");
			int b = scanner.nextInt();
			float c = (float) a / (float) b;
			System.out.println("a/b = " + c);
*/
//	EXERCISE 2
//		question1:
/*	class Account {
			String		email;
			String		userName;
			String		fullName;
			LocalDate	createDate;
	}
			Account[] accounts = new Account[5];
			for (int i =0; i < accounts.length; i++) {
				Account account = new Account();
				account.email = "Email so " + i;
				account.userName = "UserName so " + i;
				account.fullName = "FullName so " + i;
				account.createDate = LocalDate.now();
				accounts[i] = account;
				
				System.out.println("Account so " + i);
				System.out.println("Email: "+ accounts[i].email);
				System.out.println("User Name: "+ accounts[i].userName);
				System.out.println("Full Name: "+ accounts[i].fullName);
				System.out.println("Create Date: "+ accounts[i].createDate);
			}
*/	
//	EXERCISE 3
//		question1:
/*			int salary = 5000;
			float salaryF = (float) salary;
			System.out.printf("%1.2f%n", salaryF);
*/			
//		question2:
/*			String stringNumber = "1234567";
			int number = Integer.parseInt(stringNumber);
			System.out.println(number);
*/
//		question3:
/*			Integer a2 = 1234567;
			int a3 = a2.intValue();
			System.out.println(a3);
*/			
//	EXCERCISE 4
//		question1:
/*			System.out.println("Nhap chuoi ki tu:");
			String a4 = scanner.nextLine();
			if (a4 == null || a4.isEmpty()) {
				System.out.println("Khong co ki tu nao");
			}
			else {
				StringTokenizer tokens = new StringTokenizer(a4);
				System.out.println("So tu cua chuoi = " + tokens.countTokens());
			}
*/			
//		question2:
/*			System.out.print("Nhap chuoi ki tu thu nhat: ");
			String a5 = scanner.nextLine();
			System.out.print("Nhap chuoi ki tu thu hai: ");
			String a6 = scanner.nextLine();
			System.out.println(a5 + " " + a6);
*/			
//		question3:
/*			System.out.print("Nhap vao ho va ten: ");
			String a7 = scanner.nextLine();
			char[] charArray = a7.toCharArray();
			boolean foundSpace = true;
			for (int i = 0; i < charArray.length; i++) {
				if (Character.isLetter(charArray[i])) {
					if (foundSpace) {
						charArray[i] = Character.toUpperCase(charArray[i]);
						foundSpace = false;
					}
				}
				else {
					foundSpace = true;
				}
			}
			a7 = String.valueOf(charArray);
			System.out.println("Ho va ten: " + a7);
*/
//		question4:
/*			System.out.print("Nhap vao ten: ");
			String a8 = scanner.nextLine();
			a8 = a8.toUpperCase();
			a8 = a8.replaceAll("\\s", "");
			for (int i = 0; i < a8.length(); i++) {
				System.out.println("Ki tu thu " + i + "la: " + a8.charAt(i));
			}
*/			
//		question5:
/*			System.out.print("Nhap vao ho: ");
			String a9 = scanner.nextLine();
			System.out.print("Nhap vao ten: ");
			String a10 = scanner.nextLine();
			System.out.println("Ho va ten da nhap: " + a9 + " " +a10);
*/
//		question6:
/*			System.out.print("Nhap vao ho va ten: ");
			String a11 = scanner.nextLine();
			String[] a12 = a11.split("\\s");
			String lastName = a12[0] + " " + a12[1];
			String firstName = a12[a12.length -1];
			String middName = a12[a12.length -2];
			
			System.out.println("Ho la: " + lastName);
			System.out.println("Ten dem la: " + middName);
			System.out.println("Ten la: " + firstName);
*/			
//		question7:
//		 a)
/*			System.out.print("Nhap vao ho va ten: ");
			String a13 = scanner.nextLine();
			System.out.print("Ho va ten da nhap: " + a13.trim());
*/
//		 b)
/*			System.out.print("Nhap vao ho va ten: ");
			String a14 = scanner.nextLine();
			a14 = a14.trim();
			char[] charArray1 = a14.toCharArray();
			boolean foundSpace1 = true;
			for (int i = 0; i < charArray1.length; i++) {
				if (Character.isLetter(charArray1[i])) {
					if (foundSpace1) {
						charArray1[i] = Character.toUpperCase(charArray1[i]);
						foundSpace1 = false;
					}
				}
				else {
					foundSpace1 = true;
				}
			}
			a14 = String.valueOf(charArray1);
			System.out.println("Ho va ten: " + a14);
*/			
//		question8:
			
	}
}
