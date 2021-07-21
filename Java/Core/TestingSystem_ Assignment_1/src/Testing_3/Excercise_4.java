package Testing_3;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Excercise_4 {
	public static Scanner scanner = new Scanner(System.in);

	public static void question1() {
		System.out.println("Nhap chuoi ki tu:");
		String a4 = scanner.nextLine();
		if (a4 == null || a4.isEmpty()) {
			System.out.println("Khong co ki tu nao");
		} else {
			StringTokenizer tokens = new StringTokenizer(a4);
			System.out.println("So tu cua chuoi = " + tokens.countTokens());
		}
	}

	public static void question2() {
		System.out.print("Nhap chuoi ki tu thu nhat: ");
		String a5 = scanner.nextLine();
		System.out.print("Nhap chuoi ki tu thu hai: ");
		String a6 = scanner.nextLine();
		System.out.println(a5 + " " + a6);
	}

	public static void question3() {
		System.out.print("Nhap vao ho va ten: ");
		String a7 = scanner.nextLine();
		char[] charArray = a7.toCharArray();
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
		a7 = String.valueOf(charArray);
		System.out.println("Ho va ten: " + a7);
	}

	public static void question4() {
		System.out.print("Nhap vao ten: ");
		String a8 = scanner.nextLine();
		a8 = a8.toUpperCase();
		a8 = a8.replaceAll("\\s", "");
		for (int i = 0; i < a8.length(); i++) {
			System.out.println("Ki tu thu " + i + "la: " + a8.charAt(i));
		}
	}

	public static void question5() {
		System.out.print("Nhap vao ho: ");
		String a9 = scanner.nextLine();
		System.out.print("Nhap vao ten: ");
		String a10 = scanner.nextLine();
		System.out.println("Ho va ten da nhap: " + a9 + " " + a10);
	}

	public static void question6() {
		System.out.print("Nhap vao ho va ten: ");
		String a11 = scanner.nextLine();
		String[] a12 = a11.split("\\s");
		String lastName = a12[0] + " " + a12[1];
		String firstName = a12[a12.length - 1];
		String middName = a12[a12.length - 2];

		System.out.println("Ho la: " + lastName);
		System.out.println("Ten dem la: " + middName);
		System.out.println("Ten la: " + firstName);
	}

	public static void question7a() {
		System.out.print("Nhap vao ho va ten: ");
		String a13 = scanner.nextLine();
		System.out.print("Ho va ten da nhap: " + a13.trim());
	}

	public static void question7b() {
		System.out.print("Nhap vao ho va ten: ");
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
			} else {
				foundSpace1 = true;
			}
		}
		a14 = String.valueOf(charArray1);
		System.out.println("Ho va ten: " + a14);
	}

	public static void question8() {
		String[] groupNames = { "Java group", "DEV group", "Java club" };

		for (String groupName : groupNames) {
			if (groupName.contains("Java")) {
				System.out.println(groupName);
			}
		}
	}

	public static void question9() {
		String[] groupNames = { "Java", "python", "HTML" };
		for (String groupName : groupNames) {
			if (groupName.equals("Java")) {
				System.out.println(groupName);
			}
		}
	}

	public static void question10() {
		System.out.print("Nhap chuoi 1: ");
		String array1 = scanner.nextLine().trim();
		System.out.print("Nhap chuoi 2: ");
		String array2 = scanner.nextLine().trim();
		String reverseArray1 = new StringBuilder(array1).reverse().toString();
		if (array2.equals(reverseArray1)) {
			System.out.println("Chuoi 2 la chuoi dao nguoc cua chuoi 1");
		} else {
			System.out.println("Chuoi 2 khong la chuoi dao nguoc cua chuoi 1");
		}
	}

	public static void question11() {
		int amount = 0;

		System.out.print("Nhap vao mot chuoi: ");
		String array = scanner.nextLine();
		char[] charArray = array.trim().toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			if (charArray[i] == 'a') {
				amount++;
			}
		}
		System.out.println("So lan xuat hien chu 'a' la " + amount + " lan");
	}

	public static void question12() {
		System.out.print("Nhap chuoi: ");
		String array = scanner.nextLine().trim();
		String reverse = "";
		for (int i = array.length() - 1; i >= 0; i--) {
			reverse += array.charAt(i);
		}
		System.out.println(reverse);
	}

	public static boolean question13() {
		System.out.print("Nhap chuoi ");
		String array = scanner.nextLine().trim();
		if (array.matches(".*\\d.*")) {
			return true;
		} else {
			return false;
		}
	}

	public static String question14() {
		System.out.print("Nhap chuoi: ");
		String array = scanner.nextLine();
		System.out.print("Nhap ki tu muon chuyen: ");
		char char1 = scanner.next().toCharArray()[0];
		System.out.print("Nhap ki tu ma ki tu " + char1 + " se chuyen thanh: ");
		char char2 = scanner.next().toCharArray()[0];
		for (int i = 0; i < array.length(); i++) {
			if (array.charAt(i) == char1) {
				array = array.replace(char1, char2);
			}
		}
		return array;
	}

	public static void question15() {
		System.out.print("Nhap chuoi: ");
		String array = scanner.nextLine().trim();

		String[] words = array.split(" ");

		for (int i = words.length - 1; i >= 0; i--) {
			System.out.print(words[i] + " ");
		}
	}

	public static void question16() {
		System.out.print("Nhap chuoi: ");
		String array = scanner.nextLine().trim().replaceAll("\\s+", "");
		System.out.print("Nhap so n: ");
		int n = scanner.nextInt();

		if (array == null || array.length() % 2 != 0) {
			System.out.println("KO");
		} else {
			for (int i = 0; i < array.length(); i += n) {
				System.out.print(array.substring(i, i + n) + "\t");
			}
		}
	}

	public static void main(String[] args) {
		question16();
	}
}
