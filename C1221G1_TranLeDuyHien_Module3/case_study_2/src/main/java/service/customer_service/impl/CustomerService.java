package service.customer_service.impl;





import model.customer.Customer;
import repository.customer_repository.ICustomerRepository;
import repository.customer_repository.CustomerRepositoryImpl;
import service.customer_service.ICustomerService;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

public class CustomerService implements ICustomerService {
    ICustomerRepository customerRepository = new CustomerRepositoryImpl();

    @Override
    public Map<String,String> insertCustomer(Customer customer) throws SQLException {
        Map<String,String> map = new HashMap<>();
        if (customer.getCustomerIdCard().equals("")){
            map.put("cmnd", "CMND không được để trống");
        } else if (!customer.getCustomerIdCard().matches("^\\d{9}|\\d{12}$")){
            map.put("cmnd","CMND không hợp lệ");
        }

        if (customer.getCustomerPhone().equals("")){
            map.put("phone","Số điện thoại không được để trống");
        } else if (!customer.getCustomerPhone().matches("^((090)|(091)|([(]84[)][+]90)|([(]84[)][+]91))\\d{7}$")){
            map.put("phone","Số điện thoại không hợp lệ");
        }

        if (customer.getCustomerEmail().equals("")){
            map.put("email","Email không được để trống");
        } else if (!customer.getCustomerEmail().matches("^[a-zA-Z0-9._%-]+@[a-zA-Z0-9.-]+.[a-zA-Z]{2,4}$")){
            map.put("email","Email không hợp lệ");
        }

        if (map.isEmpty()){
            customerRepository.insertCustomer(customer);
        }



        return map;
    }
//    public Map<String, String> save(Student student) {
//        Map<String, String>map = new HashMap<>();
//        if(student.getName().equals("")) {
//            map.put("name","Tên không được để trống");
//        } else if(!student.getName().matches("^[a-zA-Z ]+$")) {
//            map.put("name","Tên không hợp lệ");
//        }
//
//        if(map.isEmpty()) {
//            iStudentRepository.save(student);
//        }
//        return map;
//    }
    @Override
    public Customer selectCustomer(int id) {
        return this.customerRepository.selectCustomer(id);
    }

    @Override
    public List<Customer> selectAllCustomer() {
        return this.customerRepository.selectAllCustomer();
    }

    @Override
    public void update(Customer customer) {
        this.customerRepository.update(customer);
    }

    @Override
    public void delete(int id) {
        this.customerRepository.delete(id);
    }

    @Override
    public List<Customer> searchCustomer(String name,String email,String customerType) {
        return this.customerRepository.searchCustomer(name,email,customerType);
    }
}
