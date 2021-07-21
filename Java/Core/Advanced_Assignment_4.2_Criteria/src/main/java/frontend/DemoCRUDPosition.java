package frontend;

import utils.ScannerUtils;

public class DemoCRUDPosition {
	private static FunctionPosition funpos = new FunctionPosition();

	public static void main(String[] args) {
		menuPosition();
	}

	private static void menuPosition() {
		int choose;
		do {
			System.out.println("-----Chuong trinh quan li chuc vu-----");
			System.out.println("1 - Lay danh sach cac chuc vu");
			System.out.println("2 - Tim chuc vu theo ID");
			System.out.println("3 - Tim chuc vu theo ten");
			System.out.println("4 - Lay danh sach nhan vien theo chuc vu");
			System.out.println("5 - Xoa chuc vu");
			System.out.println("6 - Ket thuc chuong trinh");
			System.out.println("----------------------------------------");
			System.out.print("Nhap chuc nang muon su dung: ");
			choose = ScannerUtils.inputInt();

			if (choose >= 1 && choose <= 6) {
				switch (choose) {
				case 1:
					System.out.println("-----Lay danh sach cac chuc vu-----");
					funpos.showAllPosition();
					break;
				case 2:
					System.out.println("-----Tim chuc vu theo ID-----");
					funpos.showPositionByID();
					break;
				case 3:
					System.out.println("-----Tim chuc vu theo ten-----");
					funpos.showPositionByName();
					break;
				case 4:
					System.out.println("-----Danh sach nhan vien theo chuc vu-----");
					funpos.showAccountPositionByID();
					break;
				case 5:
					System.out.println("-----Xoa chuc vu-----");
					funpos.deletePosition();
					break;
				case 6:
					System.out.println("---BYE---");
					break;
				}
			} else {
				System.out.println("input wrong ! please input again (1 --> 6).");
			}

		} while (choose != 6);
	}
}
