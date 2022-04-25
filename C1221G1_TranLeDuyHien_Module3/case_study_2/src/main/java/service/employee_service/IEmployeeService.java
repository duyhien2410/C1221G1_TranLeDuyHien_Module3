package service.employee_service;

import model.employee.Employee;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public interface IEmployeeService {
    public Map<String, String> insertEmployee(Employee employee) throws SQLException;
    public List<Employee> selectAllEmployee();
    public Employee selectEmployee(int id);
    public void update(Employee employee);
    public void delete(int id);
    public List<Employee> searchEmployee(String name);
}
