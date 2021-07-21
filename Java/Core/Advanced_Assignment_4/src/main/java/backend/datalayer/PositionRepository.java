package backend.datalayer;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import entity.Position;
import entity.PositionName;
import utils.HibernateUtils;

@SuppressWarnings("deprecation")
public class PositionRepository {
	private HibernateUtils hibernateUtils;

	public PositionRepository() {
		hibernateUtils = HibernateUtils.getInstance();
	}

	@SuppressWarnings("unchecked")
	public List<Position> getAllPositions() {
		Session session = null;

		try {
			session = hibernateUtils.openSession();
			Query<Position> query = session.createQuery("FROM Position ORDER BY positionID");

			return query.list();
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
			Position position = session.get(Position.class, positionID);
			return position;
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

	@SuppressWarnings("unchecked")
	public Position getPositionByName(PositionName positionName) {
		Session session = null;
		try {
			session = hibernateUtils.openSession();
			Query<Position> query = session.createQuery("FROM Position WHERE positionName =:nameParemeter");
			query.setParameter("nameParemeter", positionName);
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

	public void updatePosition(Position position) {
		Session session = null;
		try {
			// get session
			session = hibernateUtils.openSession();
			session.beginTransaction();
			// update
			session.update(position);
			session.getTransaction().commit();
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

	public void deletePosition(short positionID) {
		Session session = null;
		try {
			// get session
			session = hibernateUtils.openSession();
			session.beginTransaction();
			// get position
			Position position = (Position) session.load(Position.class, positionID);
			// delete
			session.delete(position);
			session.getTransaction().commit();
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}
}
