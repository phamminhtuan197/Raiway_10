package Testing_1_2;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;
import java.time.LocalDate;
import java.util.Calendar;

public class Program {

	static Department department1 = new Department(1, DepartmentName.SALES);
	static Department department2 = new Department(2, DepartmentName.MARKETING);
	static Department department3 = new Department(3, DepartmentName.TRAINING);
	static Department department4 = new Department(4, DepartmentName.SUPPORT);
	static Department department5 = new Department(5, DepartmentName.MANAGEMENT);
	static Department department6 = new Department(6, DepartmentName.ENGINEERING);
	static Department department7 = new Department(7, DepartmentName.SERVICES);
	static Department department8 = new Department(8, DepartmentName.ACCOUNTING);

	static Position position1 = new Position(1, PositionName.DEV);
	static Position position2 = new Position(2, PositionName.TEST);
	static Position position3 = new Position(3, PositionName.SCUMMASTER);
	static Position position4 = new Position(4, PositionName.PM);

	static Account account1 = new Account(1, "tmonroe0@unicef.org", "tmonroe0", "Trixy Monroe", department5, position1);
	static Account account2 = new Account(2, "pturner1@state.gov", "pturner1", "Paige Turner", department8, position2);
	static Account account3 = new Account(3, "gfranklyn2@newsvine.com", "gfranklyn2", "Gabie Franklyn", department7,
			position2);
	static Account account4 = new Account(4, "kcosbey3@macromedia.com", "kcosbey3", "Karry Cosbey", department1,
			position3);
	static Account account5 = new Account(5, "hburston4@reverbnation.com", "hburston4", "Hannah Burston", department4,
			position3);
	static Account account6 = new Account(6, "ftwitty5@berkeley.edu", "ftwitty5", "Francisca Twitty", department3,
			position4);
	static Account account7 = new Account(7, "wbamlett6@about.com", "wbamlett6", "Wyndham Bamlett", department3,
			position3);
	static Account account8 = new Account(8, "lassad7@xrea.com", "lassad7", "Linea Assad", department2, position3);
	static Account account9 = new Account(9, "rdewing8@google.fr", "rdewing8", "Randie Dewing", department5, position2);
	static Account account10 = new Account(10, "kvaudrey9@amazon.de", "kvaudrey9", "Krystalle Vaudrey", department2,
			position2);
	static Account account11 = new Account(11, "mbilliea@intel.com", "mbilliea", "Mira Billie", department6, position4);
	static Account account12 = new Account(12, "kshaplandb@digg.com", "kshaplandb", "Kimbra Shapland", department1,
			position3);
	static Account account13 = new Account(13, "kmchalec@unc.edu", "kmchalec", "Kaylyn McHale", department4, position2);
	static Account account14 = new Account(14, "mjoselovitchd@1688.com", "mjoselovitchd", "Melonie Joselovitch",
			department8, position3);
	static Account account15 = new Account(15, "mdee@businesswire.com", "mdee", "Meg de Nore", department8, position2);

	static Group group1 = new Group(1, "Carbon", account8);
	static Group group2 = new Group(2, "Leader", account15);
	static Group group3 = new Group(3, "Risperidone", account8);
	static Group group4 = new Group(4, "Good", account11);
	static Group group5 = new Group(5, "Valacyclovir", account15);
	static Group group6 = new Group(6, "Wipe", account15);
	static Group group7 = new Group(7, "Lisinopril", account12);
	static Group group8 = new Group(8, "Jardiance", account11);
	static Group group9 = new Group(9, "Monodox", account4);
	static Group group10 = new Group(10, "Denti", account7);

	static TypeQuestion typeQuestion1 = new TypeQuestion(1, TypeName.ESSAY);
	static TypeQuestion typeQuestion2 = new TypeQuestion(2, TypeName.MULTIPLE_CHOICE);

	static CategoryQuestion categoryQuestion1 = new CategoryQuestion(1, CategoryName.JAVA);
	static CategoryQuestion categoryQuestion2 = new CategoryQuestion(2, CategoryName.NET);
	static CategoryQuestion categoryQuestion3 = new CategoryQuestion(3, CategoryName.SQL);
	static CategoryQuestion categoryQuestion4 = new CategoryQuestion(4, CategoryName.POSTMAN);
	static CategoryQuestion categoryQuestion5 = new CategoryQuestion(5, CategoryName.RUBY);

	static Question question1 = new Question(1, "Cum sociis", categoryQuestion3, typeQuestion2, account11);
	static Question question2 = new Question(2, "Nulla justo.", categoryQuestion3, typeQuestion2, account9);
	static Question question3 = new Question(3, "Suspendisse potenti.", categoryQuestion2, typeQuestion2, account5);
	static Question question4 = new Question(4, "In hac habitasse platea dictumst.", categoryQuestion4, typeQuestion2,
			account1);
	static Question question5 = new Question(5, "Aenean fermentum.", categoryQuestion2, typeQuestion1, account9);
	static Question question6 = new Question(6, "Donec ut mauris eget massa tempor convallis.", categoryQuestion4,
			typeQuestion2, account11);
	static Question question7 = new Question(7, "Ut tellus.", categoryQuestion5, typeQuestion1, account15);
	static Question question8 = new Question(8, "Vivamus vestibulum sagittis sapien.", categoryQuestion5, typeQuestion2,
			account11);
	static Question question9 = new Question(9, "Mauris enim leo", categoryQuestion5, typeQuestion2, account11);
	static Question question10 = new Question(10, "Duis mattis egestas metus.", categoryQuestion4, typeQuestion2, account4);
	static Question question11 = new Question(11, "Maecenas luctus tincidunt.", categoryQuestion4, typeQuestion2, account2);
	static Question question12 = new Question(12, "Morbi luctus rutrum.", categoryQuestion3, typeQuestion2, account11);
	static Question question13 = new Question(13, "Quisque porta volutpat erat.", categoryQuestion3, typeQuestion1, account6);
	static Question question14 = new Question(14, "Integer tincidunt ante vel ipsum.", categoryQuestion3, typeQuestion1,
			account15);
	static Question question15 = new Question(15, "Integer pede, tempus vel, pede.", categoryQuestion1, typeQuestion1,
			account14);

