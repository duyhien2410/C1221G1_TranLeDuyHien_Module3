package repository.contract_repository;

import model.contract.Contract;
import model.service.Service;

import java.sql.SQLException;
import java.util.List;

public interface IContractRepository {
    public void insertContract(Contract contract) throws SQLException;
    public List<Contract> selectAllContract();
}
