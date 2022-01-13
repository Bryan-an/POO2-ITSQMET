<%--
    Document   : Ejercicio3-PairNumbers
    Created on : 30 dic. 2021, 09:16:00
    Author     : Bryan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ejercicio 3 - Números pares</title>
    </head>
    <body>
        <%
            int initialNumber = Integer.parseInt(request.getParameter("initialNumber"));
            int pairNumber;

            if (initialNumber % 2 == 0) {
                pairNumber = initialNumber;
            } else {
                pairNumber = initialNumber + 1;
            }

            for (int i = 0; i < 10; i++) {
                out.println(pairNumber);
                pairNumber += 2;
            }
        %>
    </body>
</html>
