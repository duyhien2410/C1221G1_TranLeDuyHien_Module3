package repository.employee_repository;

import model.employee.Department;

import java.util.List;

public interface IDepartmentRepository {
    List<Department> selectAll();
}
