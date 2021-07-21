package backend.datalayer;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.CriteriaUpdate;
import javax.persistence.criteria.Expression;
import javax.persistence.criteria.Root;

import org.hibernate.Session;

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
			CriteriaBuilder builder = session.getCriteriaBuilder();
			CriteriaQuery<Account> query = builder.createQuery(Account.class);
			Root<Account> root = query.from(Account.class);
			query.select(root);
			List<Account> listAccounts = session.createQuery(query).list();
			return listAccounts;
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

	public Account getAccountByID(short accountID) {
		Session session = null;
		try {
			session = hibernateUtils.openSession();
			CriteriaBuilder builder = session.getCriteriaBuilder();
			CriteriaQuery<Account> query = builder.createQuery(Account.class);
			Root<Account> root = query.from(Account.class);
			query.select(root);
			query.where(builder.equal(root.get("accountID"), accountID));
			Account account = session.createQuery(query).uniqueResult();
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
			CriteriaBuilder builder = session.getCriteriaBuilder();
			CriteriaQuery<Account> query = builder.createQuery(Account.class);
			Root<Account> root = query.from(Account.class);
			query.select(root);
			query.where(builder.equal(root.get("userName"), userName));
			Account account = session.createQuery(query).uniqueResult();
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
			CriteriaBuilder builder = session.getCriteriaBuilder();
			CriteriaQuery<Short> query = builder.createQuery(Short.class);
			Root<Account> root = query.from(Account.class);
			query.multiselect(root.get("accountID"));
			query.where(builder.equal(root.get("email"), email));
			short accountID = session.createQuery(query).uniqueResult();
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
			CriteriaBuilder builder = session.getCriteriaBuilder();
			CriteriaQuery<String> query = builder.createQuery(String.class);
			Root<Account> root = query.from(Account.class);
			query.multiselect(root.get("fullName"));
			query.where(builder.equal(root.get("accountID"), accountID));
			String firstName = session.createQuery(query).uniqueResult();
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
			CriteriaBuilder builder = session.getCriteriaBuilder();
			CriteriaQuery<Account> query = builder.createQuery(Account.class);
			Root<Account> root = query.from(Account.class);
			query.select(root);
			Expression<Integer> monthCreateDate = builder.function("month", Integer.class, root.get("createDate"));
			Expression<Integer> monthCurrent = builder.function("month", Integer.class, builder.currentDate());
			query.where(builder.equal(monthCreateDate, monthCurrent));
			List<Account> accounts = session.createQuery(query).list();
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
			CriteriaBuilder builder = session.getCriteriaBuilder();
			CriteriaQuery<Account> query = builder.createQuery(Account.class);
			Root<Account> root = query.from(Account.class);
			query.select(root);
			Expression<Integer> monthCreateDate = builder.function("month", Integer.class, root.get("createDate"));
			Expression<Integer> monthCurrent = builder.function("month", Integer.class, builder.currentDate());
			query.where(builder.equal(monthCreateDate, monthCurrent));
			query.orderBy(builder.asc(root.get("createDate")));
			List<Account> accounts = session.createQuery(query).list();
			return accounts;
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

//	Dem so account dc tao trong moi thang cua nam hien tai
	public List<Object[]> getCountAccountByMonthOfYearNow() {
		Session session = null;
		try {
			session = hibernateUtils.openSession();
			CriteriaBuilder builder = session.getCriteriaBuilder();
			CriteriaQuery<Object[]> query = builder.createQuery(Object[].class);
			Root<Account> root = query.from(Account.class);
			Expression<Integer> monthCreateDate = builder.function("month", Integer.class, root.get("createDate"));
			Expression<Integer> yearCreateDate = builder.function("year", Integer.class, root.get("createDate"));
			Expression<Integer> yearCurrent = builder.function("year", Integer.class, builder.currentDate());
			Expression<Long> amountAccounts = builder.count(root.get("accountID"));
			query.multiselect(monthCreateDate, amountAccounts);
			query.where(builder.equal(yearCreateDate, yearCurrent));
			query.groupBy(monthCreateDate);
			List<Object[]> objects = session.createQuery(query).list();
			return objects;
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

	public void updateEmailUsernameAccountByID(String newEmail, String newUserName, short accountID) {

		Session session = null;
		try {
			// get session
			session = hibernateUtils.openSession();
			session.beginTransaction();
			// update
			CriteriaBuilder builder = session.getCriteriaBuilder();
			CriteriaUpdate<Account> query = builder.createCriteriaUpdate(Account.class);
			Root<Account> root = query.from(Account.class);
			query.set("email", newEmail);
			query.set("userName", newUserName);
			query.set("accountID", accountID);
			query.where(builder.equal(root.get("accountID"), accountID));
			session.createQuery(query).executeUpdate();
			session.getTransaction().commit();
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

//	Xoa account theo truong bat ki
	public void deleteAccountByEmail(String email) {
		Session session = null;
		try {
			// get session
			session = hibernateUtils.openSession();
			session.beginTransaction();
			// Delete
			CriteriaBuilder builder = session.getCriteriaBuilder();
			CriteriaQuery<Account> query = builder.createQuery(Account.class);
			Root<Account> root = query.from(Account.class);
			query.select(root);
			query.where(builder.equal(root.get("email"), email));
			Account account = session.createQuery(query).uniqueResult();
			session.delete(account);
			session.getTransaction().commit();
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

//	phan trang bang hibernate
	public List<Account> getAccountByPaging() {
		Session session = null;
		try {
			// get session
			session = hibernateUtils.openSession();
			CriteriaBuilder builder = session.getCriteriaBuilder();
			CriteriaQuery<Account> query = builder.createQuery(Account.class);
			Root<Account> root = query.from(Account.class);
			query.select(root);
			query.orderBy(builder.asc(root.get("accountID")));
			List<Account> accounts = session.createQuery(query).setFirstResult(5).setMaxResults(3).list();
			return accounts;
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

}