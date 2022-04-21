package model.service;

public class Service {
    private Integer serviceID;
    private String serviceName;
    private Integer area;
    private Double costs;           //chi phí thuê
    private Integer peopleMax;      //số người tối đa
    private String standardRoom;    //tiêu chuẩn phòng
    private String convenientOther; //tiện nghi khác
    private Double areaPool;        //diện tích hồ bơi
    private Integer numberFloor;    //số tầng
    private Integer typeRentId;     //mã kiểu thuê
    private Integer typeServiceId;  //mã loại dịch dụ

    public Service() {
    }

    public Service(String serviceName, Integer area, Double costs, Integer peopleMax, String standardRoom,
                   String convenientOther, Double areaPool, Integer numberFloor, Integer typeRentId, Integer typeServiceId) {
        this.serviceName = serviceName;
        this.area = area;
        this.costs = costs;
        this.peopleMax = peopleMax;
        this.standardRoom = standardRoom;
        this.convenientOther = convenientOther;
        this.areaPool = areaPool;
        this.numberFloor = numberFloor;
        this.typeRentId = typeRentId;
        this.typeServiceId = typeServiceId;
    }

    public Service(Integer serviceID, String serviceName, Integer area, Double costs, Integer peopleMax,
                   String standardRoom, String convenientOther, Double areaPool, Integer numberFloor, Integer typeRentId,
                   Integer typeServiceId) {
        this.serviceID = serviceID;
        this.serviceName = serviceName;
        this.area = area;
        this.costs = costs;
        this.peopleMax = peopleMax;
        this.standardRoom = standardRoom;
        this.convenientOther = convenientOther;
        this.areaPool = areaPool;
        this.numberFloor = numberFloor;
        this.typeRentId = typeRentId;
        this.typeServiceId = typeServiceId;
    }

    public Integer getServiceID() {
        return serviceID;
    }

    public void setServiceID(Integer serviceID) {
        this.serviceID = serviceID;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public Integer getArea() {
        return area;
    }

    public void setArea(Integer area) {
        this.area = area;
    }

    public Double getCosts() {
        return costs;
    }

    public void setCosts(Double costs) {
        this.costs = costs;
    }

    public Integer getPeopleMax() {
        return peopleMax;
    }

    public void setPeopleMax(Integer peopleMax) {
        this.peopleMax = peopleMax;
    }

    public String getStandardRoom() {
        return standardRoom;
    }

    public void setStandardRoom(String standardRoom) {
        this.standardRoom = standardRoom;
    }

    public String getConvenientOther() {
        return convenientOther;
    }

    public void setConvenientOther(String convenientOther) {
        this.convenientOther = convenientOther;
    }

    public Double getAreaPool() {
        return areaPool;
    }

    public void setAreaPool(Double areaPool) {
        this.areaPool = areaPool;
    }

    public Integer getNumberFloor() {
        return numberFloor;
    }

    public void setNumberFloor(Integer numberFloor) {
        this.numberFloor = numberFloor;
    }

    public Integer getTypeRentId() {
        return typeRentId;
    }

    public void setTypeRentId(Integer typeRentId) {
        this.typeRentId = typeRentId;
    }

    public Integer getTypeServiceId() {
        return typeServiceId;
    }

    public void setTypeServiceId(Integer typeServiceId) {
        this.typeServiceId = typeServiceId;
    }
}
