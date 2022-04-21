package service.employee_service.impl;

import model.employee.Level;
import repository.employee_repository.ILevelRepository;
import repository.employee_repository.impl.LevelRepositoryImpl;
import service.employee_service.ILevelService;

import java.util.List;

public class LevelService implements ILevelService {
    ILevelRepository levelRepository = new LevelRepositoryImpl();
    @Override
    public List<Level> selectAll() {
        return this.levelRepository.selectAll();
    }
}
