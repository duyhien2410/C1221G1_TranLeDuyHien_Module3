import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ProductServlet", value = "/ProductServlet")
public class ProductServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String productName = String.valueOf(request.getParameter("product"));
        double listPrice = Double.parseDouble(request.getParameter("price"));
        double discountPercent = Double.parseDouble(request.getParameter("discountPercent"));

        double discountAmount = listPrice*discountPercent*0.01;
        double discountPrice = listPrice - discountAmount;

        request.setAttribute("productName",productName);
        request.setAttribute("amount", discountAmount);
        request.setAttribute("price", discountPrice);
        request.getRequestDispatcher("result.jsp").forward(request,response);
//        PrintWriter writer = response.getWriter();
//        writer.println("<html>");
//        writer.println("<h1>Product Description: " + productName + "</h1>");
//        writer.println("<h1>List Price: " + listPrice + "</h1>");
//        writer.println("<h1>Discount Percent: " + discountPercent + "</h1>");
//        writer.println("<br>");
//        writer.println("<h1>Discount Amount: " + discountAmount + "</h1>");
//        writer.println("<h1>Discount Price: " + discountPrice + "</h1>");
//        writer.println("</html>");
    }
}