	Answer answer1 = new Answer(1, "In quis justo.", question1, true);
	Answer answer2 = new Answer(2, "Lorem ipsum dolor sit amet, consectetuer adipiscing elit.", question15, true);
	Answer answer3 = new Answer(3, "Praesent id massa id nisl venenatis lacinia.", question4, false);
	Answer answer4 = new Answer(4, "Praesent blandit lacinia erat.", question13, false);
	Answer answer5 = new Answer(5, "Nulla mollis molestie lorem.", question9, false);
	Answer answer6 = new Answer(6, "In est risus, auctor sed, tristique in, tempus sit amet, sem.", question12, false);
	Answer answer7 = new Answer(7, "Integer a nibh.", question15, false);
	Answer answer8 = new Answer(8, "Proin leo odio, porttitor id, consequat in, consequat ut, nulla.", question8,
			false);
	Answer answer9 = new Answer(9, "Proin risus.", question15, true);
	Answer answer10 = new Answer(10, "Donec posuere metus vitae ipsum.", question9, true);
	Answer answer11 = new Answer(11, "Maecenas rhoncus aliquam lacus.", question10, false);
	Answer answer12 = new Answer(12, "Curabitur in libero ut massa volutpat convallis.", question9, true);
	Answer answer13 = new Answer(13, "Praesent blandit.", question9, false);
	Answer answer14 = new Answer(14, "Ut at dolor quis odio consequat varius.", question6, false);
	Answer answer15 = new Answer(15, "In blandit ultrices enim.", question1, false);
	Answer answer16 = new Answer(16, "Nulla neque libero, convallis eget, eleifend luctus, ultricies eu, nibh.",
			question2, false);
	Answer answer17 = new Answer(17, "Suspendisse potenti.", question11, true);
	Answer answer18 = new Answer(18, "Ut tellus.", question7, true);
	Answer answer19 = new Answer(19, "Lorem ipsum dolor sit amet, consectetuer adipiscing elit.", question3, true);
	Answer answer20 = new Answer(20, "Nullam sit amet turpis elementum ligula vehicula consequat.", question9, false);

	static Exam exam1 = new Exam(1, 105,
			"Praesent id massa id nisl venenatis lacinia. Aenean sit amet justo. Morbi ut odio.", categoryQuestion1, 20,
			account7);
	static Exam exam2 = new Exam(2, 169,
			"Nam ultrices, libero non mattis pulvinar, nulla pede ullamcorper augue, a suscipit nulla elit ac nulla. Sed vel enim sit amet nunc viverra dapibus. Nulla suscipit ligula in lacus.",
			categoryQuestion2, 120, account3);
	static Exam exam3 = new Exam(3, 116,
			"Curabitur at ipsum ac tellus semper interdum. Mauris ullamcorper purus sit amet nulla. Quisque arcu libero, rutrum ac, lobortis vel, dapibus at, diam.",
			categoryQuestion4, 100, account4);
	static Exam exam4 = new Exam(4, 159,
			"Integer tincidunt ante vel ipsum. Praesent blandit lacinia erat. Vestibulum sed magna at nunc commodo placerat.",
			categoryQuestion5, 90, account3);
	static Exam exam5 = new Exam(5, 151,
			"Quisque porta volutpat erat. Quisque erat eros, viverra eget, congue eget, semper rutrum, nulla. Nunc purus.",
			categoryQuestion2, 45, account8);
	static Exam exam6 = new Exam(6, 121,
			"Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Vivamus vestibulum sagittis sapien. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus.",
			categoryQuestion4, 45, account12);

