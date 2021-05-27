package utils;

import java.util.Scanner;

public class ScannerUtils {

	private static Scanner scanner = new Scanner(System.in);

	public static int inputID() {
		while (true) {
			int id = inputInt("Please input a id as int, please input again.");
			if (id > 0) {
				return id;
			}
			// else
			System.out.println("Please input a id as int which must be greater than > 0, please input again.");
		}
	}

	public static String inputName() {
		return inputString("Please input a name, please input again.");
	}

	public static String inputEmail(String errorMessage) {
		while (true) {
			String email = ScannerUtils.inputString(errorMessage);
			if (email == null || !email.contains("@") && !email.contains(".com") ) {
				System.err.println(errorMessage);
				System.out.print("Re-enter email: ");
			} else {
				return email;
			}
		}
	}

	public static String inputPassword(String errorMessage) {
		while (true) {
			String password = ScannerUtils.inputString(errorMessage);
			if (password.length() < 6 || password.length() > 12) {
				System.out.println(errorMessage);
				continue;
			}

			boolean hasAtLeast1Character = false;

			for (int i = 0; i < password.length(); i++) {
				if (Character.isUpperCase(password.charAt(i)) == true) {
					hasAtLeast1Character = true;
					break;
				}
			}
			if (hasAtLeast1Character == true) {
				return password;
			} else {
				System.out.println(errorMessage);
				System.out.print("Re-enter password: ");
			}
		}
	}

	public static boolean isAlpha(String name) {
		return name.matches("[a-zA-Z]+");
	}

// full name chi chua chu
	public static String inputfullName(String errorMessage) {
		while (true) {
			String fullName = ScannerUtils.inputName();
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
			String name = fullName.replaceAll(" ", "");
			if (isAlpha(name)) {
				return fullName;
			} else {
				System.out.println(errorMessage);
				System.out.println("Moi ban nhap lai ten: ");
			}
		}
	}

	public static int inputInt() {
		return inputInt("Please input a number as int, please input again");
	}

	public static int inputInt(String errorMessage) {
		while (true) {
			try {
				return Integer.parseInt(scanner.nextLine().trim());
			} catch (Exception e) {
				System.err.println(errorMessage);
				System.out.println("Input again: ");
			}
		}
	}

	public static float inputFloat(String errorMessage) {
		while (true) {
			try {
				return Float.parseFloat(scanner.nextLine().trim());
			} catch (Exception e) {
				System.err.println(errorMessage);
			}
		}
	}

	public static double inputDouble(String errorMessage) {
		while (true) {
			try {
				return Double.parseDouble(scanner.nextLine().trim());
			} catch (Exception e) {
				System.err.println(errorMessage);
			}
		}
	}

	public static String inputString(String errorMessage) {
		while (true) {
			String input = scanner.nextLine().trim();
			if (!input.isEmpty()) {
				return input;
			} else {
				System.err.println(errorMessage);
			}
		}
	}

}
