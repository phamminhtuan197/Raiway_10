package frontend;

import java.util.List;

import backend.datalayer.PositionRepository;
import entity.Account;
import entity.Position;
import entity.PositionName;
import utils.ScannerUtils;

public class FunctionPosition {
	public void createPosition() {
		do {
			PositionRepository posRepository = new PositionRepository();
			System.out.println("Nhập tên chuc vu cần tạo:");
			String positionName = ScannerUtils.inputName();
			if (posRepository.isPositionExistsByName(PositionName.valueOf(positionName))) {
				System.out.println("Chuc vu nay da ton tai");
			} else {
				Position position = new Position();
				position.setPositionName(PositionName.valueOf(positionName));
				posRepository.createPosition(position);
				System.out.println("Tao chuc vu thanh cong!");
				break;
			}
		} while (true);
	}

	public void showPositionByName() {
		do {
			System.out.print("Nhap ten chuc vu can tim: ");
			String namePosition = ScannerUtils.inputfullName("Nhap sai ten phong").toLowerCase();
			if (namePosition.equals("pm")) {
				namePosition = namePosition.toUpperCase();
			} else if (namePosition.equals("scrummaster")) {
				char[] charArray = namePosition.trim().toCharArray();
				charArray[0] = Character.toUpperCase(charArray[0]);
				charArray[5] = Character.toUpperCase(charArray[5]);
				namePosition = String.valueOf(charArray);
			} else {
				char[] charArray = namePosition.trim().toCharArray();
				boolean foundSpace = true;
				for (int i = 0; i < charArray.length; i++) {
					if (Character.isLetter(charArray[i])) {
						if (foundSpace) {
							charArray[i] = Character.toUpperCase(charArray[i]);
							foundSpace = false;
						}
					} else {
						foundSpace = true;
					}
				}
				namePosition = String.valueOf(charArray).replaceAll("\\s+", "");
			}
			PositionRepository positionRepository = new PositionRepository();
			if (!positionRepository.isPositionExistsByName(PositionName.valueOf(namePosition))) {
				System.out.println("Không có chuc vu này trên hệ thống");
			} else {
				Position posByName = positionRepository.getPositionByName(PositionName.valueOf(namePosition));
				System.out.println(posByName.toString());
				break;
			}
		} while (true);

	}

	public void showPositionByID() {
		do {
			PositionRepository positionRepository = new PositionRepository();
			System.out.print("Nhap ID cua chuc vu can tim: ");
			short id = (short) ScannerUtils.inputID();
			if (!positionRepository.isPositionExistsByID(id)) {
				System.out.println("Không có chuc vu này trên hệ thống");
			} else {
				Position position = positionRepository.getPositionByID(id);
				System.out.println(position.toString());
				break;
			}
		} while (true);
	}

	public void showAllPosition() {
		System.out.println("Danh sach tat ca chuc vu: ");
		PositionRepository positionRepository = new PositionRepository();
		List<Position> listPositions = positionRepository.getAllPositions();
		for (Position position : listPositions) {
			System.out.println("ID=" + position.getPositionID() + ", Name=" + position.getPositionName());
		}
	}

	public void updatePosition() {
		do {
			PositionRepository positionRepository = new PositionRepository();
			System.out.print("Nhap ID chuc vu can update: ");
			short positionID = (short) ScannerUtils.inputID();
			if (!positionRepository.isPositionExistsByID(positionID)) {
				System.out.println("Khong co chuc vu nao co ID nay");
			} else {
				do {
					System.out.print("Nhap ten chuc vu moi: ");
					String newName = ScannerUtils.inputName();
					if (positionRepository.isPositionExistsByName(PositionName.valueOf(newName))) {
						System.out.println("Ten nay da ton tai, moi nhap ten khac");
					} else {
						Position position = new Position();
						position.setPositionID(positionID);
						position.setPositionName(PositionName.valueOf(newName));
						positionRepository.updatePosition(position);
						System.out.println("Update complete");
						break;
					}
				} while (true);
				break;
			}
		} while (true);
	}

	public void deletePosition() {
		do {
			PositionRepository positionRepository = new PositionRepository();
			System.out.print("Nhap ID cua chuc vu can xoa: ");
			short positionID = (short) ScannerUtils.inputID();
			if (!positionRepository.isPositionExistsByID(positionID)) {
				System.out.println("Khong co phong ban nao co ID nay");
			} else {
				positionRepository.deletePosition(positionID);
				System.out.println("Delete complete");
				break;
			}
		} while (true);
	}

	public void showAccountPositionByID() {
		do {
			PositionRepository positionRepository = new PositionRepository();
			System.out.print("Nhap ID chuc vu can lay danh sach nhan vien: ");
			short positionID = (short) ScannerUtils.inputID();
			if (!positionRepository.isPositionExistsByID(positionID)) {
				System.out.println("Khong co chuc vu nay tren he thong");
			} else {
				Position position = positionRepository.getPositionByID(positionID);
				List<Account> listAccounts = position.getAccounts();
				for (Account account : listAccounts) {
					System.out.println(account.toString());
				}
				break;
			}
		} while (true);
	}
}