	public Program() {
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		try {
			account1.createDate = formatter.parse("30/09/2017");
			account2.createDate = formatter.parse("16/06/2019");
			account3.createDate = formatter.parse("02/02/2021");
			account4.createDate = formatter.parse("03/05/2019");
			account5.createDate = formatter.parse("01/03/2021");
			account6.createDate = formatter.parse("21/12/2019");
			account7.createDate = formatter.parse("20/05/2020");
			account8.createDate = formatter.parse("06/03/2021");
			account9.createDate = formatter.parse("08/01/2021");
			account10.createDate = formatter.parse("20/09/2019");
			account11.createDate = formatter.parse("09/09/2020");
			account12.createDate = formatter.parse("22/07/2019");
			account13.createDate = formatter.parse("24/04/2021");
			account14.createDate = formatter.parse("17/11/2020");
			account15.createDate = formatter.parse("11/11/2020");

			group1.createDate = formatter.parse("16/07/2020");
			group2.createDate = formatter.parse("05/08/2020");
			group3.createDate = formatter.parse("25/03/2020");
			group4.createDate = formatter.parse("12/12/2019");
			group5.createDate = formatter.parse("18/08/2019");
			group6.createDate = formatter.parse("08/06/2019");
			group7.createDate = formatter.parse("17/10/2020");
			group8.createDate = formatter.parse("20/11/2020");
			group9.createDate = formatter.parse("19/07/2020");
			group10.createDate = formatter.parse("12/06/2020");

			question1.createDate = formatter.parse("15/03/2020");
			question2.createDate = formatter.parse("26/01/2020");
			question3.createDate = formatter.parse("06/09/2020");
			question4.createDate = formatter.parse("24/01/2020");
			question5.createDate = formatter.parse("25/12/2019");
			question6.createDate = formatter.parse("06/03/2020");
			question7.createDate = formatter.parse("27/01/2020");
			question8.createDate = formatter.parse("20/06/2019");
			question9.createDate = formatter.parse("14/02/2020");
			question10.createDate = formatter.parse("24/07/2020");
			question11.createDate = formatter.parse("22/03/2021");
			question12.createDate = formatter.parse("10/03/2020");
			question13.createDate = formatter.parse("27/10/2020");
			question14.createDate = formatter.parse("17/05/2020");
			question15.createDate = formatter.parse("23/02/2020");

			exam1.createDate = formatter.parse("21/01/2020");
			exam2.createDate = formatter.parse("14/04/2021");
			exam3.createDate = formatter.parse("05/05/2019");
			exam4.createDate = formatter.parse("16/08/2019");
			exam5.createDate = formatter.parse("22/08/2019");
			exam6.createDate = formatter.parse("05/09/2019");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		account1.groups = new Group[] { group1, group3, group5 };
		account2.groups = new Group[] { group7, group8 };
		account3.groups = new Group[] { group6, group10 };
		account4.groups = new Group[] { group7, group6, group8 };
		account5.groups = new Group[] { group1, group4, group10 };
		account6.groups = new Group[] { group1, group9 };
		account7.groups = new Group[] { group1, group3, group5 };
		account8.groups = new Group[] { group2, group7 };
		account9.groups = new Group[] { group1, group2 };
		account10.groups = new Group[] { group6, group8, group10 };
		account11.groups = new Group[] { group1, group2, group5 };
		account12.groups = new Group[] { group3, group10 };
		account13.groups = new Group[] { group1, group2, group9 };
		account14.groups = new Group[] { group2, group8 };
		account15.groups = new Group[] { group1, group6, group7, group10 };

		group1.accounts = new Account[] { account1, account5, account6, account7, account9, account11, account13,
				account15 };
		group2.accounts = new Account[] { account8, account9, account11, account13, account14 };
		group3.accounts = new Account[] { account1, account7, account12 };
		group4.accounts = new Account[] { account5 };
		group5.accounts = new Account[] { account1, account7, account11 };
		group6.accounts = new Account[] { account3, account4, account10, account15 };
		group7.accounts = new Account[] { account2, account4, account8, account15 };
		group8.accounts = new Account[] { account2, account4, account10, account14 };
		group9.accounts = new Account[] { account6, account13 };
		group10.accounts = new Account[] { account3, account5, account10, account12, account15 };

		question1.exams = new Exam[] { exam5, exam6 };
		question2.exams = new Exam[] { exam1, exam3 };
		question3.exams = new Exam[] { exam1, exam2, exam6 };
		question4.exams = new Exam[] { exam1 };
		question5.exams = new Exam[] { exam1, exam3 };
		question6.exams = new Exam[] { exam3, exam6 };
		question7.exams = new Exam[] { exam1, exam6 };
		question8.exams = new Exam[] { exam2, exam4 };
		question9.exams = new Exam[] { exam4, exam6 };
		question10.exams = new Exam[] { exam1, exam2 };
		question11.exams = new Exam[] { exam1, exam6 };
		question12.exams = new Exam[] { exam2 };
		question13.exams = new Exam[] { exam3, exam5 };
		question14.exams = new Exam[] { exam1, exam4 };
		question15.exams = new Exam[] { exam3, exam6 };

		exam1.questions = new Question[] { question2, question3, question4, question5, question7, question10,
				question11, question14 };
		exam2.questions = new Question[] { question3, question8, question10, question12 };
		exam3.questions = new Question[] { question2, question5, question6, question13, question15 };
		exam4.questions = new Question[] { question8, question9, question14 };
		exam5.questions = new Question[] { question1, question13 };
		exam6.questions = new Question[] { question1, question3, question6, question7, question9, question11,
				question15 };

	}

	public void Pava() {
		Department[] departments = { department1, department2, department3, department4, department5, department6,
				department7, department8 };

		Account[] accounts = { account1, account2, account3, account4, account5, account6, account7, account8, account9,
				account10, account11, account12, account13, account14, account15 };

		Group[] groups = { group1, group2, group3, group4, group5, group6, group7, group8, group9, group10 };
	}

	public static void e1q1() {

		if (account2.department == null) {
			System.out.println("nhan vien nay chua co phong ban");
		} else {
			System.out.println("Phong ban cua nhan vien la " + account2.department);
		}
	}

	public static void e1q2() {
		if (account2.groups == null) {
			System.out.println("nhan vien nay chua co group");
		} else {
			int amountGroup = account2.groups.length;
			if (amountGroup == 1 || amountGroup == 2) {
				System.out.println("Group cua nhan vien nay la Java Fresher, C# Fresher");
			}
			if (amountGroup == 3) {
				System.out.println("Nhan vien nay la nguoi quan trong, tham gia nhieu group");
			}
			if (amountGroup >= 4) {
				System.out.println("Nhan vien nay la nguoi hong chuyen, tham gia tat ca cac group");
			}
		}
	}

	public static void e1q3() {
		System.out.println(account2.department == null ? "nhan vien nay chua co phong ban"
				: "Phong ban cua nhan vien la " + account2.department);
	}

	public static void e1q4() {
		System.out.println(
				account1.position.name.toString() == "DEV" ? "Day la developer" : "Nguoi nay khong phai Developer");
	}

	public static void e1q5() {
		
		int amountaccount = group1.accounts.length;
		switch (amountaccount) {
		case 0:
			System.out.println("Nhom khong co thanh vien");
			break;
		case 1:
			System.out.println("Nhom co 1 thanh vien");
			break;
		case 2:
			System.out.println("Nhom co 2 thanh vien");
			break;
		case 3:
			System.out.println("Nhom co 3 thanh vien");
			break;
		default:
			System.out.println("Nhom co nhieu thanh vien");
			break;
		}
	}

	public static void e1q6() {
		int amountGroup = account2.groups.length;
		switch (amountGroup) {
		case 1:
			System.out.println("Group cua nhan vien nay la Java Fresher, C# Fresher");
			break;
		case 2:
			System.out.println("Group cua nhan vien nay la Java Fresher, C# Fresher");
			break;
		case 3:
			System.out.println("Nhan vien nay la nguoi quan trong, tham gia nhieu group");
			break;
		default:
			System.out.println("Nhan vien nay la nguoi hong chuyen, tham gia tat ca cac group");
			break;
		}
	}

	public static void e1q7() {
		String nameOfPosition = account1.position.name.toString();
		switch (nameOfPosition) {
		case "DEV":
			System.out.println("Day la Developer");
			break;
		default:
			System.out.println("Nguoi nay khong phai Developer");
			break;
		}
	}

	public static void e1q8() {
		Account[] accounts = { account1, account2, account3, account4, account5, account6, account7, account8, account9,
				account10, account11, account12, account13, account14, account15 };

		for (Account account : accounts) {
			System.out.println("id=" + account.id + ", email=" + account.email + ", fullName=" + account.fullName
					+ ", DepartmentName=" + account.department.name.toString());
		}
	}

	public static void e1q9() {
		Department[] departments = { department1, department2, department3, department4, department5, department6,
				department7, department8 };

		for (Department department : departments) {
			System.out.println("id=" + department.id + ", DepartmentName=" + department.name);
		}
	}

	public static void e1q10() {
		Account[] accounts = { account1, account2, account3, account4, account5, account6, account7, account8, account9,
				account10, account11, account12, account13, account14, account15 };

		for (int i = 0; i < accounts.length; i++) {
			System.out.println("thong tin account thu" + " " + (i + 1) + " " + "la:");
			System.out.println("Email:" + " " + accounts[i].email);
			System.out.println("FullName:" + " " + accounts[i].fullName);
			System.out.println("Department:" + " " + accounts[i].department.name.toString());
		}
	}

	public static void e1q11() {
		Department[] departments = { department1, department2, department3, department4, department5, department6,
				department7, department8 };

		for (int i = 0; i < departments.length; i++) {
			System.out.println("Thong tin phong ban thu" + " " + (i + 1) + " " + "la:");
			System.out.println("ID:" + " " + departments[i].id);
			System.out.println("Name:" + " " + departments[i].name);
		}
	}

	public static void e1q12() {
		Department[] departments = { department1, department2, department3, department4, department5, department6,
				department7, department8 };

		for (int i = 0; i < departments.length; i++) {
			if (i == 2) {
				break;
			}
			System.out.println("Thong tin phong ban thu" + " " + (i + 1) + " " + "la:");
			System.out.println("ID:" + " " + departments[i].id);
			System.out.println("Name:" + " " + departments[i].name);
		}
	}

	public static void e1q13() {
		Account[] accounts = { account1, account2, account3, account4, account5, account6, account7, account8, account9,
				account10, account11, account12, account13, account14, account15 };

		for (int i = 0; i < accounts.length; i++) {
			if (i != 1) {
				System.out.println("thong tin account thu" + " " + (i + 1) + " " + "la:");
				System.out.println("Email:" + " " + accounts[i].email);
				System.out.println("FullName:" + " " + accounts[i].fullName);
				System.out.println("Department:" + " " + accounts[i].department.name.toString());
			}
		}
	}

	public static void e1q14() {
		Account[] accounts = { account1, account2, account3, account4, account5, account6, account7, account8, account9,
				account10, account11, account12, account13, account14, account15 };

		for (int i = 1; i < 4; i++) {
			System.out.println("thong tin account thu" + " " + i + " " + "la:");
			System.out.println("Email:" + " " + accounts[i].email);
			System.out.println("FullName:" + " " + accounts[i].fullName);
			System.out.println("Department:" + " " + accounts[i].department.name.toString());
		}
	}

	public static void e1q15() {
		for (int i = 0; i <= 20; i++) {
			if (i % 2 == 0)
				System.out.println(i);
		}
	}

	public static void e1q16() {
		Account[] accounts = { account1, account2, account3, account4, account5, account6, account7, account8, account9,
				account10, account11, account12, account13, account14, account15 };
		Department[] departments = { department1, department2, department3, department4, department5, department6,
				department7, department8 };

//		q10:
		int i = 0;
		while (i < accounts.length) {
			System.out.println("thong tin account thu" + " " + (i + 1) + " " + "la:");
			System.out.println("Email:" + " " + accounts[i].email);
			System.out.println("FullName:" + " " + accounts[i].fullName);
			System.out.println("Department:" + " " + accounts[i].department.name.toString());
			i++;
		}

//		q11:
		int a = 0;
		while (a < departments.length) {
			System.out.println("Thong tin phong ban thu" + " " + (a + 1) + " " + "la:");
			System.out.println("ID:" + " " + departments[a].id);
			System.out.println("Name:" + " " + departments[a].name);
			a++;
		}

//		q12:
		int b = 0;
		while (b < departments.length) {
			if (b == 2) {
				break;
			}
			System.out.println("Thong tin phong ban thu" + " " + (b + 1) + " " + "la:");
			System.out.println("ID:" + " " + departments[b].id);
			System.out.println("Name:" + " " + departments[b].name);
			b++;
		}

//		q13:
		int c = 0;
		while (c < accounts.length) {
			if (c != 1) {
				System.out.println("thong tin account thu" + " " + (c + 1) + " " + "la:");
				System.out.println("Email:" + " " + accounts[c].email);
				System.out.println("FullName:" + " " + accounts[c].fullName);
				System.out.println("Department:" + " " + accounts[c].department.name.toString());
			}
			c++;
		}

//		q14:
		int d = 1;
		while (d < 4) {
			System.out.println("thong tin account thu" + " " + d + " " + "la:");
			System.out.println("Email:" + " " + accounts[d].email);
			System.out.println("FullName:" + " " + accounts[d].fullName);
			System.out.println("Department:" + " " + accounts[d].department.name.toString());
			d++;
		}

//		 q15:
		int j = 0;
		while (j <= 20) {
			if (j % 2 == 0) {
				System.out.println(j);
			}
			j++;
		}
	}

	public static void e1q17() {
		Account[] accounts = { account1, account2, account3, account4, account5, account6, account7, account8, account9,
				account10, account11, account12, account13, account14, account15 };
		Department[] departments = { department1, department2, department3, department4, department5, department6,
				department7, department8 };
//		q10:
		int i1 = 0;
		do {
			System.out.println("thong tin account thu" + " " + (i1 + 1) + " " + "la:");
			System.out.println("Email:" + " " + accounts[i1].email);
			System.out.println("FullName:" + " " + accounts[i1].fullName);
			System.out.println("Department:" + " " + accounts[i1].department.name.toString());
			i1++;
		} while (i1 < accounts.length);

//		q11:
		int a1 = 0;
		do {
			System.out.println("Thong tin phong ban thu" + " " + (a1 + 1) + " " + "la:");
			System.out.println("ID:" + " " + departments[a1].id);
			System.out.println("Name:" + " " + departments[a1].name);
			a1++;
		} while (a1 < departments.length);

//		q12:
		int b1 = 0;
		do {
			if (b1 == 2) {
				break;
			}
			System.out.println("Thong tin phong ban thu" + " " + (b1 + 1) + " " + "la:");
			System.out.println("ID:" + " " + departments[b1].id);
			System.out.println("Name:" + " " + departments[b1].name);
			b1++;
		} while (b1 < departments.length);

//		q13:
		int c1 = 0;
		do {
			if (c1 != 1) {
				System.out.println("thong tin account thu" + " " + (c1 + 1) + " " + "la:");
				System.out.println("Email:" + " " + accounts[c1].email);
				System.out.println("FullName:" + " " + accounts[c1].fullName);
				System.out.println("Department:" + " " + accounts[c1].department.name.toString());
			}
			c1++;
		} while (c1 < accounts.length);

//		q14:
		int d1 = 1;
		do {
			System.out.println("thong tin account thu" + " " + d1 + " " + "la:");
			System.out.println("Email:" + " " + accounts[d1].email);
			System.out.println("FullName:" + " " + accounts[d1].fullName);
			System.out.println("Department:" + " " + accounts[d1].department.name.toString());
			d1++;
		} while (d1 < 4);

//		q15:
		int j1 = 0;
		do {
			if (j1 % 2 == 0) {
				System.out.println(j1);
			}
			j1++;
		} while (j1 <= 20);
	}

	public static void e2q1() {
		int i2 = 5;
		System.out.printf("%d %n", i2);
	}

	public static void e2q2() {
		int i3 = 100000000;
		System.out.printf(Locale.US, "%,d %n", i3);
	}

	public static void e2q3() {
		double i4 = 5.567098;
		System.out.printf("%.4f%n", i4);
	}

	public static void e2q4() {
		String name = "Pham Minh Tuan";
		System.out.printf("Ten toi la \"%s\" va toi dang doc than %n", name);
	}

	public static void e2q5() {
		Date date = java.util.Calendar.getInstance().getTime();
		System.out.printf("%td/%tm/%tY %tHh:%tMp:%tSs %n", date, date, date, date, date, date);
	}

	public static void e2q6() {
		Account[] accounts = { account1, account2, account3, account4, account5, account6, account7, account8, account9,
				account10, account11, account12, account13, account14, account15 };

		System.out.printf("%-30s %-30s %s %n", "Email", "FullName", "Department Name");
		for (int i5 = 0; i5 < accounts.length; i5++) {
			System.out.printf("%-30s %-30s %s %n", accounts[i5].email, accounts[i5].fullName,
					accounts[i5].department.name.toString());
		}
	}

	public static void e3q1() {
		Locale locale = new Locale("vi", "VN");
		DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.DEFAULT, locale);
		String date1 = dateFormat.format(exam1.createDate);
		System.out.println("Exam 1: id=" + exam1.id + ", code=" + exam1.code + ", title=" + exam1.title + ", category="
				+ exam1.category + ", duration=" + exam1.duration + ", creator=" + exam1.creator + ", createDate="
				+ date1 + ", questions=" + exam1.questions);
	}

