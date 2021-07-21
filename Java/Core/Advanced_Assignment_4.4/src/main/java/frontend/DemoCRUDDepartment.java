package frontend;

import utils.ScannerUtils;

public class DemoCRUDDepartment {
//	private static Scanner scanner = new Scanner(System.in);
	private static FunctionDepartment fundep = new FunctionDepartment();

	public static void main(String[] args) {
		menuDepartment();
	}

	private static void menuDepartment() {
		int choose;
		do {
			System.out.println("-----Chuong trinh quan li phong ban-----");
			System.out.println("1 - Lay danh sach cac phong ban");
			System.out.println("2 - Tim phong ban theo ID");
			System.out.println("3 - Tim phong ban theo Name");
			System.out.println("4 - Tao phong ban");
			System.out.println("5 - Update ten phong ban");
			System.out.println("6 - Xoa phong ban");
			System.out.println("7 - Lay danh sach nhan vien cua phong");
			System.out.println("8 - Ket thuc chuong trinh");
			System.out.println("----------------------------------------");
			System.out.print("Nhap chuc nang muon su dung: ");
			choose = ScannerUtils.inputInt();

			if (choose >= 1 && choose <= 8) {
				switch (choose) {
				case 1:
					System.out.println("-----Lay danh sach cac phong ban-----");
					fundep.showAllDepartment();
					break;
				case 2:
					System.out.println("-----Tim phong ban theo ID-----");
					fundep.showDepartmentByID();
					break;
				case 3:
					System.out.println("-----Tim phong ban theo ten-----");
					fundep.showDepartmentByName();
					break;
				case 4:
					System.out.println("-----Tạo mới phòng ban-----");
					fundep.createDepartment();
					break;
				case 5:
					System.out.println("-----Update phong ban-----");
					fundep.updateDepartment();
					break;
				case 6:
					System.out.println("-----Xoa phong ban-----");
					fundep.deleteDepartment();
					break;
				case 7:
					System.out.println("-----Danh sach nhan vien trong phong-----");
					fundep.showAccountDepartmentByID();
					break;
				case 8:
					System.out.println("---BYE---");
					break;
				}
			} else {
				System.out.println("input wrong ! please input again (1 --> 8).");
			}

		} while (choose != 8);
	}

}
