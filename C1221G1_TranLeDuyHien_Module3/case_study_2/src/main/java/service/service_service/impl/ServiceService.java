package service.service_service.impl;

import model.service.Service;
import repository.service_repository.IServiceRepository;
import repository.service_repository.impl.ServiceRepositoryImpl;
import service.service_service.IServiceService;

import java.sql.SQLException;
import java.util.List;

public class ServiceService implements IServiceService {
    IServiceRepository serviceRepository = new ServiceRepositoryImpl();

    @Override
    public void insertServices(Service service) throws SQLException {
        this.serviceRepository.insertServices(service);
    }

    @Override
    public List<Service> selectAllService() {
        return this.serviceRepository.selectAllService();
    }
}
