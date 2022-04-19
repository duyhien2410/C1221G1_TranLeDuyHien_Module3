package repository.impl;

import model.Customer;
import repository.BaseRepository;
import repository.ICustomerRepository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CustomerRepositoryImpl implements ICustomerRepository {
    private static final String INSERT_CUSTOMER_SQL = "insert into khach_hang (ho_ten,ngay_sinh,gioi_tinh," +
            "so_cmnd,so_dien_thoai,email,dia_chi,ma_loai_khach) values (?,?,?,?,?,?,?,?);";
    //    private static final String SELECT_CUSTOMER_BY_ID = "select id,name,email,country from users where id =?";
    private static final String SELECT_ALL_CUSTOMER = "select * from khach_hang group by ho_ten;";

    @Override
    public void insertCustomer(Customer customer) throws SQLException {
        System.out.println(INSERT_CUSTOMER_SQL);
        try (PreparedStatement preparedStatement = BaseRepository.connection.prepareStatement(INSERT_CUSTOMER_SQL)) {
            preparedStatement.setString(1, customer.getCustomerName());
            preparedStatement.setString(2, customer.getCustomerBirthday());
            preparedStatement.setString(3, customer.getCustomerGender());
            preparedStatement.setString(4, customer.getCustomerIdCard());
            preparedStatement.setString(5, customer.getCustomerPhone());
            preparedStatement.setString(6, customer.getCustomerEmail());
            preparedStatement.setString(7, customer.getCustomerAddress());
            preparedStatement.setInt(8, customer.getCustomerTypeId());
            System.out.println(preparedStatement);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Customer selectCustomer(int id) {
        return null;
    }

    @Override
    public List<Customer> selectAllCustomer() {
        List<Customer> customers = new ArrayList<>();
        try (PreparedStatement preparedStatement = BaseRepository.connection.prepareStatement(SELECT_ALL_CUSTOMER)) {
            System.out.println(preparedStatement);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                Integer customerId = rs.getInt("ma_khach_hang");
                Integer customerTypeId = rs.getInt("ma_loai_khach");
                String customerName = rs.getString("ho_ten");
                String customerBirthDay = rs.getString("ngay_sinh");
                String customerGender = rs.getString("gioi_tinh");
                String customerIdCard = rs.getString("so_cmnd");
                String customerPhone = rs.getString("so_dien_thoai");
                String customerEmail = rs.getString("email");
                String customerAddress = rs.getString("dia_chi");

                customers.add(new Customer(customerId,customerTypeId,customerName,customerBirthDay,customerGender,customerIdCard,customerPhone,
                        customerEmail,customerAddress));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return customers;
    }
}
