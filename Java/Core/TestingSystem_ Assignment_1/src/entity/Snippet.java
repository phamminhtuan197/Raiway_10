package entity;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import Testing_1_2.*;
public class Snippet {
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
	
		TypeQuestion typeQuestion1 = new TypeQuestion(1, TypeName.ESSAY);
		TypeQuestion typeQuestion2 = new TypeQuestion(2, TypeName.MULTIPLE_CHOICE);
	
		static CategoryQuestion categoryQuestion1 = new CategoryQuestion(1, CategoryName.JAVA);
		static CategoryQuestion categoryQuestion2 = new CategoryQuestion(2, CategoryName.NET);
		static CategoryQuestion categoryQuestion3 = new CategoryQuestion(3, CategoryName.SQL);
		static CategoryQuestion categoryQuestion4 = new CategoryQuestion(4, CategoryName.POSTMAN);
		static CategoryQuestion categoryQuestion5 = new CategoryQuestion(5, CategoryName.RUBY);
	
		Question question1 = new Question(1, "Cum sociis", categoryQuestion3, typeQuestion2, account11);
		Question question2 = new Question(2, "Nulla justo.", categoryQuestion3, typeQuestion2, account9);
		Question question3 = new Question(3, "Suspendisse potenti.", categoryQuestion2, typeQuestion2, account5);
		Question question4 = new Question(4, "In hac habitasse platea dictumst.", categoryQuestion4, typeQuestion2,
				account1);
		Question question5 = new Question(5, "Aenean fermentum.", categoryQuestion2, typeQuestion1, account9);
		Question question6 = new Question(6, "Donec ut mauris eget massa tempor convallis.", categoryQuestion4,
				typeQuestion2, account11);
		Question question7 = new Question(7, "Ut tellus.", categoryQuestion5, typeQuestion1, account15);
		Question question8 = new Question(8, "Vivamus vestibulum sagittis sapien.", categoryQuestion5, typeQuestion2,
				account11);
		Question question9 = new Question(9, "Mauris enim leo", categoryQuestion5, typeQuestion2, account11);
		Question question10 = new Question(10, "Duis mattis egestas metus.", categoryQuestion4, typeQuestion2, account4);
		Question question11 = new Question(11, "Maecenas luctus tincidunt.", categoryQuestion4, typeQuestion2, account2);
		Question question12 = new Question(12, "Morbi luctus rutrum.", categoryQuestion3, typeQuestion2, account11);
		Question question13 = new Question(13, "Quisque porta volutpat erat.", categoryQuestion3, typeQuestion1, account6);
		Question question14 = new Question(14, "Integer tincidunt ante vel ipsum.", categoryQuestion3, typeQuestion1,
				account15);
		Question question15 = new Question(15, "Integer pede, tempus vel, pede.", categoryQuestion1, typeQuestion1,
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
	
		public void createDate() {
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
		}
	
		public void InsertData() {
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
}

