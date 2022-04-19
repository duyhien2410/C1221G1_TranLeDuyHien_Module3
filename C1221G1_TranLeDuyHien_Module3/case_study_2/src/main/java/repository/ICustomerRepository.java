package repository;

import model.Customer;

import java.sql.SQLException;
import java.util.List;

public interface ICustomerRepository {
    public void insertCustomer(Customer customer) throws SQLException;
    public Customer selectCustomer(int id);
    public List<Customer> selectAllCustomer();
}