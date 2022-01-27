package com.itsqm.servlet;

import com.itsqm.acceso.Contacto;
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
@WebServlet(name = "Ingreso", urlPatterns = {"/Ingreso"})
public class IngresoC extends HttpServlet {

    // GET -> doGet
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    // POST -> doPost
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter pw = response.getWriter();

        String n = request.getParameter("txtN");
        String a = request.getParameter("txtA");
        String t1 = request.getParameter("txtT1");
        String t2 = request.getParameter("txtT2");
        String d = request.getParameter("txtD");
        String e = request.getParameter("txtE");

        Contacto c = new Contacto();
        String resp = c.insertarContacto(n, a, t1, t2, d, e);
        pw.println(resp);
    }
}
