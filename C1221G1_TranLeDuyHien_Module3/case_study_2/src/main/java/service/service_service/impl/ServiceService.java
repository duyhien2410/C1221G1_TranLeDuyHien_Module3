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
    public Map<String, String> insertServices(Service service) throws SQLException {
        Map<String, String> map = new HashMap<>();
        if (service.getPeopleMax().equals("")) {
            map.put("max", "Số người tối đa không được để trống");
        } else if (!service.getPeopleMax().matches("^[1-9]\\d*$")) {
            map.put("max", "Số người tối đa phải là số nguyên dương");
        }

        if (service.getNumberFloor().equals("")) {
            map.put("floor", "Số tầng không được để trống");
        } else if (!service.getNumberFloor().matches("^[1-9]\\d*$")) {
            map.put("floor", "Số tầng phải là số nguyên dương");
        }

        if (map.isEmpty()) {
            serviceRepository.insertServices(service);
        }

        return map;
    }

    @Override
    public List<Service> selectAllService() {
        return this.serviceRepository.selectAllService();
    }
}
