package repository.employee_repository;

import model.employee.Employee;
import model.service.Service;

import java.sql.SQLException;
import java.util.List;

public interface IEmployeeRepository {
    public void insertEmployee(Employee employee) throws SQLException;
    public List<Employee> selectAllEmployee();
}
