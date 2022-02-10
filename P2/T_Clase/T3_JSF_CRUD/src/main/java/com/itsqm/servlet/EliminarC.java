/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
@WebServlet(name = "EliminarC", urlPatterns = {"/EliminarC"})
public class EliminarC extends HttpServlet {

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

        Contacto c = new Contacto();
        String resp = c.eliminarContacto(id);
        pw.println(resp);
    }
}
