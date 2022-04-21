package repository.employee_repository.impl;

import model.customer.CustomerType;
import model.employee.Level;
import repository.BaseRepository;
import repository.employee_repository.ILevelRepository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LevelRepositoryImpl implements ILevelRepository {
    private static final String SELECT_ALL_LEVEL = "select * from trinh_do";

    @Override
    public List<Level> selectAll() {
        List<Level> levelList = new ArrayList<>();
        try (PreparedStatement preparedStatement = BaseRepository.connection.prepareStatement(SELECT_ALL_LEVEL);) {
            System.out.println(preparedStatement);
            ResultSet resultSet = preparedStatement.executeQuery();


            while (resultSet.next()) {
                Integer idLevel = resultSet.getInt("ma_trinh_do");
                String nameLevel = resultSet.getString("ten_trinh_do");
                levelList.add(new Level(idLevel, nameLevel));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return levelList;
    }
}
