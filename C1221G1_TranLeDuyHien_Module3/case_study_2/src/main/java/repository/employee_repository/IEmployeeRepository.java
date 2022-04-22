package repository.employee_repository;

import model.customer.Customer;
import model.employee.Employee;
import model.service.Service;

import java.sql.SQLException;
import java.util.List;

public interface IEmployeeRepository {
    public void insertEmployee(Employee employee) throws SQLException;
    public List<Employee> selectAllEmployee();
    public Employee selectEmployee(int id);
    public void update(Employee employee);
    public void delete(int id);
    public List<Employee> searchEmployee(String name);
}
