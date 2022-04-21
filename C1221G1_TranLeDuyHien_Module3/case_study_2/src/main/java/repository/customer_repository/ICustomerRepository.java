package repository.customer_repository;

import model.customer.Customer;

import java.sql.SQLException;
import java.util.List;

public interface ICustomerRepository {
    public void insertCustomer(Customer customer) throws SQLException;
    public Customer selectCustomer(int id);
    public List<Customer> selectAllCustomer();
    public void update(Customer customer);
    public void delete(int id);
    public List<Customer> searchCustomer(String name);
}
