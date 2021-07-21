package frontend;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import backend.presentationlayer.GroupController;
import database.Group;
import utils.ScannerUtils;

public class ProgramGroup {
	private static GroupController groupController;

	public static void menuGroup() {
		System.out.println("--------MENU---------");
		System.out.println("1. Get list group");
		System.out.println("2. Create group");
		System.out.println("3. Get group by ID");
		System.out.println("4. Update group by ID");
		System.out.println("5. Delete group by ID");
		System.out.println("6. Exit");
		System.out.println("---------------------");
	}

	public static void getListGroup() throws ClassNotFoundException, SQLException, IOException {
		ArrayList<Group> groups = groupController.getListGroup();

		for (Group group : groups) {
			System.out.println(group);
		}
	}

	public static void createGroup() throws Exception {
		System.out.println("Input groupname : ");
		String groupname = ScannerUtils.inputString("Please input as String!");

		System.out.println("Input creatorID: ");
		int creatorID = ScannerUtils.inputId();

		System.out.println("Input createdate: ");
		String createdate = ScannerUtils.inputString("Please input createdate as yyy-MM-dd !");

		groupController.createGroup(groupname, creatorID, createdate);
	}

	public static void getGroupByID() throws SQLException {
		System.out.println("Input groupID: ");
		int groupID = ScannerUtils.inputId();

		Group group = groupController.getGroupByID(groupID);
		System.out.println(group);
	}

	public static void updateGroup() throws SQLException, Exception {
		System.out.println("Input groupID: ");
		int groupID = ScannerUtils.inputId();

		System.out.println("Input new group name: ");
		String newGroupName = ScannerUtils.inputString("Please input new name as String !");

		groupController.updateGroupByID(groupID, newGroupName);
	}

	public static void deleteGroup() throws Exception {
		System.out.println("Input groupID: ");
		int groupID = ScannerUtils.inputId();

		groupController.deleteGroup(groupID);
	}

	public static void main(String[] args) throws Exception {
		groupController = new GroupController();
		int choose;
		do {
			menuGroup();
			System.out.print("Enter your choice: ");
			choose = ScannerUtils.inputInt();
			switch (choose) {
			case 1:
				System.out.println("-----List group-----");
				getListGroup();
				break;

			case 2:
				System.out.println("-----Create Group-----");
				createGroup();
				break;

			case 3:
				System.out.println("-----Get Group by ID-----");
				getGroupByID();
				break;

			case 4:
				System.out.println("-----Update Group-----");
				updateGroup();
				break;

			case 5:
				System.out.println("-----Delete Group-----");
				deleteGroup();
				break;

			case 6:
				System.out.println("End program");
				break;

			default:
				System.out.println("input wrong ! please input again.");
				break;
			}
		} while (choose != 6);

	}
}
