package backend.businesslayer;

import java.util.List;

import entity.Position;
import entity.PositionName;

public interface IPositionService {
	List<Position> getAllPositions();

	Position getPositionByID(short positionID);

	Position getPositionByName(PositionName positionName);

	void createPosition(Position position);

	boolean isPositionExistsByID(short positionID);

	boolean isPositionExistsByName(PositionName positionName);

	void deletePosition(short positionID);
}