	public static void e3q2() {
		Exam[] exams = { exam1, exam2, exam3, exam4, exam5, exam6 };
		String pattern = "yyyy/MM/dd HH:mm:ss";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		String dateExam1 = simpleDateFormat.format(exam1.createDate);
		String dateExam2 = simpleDateFormat.format(exam2.createDate);
		String dateExam3 = simpleDateFormat.format(exam3.createDate);
		String dateExam4 = simpleDateFormat.format(exam4.createDate);
		String dateExam5 = simpleDateFormat.format(exam5.createDate);
		String dateExam6 = simpleDateFormat.format(exam6.createDate);
		String[] dateExams = { dateExam1, dateExam2, dateExam3, dateExam4, dateExam5, dateExam6 };
		int i6 = 0;
		do {
			System.out.println("Exam" + " " + (i6 + 1) + " " + "duoc tao ngay:");
			System.out.println(dateExams[i6]);
			i6++;
		} while (i6 < exams.length);
	}

	public static void e3q3() {
		Exam[] exams = { exam1, exam2, exam3, exam4, exam5, exam6 };

		String pattern1 = "yyyy";
		SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat(pattern1);
		String dateExam11 = simpleDateFormat1.format(exam1.createDate);
		String dateExam22 = simpleDateFormat1.format(exam2.createDate);
		String dateExam33 = simpleDateFormat1.format(exam3.createDate);
		String dateExam44 = simpleDateFormat1.format(exam4.createDate);
		String dateExam55 = simpleDateFormat1.format(exam5.createDate);
		String dateExam66 = simpleDateFormat1.format(exam6.createDate);
		String[] dateExams1 = { dateExam11, dateExam22, dateExam33, dateExam44, dateExam55, dateExam66 };
		int i7 = 0;
		do {
			System.out.println("Exam" + " " + (i7 + 1) + " " + "duoc tao nam:");
			System.out.println(dateExams1[i7]);
			i7++;
		} while (i7 < exams.length);
	}

