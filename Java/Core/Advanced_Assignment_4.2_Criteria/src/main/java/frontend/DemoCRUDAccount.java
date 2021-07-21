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
			System.out.println("5 - Lay Ten cua nhan vien theo ID");
			System.out.println("6 - Danh sach account duoc tao trong thang nay");
			System.out.println("7 - Thong ke theo thang so luong account duoc tao trong nam nay");
			System.out.println("8 - Update Email va UserName theo ID");
			System.out.println("9 - Xoa account theo email");
			System.out.println("10 - Ket thuc chuong trinh");
			System.out.println("----------------------------------------");
			System.out.print("Nhap chuc nang muon su dung: ");
			choose = ScannerUtils.inputInt();

			if (choose >= 1 && choose <= 10) {
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
					System.out.println("-----Ten nhan vien theo ID-----");
					funacc.showFullNameOfAccount();
					break;
				case 6:
					System.out.println("-----Danh sach account duoc tao trong thang nay-----");
					funacc.showAccountByCurrentMonth();
					break;
				case 7:
					System.out.println("-----Thong ke so luong account duoc tao trong nam nay-----");
					funacc.countAccountByMonthOfYearNow();
					break;
				case 8:
					System.out.println("-----Update Email, UserName theo ID-----");
					funacc.updateEmailUsernameAccountByID();
					break;
				case 9:
					System.out.println("-----Xoa account theo email-----");
					funacc.deleteAccountByEmail();
					break;
				case 10:
					System.out.println("---BYE---");
					break;
				}
			} else {
				System.out.println("input wrong ! please input again (1 --> 10).");
			}

		} while (choose != 10);
	}
}
