package repository.employee_repository;

import model.customer.CustomerType;
import model.employee.Level;

import java.util.List;

public interface ILevelRepository {
    List<Level> selectAll();
}
