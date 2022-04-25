package repository.contract_repository.impl;

import model.contract.Contract;
import model.service.Service;
import repository.BaseRepository;
import repository.contract_repository.IContractRepository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ContractRepositoryImpl implements IContractRepository {
    private static final String INSERT_CONTRACT_SQL = "insert into dich_vu (ten_dich_vu,dien_tich,chi_phi_thue," +
            "so_nguoi_toi_da,tieu_chuan_phong,mo_ta_tien_nghi_khac,dien_tich_ho_boi,so_tang,ma_kieu_thue,ma_loai_dich_vu) " +
            "values (?,?,?,?,?,?,?,?,?,?);";
    private static final String SELECT_ALL_CONTRACT = "select * from dich_vu group by ma_dich_vu;";

    @Override
    public void insertContract(Contract contract) throws SQLException {
        System.out.println(INSERT_CONTRACT_SQL);
        try (PreparedStatement preparedStatement = BaseRepository.connection.prepareStatement(INSERT_CONTRACT_SQL);) {
            preparedStatement.setString(1, contract.getContractDate());
            preparedStatement.setString(2, contract.getEndDate());
            preparedStatement.setString(3, contract.getDeposits());
            preparedStatement.setInt(4, contract.getEmployeeId());
            preparedStatement.setInt(5, contract.getCustomerId());
            preparedStatement.setInt(6, contract.getServiceId());

            System.out.println(preparedStatement);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Contract> selectAllContract() {
        List<Contract> contracts = new ArrayList<>();
        try (PreparedStatement preparedStatement = BaseRepository.connection.prepareStatement(SELECT_ALL_CONTRACT)) {
            System.out.println(preparedStatement);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                Integer contractId = rs.getInt("ma_hop_dong");
                String contractDate = rs.getString("ngay_lam_hop_dong");
                String endDate = rs.getString("ngay_ket_thuc");
                String deposits = rs.getString("tien_dat_coc");
                Integer employeeId = rs.getInt("ma_nhan_vien");
                Integer customerId = rs.getInt("ma_khach_hang");
                Integer serviceId = rs.getInt("ma_dich_vu");

                contracts.add(new Contract(contractId, contractDate, endDate, deposits, employeeId,
                        customerId, serviceId));
            }
        } catch (SQLException e) {
            printSQLException(e);
        }
        return contracts;
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
