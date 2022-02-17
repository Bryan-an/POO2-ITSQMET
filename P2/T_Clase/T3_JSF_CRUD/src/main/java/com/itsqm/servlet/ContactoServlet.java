/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itsqm.servlet;

import com.itsqm.acceso.Contacto;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Bryan
 */
@WebServlet(name = "ContactoServlet", urlPatterns = {"/ContactoServlet"})
public class ContactoServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String menu = request.getParameter("crud");

        if (menu.equalsIgnoreCase("in")) {
            insertarContacto(response, request);
        } else if (menu.equalsIgnoreCase("up")) {
            actualizarContacto(response, request);
        } else if (menu.equalsIgnoreCase("del")) {
            eliminarContacto(response, request);
        } else if (menu.equalsIgnoreCase("list")) {
            listarContacto(response, request);
        }
    }

    /*@Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }*/
    private void listarContacto(HttpServletResponse response, HttpServletRequest request) {
        try {
            response.setContentType("text/html");
            PrintWriter pw = response.getWriter();
            String buscar = request.getParameter("txtBuscarC");
            Contacto c = new Contacto();
            ResultSet resp = c.consultarContacto(buscar);
            String tabla = "<table class='table table-hover'>";
            tabla += "<thead class='thead-dark'>";
            tabla += "<tr>";
            tabla += "<th>ID";
            tabla += "</th>";
            tabla += "<th>Nombres";
            tabla += "</th>";
            tabla += "<th>Apellidos";
            tabla += "</th>";
            tabla += "<th>Teléfono 1";
            tabla += "</th>";
            tabla += "<th>Teléfono 2";
            tabla += "</th>";
            tabla += "<th>Dirección";
            tabla += "</th>";
            tabla += "<th>Email";
            tabla += "</th>";
            tabla += "<th>Acción";
            tabla += "</th>";
            tabla += "</tr>";
            tabla += "</thead>";
            tabla += "<tbody>";

            while (resp.next()) {
                tabla += "<tr>";
                tabla += "<td>";
                tabla += resp.getInt("id_contacto");
                tabla += "</td>";
                tabla += "<td>";
                tabla += resp.getString("nombres");
                tabla += "</td>";
                tabla += "<td>";
                tabla += resp.getString("apellidos");
                tabla += "</td>";
                tabla += "<td>";
                tabla += resp.getString("tel1");
                tabla += "</td>";
                tabla += "<td>";
                tabla += resp.getString("tel2");
                tabla += "</td>";
                tabla += "<td>";
                tabla += resp.getString("dir");
                tabla += "</td>";
                tabla += "<td>";
                tabla += resp.getString("email");
                tabla += "</td>";
                tabla += "<td>Eliminar/Actualizar";
                tabla += "</td>";
                tabla += "</tr>";
            }

            tabla += "</tbody>";
            tabla += "</table>";

            pw.println(tabla);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void eliminarContacto(HttpServletResponse response, HttpServletRequest request) throws IOException {
        response.setContentType("text/html");
        PrintWriter pw = response.getWriter();

        int id = Integer.parseInt(request.getParameter("txtId"));

        Contacto c = new Contacto();
        String resp = c.eliminarContacto(id);
        pw.println(resp);
    }

    private void actualizarContacto(HttpServletResponse response, HttpServletRequest request) throws IOException {
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

    private void insertarContacto(HttpServletResponse response, HttpServletRequest request) throws IOException {
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
