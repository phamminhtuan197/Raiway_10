package backend.datalayer;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import entity.Group;
import utils.HibernateUtils;

@SuppressWarnings("deprecation")
public class GroupRepository {
	private HibernateUtils hibernateUtils;

	public GroupRepository() {
		hibernateUtils = HibernateUtils.getInstance();
	}

	@SuppressWarnings({ "unchecked" })
	public List<Group> getAllGroups() {

		Session session = null;

		try {
			session = hibernateUtils.openSession();
			Query<Group> query = session.createQuery("FROM Group");

			return query.list();
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

	public Group getGroupByID(short groupID) {
		Session session = null;
		try {
			session = hibernateUtils.openSession();
			Group group = session.get(Group.class, groupID);
			return group;
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

	@SuppressWarnings({ "unchecked" })
	public Group getGroupByName(String groupName) {
		Session session = null;
		try {
			session = hibernateUtils.openSession();
			Query<Group> query = session.createQuery("FROM Group WHERE groupName =:nameParameter");
			query.setParameter("nameParameter", groupName);
			Group group = query.uniqueResult();
			return group;
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

	public void createGroup(Group group) {
		Session session = null;
		try {
			session = hibernateUtils.openSession();
			session.beginTransaction();
			session.save(group);
			session.getTransaction().commit();
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

	public boolean isGroupExistsByID(short groupID) {
		Group group = getGroupByID(groupID);
		if (group == null) {
			return false;
		}
		return true;
	}

	public boolean isGroupExistsByName(String groupName) {
		Group group = getGroupByName(groupName);
		if (group == null) {
			return false;
		}
		return true;
	}

	public void updateGroupNameByID(short groupID, String newName) {
		Session session = null;
		try {
			session = hibernateUtils.openSession();
			session.beginTransaction();
			Group group = session.load(Group.class, groupID);
			group.setGroupName(newName);
			session.getTransaction().commit();
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

	public void updateGroup(Group group) {
		Session session = null;
		try {
			session = hibernateUtils.openSession();
			session.beginTransaction();
			session.getTransaction().commit();
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

	public void deleteGroup(short groupID) {
		Session session = null;
		try {
			session = hibernateUtils.openSession();
			session.beginTransaction();
			Group group = session.load(Group.class, groupID);
			session.delete(group);
			session.getTransaction().commit();
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}
}
