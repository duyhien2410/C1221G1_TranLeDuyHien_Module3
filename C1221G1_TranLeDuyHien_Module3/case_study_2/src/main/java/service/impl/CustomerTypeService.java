package service.impl;

import model.CustomerType;
import repository.ICustomerTypeRepository;
import repository.impl.CustomerTypeRepositoryImpl;
import service.ICustomerTypeService;

import java.util.List;

public class CustomerTypeService implements ICustomerTypeService {
    ICustomerTypeRepository customerTypeRepository = new CustomerTypeRepositoryImpl();

    @Override
    public List<CustomerType> selectAll() {
        return this.customerTypeRepository.selectAll();
    }
}
