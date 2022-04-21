package service.customer_service.impl;



import model.customer.CustomerType;
import repository.customer_repository.ICustomerTypeRepository;
import repository.customer_repository.CustomerTypeRepositoryImpl;
import service.customer_service.ICustomerTypeService;

import java.util.List;

public class CustomerTypeService implements ICustomerTypeService {
    ICustomerTypeRepository customerTypeRepository = new CustomerTypeRepositoryImpl();

    @Override
    public List<CustomerType> selectAll() {
        return this.customerTypeRepository.selectAll();
    }
}
