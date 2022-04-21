package repository.employee_repository.impl;

import model.employee.Level;
import model.employee.Position;
import repository.BaseRepository;
import repository.employee_repository.IPositionRepository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PositionRepositoryImpl implements IPositionRepository {
    private static final String SELECT_ALL_POSITION = "select * from vi_tri";

    @Override
    public List<Position> selectAll() {
        List<Position> positionList = new ArrayList<>();
        try (PreparedStatement preparedStatement = BaseRepository.connection.prepareStatement(SELECT_ALL_POSITION);) {
            System.out.println(preparedStatement);
            ResultSet resultSet = preparedStatement.executeQuery();


            while (resultSet.next()) {
                Integer idPosition = resultSet.getInt("ma_vi_tri");
                String namePosition = resultSet.getString("ten_vi_tri");
                positionList.add(new Position(idPosition, namePosition));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return positionList;
    }
}
