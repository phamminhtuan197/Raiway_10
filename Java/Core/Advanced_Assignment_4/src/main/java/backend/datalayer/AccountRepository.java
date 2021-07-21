package backend.datalayer;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import entity.Account;
import utils.HibernateUtils;

public class AccountRepository {
	private HibernateUtils hibernateUtils;

	public AccountRepository() {
		hibernateUtils = HibernateUtils.getInstance();
	}

	@SuppressWarnings("unchecked")
	public List<Account> getAllAccount() {
		Session session = null;
		try {
// get session
			session = hibernateUtils.openSession();
// create hql query
			Query<Account> query = session.createQuery("FROM Account");
			return query.list();
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
			Account account = session.get(Account.class, accountID);
			return account;
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

	@SuppressWarnings("unchecked")
	public Account getAccountByUserName(String userName) {
		Session session = null;
		try {
// get session
			session = hibernateUtils.openSession();
// create hql query
			Query<Account> query = session.createQuery("FROM Account WHERE userName =:nameParameter");

// set parameter
			query.setParameter("nameParameter", userName);
// get result
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

	public void updateAccount(Account account) {
		Session session = null;
		try {
			// get session
			session = hibernateUtils.openSession();
			session.beginTransaction();
			// update
			session.update(account);
			session.getTransaction().commit();
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

	public void deleteAccount(short accountID) {
		Session session = null;
		try {
			// get session
			session = hibernateUtils.openSession();
			session.beginTransaction();
			// get department
			Account account = (Account) session.load(Account.class, accountID);
			// delete
			session.delete(account);
			session.getTransaction().commit();
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

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
}