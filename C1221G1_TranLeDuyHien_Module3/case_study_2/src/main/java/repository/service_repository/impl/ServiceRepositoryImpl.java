package repository.service_repository.impl;

import model.customer.Customer;
import model.service.Service;
import repository.BaseRepository;
import repository.service_repository.IServiceRepository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ServiceRepositoryImpl implements IServiceRepository {
    private static final String INSERT_SERVICE_SQL = "insert into dich_vu (ten_dich_vu,dien_tich,chi_phi_thue," +
            "so_nguoi_toi_da,tieu_chuan_phong,mo_ta_tien_nghi_khac,dien_tich_ho_boi,so_tang,ma_kieu_thue,ma_loai_dich_vu) " +
            "values (?,?,?,?,?,?,?,?,?,?);";
    private static final String SELECT_ALL_SERVICE = "select * from dich_vu group by ma_dich_vu;";

    @Override
    public void insertServices(Service service) throws SQLException {
        System.out.println(INSERT_SERVICE_SQL);
        try (PreparedStatement preparedStatement = BaseRepository.connection.prepareStatement(INSERT_SERVICE_SQL);) {
            preparedStatement.setString(1, service.getServiceName());
            preparedStatement.setInt(2, service.getArea());
            preparedStatement.setDouble(3, service.getCosts());
            preparedStatement.setString(4, service.getPeopleMax());
            preparedStatement.setString(5, service.getStandardRoom());
            preparedStatement.setString(6, service.getConvenientOther());
            preparedStatement.setDouble(7, service.getAreaPool());
            preparedStatement.setString(8, service.getNumberFloor());
            preparedStatement.setInt(9, service.getTypeRentId());
            preparedStatement.setInt(10, service.getTypeServiceId());
            System.out.println(preparedStatement);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Service> selectAllService() {
        List<Service> services = new ArrayList<>();
        try (PreparedStatement preparedStatement = BaseRepository.connection.prepareStatement(SELECT_ALL_SERVICE)) {
            System.out.println(preparedStatement);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                Integer serviceID = rs.getInt("ma_dich_vu");
                String serviceName = rs.getString("ten_dich_vu");
                Integer area = rs.getInt("dien_tich");
                Double costs = rs.getDouble("chi_phi_thue");
                String peopleMax = rs.getString("so_nguoi_toi_da");
                String standardRoom = rs.getString("tieu_chuan_phong");
                String convenientOther = rs.getString("mo_ta_tien_nghi_khac");
                Double areaPool = rs.getDouble("dien_tich_ho_boi");
                String numberFloor = rs.getString("so_tang");
                Integer typeRentId = rs.getInt("ma_kieu_thue");
                Integer typeServiceId = rs.getInt("ma_loai_dich_vu");

                services.add(new Service(serviceID, serviceName, area, costs, peopleMax,
                        standardRoom, convenientOther, areaPool, numberFloor, typeRentId, typeServiceId));
            }
        } catch (SQLException e) {
            printSQLException(e);
        }
        return services;
    }

    private void printSQLException(SQLException ex) {
        for (Throwable e : ex) {
            if (e instanceof SQLException) {
                e.printStackTrace(System.err);
                System.err.println("SQLState: " + ((SQLException) e).getSQLState());
                System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
                System.err.println("Message: " + e.getMessage());
                Throwable t = ex.getCause();
                while (t != null) {
                    System.out.println("Cause: " + t);
                    t = t.getCause();
                }
            }
        }
    }
}
