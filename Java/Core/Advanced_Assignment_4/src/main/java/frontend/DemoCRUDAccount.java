package frontend;

import utils.ScannerUtils;

public class DemoCRUDAccount {
	private static FunctionAccount funacc = new FunctionAccount();

	public static void main(String[] args) {
		menuAccount();
	}

	private static void menuAccount() {
		int choose;
		do {
			System.out.println("-----Chuong trinh quan li Account-----");
			System.out.println("1 - Lay danh sach cac Account");
			System.out.println("2 - Tim account theo ID");
			System.out.println("3 - Tim account theo UserName");
			System.out.println("4 - Tao account");
			System.out.println("5 - Update UserName account");
			System.out.println("6 - Xoa account");
			System.out.println("7 - Ket thuc chuong trinh");
			System.out.println("----------------------------------------");
			System.out.print("Nhap chuc nang muon su dung: ");
			choose = ScannerUtils.inputInt();

			if (choose >= 1 && choose <= 7) {
				switch (choose) {
				case 1:
					System.out.println("-----Lay danh sach cac account-----");
					funacc.showAllAccount();
					break;
				case 2:
					System.out.println("-----Tim account theo ID-----");
					funacc.showAccountByID();
					break;
				case 3:
					System.out.println("-----Tim account theo UserName-----");
					funacc.showAccountByName();
					break;
				case 4:
					System.out.println("-----Tạo mới account-----");
					funacc.createAccount();
					break;
				case 5:
					System.out.println("-----Update UserName-----");
					funacc.updateAccount();
					break;
				case 6:
					System.out.println("-----Xoa account-----");
					funacc.deleteAccount();
					break;
				case 7:
					System.out.println("---BYE---");
					break;
				}
			} else {
				System.out.println("input wrong ! please input again (1 --> 7).");
			}

		} while (choose != 7);
	}
}
