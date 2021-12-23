<%--
    Document   : index
    Created on : 16 dic. 2021, 08:23:19
    Author     : Bryan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%
            String saludo = "Hola Mundo";
            out.println("<h1 align='center'>" + saludo + "</h1>");
            out.println("<table border='2'>");
            out.println("<thead>");
            out.println("<tr>");
            out.println("<th>Nombres");
            out.println("</th>");
            out.println("<th>Apellidos");
            out.println("</th>");
            out.println("<th>Correo");
            out.println("</th>");
            out.println("</tr>");
            out.println("</thead>");
            out.println("<tbody>");
            out.println("<tr>");
            out.println("<td>David");
            out.println("</td>");
            out.println("<td>Galarza");
            out.println("</td>");
            out.println("<td>d@c.c");
            out.println("</td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td>Carlos");
            out.println("</td>");
            out.println("<td>Quintanilla");
            out.println("</td>");
            out.println("<td>c@c.c");
            out.println("</td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td>Felipe");
            out.println("</td>");
            out.println("<td>Lopez");
            out.println("</td>");
            out.println("<td>f@c.c");
            out.println("</td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td>Marco");
            out.println("</td>");
            out.println("<td>Caiza");
            out.println("</td>");
            out.println("<td>m@c.c");
            out.println("</td>");
            out.println("</tr>");
            out.println("</tbody>");
            out.println("</table>");
            out.print("<br><br>");
            out.println("Generar un formulario dentro de una tabla");
            out.println("<h2>Datos del postulante</h2>");
            out.println("<form>");
            out.println("<table>");
            out.println("<tr>");
            out.println("<td>");
            out.println("<label>Cédula</label>");
            out.println("</td>");
            out.println("<td>");
            out.println("<input type='text' id='cedula'>");
            out.println("</td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td>");
            out.println("<label>Nombres</label>");
            out.println("</td>");
            out.println("<td>");
            out.println("<input type='text' id='nombres'>");
            out.println("</td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td>");
            out.println("<label>Apellidos</label>");
            out.println("</td>");
            out.println("<td>");
            out.println("<input type='text' id='apellidos'>");
            out.println("</td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td>");
            out.println("<label>Correo</label>");
            out.println("</td>");
            out.println("<td>");
            out.println("<input type='email' id='correo'>");
            out.println("</td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td>");
            out.println("<label>Dirección</label>");
            out.println("</td>");
            out.println("<td>");
            out.println("<textarea id='dir'></textarea>");
            out.println("</td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td>");
            out.println("<label>Último estudio</label>");
            out.println("</td>");
            out.println("<td>");
            out.println("<select id='uEstudio'>");
            out.println("<option value='ing'>Ingeniería</option>");
            out.println("<option value='msc'>Maestría en ciencias</option>");
            out.println("<option value='mgt'>Maestría profesionalizante</option>");
            out.println("<option value='phd'>Doctorado en filosofía</option>");
            out.println("</select>");
            out.println("</td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td>");
            out.println("</td>");
            out.println("<td>");
            out.println("<button>Registrar</button>");
            out.println("</td>");
            out.println("</tr>");
            out.println("</table>");
            out.println("</form>");
        %>
    </body>
</html>
