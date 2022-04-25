package service.service_service;

import model.service.Service;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public interface IServiceService {
    public Map<String,String> insertServices(Service service) throws SQLException;
    public List<Service> selectAllService();
}
