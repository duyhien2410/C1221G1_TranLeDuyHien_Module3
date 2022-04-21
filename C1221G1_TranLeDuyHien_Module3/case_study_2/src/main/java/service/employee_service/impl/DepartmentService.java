package service.employee_service.impl;

import model.employee.Department;
import repository.employee_repository.IDepartmentRepository;
import repository.employee_repository.impl.DepartmentRepositoryImpl;
import service.employee_service.IDepartmentService;

import java.util.List;

public class DepartmentService implements IDepartmentService {
    IDepartmentRepository departmentRepository = new DepartmentRepositoryImpl();

    @Override
    public List<Department> selectAll() {
        return this.departmentRepository.selectAll();
    }
}
