<%--
    Document   : Exercise9Back
    Created on : 31 dic. 2021, 07:28:44
    Author     : Bryan
--%>

<%@page import="java.util.Arrays"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
        <title>Ejercicio 9</title>
    </head>
    <body>
        <%
            int enteredNumbersCount = Integer.parseInt(request.getParameter("inputs-count"));
            int[] numbers = new int[enteredNumbersCount];
            double average;

            for (int i = 1; i <= enteredNumbersCount; i++) {
                numbers[i - 1] = Integer.parseInt(request.getParameter("num" + i));
            }

            average = Arrays.stream(numbers).average().getAsDouble();

            out.println("<div class='container text-center py-5'>");
            out.println("<h3>");
            out.println("Promedio " + average);
            out.println("</h3>");
            out.println("</div>");
        %>
    </body>
</html>
