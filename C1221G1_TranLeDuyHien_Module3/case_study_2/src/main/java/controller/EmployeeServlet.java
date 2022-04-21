package controller;

import model.customer.CustomerType;
import model.employee.Department;
import model.employee.Employee;
import model.employee.Level;
import model.employee.Position;
import model.service.Service;
import service.employee_service.IDepartmentService;
import service.employee_service.IEmployeeService;
import service.employee_service.ILevelService;
import service.employee_service.IPositionService;
import service.employee_service.impl.DepartmentService;
import service.employee_service.impl.EmployeeService;
import service.employee_service.impl.LevelService;
import service.employee_service.impl.PositionService;
import service.service_service.IServiceService;
import service.service_service.impl.ServiceService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "EmployeeServlet", urlPatterns = "/employees")
public class EmployeeServlet extends HttpServlet {
    private IEmployeeService employeeService;
    private ILevelService levelService;
    private IPositionService positionService;
    private IDepartmentService departmentService;

    public void init() {
        employeeService = new EmployeeService();
        levelService = new LevelService();
        positionService = new PositionService();
        departmentService = new DepartmentService();
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
            case "update":
//                showUpdate(request, response);
                break;
            default:
                listEmployee(request, response);
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
                insertEmployee(request, response);
                break;
//            case "update":
//                updateCustomer(request,response);
//                break;
//            case "delete":
//                try {
//                    deleteCustomer(request, response);
//                } catch (SQLException e) {
//                    e.printStackTrace();
//                }
//                break;
//            case "search":
//                try {
//                    searchCustomer(request, response);
//                } catch (SQLException e) {
//                    e.printStackTrace();
//                }
//                break;
        }

    }

    private void insertEmployee(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        String name = request.getParameter("name");
        String birthDay = request.getParameter("birthDay");
        String idCard = request.getParameter("idCard");
        Double wage = Double.parseDouble(request.getParameter("wage"));
        String phone = request.getParameter("phone");
        String email = request.getParameter("email");
        String address = request.getParameter("address");
        Integer positionId = Integer.parseInt(request.getParameter("positionId"));
        Integer levelId = Integer.parseInt(request.getParameter("levelId"));
        Integer departmentId = Integer.parseInt(request.getParameter("departmentId"));

        Employee employee = new Employee(name, birthDay, idCard, wage,
                phone, email, address, positionId,levelId,departmentId);
        try {
            employeeService.insertEmployee(employee);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        RequestDispatcher dispatcher = request.getRequestDispatcher("view/employee/create.jsp");
        dispatcher.forward(request, response);
    }

    private void listEmployee(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Employee> employeeList = employeeService.selectAllEmployee();
        List<Level> levelList = levelService.selectAll();
        List<Position> positionList = positionService.selectAll();
        List<Department> departmentList = departmentService.selectAll();
        request.setAttribute("employeeList", employeeList);
        request.setAttribute("levelList", levelList);
        request.setAttribute("positionList", positionList);
        request.setAttribute("departmentList",departmentList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("view/employee/list.jsp");
        dispatcher.forward(request, response);
    }

    private void showCreate(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Level> levelList = levelService.selectAll();
        request.setAttribute("levelList", levelList);
        List<Position> positionList = positionService.selectAll();
        request.setAttribute("positionList", positionList);
        List<Department> departmentList = departmentService.selectAll();
        request.setAttribute("departmentList",departmentList);

        RequestDispatcher dispatcher = request.getRequestDispatcher("view/employee/create.jsp");
        dispatcher.forward(request, response);
    }

}
