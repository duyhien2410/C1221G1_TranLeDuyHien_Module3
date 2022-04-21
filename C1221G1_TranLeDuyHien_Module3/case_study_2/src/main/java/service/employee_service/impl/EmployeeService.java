package service.employee_service.impl;

import model.employee.Employee;
import repository.employee_repository.IEmployeeRepository;
import repository.employee_repository.impl.EmployeeRepositoryImpl;
import service.employee_service.IEmployeeService;

import java.sql.SQLException;
import java.util.List;

public class EmployeeService implements IEmployeeService {
    IEmployeeRepository iEmployeeRepository = new EmployeeRepositoryImpl();

    @Override
    public void insertEmployee(Employee employee) throws SQLException {
        this.iEmployeeRepository.insertEmployee(employee);
    }

    @Override
    public List<Employee> selectAllEmployee() {
        return this.iEmployeeRepository.selectAllEmployee();
    }
}
