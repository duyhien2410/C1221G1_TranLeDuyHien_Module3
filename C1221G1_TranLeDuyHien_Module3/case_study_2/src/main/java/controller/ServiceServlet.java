package controller;

import model.customer.Customer;
import model.customer.CustomerType;
import model.service.Service;
import service.customer_service.ICustomerService;
import service.customer_service.impl.CustomerService;
import service.customer_service.impl.CustomerTypeService;
import service.service_service.IServiceService;
import service.service_service.impl.ServiceService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@WebServlet(name = "ServiceServlet", urlPatterns = "/services")
public class ServiceServlet extends HttpServlet {
    private IServiceService serviceService;

    public void init() {
        serviceService = new ServiceService();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                showCreate(request, response);
                break;
            default:
                listService(request, response);
                break;
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                insertServices(request, response);
                break;
        }

    }

    private void insertServices(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        String serviceName = request.getParameter("serviceName");
        Integer area = Integer.parseInt(request.getParameter("area"));
        Double costs = Double.parseDouble(request.getParameter("costs"));
        String peopleMax = request.getParameter("peopleMax");
        String standardRoom = request.getParameter("standardRoom");
        String convenientOther = request.getParameter("convenientOther");
        Double areaPool = Double.parseDouble(request.getParameter("areaPool"));
        String numberFloor = request.getParameter("numberFloor");
        Integer typeRentId = Integer.parseInt(request.getParameter("typeRentId"));
        Integer typeServiceId = Integer.parseInt(request.getParameter("typeServiceId"));

        Service service = new Service(serviceName, area, costs, peopleMax,
                standardRoom, convenientOther, areaPool, numberFloor,typeRentId,typeServiceId);
        Map<String,String> map = null;
        try {
            map = serviceService.insertServices(service);
            request.setAttribute("error", map);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        try {
            serviceService.insertServices(service);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        RequestDispatcher dispatcher = request.getRequestDispatcher("view/service/create.jsp");
        dispatcher.forward(request, response);
    }

    private void listService(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Service> serviceList = serviceService.selectAllService();
        request.setAttribute("serviceList", serviceList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("view/service/list.jsp");
        dispatcher.forward(request, response);
    }

    private void showCreate(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("view/service/create.jsp");
        dispatcher.forward(request, response);
    }
}
