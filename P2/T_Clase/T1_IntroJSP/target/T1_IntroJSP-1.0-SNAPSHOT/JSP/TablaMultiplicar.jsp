<%--
    Document   : TablaMultiplicar
    Created on : 30 dic. 2021, 07:57:43
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
            int num = Integer.parseInt(request.getParameter("num"));
            int numF = Integer.parseInt(request.getParameter("numFinal"));

            for (int i = 1; i <= numF; i++) {
                out.println(i + "x" + num + "=" + (i * num) + "<br>");
            }
        %>
    </body>
</html>
