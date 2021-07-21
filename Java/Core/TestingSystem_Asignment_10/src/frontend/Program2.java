package frontend;

import java.sql.SQLException;
import java.util.Date;

import backend.DepartmentDao;
public class Program2 {
	public static void main (String[] args) throws SQLException, ClassNotFoundException, Exception {
		DepartmentDao dao = new DepartmentDao();
//		System.out.println(dao.getDepartment());
//		System.out.println(dao.getDepartmentid5());
//		System.out.println(dao.getDepartmentByID(1));
//		System.out.println(dao.isDepartmentExists(2));
//		dao.createDepartment("Don ve sinh");
//		dao.updateDepartmentName(14, "Rua bat");
//		dao.deleteDepartmentByID(19);

		System.out.println(dao.getAccount());
//		System.out.println(dao.getAccountid5());
//		System.out.println(dao.getAccountByID(1));
//		System.out.println(dao.isAccountExists(2));
//		dao.createAccount("phamminhtuan197@gmail.com", "phamminhtuan197", "Pham Minh Tuan", 1, 2,"2020-12-20", "M");
//		dao.updateAccountUserName(15, "phamminhtuan");
//		dao.deleteAccountByID(15);
	}
}
