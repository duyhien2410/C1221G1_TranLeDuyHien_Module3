package model.employee;

public class Employee {
    private Integer employeeId;
    private String name;
    private String birthDay;
    private String idCard;
    private String wage;        //lương
    private String phone;
    private String email;
    private String address;
    private Integer positionId;     //vị trí(chức vụ)
    private Integer levelId;        //trình độ
    private Integer departmentId;   //bộ phận

    public Employee() {
    }

    public Employee(String name, String birthDay, String idCard, String wage, String phone, String email,
                    String address, Integer positionId, Integer levelId, Integer departmentId) {
        this.name = name;
        this.birthDay = birthDay;
        this.idCard = idCard;
        this.wage = wage;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.positionId = positionId;
        this.levelId = levelId;
        this.departmentId = departmentId;
    }

    public Employee(Integer employeeId, String name, String birthDay, String idCard, String wage, String phone,
                    String email, String address, Integer positionId, Integer levelId, Integer departmentId) {
        this.employeeId = employeeId;
        this.name = name;
        this.birthDay = birthDay;
        this.idCard = idCard;
        this.wage = wage;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.positionId = positionId;
        this.levelId = levelId;
        this.departmentId = departmentId;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getWage() {
        return wage;
    }

    public void setWage(String wage) {
        this.wage = wage;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getPositionId() {
        return positionId;
    }

    public void setPositionId(Integer positionId) {
        this.positionId = positionId;
    }

    public Integer getLevelId() {
        return levelId;
    }

    public void setLevelId(Integer levelId) {
        this.levelId = levelId;
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }
}
