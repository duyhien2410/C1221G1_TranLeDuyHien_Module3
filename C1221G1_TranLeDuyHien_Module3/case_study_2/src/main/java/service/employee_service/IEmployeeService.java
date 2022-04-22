package service.employee_service;

import model.employee.Employee;

import java.sql.SQLException;
import java.util.List;

public interface IEmployeeService {
    public void insertEmployee(Employee employee) throws SQLException;
    public List<Employee> selectAllEmployee();
    public Employee selectEmployee(int id);
    public void update(Employee employee);
    public void delete(int id);
    public List<Employee> searchEmployee(String name);
}
