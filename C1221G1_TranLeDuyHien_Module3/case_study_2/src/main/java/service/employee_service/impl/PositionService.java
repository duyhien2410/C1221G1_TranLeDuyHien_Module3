package service.employee_service.impl;

import model.employee.Position;
import repository.employee_repository.IPositionRepository;
import repository.employee_repository.impl.PositionRepositoryImpl;
import service.employee_service.IPositionService;

import java.util.List;

public class PositionService implements IPositionService {
    IPositionRepository positionRepository = new PositionRepositoryImpl();

    @Override
    public List<Position> selectAll() {
        return this.positionRepository.selectAll();
    }
}
