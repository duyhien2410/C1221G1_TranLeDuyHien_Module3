package service.customer_service;

import model.customer.Customer;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public interface ICustomerService {
    public Map<String,String> insertCustomer(Customer customer) throws SQLException;
    public Customer selectCustomer(int id);
    public List<Customer> selectAllCustomer();
    public void update(Customer customer);
    public void delete(int id);
    public List<Customer> searchCustomer(String name,String email,String customerType);
}
