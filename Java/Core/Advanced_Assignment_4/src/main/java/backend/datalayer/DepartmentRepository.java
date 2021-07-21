package backend.datalayer;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import entity.Department;
import utils.HibernateUtils;

@SuppressWarnings("deprecation")
public class DepartmentRepository {
	private HibernateUtils hibernateUtils;

	public DepartmentRepository() {
		hibernateUtils = HibernateUtils.getInstance();
	}

	@SuppressWarnings({ "unchecked" })
	public List<Department> getAllDepartments() {

		Session session = null;

		try {
			session = hibernateUtils.openSession();
			Query<Department> query = session.createQuery("FROM Department ORDER BY departmentID");

			return query.list();
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
			Department department = session.get(Department.class, departmentID);
			return department;
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

	@SuppressWarnings({ "unchecked" })
	public Department getDepartmentByName(String departmentName) {
		Session session = null;
		try {
			session = hibernateUtils.openSession();
			Query<Department> query = session.createQuery("FROM Department WHERE departmentName =:nameParameter");
			query.setParameter("nameParameter", departmentName);
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

//	public void updateDepartmentNameByID(short departmentID, String newName) {
//		Session session = null;
//		try {
//			// get session
//			session = hibernateUtils.openSession();
//			session.beginTransaction();
//			// get department
//			Department department = (Department) session.load(Department.class, departmentID);
//			// update
//			department.setDepartmentName(newName);
//			session.getTransaction().commit();
//		} finally {
//			if (session != null) {
//				session.close();
//			}
//		}
//	}

	public void updateDepartment(Department department) {
		Session session = null;
		try {
			// get session
			session = hibernateUtils.openSession();
			session.beginTransaction();
			// update
			session.update(department);
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
			Department department = (Department) session.load(Department.class, departmentID);
			// delete
			session.delete(department);
			session.getTransaction().commit();
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}
}
