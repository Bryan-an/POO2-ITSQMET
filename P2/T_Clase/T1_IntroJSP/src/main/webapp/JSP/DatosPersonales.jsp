<%--
    Document   : DatosPersonales
    Created on : 23 dic. 2021, 07:48:13
    Author     : Bryan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
    </head>
    <body>
        <%
            String cc, nom, ape, correo;
            int edad;

            cc = request.getParameter("cc");
            nom = request.getParameter("nom");
            ape = request.getParameter("ape");
            correo = request.getParameter("correo");
            edad = Integer.parseInt(request.getParameter("edad"));

            out.println("<div align='center'>");
            out.println("<table>");
            out.println("<tr>");
            out.println("<td><label>Cédula:</label>");
            out.println("</td>");
            out.println("<td><h3>" + cc + "</h3>");
            out.println("</td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td><label>Nombres</label>");
            out.println("</td>");
            out.println("<td><h3>" + nom + "</h3>");
            out.println("</td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td><label>Apellidos:</label>");
            out.println("</td>");
            out.println("<td><h3>" + ape + "</h3>");
            out.println("</td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td><label>Correo:</label>");
            out.println("</td>");
            out.println("<td><h3>" + correo + "</h3>");
            out.println("</td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td><label>Edad:</label>");
            out.println("</td>");
            out.println("<td><h3>" + edad + "</h3>");
            out.println("</td>");
            out.println("</tr>");
            out.println("</table>");
            out.println("</div>");
        %>
    </body>
</html>
