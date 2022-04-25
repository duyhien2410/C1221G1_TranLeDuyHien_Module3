package service.employee_service.impl;

import model.employee.Employee;
import repository.employee_repository.IEmployeeRepository;
import repository.employee_repository.impl.EmployeeRepositoryImpl;
import service.employee_service.IEmployeeService;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeService implements IEmployeeService {
    IEmployeeRepository iEmployeeRepository = new EmployeeRepositoryImpl();

    @Override
    public Map<String, String> insertEmployee(Employee employee) throws SQLException {
        Map<String, String> map = new HashMap<>();
        if (employee.getWage().equals("")) {
            map.put("wage", "Lương không được để trống");
        } else if (!employee.getWage().matches("^[1-9]\\d*[.]\\d+$")) {
            map.put("wage", "Lương phải là số dương");
        }

        if (employee.getPhone().equals("")) {
            map.put("phone","Số điện thoại không được để trống");
        } else if (!employee.getPhone().matches("^((090)|(091)|([(]84[)][+]90)|([(]84[)][+]91))\\d{7}$")){
            map.put("phone","Số điện thoại không hợp lệ");
        }

        return map;
    }

    @Override
    public List<Employee> selectAllEmployee() {
        return this.iEmployeeRepository.selectAllEmployee();
    }

    @Override
    public Employee selectEmployee(int id) {
        return this.iEmployeeRepository.selectEmployee(id);
    }

    @Override
    public void update(Employee employee) {
        this.iEmployeeRepository.update(employee);
    }

    @Override
    public void delete(int id) {
        this.iEmployeeRepository.delete(id);
    }

    @Override
    public List<Employee> searchEmployee(String name) {
        return this.iEmployeeRepository.searchEmployee(name);
    }
}
