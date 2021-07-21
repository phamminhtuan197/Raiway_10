package backend.datalayer;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import entity.Department;
import utils.HibernateUtils;

public class DepartmentRepository implements IDepartmentRepository {
	private HibernateUtils hibernateUtils;

	public DepartmentRepository() {
		hibernateUtils = HibernateUtils.getInstance();
	}

	public List<Department> getAllDepartments() {

		Session session = null;

		try {
			session = hibernateUtils.openSession();
			String hql = "FROM Department ORDER BY departmentID";
			Query<Department> query = session.createQuery(hql, Department.class);
			List<Department> departments = query.list();
			return departments;
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

	public Department getDepartmentByID(short departmentID) {
		Session session = null;
		try {
			session = hibernateUtils.openSession();
			String hql = "FROM Department d WHERE d.departmentID =:departmentID";
			Query<Department> query = session.createQuery(hql, Department.class);
			query.setParameter("departmentID", departmentID);
			Department department = query.uniqueResult();
			return department;
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

	public Department getDepartmentByName(String departmentName) {
		Session session = null;
		try {
			session = hibernateUtils.openSession();
			String hql = "FROM Department WHERE departmentName =:departmentName";
			Query<Department> query = session.createQuery(hql, Department.class);
			query.setParameter("departmentName", departmentName);
			Department department = query.uniqueResult();
			return department;
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

	public void createDepartment(Department department) {
		Session session = null;
		try {
			session = hibernateUtils.openSession();
			session.beginTransaction();
			session.save(department);
			session.getTransaction().commit();
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

	public boolean isDepartmentExistsByID(short departmentID) {
		Department department = getDepartmentByID(departmentID);
		if (department == null) {
			return false;
		}
		return true;
	}

	public boolean isDepartmentExistsByName(String departmentName) {
		Department department = getDepartmentByName(departmentName);
		if (department == null) {
			return false;
		}
		return true;
	}

	@SuppressWarnings("rawtypes")
	public void updateDepartmentNameByID(short departmentID, String newName) {
		Session session = null;
		try {
			// get session
			session = hibernateUtils.openSession();
			session.beginTransaction();
			// get department
			String hql = "UPDATE Department SET userName =:newUserName WHERE departmentID =:departmentID";
			Query query = session.createQuery(hql);
			query.setParameter("newUserName", newName);
			query.setParameter("departmentID", departmentID);
			query.executeUpdate();
			session.getTransaction().commit();
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

	@SuppressWarnings("rawtypes")
	public void deleteDepartment(short departmentID) {
		Session session = null;
		try {
			// get session
			session = hibernateUtils.openSession();
			session.beginTransaction();
			// get department
			String hql = "DELETE FROM Department WHERE departmentID =:departmentID";
			Query query = session.createQuery(hql);
			query.setParameter("departmentID", departmentID);
			query.executeUpdate();
			session.getTransaction().commit();
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}
}
