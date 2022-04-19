package service.impl;

import model.Customer;
import repository.ICustomerRepository;
import repository.impl.CustomerRepositoryImpl;
import service.ICustomerService;

import java.sql.SQLException;
import java.util.List;

public class CustomerService implements ICustomerService {
    ICustomerRepository customerRepository = new CustomerRepositoryImpl();

    @Override
    public void insertCustomer(Customer customer) throws SQLException {
        this.customerRepository.insertCustomer(customer);
    }

    @Override
    public Customer selectCustomer(int id) {
        return this.customerRepository.selectCustomer(id);
    }

    @Override
    public List<Customer> selectAllCustomer() {
        return this.customerRepository.selectAllCustomer();
    }
}
