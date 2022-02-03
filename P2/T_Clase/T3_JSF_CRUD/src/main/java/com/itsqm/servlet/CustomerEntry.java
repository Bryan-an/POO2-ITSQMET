package com.itsqm.servlet;

import com.itsqm.acceso.Customer;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Bryan
 */
@WebServlet(name = "CustomerEntry", urlPatterns = {"/CustomerEntry"})
public class CustomerEntry extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text");
        PrintWriter output = response.getWriter();

        String name = request.getParameter("name");
        String lastName1 = request.getParameter("lastName1");
        String lastName2 = request.getParameter("lastName2");
        String phone = request.getParameter("phone");
        String email = request.getParameter("email");

        String message = new Customer().insertCustomer(name, lastName1, lastName2, phone, email);
        output.print(message);
    }

}
