package backend.persentationlayer;

import java.util.List;

import backend.businesslayer.IPositionService;
import backend.businesslayer.PositionService;
import entity.Position;
import entity.PositionName;

public class PositionController {
	private IPositionService positionService;

	public PositionController() {
		positionService = new PositionService();
	}

	public List<Position> getAllPositions() {
		return positionService.getAllPositions();
	}

	public Position getPositionByID(short positionID) {
		return positionService.getPositionByID(positionID);
	}

	public Position getPositionByName(PositionName positionName) {
		return positionService.getPositionByName(positionName);
	}

	public void createPosition(Position position) {
		positionService.createPosition(position);
	}

	public boolean isPositionExistsByID(short positionID) {
		return positionService.isPositionExistsByID(positionID);
	}

	public boolean isPositionExistsByName(PositionName positionName) {
		return positionService.isPositionExistsByName(positionName);
	}

	public void deletePosition(short positionID) {
		positionService.deletePosition(positionID);
	}
}
