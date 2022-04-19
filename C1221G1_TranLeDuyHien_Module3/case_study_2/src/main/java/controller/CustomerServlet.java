package controller;

import repository.ICustomerRepository;
import repository.impl.CustomerRepositoryImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "CustomerServlet", urlPatterns = "/customers")
public class CustomerServlet extends HttpServlet {
    private ICustomerRepository customerRepository;

    public void init() {
        customerRepository = new CustomerRepositoryImpl();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    private void insertCustomer(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{

    }
}
