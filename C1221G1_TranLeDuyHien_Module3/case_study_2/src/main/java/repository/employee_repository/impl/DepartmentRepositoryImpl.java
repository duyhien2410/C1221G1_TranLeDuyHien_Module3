package repository.employee_repository.impl;

import model.employee.Department;
import model.employee.Level;
import repository.BaseRepository;
import repository.employee_repository.IDepartmentRepository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DepartmentRepositoryImpl implements IDepartmentRepository {
    private static final String SELECT_ALL_DEPARTMENT = "select * from bo_phan";

    @Override
    public List<Department> selectAll() {
        List<Department> departmentList = new ArrayList<>();
        try (PreparedStatement preparedStatement = BaseRepository.connection.prepareStatement(SELECT_ALL_DEPARTMENT);) {
            System.out.println(preparedStatement);
            ResultSet resultSet = preparedStatement.executeQuery();


            while (resultSet.next()) {
                Integer idDepartment = resultSet.getInt("ma_bo_phan");
                String nameDepartment = resultSet.getString("ten_bo_phan");
                departmentList.add(new Department(idDepartment, nameDepartment));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return departmentList;
    }
}
