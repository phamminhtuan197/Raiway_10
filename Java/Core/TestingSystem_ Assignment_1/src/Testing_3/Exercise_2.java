package Testing_3;

import java.time.LocalDate;

public class Exercise_2 {
	public static void question1() {
		class Account {
			String email;
			String userName;
			String fullName;
			LocalDate createDate;
		}
		Account[] accounts = new Account[5];
		for (int i = 0; i < accounts.length; i++) {
			Account account = new Account();
			account.email = "Email so " + i;
			account.userName = "UserName so " + i;
			account.fullName = "FullName so " + i;
			account.createDate = LocalDate.now();
			accounts[i] = account;

			System.out.println("Account so " + i);
			System.out.println("Email: " + accounts[i].email);
			System.out.println("User Name: " + accounts[i].userName);
			System.out.println("Full Name: " + accounts[i].fullName);
			System.out.println("Create Date: " + accounts[i].createDate);
		}
	}
	
	public static void main(String[] args) {}
}
