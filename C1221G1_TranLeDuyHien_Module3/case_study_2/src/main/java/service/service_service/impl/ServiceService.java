package service.service_service.impl;

import model.service.Service;
import repository.service_repository.IServiceRepository;
import repository.service_repository.impl.ServiceRepositoryImpl;
import service.service_service.IServiceService;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ServiceService implements IServiceService {
    IServiceRepository serviceRepository = new ServiceRepositoryImpl();

    @Override
    public Map<Integer,String> insertServices(Service service) throws SQLException {
        Map<Integer,String> map = new HashMap<>();
            if (service.getPeopleMax().equals("")){

            }
//        if (customer.getCustomerEmail().equals("")){
//            map.put("email","Email không được để trống");
//        } else if (!customer.getCustomerEmail().matches("^[a-zA-Z0-9._%-]+@[a-zA-Z0-9.-]+.[a-zA-Z]{2,4}$")){
//            map.put("email","Email không hợp lệ");
//        }
//
//        if (map.isEmpty()){
//            customerRepository.insertCustomer(customer);
//        }

        return map;
    }

    @Override
    public List<Service> selectAllService() {
        return this.serviceRepository.selectAllService();
    }
}
