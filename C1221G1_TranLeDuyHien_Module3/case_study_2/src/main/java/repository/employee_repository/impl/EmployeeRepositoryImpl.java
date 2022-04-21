package repository.employee_repository.impl;

import model.employee.Employee;
import model.service.Service;
import repository.BaseRepository;
import repository.employee_repository.IEmployeeRepository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeRepositoryImpl implements IEmployeeRepository {
    private static final String INSERT_EMPLOYEE_SQL = "insert into nhan_vien (ho_ten,ngay_sinh,so_cmnd," +
            "luong,so_dien_thoai,email,dia_chi,ma_vi_tri,ma_trinh_do,ma_bo_phan) " +
            "values (?,?,?,?,?,?,?,?,?,?);";
    private static final String SELECT_ALL_EMPLOYEE = "select * from nhan_vien group by ma_nhan_vien;";

    @Override
    public void insertEmployee(Employee employee) throws SQLException {
        System.out.println(INSERT_EMPLOYEE_SQL);
        try (PreparedStatement preparedStatement = BaseRepository.connection.prepareStatement(INSERT_EMPLOYEE_SQL);) {
            preparedStatement.setString(1, employee.getName());
            preparedStatement.setString(2, employee.getBirthDay());
            preparedStatement.setString(3, employee.getIdCard());
            preparedStatement.setDouble(4, employee.getWage());
            preparedStatement.setString(5, employee.getPhone());
            preparedStatement.setString(6, employee.getEmail());
            preparedStatement.setString(7, employee.getAddress());
            preparedStatement.setInt(8, employee.getPositionId());
            preparedStatement.setInt(9, employee.getLevelId());
            preparedStatement.setInt(10, employee.getDepartmentId());
            System.out.println(preparedStatement);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Employee> selectAllEmployee() {
        List<Employee> employees = new ArrayList<>();
        try (PreparedStatement preparedStatement = BaseRepository.connection.prepareStatement(SELECT_ALL_EMPLOYEE)) {
            System.out.println(preparedStatement);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                Integer employeeId = rs.getInt("ma_nhan_vien");
                String name = rs.getString("ho_ten");
                String birthDay = rs.getString("ngay_sinh");
                String idCard = rs.getString("so_cmnd");
                Double wage = Double.parseDouble(rs.getString("luong"));
                String phone = rs.getString("so_dien_thoai");
                String email = rs.getString("email");
                String address = rs.getString("dia_chi");
                Integer positionId = rs.getInt("ma_vi_tri");
                Integer levelId = rs.getInt("ma_trinh_do");
                Integer departmentId = rs.getInt("ma_bo_phan");

                employees.add(new Employee(employeeId, name, birthDay, idCard, wage,
                        phone, email, address, positionId, levelId, departmentId));
            }
        } catch (SQLException e) {
            printSQLException(e);
        }
        return employees;
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
