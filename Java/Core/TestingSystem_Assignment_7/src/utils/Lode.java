package utils;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
import utils.FileManager;
import utils.IOManager;
import utils.User;

public class Lode {
	private static Scanner scanner = new Scanner(System.in);
	private static ArrayList<User> users = new ArrayList<>();
	private static ArrayList<Admin> admins = new ArrayList<>();
	private static ArrayList<MoneyCard> moneyCards = new ArrayList<>();
	private static ArrayList<KetQua> results = new ArrayList<>();

	public static void signUp() {
		do {
			
			
			System.out.print("UserName: ");
			String userName = scanner.next();
			System.out.print("Password: ");
			String passWord = scanner.next();
			System.out.println("Admin hay User (A/U)? ");
			String type = scanner.next();
			
			switch (type) {
			case "A":
				Admin admin = new Admin(userName, passWord);
				admins.add(admin);
				try {
					IOManager.<ArrayList<Admin>>writeObject(admins, "C:\\Users\\Public\\new\\Lode\\User.txt");
					System.out.println("dang ki thanh cong");
				} catch (IOException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
				break;
			case "U":
				User user = new User(userName, passWord);
				users.add(user);
				try {
					IOManager.<ArrayList<User>>writeObject(users, "C:\\Users\\Public\\new\\Lode\\User.txt");
					System.out.println("dang ki thanh cong");
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				break;
			default:
				System.out.println("Nhap sai moi nhap lai");
				return;
			}
		} while (true);
	}

	public static void createFolderFile() {
		try {
//			Tao folder
			FileManager.createNewFolder("C:\\Users\\Public\\new", "Lode");
//			FileManager.checkPath("C:\\Users\\Public\\new\\Lode");
//			Tao file user
			FileManager.createFile("C:\\Users\\Public\\new\\Lode", "User.txt");
//			Tao file ket qua lo de
			FileManager.createFile("C:\\Users\\Public\\new\\Lode", "Ketqua.txt");
//			Tao file nap tien
			FileManager.createFile("C:\\Users\\Public\\new\\Lode", "Naptien.txt");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void signIn() {
		do {
			System.out.print("UserName: ");
			String userName = scanner.next();
			System.out.print("Password: ");
			String passWord = scanner.next();

			for (User user : users) {
				for (Admin admin : admins) {
					if (user.getUserName() == userName && user.getPassWord() == passWord) {
						System.out.println("Dang nhap thanh cong, ban la User");
						System.out.println("-----Menu-----");
						System.out.println("1 - xem ket qua cac ngay");
						System.out.println("2 - nap tien");
						System.out.println("3 - back");

						System.out.print("Nhap lua chon: ");
						int u = scanner.nextInt();
						scanner.nextLine();
						switch (u) {
						case 1:
//								System.out.print("Nhap ngay can xem (yyyy/MM/dd)");
//								String date = scanner.next();
//								for(KetQua result : results) {
//									if (LocalDate.parse(date) == result.getDate()) {
							try {
								IOManager.<ArrayList<KetQua>>readObject(results,
										"C:\\Users\\Public\\new\\Lode\\Ketqua.txt");
							} catch (ClassNotFoundException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							} catch (IOException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							break;
						case 2:
							napTien();
							break;
						default:
							return;
						}
					} else if (admin.getUserName() == userName && admin.getPassWord() == passWord) {
						System.out.println("Dang nhap thanh cong, ban la Admin");
						System.out.println("-----Menu-----");
						System.out.println("1 - xem danh sach user");
						System.out.println("2 - xem ket qua tung ngay");
						System.out.println("3 - nap tien");
						System.out.println("4 - back");
						
						System.out.print("Nhap lua chon: ");
						int u = scanner.nextInt();
						scanner.nextLine();
						switch (u) {
						case 1:
						}		
					} else {
						System.out.println("Sai tai khoan hoac mat khau, dang nhap lai");
					}
				}
			}
		} while (true);
	}

	public static void menu() {
		System.out.println("-----Menu-----");
		System.out.println("1 - Dang ky tai khoan");
		System.out.println("2 - Dang nhap tai khoan");
		System.out.println("3 - Nap tien");
		System.out.println("4 - Ket thuc chuong trinh");
		do {
			System.out.print("Nhap lua chon:");
			int choose = scanner.nextInt();
			scanner.nextLine();

			switch (choose) {
			case 1:
				signUp();
				break;
			case 2:
				signIn();
				break;
			case 3:
				napTien();
				break;
			case 4:
				System.out.println("ket thuc chuong trinh");
				return;
			}
		} while (true);
	}

	public static void napTien() {
		System.out.print("UserName can nap: ");
		String userName = scanner.next();
		System.out.print("Nhap ten the: ");
		String nameCard = scanner.nextLine();
		System.out.print("Nhap ma the: ");
		String codeCard = scanner.nextLine();
		System.out.println("Nhap menh gia the: ");
		int valueCard = scanner.nextInt();

		moneyCards.add(new MoneyCard(userName, nameCard, codeCard, valueCard));

		try {
			IOManager.<ArrayList<MoneyCard>>writeObject(moneyCards, "C:\\Users\\Public\\new\\Lode\\Naptien.txt");
			System.out.println("nap tien thanh cong");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void addResult() {

		do {
			System.out.println("1 - them ket qua");
			System.out.println("2 - Stop");
			System.out.print("Nhap lua chon: ");
			int i = scanner.nextInt();
			switch (i) {
			case 1:
				KetQua result = new KetQua();
				System.out.print("Nhap ngay (yyyy-MM-dd)");
				result.setDate(LocalDate.parse(scanner.next()));
				scanner.nextLine();
				System.out.print("Nhap giai nhat: ");
				result.setNhat(scanner.nextLine());
				System.out.print("Nhap giai nhi: ");
				result.setNhi(scanner.nextLine());
				System.out.print("Nhap giai ba: ");
				result.setBa(scanner.nextLine());
				System.out.print("Nhap giai bon: ");
				result.setBon(scanner.nextLine());
				System.out.print("Nhap giai nam: ");
				result.setNam(scanner.nextLine());
				System.out.print("Nhap giai sau: ");
				result.setSau(scanner.nextLine());
				System.out.print("Nhap giai bay: ");
				result.setBay(scanner.nextLine());
				System.out.print("Nhap giai dac biet: ");
				result.setDacbiet(scanner.nextLine());

				results.add(result);

				try {
					IOManager.<ArrayList<KetQua>>writeObject(results, "C:\\Users\\Public\\new\\Lode\\Ketqua.txt");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case 2:
				return;
			}
		} while (true);
	}

	public static void main(String[] args) {
//		addResult();
//		
//		KetQua kq1 = new KetQua(LocalDate.parse("2021-05-01"), "01", "02", "03", "04", "05", "06", "07", "08");
//		KetQua kq2 = new KetQua(LocalDate.parse("2021-05-02"), "11", "12", "13", "14", "15", "16", "17", "18");
//		KetQua kq3 = new KetQua(LocalDate.parse("2021-05-03"), "21", "22", "23", "24", "25", "26", "27", "28");
//		results.add(kq1);
//		results.add(kq2);
//		results.add(kq3);
//		try {
//			IOManager.<ArrayList<KetQua>>writeObject(results, "C:\\Users\\Public\\new\\Lode\\Ketqua.txt");
//		} catch (IOException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
//		for (KetQua result : results) {
//			if (result.getNhat().equals("1")) {
//				System.out.println(results);
//			}
//		}
		try {

			IOManager.<ArrayList<KetQua>>readObject(results, "C:\\Users\\Public\\new\\Lode\\Ketqua.txt");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//			}
//		}

	}
}
