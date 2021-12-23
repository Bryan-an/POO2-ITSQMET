<%--
    Document   : PromediarCalificaciones
    Created on : 23 dic. 2021, 09:17:58
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
        <%
            double n1, n2, n3, promedio;

            n1 = Double.parseDouble(request.getParameter("n1"));
            n2 = Double.parseDouble(request.getParameter("n2"));
            n3 = Double.parseDouble(request.getParameter("n3"));

            promedio = (n1 + n2 + n3) / 3;

            out.println("<div align='center'>");
            out.println("<table>");
            out.println("<tr>");
            out.println("<td><label>1ra nota:</label>");
            out.println("</td>");
            out.println("<td><h3>" + n1 + "</h3>");
            out.println("</td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td><label>2ra nota:</label>");
            out.println("</td>");
            out.println("<td><h3>" + n2 + "</h3>");
            out.println("</td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td><label>3ra nota:</label>");
            out.println("</td>");
            out.println("<td><h3>" + n3 + "</h3>");
            out.println("</td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td><label>Promedio:</label>");
            out.println("</td>");
            out.println("<td><h3>" + promedio + "</h3>");
            out.println("</td>");
            out.println("</tr>");
            out.println("</table>");
            out.println("</div>");
        %>
    </body>
</html>
