package backend.datalayer;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

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
			CriteriaBuilder builder = session.getCriteriaBuilder();
			CriteriaQuery<Position> query = builder.createQuery(Position.class);
			Root<Position> root = query.from(Position.class);
			query.select(root);
			List<Position> positions = session.createQuery(query).list();
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
			CriteriaBuilder builder = session.getCriteriaBuilder();
			CriteriaQuery<Position> query = builder.createQuery(Position.class);
			Root<Position> root = query.from(Position.class);
			query.select(root);
			query.where(builder.equal(root.get("positionID"), positionID));
			Position position = session.createQuery(query).uniqueResult();
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
			CriteriaBuilder builder = session.getCriteriaBuilder();
			CriteriaQuery<Position> query = builder.createQuery(Position.class);
			Root<Position> root = query.from(Position.class);
			query.select(root);
			query.where(builder.equal(root.get("positionName"), positionName));
			Position position = session.createQuery(query).uniqueResult();
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

	public void deletePosition(short positionID) {
		Session session = null;
		try {
			// get session
			session = hibernateUtils.openSession();
			session.beginTransaction();
			// get position
			CriteriaBuilder builder = session.getCriteriaBuilder();
			CriteriaQuery<Position> query = builder.createQuery(Position.class);
			Root<Position> root = query.from(Position.class);
			query.select(root);
			query.where(builder.equal(root.get("positionID"), positionID));
			Position position = session.createQuery(query).uniqueResult();
			session.delete(position);
			session.getTransaction().commit();
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}
}