	public static void e3q4() {
		Exam[] exams = { exam1, exam2, exam3, exam4, exam5, exam6 };

		String pattern2 = "MM/yyyy";
		SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat(pattern2);
		String dateExam111 = simpleDateFormat2.format(exam1.createDate);
		String dateExam222 = simpleDateFormat2.format(exam2.createDate);
		String dateExam333 = simpleDateFormat2.format(exam3.createDate);
		String dateExam444 = simpleDateFormat2.format(exam4.createDate);
		String dateExam555 = simpleDateFormat2.format(exam5.createDate);
		String dateExam666 = simpleDateFormat2.format(exam6.createDate);
		String[] dateExams2 = { dateExam111, dateExam222, dateExam333, dateExam444, dateExam555, dateExam666 };
		int i8 = 0;
		do {
			System.out.println("Exam" + " " + (i8 + 1) + " " + "duoc tao vao:");
			System.out.println(dateExams2[i8]);
			i8++;
		} while (i8 < exams.length);
	}

	public static void e3q5() {
		Exam[] exams = { exam1, exam2, exam3, exam4, exam5, exam6 };

		String pattern3 = "MM/dd";
		SimpleDateFormat simpleDateFormat3 = new SimpleDateFormat(pattern3);
		String dateExam1111 = simpleDateFormat3.format(exam1.createDate);
		String dateExam2222 = simpleDateFormat3.format(exam2.createDate);
		String dateExam3333 = simpleDateFormat3.format(exam3.createDate);
		String dateExam4444 = simpleDateFormat3.format(exam4.createDate);
		String dateExam5555 = simpleDateFormat3.format(exam5.createDate);
		String dateExam6666 = simpleDateFormat3.format(exam6.createDate);
		String[] dateExams3 = { dateExam1111, dateExam2222, dateExam3333, dateExam4444, dateExam5555, dateExam6666 };
		int i9 = 0;
		do {
			System.out.println("Exam" + " " + (i9 + 1) + " " + "duoc tao vao:");
			System.out.println(dateExams3[i9]);
			i9++;
		} while (i9 < exams.length);
	}

