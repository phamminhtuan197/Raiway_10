package backend.datalayer;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.CriteriaUpdate;
import javax.persistence.criteria.Root;

import org.hibernate.Session;

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
			CriteriaBuilder builder = session.getCriteriaBuilder();
			CriteriaQuery<Department> query = builder.createQuery(Department.class);
			Root<Department> root = query.from(Department.class);
			query.select(root);
			query.orderBy(builder.asc(root.get("departmentID")));
			List<Department> departments = session.createQuery(query).list();
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
			CriteriaBuilder builder = session.getCriteriaBuilder();
			CriteriaQuery<Department> query = builder.createQuery(Department.class);
			Root<Department> root = query.from(Department.class);
			query.select(root);
			query.where(builder.equal(root.get("departmentID"), departmentID));
			Department department = session.createQuery(query).uniqueResult();
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
			CriteriaBuilder builder = session.getCriteriaBuilder();
			CriteriaQuery<Department> query = builder.createQuery(Department.class);
			Root<Department> root = query.from(Department.class);
			query.select(root);
			query.where(builder.equal(root.get("departmentName"), departmentName));
			Department department = session.createQuery(query).uniqueResult();
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

	public void updateDepartmentNameByID(short departmentID, String newName) {
		Session session = null;
		try {
			// get session
			session = hibernateUtils.openSession();
			session.beginTransaction();
			// get department
			CriteriaBuilder builder = session.getCriteriaBuilder();
			CriteriaUpdate<Department> query = builder.createCriteriaUpdate(Department.class);
			Root<Department> root = query.from(Department.class);
			query.set("departmentName", newName);
			query.where(builder.equal(root.get("departmentID"), departmentID));
			session.createQuery(query).executeUpdate();
			session.getTransaction().commit();
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

	public void deleteDepartment(short departmentID) {
		Session session = null;
		try {
			// get session
			session = hibernateUtils.openSession();
			session.beginTransaction();
			// get department
			CriteriaBuilder builder = session.getCriteriaBuilder();
			CriteriaQuery<Department> query = builder.createQuery(Department.class);
			Root<Department> root = query.from(Department.class);
			query.select(root);
			query.where(builder.equal(root.get("departmentID"), departmentID));
			Department department = session.createQuery(query).uniqueResult();
			session.delete(department);
			session.getTransaction().commit();
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}
}
