/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itsqm.servlet;

import com.itsqm.acceso.Contacto;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Bryan
 */
@WebServlet(name = "ListarC", urlPatterns = {"/ListarC"})
public class ListarC extends HttpServlet {

    // GET -> doGet
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    // POST -> doPost
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            response.setContentType("text/html");
            PrintWriter pw = response.getWriter();

            String buscarC = request.getParameter("txtBuscarC");

            Contacto c = new Contacto();
            ResultSet resp = c.consultarContacto(buscarC);
            String resultado = "";

            while (resp.next()) {
                // 1ra opción JSON
                // text HTML
                // Servicio web
                resultado += resp.getInt("id_contacto") + "||";
                resultado += resp.getString("nombres") + "||";
                resultado += resp.getString("apellidos") + "||";
                resultado += resp.getString("tel1") + "||";
                resultado += resp.getString("tel2") + "||";
                resultado += resp.getString("dir") + "||";
                resultado += resp.getString("email") + "||";
            }

            pw.println(resultado);
        } catch (SQLException ex) {
            Logger.getLogger(ListarC.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