	public static void e4q1() {
		Random random = new Random();
		System.out.println(random.nextInt());
	}

	public static void e4q2() {
		Random random = new Random();
		System.out.println(random.nextFloat());
	}

	public static void e4q3() {
		Random random = new Random();
		String[] nameClassmates = { "Tuan", "Hai", "Cong", "Hanh", "Duc Anh", "Vuong", "Son", "Tu" };
		System.out.println(nameClassmates[random.nextInt(nameClassmates.length)]);
	}

	public static void e4q4() {
		Random random = new Random();
		int minDay = (int) LocalDate.of(1995, 07, 24).toEpochDay();
		int maxDay = (int) LocalDate.of(1995, 12, 20).toEpochDay();
		int randomInt = minDay + random.nextInt(maxDay - minDay);
		LocalDate randomDay = LocalDate.ofEpochDay(randomInt);
		System.out.println(randomDay);
	}

	public static void e4q5() {
		Random random = new Random();
		int dateNow = (int) LocalDate.now().toEpochDay();
		int randomInt1 = dateNow - random.nextInt(365);
		LocalDate randomDate = LocalDate.ofEpochDay(randomInt1);
		System.out.println(randomDate);
	}

	public static void e4q6() {
		Random random = new Random();
		int dateNow1 = (int) LocalDate.now().toEpochDay();
		int randomInt2 = dateNow1 - random.nextInt(dateNow1);
		LocalDate randomDate1 = LocalDate.ofEpochDay(randomInt2);
		System.out.println(randomDate1);
	}

	public static void e4q7() {
		Random random = new Random();
		int m = 100;
		int m1 = m + random.nextInt(899);
		System.out.println(m1);
	}

