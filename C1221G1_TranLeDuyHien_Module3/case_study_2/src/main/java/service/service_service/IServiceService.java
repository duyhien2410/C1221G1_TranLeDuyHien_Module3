package service.service_service;

import model.service.Service;

import java.sql.SQLException;
import java.util.List;

public interface IServiceService {
    public void insertServices(Service service) throws SQLException;
    public List<Service> selectAllService();
}
