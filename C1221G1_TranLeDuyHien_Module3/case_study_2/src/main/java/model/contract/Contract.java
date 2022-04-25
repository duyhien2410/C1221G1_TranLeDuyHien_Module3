package model.contract;

public class Contract {
    private Integer contractId;
    private String contractDate;
    private String endDate;
    private String deposits;
    private Integer employeeId;
    private Integer customerId;
    private Integer serviceId;

    public Contract(String contractDate, String endDate, String deposits, Integer employeeId, Integer customerId, Integer serviceId) {
        this.contractDate = contractDate;
        this.endDate = endDate;
        this.deposits = deposits;
        this.employeeId = employeeId;
        this.customerId = customerId;
        this.serviceId = serviceId;
    }

    public Contract(Integer contractId, String contractDate, String endDate, String deposits, Integer employeeId, Integer customerId, Integer serviceId) {
        this.contractId = contractId;
        this.contractDate = contractDate;
        this.endDate = endDate;
        this.deposits = deposits;
        this.employeeId = employeeId;
        this.customerId = customerId;
        this.serviceId = serviceId;
    }

    public Integer getContractId() {
        return contractId;
    }

    public void setContractId(Integer contractId) {
        this.contractId = contractId;
    }

    public String getContractDate() {
        return contractDate;
    }

    public void setContractDate(String contractDate) {
        this.contractDate = contractDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getDeposits() {
        return deposits;
    }

    public void setDeposits(String deposits) {
        this.deposits = deposits;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public Integer getServiceId() {
        return serviceId;
    }

    public void setServiceId(Integer serviceId) {
        this.serviceId = serviceId;
    }
}