	public static void e5q1() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Moi ban nhap so nguyen thu nhat:");
		int s1 = scanner.nextInt();
		System.out.println("Moi ban nhap so nguyen thu hai:");
		int s2 = scanner.nextInt();
		System.out.println("Moi ban nhap so nguyen thu ba:");
		int s3 = scanner.nextInt();
		System.out.println("3 so ban vua nhap la:" + " " + s1 + ", " + s2 + ", " + s3);
	}

	public static void e5q2() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap vao so thuc thu nhat:");
		float f1 = scanner.nextFloat();
		System.out.println("Nhap vao so thuc thu hai:");
		float f2 = scanner.nextFloat();
		System.out.println("Hai so thuc ban nhap la:" + " " + f1 + ", " + f2);
	}

	public static void e5q3() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap vao ho va ten:");
		String m2 = scanner.next();
		String m3 = scanner.next();
		System.out.println("Ho va ten cua ban la:" + " " + m2 + " " + m3);
	}

	public static void e5q4() {
		Scanner scanner = new Scanner(System.in);
//		System.out.print("Nhap vao ngay thang nam sinh cua ban:");
//		String m4 = scanner.nextLine();
//		System.out.println("Ngay sinh cua ban la:" + " " + m4);

		Calendar m4 = java.util.Calendar.getInstance();
		System.out.print("Nhap vao ngay sinh cua ban:");
		int m5 = scanner.nextInt();
		System.out.print("Nhap vao thang sinh cua ban:");
		int m6 = scanner.nextInt();
		System.out.print("Nhap vao nam sinh cua ban:");
		int m7 = scanner.nextInt();
		if (m6 == m4.get(Calendar.MONTH) + 1 && m5 == m4.get(Calendar.DAY_OF_MONTH)) {
			System.out.println("Sinh nhat ban la:" + " " + m5 + "/" + m6 + "/" + m7);
			System.out.println("Hom nay la sinh nhat ban day ! HAPPY BIRTHDAY!");
		} else {
			System.out.println("Sinh nhat ban la:" + " " + m5 + "/" + m6 + "/" + m7);
		}

	}

	public static void e5q5() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap Account ID:");
		int accountID = scanner.nextInt();
		System.out.print("Nhap Email:");
		String email = scanner.next();
		System.out.print("Nhap ten nguoi dung:");
		String userName = scanner.next();
		scanner.nextLine();
		System.out.print("Nhap ten cua ban:");
		String fullName = scanner.nextLine();
		System.out.print("Nhap phong ban:");
		int department = scanner.nextInt();
		System.out.print("Nhap chuc vu:");
		int position = scanner.nextInt();
		System.out.println("AccountID:" + " " + accountID);
		System.out.println("Email:" + " " + email);
		System.out.println("UserName:" + " " + userName);
		System.out.println("FullName:" + " " + fullName);
		switch (department) {
		case 1:
			System.out.println("Phong ban: SALES");
			break;
		case 2:
			System.out.println("Phong ban: MARKETING");
			break;
		case 3:
			System.out.println("Phong ban: TRAINING");
			break;
		case 4:
			System.out.println("Phong ban: SUPPORT");
			break;
		case 5:
			System.out.println("Phong ban: MANAGEMENT");
			break;
		case 6:
			System.out.println("Phong ban: ENGINEERING");
			break;
		case 7:
			System.out.println("Phong ban: SERVICES");
			break;
		case 8:
			System.out.println("Phong ban: ACCOUNTING");
			break;
		default:
			System.out.println("Nhap sai phong ban!");
			break;
		}
		switch (position) {
		case 1:
			System.out.println("Chuc vu: DEV");
			break;
		case 2:
			System.out.println("Chuc vu: TEST");
			break;
		case 3:
			System.out.println("Chuc vu: SCUMMASTER");
			break;
		case 4:
			System.out.println("Chuc vu: PM");
			break;
		default:
			System.out.println("Nhap sai chuc vu!");
			break;
		}
	}

	public static void e5q6() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap ma phong ban:");
		int departmentID = scanner.nextInt();
		System.out.print("Nhap ten phong ban:");
		String departmentName = scanner.next();
		System.out.println("DepartmentID:" + " " + departmentID);
		System.out.println("DepartmentName:" + " " + departmentName);
	}

	public static void e5q7() {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.print("Nhap vao mot so chan:");
			int m8 = scanner.nextInt();
			if (m8 % 2 == 0) {
				System.out.println("So chan ban da nhap:" + " " + m8);
				break;
			} else {
				System.out.print("Ban da nhap sai, vui long nhap lai. ");
			}
		}
	}

	public static void e5q8() {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.print("Nhap vao chuc nang muon su dung");
			int m9 = scanner.nextInt();
			if (m9 == 1 || m9 == 2) {
				switch (m9) {
				case 1:
					e5q5();
					break;
				case 2:
					e5q6();
					break;
				}
				return;
			} else {
				System.out.println("Nhap sai moi nhap lai");
			}
		}
	}

	public static void e5q9() {
		Account[] accounts = { account1, account2, account3, account4, account5, account6, account7, account8, account9,
				account10, account11, account12, account13, account14, account15 };
		Group[] groups = { group1, group2, group3, group4, group5, group6, group7, group8, group9, group10 };

		Scanner scanner = new Scanner(System.in);

		System.out.println("Danh sach UserName:");
		for (int m10 = 0; m10 < accounts.length; m10++) {
			System.out.println(accounts[m10].userName);
		}
		System.out.print("Nhap vao UserName ban chon:");
		String m11 = scanner.nextLine();
		int indexAccountSelect = -1;
		for (int i = 0; i < accounts.length; i++) {
			if (m11.trim().equals(accounts[i].userName.trim())) {
				indexAccountSelect = i;
//				System.out.println("seclect acc index= " + i);
			}
		}
		System.out.println("Danh sach Group:");
		for (int m12 = 0; m12 < groups.length; m12++) {
			System.out.println(groups[m12]);
		}
		System.out.print("Nhap vao ten group ban chon:");
		String m13 = scanner.nextLine();
		int indexGroupsSelected = -1;
		for (int i = 0; i < groups.length; i++) {
			if (m13.trim().equals(groups[i].name)) {
				indexGroupsSelected = i;
			}
		}
		if (indexAccountSelect == -1 || indexGroupsSelected == -1) {
			System.out.println("Username Hoac group khong ton tai");
		} else {
			accounts[indexAccountSelect].groups = new Group[] { groups[indexGroupsSelected] };
			System.out.println("Da nhap xong account: " + accounts[indexAccountSelect].userName + " vao group: " + m13);
		}
	}

	public static void addGroupToAccount() {
		Account[] accounts = { account1, account2, account3, account4, account5, account6, account7, account8, account9,
				account10, account11, account12, account13, account14, account15 };
		Group[] groups = { group1, group2, group3, group4, group5, group6, group7, group8, group9, group10 };

		Scanner scanner = new Scanner(System.in);

		System.out.println("Danh sach UserName:");
		for (int m10 = 0; m10 < accounts.length; m10++) {
			System.out.println(accounts[m10].userName);
		}
		System.out.print("Nhap vao UserName ban chon:");
		String m11 = scanner.nextLine();
		int indexAccountSelect = -1;
		for (int i = 0; i < accounts.length; i++) {
			if (m11.trim().equals(accounts[i].userName.trim())) {
				indexAccountSelect = i;
//				System.out.println("seclect acc index= " + i);
			}
		}
		System.out.println("Danh sach Group:");
		for (int m12 = 0; m12 < groups.length; m12++) {
			System.out.println(groups[m12]);
		}
		System.out.print("Nhap vao ten group ban chon:");
		String m13 = scanner.nextLine();
		int indexGroupsSelected = -1;
		for (int i = 0; i < groups.length; i++) {
			if (m13.trim().equals(groups[i].name)) {
				indexGroupsSelected = i;
			}
		}
		if (indexAccountSelect == -1 || indexGroupsSelected == -1) {
			System.out.println("Username Hoac group khong ton tai");
		} else {
//			accounts[indexAccountSelect].groups = new Group[] { groups[indexGroupsSelected] };
			System.out.println("Da nhap xong group: " + groups[indexGroupsSelected].name + " vao account: " + m11);
		}
	}

	public static void e5q10() {
		Account[] accounts = { account1, account2, account3, account4, account5, account6, account7, account8, account9,
				account10, account11, account12, account13, account14, account15 };
		Group[] groups = { group1, group2, group3, group4, group5, group6, group7, group8, group9, group10 };
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.print("Nhap vao chuc nang muon su dung");
			int m9 = scanner.nextInt();
			if (m9 == 1 || m9 == 2 || m9 == 3) {
				switch (m9) {
				case 1:
					e5q5();
					break;
				case 2:
					e5q6();
					break;
				case 3:
					addGroupToAccount();
				}
				
				System.out.print("Ban co muon thuc hien chuc nang khac khong? (Y/N)");
				String yesNo = scanner.next();
				if (yesNo.trim().equals("N")) {
					System.out.println("Ket thuc chuong trinh.");
					return;
				}
			} 
			else {
				System.out.println("Nhap sai moi nhap lai");
			}
		}
	}

	public static void e5q11() {
		Random random = new Random();
		Account[] accounts = { account1, account2, account3, account4, account5, account6, account7, account8, account9,
				account10, account11, account12, account13, account14, account15 };
		Group[] groups = { group1, group2, group3, group4, group5, group6, group7, group8, group9, group10 };
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.print("Nhap vao chuc nang muon su dung");
			int m9 = scanner.nextInt();
			if (m9 == 1 || m9 == 2 || m9 ==3 || m9 == 4) {
				switch (m9) {
				case 1:
					e5q5();
					break;
				case 2:
					e5q6();
					break;
				case 3:
					addGroupToAccount();
					break;
				case 4:
					System.out.println("Danh sach UserName:");
					for (int i = 0; i < accounts.length; i++) {
						System.out.println(accounts[i].userName);
					}
					System.out.print("Nhap vao UserName ban chon:");
					scanner.nextLine();
					String m14 = scanner.nextLine();
					int indexAccountSelected = -1;
					for (int i = 0; i < accounts.length; i++) {
// 						System.out.println("M14 = " + m14.trim() + "  ,  username = " + accounts[i].userName.trim());
						if (m14.trim().equals(accounts[i].userName.trim())) {
							indexAccountSelected = i;
// 							System.out.println("seclect acc index= " + i); 
						}
					}
					Group m15 = groups[random.nextInt(groups.length)];
					System.out.println("Lay ngau nhien mot group:" + " " + m15.name);
					// System.out.println("group index = " + indexGroupSelected + " , account indext
					// = " + indexAccountSelected);
					if (indexAccountSelected == -1) {
						System.out.println("Username khong ton tai");
					} else {
						System.out.println("Da nhap xong account: " + accounts[indexAccountSelected].userName
								+ " vao group: " + m15.name);
					}
				}
				System.out.print("Ban co muon thuc hien chuc nang khac khong? (Y/N)");
				String yesNo = scanner.next();
				if (yesNo.trim().equals("N")) {
					System.out.println("Ket thuc chuong trinh.");
					return;
				}
			} else {
				System.out.println("Nhap sai moi nhap lai");
			}
		}
	}

	public static void e6q1() {
		for (int i = 0; i < 10; i++) {
			if (i % 2 == 0) {
				System.out.println("So chan, nguyen duong, nho hon 10: " + i);
			}
		}
	}

	public static void e6q2() {
		Account[] accounts = { account1, account2, account3, account4, account5, account6, account7, account8, account9,
				account10, account11, account12, account13, account14, account15 };
		System.out.println("Thong tin cac account:");
		for (int i = 0; i < accounts.length; i++) {
			System.out.println(accounts[i]);
		}
	}

	public static void e6q3() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		e3q1();
	}
}
