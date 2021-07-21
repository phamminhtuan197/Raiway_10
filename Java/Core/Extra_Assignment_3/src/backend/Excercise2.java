package backend;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Excercise2 {

	private static Scanner scanner = new Scanner(System.in);

	public static void question1() {
		System.out.print("Nhap vao ho va ten: ");
		String fullName = scanner.nextLine();
		char[] charArray = fullName.trim().toCharArray();
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
		fullName = String.valueOf(charArray);
		System.out.println("Ho va ten: " + fullName);
	}

	public static void question2() {
		int amount = 0;

		System.out.print("Nhap vao mot chuoi: ");
		String array = scanner.nextLine();
		char[] charArray = array.trim().toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			if (charArray[i] == 'a') {
				amount++;
				System.out.println("Chu 'a' xuat hien o vi tri " + (i + 1));
			}
		}
		System.out.println("So lan xuat hien chu 'a' la " + amount + " lan");
	}

	public static void question3() {
		System.out.print("Nhap chuoi s: ");
		String s = scanner.nextLine();
		System.out.print("Nhap ki tu x: ");
		char x = scanner.next().toCharArray()[0];
		System.out.print("Nhap ki tu y: ");
		char y = scanner.next().toCharArray()[0];
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == x) {
				s = s.replace(x, y);
			}
		}
		System.out.println(s);
	}

	public static void question4() {
		System.out.print("Nhap chuoi: ");
		String array = scanner.nextLine().trim();
		String reverse = "";
		for (int i = array.length() - 1; i >= 0; i--) {
			reverse += array.charAt(i);
		}
		System.out.println(reverse);
	}

	public static void question5() {
		System.out.print("Nhap chuoi: ");
		String array = scanner.nextLine().trim().replaceAll("[^0-9]", "");
		String[] arrayNumber = array.split("");

		Map<String, Integer> map = new HashMap<String, Integer>();
		for (String x : arrayNumber) {
			if (map.containsKey(x)) {
				map.put(x, map.get(x) + 1);
			} else {
				map.put(x, 1);
			}
		}
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " xuat hien " + entry.getValue() + " lan");
		}
	}

	public static void question6() {

		String array = "Java - Nơi trí tưởng tượng bay xa".replaceAll("- ", "");

		String[] arrayNumber = array.split(" ");
		for (int i = 0; i < arrayNumber.length; i++) {
			System.out.println("array[" + i + "]: " + arrayNumber[i]);
		}
	}

	public static void question7() {
		String username = "root";
		String password = "root";
		do {
			System.out.print("User Name: ");
			String userName = scanner.next();
			System.out.print("PassWord: ");
			String passWord = scanner.next();

			if (userName.equals(username) && passWord.equals(password)) {
				System.out.println("Login success");
				return;
			} else {
				System.out.println("Wrong account or password. Please retype");
			}
		} while (true);
	}
}
