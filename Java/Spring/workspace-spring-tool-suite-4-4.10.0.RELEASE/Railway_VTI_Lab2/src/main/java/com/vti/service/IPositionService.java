package com.vti.service;

import java.util.List;

import com.vti.entity.Position;
import com.vti.entity.PositionName;

public interface IPositionService {
	public List<Position> getAllPositions();

	public Position getPositionByID(short positionID);

	public Position getPositionByName(PositionName positionName);

	public boolean isPositionExistsByID(short positionID);

	public boolean isPositionExistsByName(PositionName positionName);

	public void deletePosition(short positionID);
}
