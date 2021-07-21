package backend.datalayer;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import entity.Account;
import utils.HibernateUtils;

public class AccountRepository implements IAccountRepository {
	private HibernateUtils hibernateUtils;

	public AccountRepository() {
		hibernateUtils = HibernateUtils.getInstance();
	}

	public List<Account> getAllAccount() {
		Session session = null;
		try {
// get session
			session = hibernateUtils.openSession();
// create hql query
			String hql = "FROM Account ORDER BY accountID";
			Query<Account> query = session.createQuery(hql, Account.class);
			List<Account> accounts = query.list();
			return accounts;
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

	public Account getAccountByID(short accountID) {
		Session session = null;
		try {
// get session
			session = hibernateUtils.openSession();
// get department by id
			String hql = "FROM Account AS a WHERE a.accountID = :accountID";
			Query<Account> query = session.createQuery(hql, Account.class);
			query.setParameter("accountID", accountID);
			Account account = query.uniqueResult();
			return account;
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

	public Account getAccountByUserName(String userName) {
		Session session = null;
		try {
// get session
			session = hibernateUtils.openSession();
// create hql query
			String hql = "FROM Account a WHERE a.userName =:userName";
			Query<Account> query = session.createQuery(hql, Account.class);
			query.setParameter("userName", userName);
			Account account = query.uniqueResult();
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

	public boolean isAccountExistsByID(short accountID) {
		// get department
		Account account = getAccountByID(accountID);
		// return result
		if (account == null) {
			return false;
		}
		return true;
	}

	public boolean isAccountExistsByName(String userName) {
		Account account = getAccountByUserName(userName);
		if (account == null) {
			return false;
		}
		return true;
	}

	public boolean isAccountExistsByEmail(String email) {
		short accountID = getAccountIDByEmail(email);
		Account account = getAccountByID(accountID);
		if (account == null) {
			return false;
		}
		return true;
	}

	public short getAccountIDByEmail(String email) {
		Session session = null;
		try {
			session = hibernateUtils.openSession();
			String hql = "SELECT a.accountID FROM Account a WHERE a.email = :email";
			Query<Short> query = session.createQuery(hql, Short.class);
			query.setParameter("email", email);
			short accountID = query.uniqueResult();
			return accountID;
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

	public String getFullName(short accountID) {
		Session session = null;
		try {
			session = hibernateUtils.openSession();
			String hql = "SELECT a.fullName FROM Account a WHERE a.accountID = :accountID";
			Query<String> query = session.createQuery(hql, String.class);
			query.setParameter("accountID", accountID);
			String firstName = query.uniqueResult();
			return firstName;
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

	public List<Account> getByCurrentMonth() {
		Session session = null;
		try {
			session = hibernateUtils.openSession();
			String hql = "FROM Account a WHERE MONTH(a.createDate) = MONTH(NOW()) AND YEAR(a.createDate) = YEAR(NOW())";
			Query<Account> query = session.createQuery(hql, Account.class);
			List<Account> accounts = query.list();
			return accounts;
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

	public List<Account> getByCurrentMonthOrderByCreateDate() {
		Session session = null;
		try {
			session = hibernateUtils.openSession();
			String hql = "FROM Account a WHERE MONTH(a.createDate) = MONTH(NOW()) AND YEAR(a.createDate) = YEAR(NOW()) ORDER BY a.createDate";
			Query<Account> query = session.createQuery(hql, Account.class);
			List<Account> accounts = query.list();
			return accounts;
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

//	Dem so account dc tao trong moi thang cua nam hien tai
	@SuppressWarnings("unchecked")
	public List<Object[]> getCountAccountByMonthOfYearNow() {
		Session session = null;
		try {
			session = hibernateUtils.openSession();
			String hql = "SELECT MONTH(a.createDate) AS month, COUNT(a.createDate) AS amount FROM Account a WHERE YEAR(a.createDate) = YEAR(NOW())";
			Query<Object[]> query = session.createQuery(hql);
			List<Object[]> results = query.list();
			return results;
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
			// update
			String hql = "UPDATE Account SET email = :email, userName = :userName WHERE accountID = :accountID";

			Query query = session.createQuery(hql);
			query.setParameter("email", newEmail);
			query.setParameter("userName", newUserName);
			query.setParameter("accountID", accountID);
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
			// Delete
			String hql = "DELETE FROM Account WHERE email = :email";
			Query query = session.createQuery(hql);
			query.setParameter("email", email);
			query.executeUpdate();
			session.getTransaction().commit();
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

//	phan trang bang hibernate
	@SuppressWarnings("unchecked")
	public List<Account> getAccountByPaging() {
		Session session = null;
		try {
			// get session
			session = hibernateUtils.openSession();
			String hql = "FROM Account ORDER BY id";
			// create hql query
			Query<Account> query = session.createQuery(hql);
//			Lay bat dau tu hang so 5
			query.setFirstResult(5);
//			Moi trang co toi da 3 hang
			query.setMaxResults(3);
			return query.list();
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

}