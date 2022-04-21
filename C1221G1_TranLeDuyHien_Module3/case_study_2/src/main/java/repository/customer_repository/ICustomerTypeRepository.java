package repository.customer_repository;

import model.customer.CustomerType;

import java.util.List;

public interface ICustomerTypeRepository {
    List<CustomerType> selectAll();
}
