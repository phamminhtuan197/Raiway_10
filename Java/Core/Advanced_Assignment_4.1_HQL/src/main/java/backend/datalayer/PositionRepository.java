package backend.datalayer;

import java.util.List;

import org.hibernate.query.Query;
import org.hibernate.Session;

import entity.Position;
import entity.PositionName;
import utils.HibernateUtils;

public class PositionRepository implements IPositionRepository {
	private HibernateUtils hibernateUtils;

	public PositionRepository() {
		hibernateUtils = HibernateUtils.getInstance();
	}

	public List<Position> getAllPositions() {
		Session session = null;

		try {
			session = hibernateUtils.openSession();
			String hql = "FROM Position ORDER BY positionID";
			Query<Position> query = session.createQuery(hql, Position.class);
			List<Position> positions = query.list();
			return positions;
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

	public Position getPositionByID(short positionID) {
		Session session = null;
		try {
			session = hibernateUtils.openSession();
			String hql = "FROM Position WHERE positionID =:positionID";
			Query<Position> query = session.createQuery(hql, Position.class);
			query.setParameter("positionID", positionID);
			Position position = query.uniqueResult();
			return position;
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

	public Position getPositionByName(PositionName positionName) {
		Session session = null;
		try {
			session = hibernateUtils.openSession();
			String hql = "FROM Position WHERE positionName =:positionName";
			Query<Position> query = session.createQuery(hql, Position.class);
			query.setParameter("positionName", positionName);
			Position position = query.uniqueResult();
			return position;
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

	public void createPosition(Position position) {
		Session session = null;
		try {
			session = hibernateUtils.openSession();
			session.beginTransaction();
			session.save(position);
			session.getTransaction().commit();
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

	public boolean isPositionExistsByID(short positionID) {
		Position position = getPositionByID(positionID);
		if (position == null) {
			return false;
		}
		return true;
	}

	public boolean isPositionExistsByName(PositionName positionName) {
		Position position = getPositionByName(positionName);
		if (position == null) {
			return false;
		}
		return true;
	}

	@SuppressWarnings("rawtypes")
	public void deletePosition(short positionID) {
		Session session = null;
		try {
			// get session
			session = hibernateUtils.openSession();
			session.beginTransaction();
			// get position
			String hql = "DELETE FROM Position WHERE positionID =:positionID";
			Query query = session.createQuery(hql);
			query.setParameter("positionID", positionID);
			query.executeUpdate();
			session.getTransaction().commit();
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}
}
