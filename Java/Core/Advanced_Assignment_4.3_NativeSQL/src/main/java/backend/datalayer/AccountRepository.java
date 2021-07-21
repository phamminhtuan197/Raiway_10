package backend.datalayer;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.NativeQuery;

import entity.Account;
import utils.HibernateUtils;

public class AccountRepository implements IAccountRepository {
	private HibernateUtils hibernateUtils;
	private DepartmentRepository departmentRepository = new DepartmentRepository();
	private PositionRepository positionRepository = new PositionRepository();

	public AccountRepository() {
		hibernateUtils = HibernateUtils.getInstance();
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public List<Account> getAllAccount() throws ParseException {
		Session session = null;
		try {
// get session
			session = hibernateUtils.openSession();
			NativeQuery query = session.createNativeQuery("SELECT * FROM Account;");

			List<Account> accounts = new ArrayList<Account>();
			List<Object[]> objectList = query.getResultList();
			for (Object[] objects : objectList) {
				Account account = new Account();
				account.setAccountID(Short.parseShort(objects[0].toString()));
				account.setEmail(objects[1].toString());
				account.setUserName(objects[2].toString());
				account.setFullName(objects[3].toString());
				account.setDepartment(departmentRepository.getDepartmentByID(Short.parseShort(objects[4].toString())));
				account.setPosition(positionRepository.getPositionByID(Short.parseShort(objects[5].toString())));
				account.setCreateDate(new SimpleDateFormat("yyyy-MM-dd").parse(objects[6].toString()));
				accounts.add(account);
			}
			return accounts;
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

	@SuppressWarnings("rawtypes")
	public Account getAccountByID(short accountID) throws ParseException {
		Session session = null;
		try {
			session = hibernateUtils.openSession();
			NativeQuery query = session.createNativeQuery("SELECT * FROM Account WHERE AccountID = ?;");
			query.setParameter(1, accountID);
			Object[] objects = (Object[]) query.getSingleResult();
			Account account = new Account();
			account.setAccountID(Short.parseShort(objects[0].toString()));
			account.setEmail(objects[1].toString());
			account.setUserName(objects[2].toString());
			account.setFullName(objects[3].toString());
			account.setDepartment(departmentRepository.getDepartmentByID(Short.parseShort(objects[4].toString())));
			account.setPosition(positionRepository.getPositionByID(Short.parseShort(objects[5].toString())));
			account.setCreateDate(new SimpleDateFormat("yyyy-MM-dd").parse(objects[6].toString()));
			return account;
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

	@SuppressWarnings({ "rawtypes" })
	public Account getAccountByUserName(String userName) throws ParseException {
		Session session = null;
		try {
// get session
			session = hibernateUtils.openSession();
			NativeQuery query = session.createNativeQuery("SELECT * FROM Account WHERE UserName = ?;");
			query.setParameter(1, userName);
			Object[] objects = (Object[]) query.getSingleResult();
			Account account = new Account();
			account.setAccountID(Short.parseShort(objects[0].toString()));
			account.setEmail(objects[1].toString());
			account.setUserName(objects[2].toString());
			account.setFullName(objects[3].toString());
			account.setDepartment(departmentRepository.getDepartmentByID(Short.parseShort(objects[4].toString())));
			account.setPosition(positionRepository.getPositionByID(Short.parseShort(objects[5].toString())));
			account.setCreateDate(new SimpleDateFormat("yyyy-MM-dd").parse(objects[6].toString()));
			return account;
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

	public void createAccount(Account account) {
		Session session = null;
		try {
			// get session
			session = hibernateUtils.openSession();
			session.beginTransaction();
			// create
			session.save(account);
			session.getTransaction().commit();
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

//	public void updateAccountUserName(short accountID, String newName) {
//		Session session = null;
//		try {
//			// get session
//			session = hibernateUtils.openSession();
//			session.beginTransaction();
//			// get department
//			Account account = (Account) session.load(Account.class, accountID);
//			// update
//			account.setUserName(newName);
//			session.getTransaction().commit();
//		} finally {
//			if (session != null) {
//				session.close();
//			}
//		}
//	}

	public boolean isAccountExistsByID(short accountID) throws ParseException {
		// get department
		Account account = getAccountByID(accountID);
		// return result
		if (account == null) {
			return false;
		}
		return true;
	}

	public boolean isAccountExistsByName(String userName) throws ParseException {
		Account account = getAccountByUserName(userName);
		if (account == null) {
			return false;
		}
		return true;
	}

	public boolean isAccountExistsByEmail(String email) throws ParseException {
		short accountID = getAccountIDByEmail(email);
		Account account = getAccountByID(accountID);
		if (account == null) {
			return false;
		}
		return true;
	}

	@SuppressWarnings("rawtypes")
	public short getAccountIDByEmail(String email) {
		Session session = null;
		try {
			session = hibernateUtils.openSession();
			NativeQuery query = session.createNativeQuery("SELECT AccountID FROM Account WHERE Email =?;");
			query.setParameter(1, email);
			Object object = query.getSingleResult();
			return (Short) object;
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

	@SuppressWarnings("rawtypes")
	public String getFullName(short accountID) {
		Session session = null;
		try {
			session = hibernateUtils.openSession();
			NativeQuery query = session.createNativeQuery("SELECT FullName FROM Account WHERE AccountID = ?;");
			query.setParameter(1, accountID);
			Object object = query.getSingleResult();
			return object.toString();
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public List<Account> getByCurrentMonth() throws ParseException {
		Session session = null;
		try {
			session = hibernateUtils.openSession();
			NativeQuery query = session.createNativeQuery(
					"SELECT * FROM Account WHERE MONTH(CreateDate) = MONTH(NOW()) AND YEAR(CreateDate) = YEAR(NOW());");
			List<Account> accounts = new ArrayList<Account>();
			List<Object[]> objectList = query.getResultList();
			for (Object[] objects : objectList) {
				Account account = new Account();
				account.setAccountID(Short.parseShort(objects[0].toString()));
				account.setEmail(objects[1].toString());
				account.setUserName(objects[2].toString());
				account.setFullName(objects[3].toString());
				account.setDepartment(departmentRepository.getDepartmentByID(Short.parseShort(objects[4].toString())));
				account.setPosition(positionRepository.getPositionByID(Short.parseShort(objects[5].toString())));
				account.setCreateDate(new SimpleDateFormat("yyyy-MM-dd").parse(objects[6].toString()));
				accounts.add(account);
			}
			return accounts;
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public List<Account> getByCurrentMonthOrderByCreateDate() throws ParseException {
		Session session = null;
		try {
			session = hibernateUtils.openSession();
			NativeQuery query = session.createNativeQuery(
					"SELECT * FROM Account WHERE MONTH(CreateDate) = MONTH(NOW()) AND YEAR(CreateDate) = YEAR(NOW()) ORDER BY MONTH(CreateDate);");
			List<Account> accounts = new ArrayList<Account>();
			List<Object[]> objectList = query.getResultList();
			for (Object[] objects : objectList) {
				Account account = new Account();
				account.setAccountID(Short.parseShort(objects[0].toString()));
				account.setEmail(objects[1].toString());
				account.setUserName(objects[2].toString());
				account.setFullName(objects[3].toString());
				account.setDepartment(departmentRepository.getDepartmentByID(Short.parseShort(objects[4].toString())));
				account.setPosition(positionRepository.getPositionByID(Short.parseShort(objects[5].toString())));
				account.setCreateDate(new SimpleDateFormat("yyyy-MM-dd").parse(objects[6].toString()));
				accounts.add(account);
			}
			return accounts;
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

//	Dem so account dc tao trong moi thang cua nam hien tai
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public List<Object[]> getCountAccountByMonthOfYearNow() {
		Session session = null;
		try {
			session = hibernateUtils.openSession();
			NativeQuery query = session.createNativeQuery(
					"SELECT MONTH(CreateDate) AS Month, COUNT(AccountID) AS Amount FROM Account WHERE YEAR(CreateDate) = YEAR(NOW());");
			List<Object[]> objectList = query.getResultList();
			return objectList;
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

	@SuppressWarnings("rawtypes")
	public void updateEmailUsernameAccountByID(String newEmail, String newUserName, short accountID) {

		Session session = null;
		try {
			// get session
			session = hibernateUtils.openSession();
			session.beginTransaction();
			NativeQuery query = session
					.createNativeQuery("UPDATE Account SET Email = ?, UserName = ?  WHERE AccountID = ?;");
			query.setParameter(1, newEmail);
			query.setParameter(2, newUserName);
			query.setParameter(3, accountID);
			query.executeUpdate();
			session.getTransaction().commit();
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

//	Xoa account theo truong bat ki
	@SuppressWarnings("rawtypes")
	public void deleteAccountByEmail(String email) {
		Session session = null;
		try {
			// get session
			session = hibernateUtils.openSession();
			session.beginTransaction();
			NativeQuery query = session.createNativeQuery("DELETE FROM Account WHERE Email = ?;");
			query.setParameter(1, email);
			query.executeUpdate();
			session.getTransaction().commit();
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

//	phan trang bang hibernate
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public List<Account> getAccountByPaging() throws ParseException {
		Session session = null;
		try {
			// get session
			session = hibernateUtils.openSession();
			NativeQuery query = session.createNativeQuery("SELECT * FROM Account LIMIT 3 OFFSET 5;");
			List<Account> accounts = new ArrayList<Account>();
			List<Object[]> objectList = query.getResultList();
			for (Object[] objects : objectList) {
				Account account = new Account();
				account.setAccountID(Short.parseShort(objects[0].toString()));
				account.setEmail(objects[1].toString());
				account.setUserName(objects[2].toString());
				account.setFullName(objects[3].toString());
				account.setDepartment(departmentRepository.getDepartmentByID(Short.parseShort(objects[4].toString())));
				account.setPosition(positionRepository.getPositionByID(Short.parseShort(objects[5].toString())));
				account.setCreateDate(new SimpleDateFormat("yyyy-MM-dd").parse(objects[6].toString()));
				accounts.add(account);
			}
			return accounts;
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

}