package service.employee_service;

import model.employee.Department;

import java.util.List;

public interface IDepartmentService {
    List<Department> selectAll();
}
