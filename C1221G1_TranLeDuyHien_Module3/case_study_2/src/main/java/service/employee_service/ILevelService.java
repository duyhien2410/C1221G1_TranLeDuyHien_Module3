package service.employee_service;

import model.employee.Level;

import java.util.List;

public interface ILevelService {
    List<Level> selectAll();
}
