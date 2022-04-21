package repository.employee_repository;

import model.employee.Position;

import java.util.List;

public interface IPositionRepository {
    List<Position> selectAll();
}
