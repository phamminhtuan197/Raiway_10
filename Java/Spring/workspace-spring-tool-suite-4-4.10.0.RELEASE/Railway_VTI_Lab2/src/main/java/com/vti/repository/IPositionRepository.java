package com.vti.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vti.entity.Position;
import com.vti.entity.PositionName;

public interface IPositionRepository extends JpaRepository<Position, Short> {

	public Position getByPositionName(PositionName positionName);

	public boolean existsByPositionName(PositionName positionName);
}
