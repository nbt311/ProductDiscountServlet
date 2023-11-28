package com.example.productdiscountcalculator;
import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "DiscountServlet", value = "/discount-servlet")
public class DiscountServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        double listprice = Double.parseDouble(request.getParameter("price"));
        double percent = Double.parseDouble(request.getParameter("percent"));
        double DiscountAmount  = listprice * percent * 0.01;
        double DiscountPrice  = listprice - DiscountAmount;
        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<h1>Discount Amount: " + DiscountAmount + "</h1>");
        writer.println("<h1>DiscountPrice: " + DiscountPrice + "</h1>");
        writer.println("</html>");
    }
}