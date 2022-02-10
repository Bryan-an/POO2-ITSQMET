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
@WebServlet(name = "ActualizarC", urlPatterns = {"/ActualizarC"})
public class ActualizarC extends HttpServlet {

    // GET -> doGet
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    // POST -> doPost
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter pw = response.getWriter();

        int id = Integer.parseInt(request.getParameter("txtId"));
        String n = request.getParameter("txtN");
        String a = request.getParameter("txtA");
        String t1 = request.getParameter("txtT1");
        String t2 = request.getParameter("txtT2");
        String d = request.getParameter("txtD");
        String e = request.getParameter("txtE");

        Contacto c = new Contacto();
        String resp = c.actualizarContacto(id, n, a, t1, t2, d, e);
        pw.println(resp);
    }
}
