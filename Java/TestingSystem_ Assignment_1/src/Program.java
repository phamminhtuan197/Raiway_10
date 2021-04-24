import java.util.Date;

public class Program {

	public static void main (String[] args) {
		Department department1 = new Department();
		department1.id = 1;
		department1.name = DepartmentName.SALES;
		
		Department department2 = new Department();
		department2.id = 2;
		department2.name = DepartmentName.MARKETING;
		
		Department department3 = new Department();
		department3.id = 3;
		department3.name = DepartmentName.TRAINING;
		
		Department department4 = new Department();
		department4.id = 4;
		department4.name = DepartmentName.SUPPORT;
		
		Department department5 = new Department();
		department5.id = 5;
		department5.name = DepartmentName.MANAGEMENT;
		
		Department department6 = new Department();
		department6.id = 6;
		department6.name = DepartmentName.ENGINEERING;
		
		Department department7 = new Department();
		department7.id = 7;
		department7.name = DepartmentName.SERVICES;
		
		Department department8 = new Department();
		department8.id = 8;
		department8.name = DepartmentName.ACCOUNTING;
		
		Position position1 = new Position();
		position1.id =1;
		position1.name = PositionName.DEV;
		
		Position position2 = new Position();
		position2.id = 2;
		position2.name = PositionName.TEST;
		
		Position position3 = new Position();
		position3.id = 3;
		position3.name = PositionName.SCUMMASTER;
		
		Position position4 = new Position();
		position4.id = 4;
		position4.name = PositionName.PM;
		
		Account account1 = new Account();
		account1.id = 1;
		account1.email = "tmonroe0@unicef.org";
		account1.userName = "tmonroe0";
		account1.fullName = "Trixy Monroe";
		account1.department = department5;
		account1.position = position1;
		account1.createDate = new Date(2020/2/11);

		
		Account account2 = new Account();
		account2.id = 2;
		account2.email = "pturner1@state.gov";
		account2.userName = "pturner1";
		account2.fullName = "Paige Turner";
		account2.department = department8;
		account2.position = position2;
		account2.createDate = new Date(2019/9/7);
		
		Account account3 = new Account();
		account3.id = 3;
		account3.email = "gfranklyn2@newsvine.com";
		account3.userName = "gfranklyn2";
		account3.fullName = "Gabie Franklyn";
		account3.department = department7;
		account3.position = position2;
		account3.createDate = new Date(2020/4/24);
		
		Account account4 = new Account();
		account4.id = 4;
		account4.email = "kcosbey3@macromedia.com";
		account4.userName = "kcosbey3";
		account4.fullName = "Karry Cosbey";
		account4.department = department1;
		account4.position = position3;
		account4.createDate = new Date(2018/9/12);
	
		Account account5 = new Account();
		account5.id = 5;
		account5.email = "hburston4@reverbnation.com";
		account5.userName = "hburston4";
		account5.fullName = "Hannah Burston";
		account5.department = department4;
		account5.position = position3;
		account5.createDate = new Date(2020/7/12);
		
		Account account6 = new Account();
		account6.id = 6;
		account6.email = "ftwitty5@berkeley.edu";
		account6.userName = "ftwitty5";
		account6.fullName = "Francisca Twitty";
		account6.department = department3;
		account6.position = position4;
		account6.createDate = new Date(2019/04/10);
		
		Account account7 = new Account();
		account7.id = 7;
		account7.email = "wbamlett6@about.com";
		account7.userName = "wbamlett6";
		account7.fullName = "Wyndham Bamlett";
		account7.department = department3;
		account7.position = position3;
		account7.createDate = new Date(2020/01/23);
		
		Account account8 = new Account();
		account8.id = 8;
		account8.email = "lassad7@xrea.com";
		account8.userName = "lassad7";
		account8.fullName = "Linea Assad";
		account8.department = department2;
		account8.position = position3;
		account8.createDate = new Date(2020/10/16);
		
		Account account9 = new Account();
		account9.id = 9;
		account9.email = "rdewing8@google.fr";
		account9.userName = "rdewing8";
		account9.fullName = "Randie Dewing";
		account9.department = department5;
		account9.position = position2;
		account9.createDate = new Date(2021/03/23);
		
		Account account10 = new Account();
		account10.id = 10;
		account10.email = "kvaudrey9@amazon.de";
		account10.userName = "kvaudrey9";
		account10.fullName = "Krystalle Vaudrey";
		account10.department = department2;
		account10.position = position2;
		account10.createDate = new Date(2020/01/30);
		
		Account account11 = new Account();
		account11.id = 11;
		account11.email = "mbilliea@intel.com";
		account11.userName = "mbilliea";
		account11.fullName = "Mira Billie";
		account11.department = department6;
		account11.position = position4;
		account11.createDate = new Date(2018/07/01);
		
		Account account12 = new Account();
		account12.id = 12;
		account12.email = "kshaplandb@digg.com";
		account12.userName = "kshaplandb";
		account12.fullName = "Kimbra Shapland";
		account12.department = department1;
		account12.position = position3;
		account12.createDate = new Date(2019/06/26);
		
		Account account13 = new Account();
		account13.id = 13;
		account13.email = "kmchalec@unc.edu";
		account13.userName = "kmchalec";
		account13.fullName = "Kaylyn McHale";
		account13.department = department4;
		account13.position = position2;
		account13.createDate = new Date(2019/9/19);
		
		Account account14 = new Account();
		account14.id = 14;
		account14.email = "mjoselovitchd@1688.com";
		account14.userName = "mjoselovitchd";
		account14.fullName = "Melonie Joselovitch";
		account14.department = department8;
		account14.position = position3;
		account14.createDate = new Date(2021/02/19);
				
		Account account15 = new Account();
		account15.id = 15;
		account15.email = "mdee@businesswire.com";
		account15.userName = "mdee";
		account15.fullName = "Meg de Nore";
		account15.department = department8;
		account15.position = position2;
		account15.createDate = new Date(2019/07/01);
		
		Group group1 = new Group();
		group1.id = 1;
		group1.name = "Carbon Dioxide";
		group1.creator = account8;
		group1.createDate = new Date(2020/06/13);
		
		Group group2 = new Group();
		group2.id = 2;
		group2.name = "Leader Nasal";
		group2.creator = account15;
		group2.createDate = new Date(2021/03/9);
		
		Group group3 = new Group();
		group3.id = 3;
		group3.name = "Risperidone";
		group3.creator = account8;
		group3.createDate = new Date(2021/03/07);
		
		Group group4 = new Group();
		group4.id = 4;
		group4.name = "Good Sense all day allergy";
		group4.creator = account11;
		group4.createDate = new Date(2020/05/28);
		
		Group group5 = new Group();
		group5.id = 5;
		group5.name = "Valacyclovir Hydrochloride";
		group5.creator = account15;
		group5.createDate = new Date(2021/03/11);
		
		Group group6 = new Group();
		group6.id = 6;
		group6.name = "Antibacterial Moist Wipe";
		group6.creator = account15;
		group6.createDate = new Date(2020/9/8);
		
		Group group7 = new Group();
		group7.id = 7;
		group7.name = "Lisinopril";
		group7.creator = account12;
		group7.createDate = new Date(2020/9/27);
		
		Group group8 = new Group();
		group8.id = 8;
		group8.name = "Jardiance";
		group8.creator = account11;
		group8.createDate = new Date(2021/02/07);
		
		Group group9 = new Group();
		group9.id = 9;
		group9.name = "Monodox";
		group9.creator = account4;
		group9.createDate = new Date(2021/04/14);
		
		Group group10 = new Group();
		group10.id = 10;
		group10.name = "Denti-Care Denti-Freeze";
		group10.creator = account7;
		group10.createDate = new Date(2020/05/24);
		
		GroupAccount groupAccount1 = new GroupAccount();
		groupAccount1.group = group7;
		groupAccount1.account = account1;
		groupAccount1.joinDate = new Date(2021/03/27);
		
		GroupAccount groupAccount2 = new GroupAccount();
		groupAccount2.group = group4;
		groupAccount2.account = account2;
		groupAccount2.joinDate = new Date(2020/01/28);
		
		GroupAccount groupAccount3 = new GroupAccount();
		groupAccount3.group = group3;
		groupAccount3.account = account3;
		groupAccount3.joinDate = new Date(2019/9/19);
		
		GroupAccount groupAccount4 = new GroupAccount();
		groupAccount4.group = group1;
		groupAccount4.account = account4;
		groupAccount4.joinDate = new Date(2021/03/11);
		
		GroupAccount groupAccount5 = new GroupAccount();
		groupAccount5.group = group4;
		groupAccount5.account = account5;
		groupAccount5.joinDate = new Date(2019/03/17);
	
		GroupAccount groupAccount6 = new GroupAccount();
		groupAccount6.group = group10;
		groupAccount6.account = account6;
		groupAccount6.joinDate = new Date(2020/01/14);

		GroupAccount groupAccount7 = new GroupAccount();
		groupAccount7.group = group7;
		groupAccount7.account = account7;
		groupAccount7.joinDate = new Date(2020/01/14);
		
		GroupAccount groupAccount8 = new GroupAccount();
		groupAccount8.group = group2;
		groupAccount8.account = account8;
		groupAccount8.joinDate = new Date(2020/12/29);
		
		GroupAccount groupAccount9 = new GroupAccount();
		groupAccount9.group = group8;
		groupAccount9.account = account9;
		groupAccount9.joinDate = new Date(2019/02/12);
		
		GroupAccount groupAccount10 = new GroupAccount();
		groupAccount10.group = group10;
		groupAccount10.account = account10;
		groupAccount10.joinDate = new Date(2020/02/07);
		
		GroupAccount groupAccount11 = new GroupAccount();
		groupAccount11.group = group5;
		groupAccount11.account = account11;
		groupAccount11.joinDate = new Date(2019/03/8);
		
		GroupAccount groupAccount12 = new GroupAccount();
		groupAccount12.group = group6;
		groupAccount12.account = account12;
		groupAccount12.joinDate = new Date(2019/02/26);
		
		GroupAccount groupAccount13 = new GroupAccount();
		groupAccount13.group = group9;
		groupAccount13.account = account13;
		groupAccount13.joinDate = new Date(2020/8/9);
		
		GroupAccount groupAccount14 = new GroupAccount();
		groupAccount14.group = group8;
		groupAccount14.account = account14;
		groupAccount14.joinDate = new Date(2019/12/17);
		
		GroupAccount groupAccount15 = new GroupAccount();
		groupAccount15.group = group6;
		groupAccount15.account = account15;
		groupAccount15.joinDate = new Date(2019/8/04);
		
		TypeQuestion typeQuestion1 = new TypeQuestion();
		typeQuestion1.id = 1;
		typeQuestion1.name = TypeName.ESSAY;
		
		TypeQuestion typeQuestion2 = new TypeQuestion();
		typeQuestion2.id = 2;
		typeQuestion2.name = TypeName.MULTIPLE_CHOICE;
		
		CategoryQuestion categoryQuestion1 = new CategoryQuestion();
		categoryQuestion1.id = 1;
		categoryQuestion1.name = CategoryName.JAVA;
		
		CategoryQuestion categoryQuestion2 = new CategoryQuestion();
		categoryQuestion2.id = 2;
		categoryQuestion2.name = CategoryName.NET;
		
		CategoryQuestion categoryQuestion3 = new CategoryQuestion();
		categoryQuestion3.id = 3;
		categoryQuestion3.name = CategoryName.SQL;
		
		CategoryQuestion categoryQuestion4 = new CategoryQuestion();
		categoryQuestion4.id = 4;
		categoryQuestion4.name = CategoryName.POSTMAN;
		
		CategoryQuestion categoryQuestion5 = new CategoryQuestion();
		categoryQuestion5.id = 5;
		categoryQuestion5.name = CategoryName.RUBY;
		
		Question question1 = new Question();
		question1.id = 1;
		question1.content = "Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus.";
		question1.category = categoryQuestion3;
		question1.type = typeQuestion2;
		question1.creator = account11;
		question1.createDate = new Date(2019/8/29);
		
		Question question2 = new Question();
		question2.id = 2;
		question2.content = "Nulla justo.";
		question2.category = categoryQuestion3;
		question2.type = typeQuestion2;
		question2.creator = account9;
		question2.createDate = new Date(2018/12/12);
		
		Question question3 = new Question();
		question3.id = 3;
		question3.content = "Suspendisse potenti.";
		question3.category = categoryQuestion2;
		question3.type = typeQuestion2;
		question3.creator = account5;
		question3.createDate = new Date(2021/02/23);
		
		Question question4 = new Question();
		question4.id = 4;
		question4.content = "In hac habitasse platea dictumst.";
		question4.category = categoryQuestion4;
		question4.type = typeQuestion2;
		question4.creator = account1;
		question4.createDate = new Date(2020/05/28);
		
		Question question5 = new Question();
		question5.id = 5;
		question5.content = "Aenean fermentum.";
		question5.category = categoryQuestion2;
		question5.type = typeQuestion1;
		question5.creator = account9;
		question5.createDate = new Date(2019/11/16);
		
		Question question6 = new Question();
		question6.id = 6;
		question6.content = "Donec ut mauris eget massa tempor convallis.";
		question6.category = categoryQuestion4;
		question6.type = typeQuestion2;
		question6.creator = account11;
		question6.createDate = new Date(2018/9/8);
		
		Question question7 = new Question();
		question7.id = 7;
		question7.content = "Ut tellus.";
		question7.category = categoryQuestion5;
		question7.type = typeQuestion1;
		question7.creator = account15;
		question7.createDate = new Date(2019/05/30);
		
		Question question8 = new Question();
		question8.id = 8;
		question8.content = "Vivamus vestibulum sagittis sapien.";
		question8.category = categoryQuestion5;
		question8.type = typeQuestion2;
		question8.creator = account11;
		question8.createDate = new Date(2019/12/31);
		
		Question question9 = new Question();
		question9.id = 9;
		question9.content = "Mauris enim leo, rhoncus sed, vestibulum sit amet, cursus id, turpis.";
		question9.category = categoryQuestion5;
		question9.type = typeQuestion2;
		question9.creator = account11;
		question9.createDate = new Date(2019/11/10);
		
		Question question10 = new Question();
		question10.id = 10;
		question10.content = "Duis mattis egestas metus.";
		question10.category = categoryQuestion4;
		question10.type = typeQuestion2;
		question10.creator = account4;
		question10.createDate = new Date(2019/02/9);
		
		Question question11 = new Question();
		question11.id = 11;
		question11.content = "Maecenas ut massa quis augue luctus tincidunt.";
		question11.category = categoryQuestion4;
		question11.type = typeQuestion2;
		question11.creator = account2;
		question11.createDate = new Date(2019/05/22);
		
		Question question12 = new Question();
		question12.id = 12;
		question12.content = "Morbi non quam nec dui luctus rutrum.";
		question12.category = categoryQuestion3;
		question12.type = typeQuestion2;
		question12.creator = account11;
		question12.createDate = new Date(2021/04/19);
		
		Question question13 = new Question();
		question13.id = 13;
		question13.content = "Quisque porta volutpat erat.";
		question13.category = categoryQuestion3;
		question13.type = typeQuestion1;
		question13.creator = account6;
		question13.createDate = new Date(2019/07/13);
		
		Question question14 = new Question();
		question14.id = 14;
		question14.content = "Integer tincidunt ante vel ipsum.";
		question14.category = categoryQuestion3;
		question14.type = typeQuestion1;
		question14.creator = account15;
		question14.createDate = new Date(2018/04/29);
		
		Question question15 = new Question();
		question15.id = 15;
		question15.content = "Integer pede justo, lacinia eget, tincidunt eget, tempus vel, pede.";
		question15.category = categoryQuestion1;
		question15.type = typeQuestion1;
		question15.creator = account14;
		question15.createDate = new Date(2020/03/06);
		
		Answer answer1 = new Answer(1,"In quis justo.",question1, true);
		Answer answer2 = new Answer(2,"Lorem ipsum dolor sit amet, consectetuer adipiscing elit.",question15, true);
		Answer answer3 = new Answer(3,"Praesent id massa id nisl venenatis lacinia.", question4, false);
		Answer answer4 = new Answer(4,"Praesent blandit lacinia erat.", question13, false);
		Answer answer5 = new Answer(5, "Nulla mollis molestie lorem.",question9, false);
		Answer answer6 = new Answer(6,"In est risus, auctor sed, tristique in, tempus sit amet, sem.", question12, false);
		Answer answer7 = new Answer(7, "Integer a nibh.", question15, false);
		Answer answer8 = new Answer(8, "Proin leo odio, porttitor id, consequat in, consequat ut, nulla.", question8,false);
		Answer answer9 = new Answer(9, "Proin risus.", question15, true);
		Answer answer10 = new Answer(10, "Donec posuere metus vitae ipsum.", question9, true);
		Answer answer11 = new Answer(11, "Maecenas rhoncus aliquam lacus.", question10,	false);
		Answer answer12 = new Answer(12, "Curabitur in libero ut massa volutpat convallis.", question9, true);
		Answer answer13 = new Answer(13, "Praesent blandit.", question9, false);
		Answer answer14 = new Answer(14, "Ut at dolor quis odio consequat varius.", question6, false);
		Answer answer15 = new Answer(15, "In blandit ultrices enim.", question1, false);
		Answer answer16 = new Answer(16, "Nulla neque libero, convallis eget, eleifend luctus, ultricies eu, nibh.", question2, false);
		Answer answer17 = new Answer(17, "Suspendisse potenti.", question11, true);
		Answer answer18 = new Answer(18, "Ut tellus.", question7, true);
		Answer answer19 = new Answer(19, "Lorem ipsum dolor sit amet, consectetuer adipiscing elit.", question3, true);
		Answer answer20 = new Answer(20, "Nullam sit amet turpis elementum ligula vehicula consequat.", question9, false);
		
		answer2.display();
	}
}