package service.customer_service.impl;





import model.customer.Customer;
import repository.customer_repository.ICustomerRepository;
import repository.customer_repository.CustomerRepositoryImpl;
import service.customer_service.ICustomerService;

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

    @Override
    public void update(Customer customer) {
        this.customerRepository.update(customer);
    }

    @Override
    public void delete(int id) {
        this.customerRepository.delete(id);
    }

    @Override
    public List<Customer> searchCustomer(String name) {
        return this.customerRepository.searchCustomer(name);
    }
}
