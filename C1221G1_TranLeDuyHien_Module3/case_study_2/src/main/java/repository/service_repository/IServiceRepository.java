package repository.service_repository;

import model.customer.Customer;
import model.service.Service;

import java.sql.SQLException;
import java.util.List;

public interface IServiceRepository {
    public void insertServices(Service service) throws SQLException;
    public List<Service> selectAllService();
}
