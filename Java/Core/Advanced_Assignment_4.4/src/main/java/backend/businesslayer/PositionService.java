package backend.businesslayer;

import java.util.List;

import backend.datalayer.IPositionRepository;
import backend.datalayer.PositionRepository;
import entity.Position;
import entity.PositionName;

public class PositionService implements IPositionService {
	private IPositionRepository positionRepository;

	public PositionService() {
		positionRepository = new PositionRepository();
	}

	public List<Position> getAllPositions() {
		return positionRepository.getAllPositions();
	}

	public Position getPositionByID(short positionID) {
		return positionRepository.getPositionByID(positionID);
	}

	public Position getPositionByName(PositionName positionName) {
		return positionRepository.getPositionByName(positionName);
	}

	public void createPosition(Position position) {
		positionRepository.createPosition(position);
	}

	public boolean isPositionExistsByID(short positionID) {
		return positionRepository.isPositionExistsByID(positionID);
	}

	public boolean isPositionExistsByName(PositionName positionName) {
		return positionRepository.isPositionExistsByName(positionName);
	}

	public void deletePosition(short positionID) {
		positionRepository.deletePosition(positionID);
	}

}
