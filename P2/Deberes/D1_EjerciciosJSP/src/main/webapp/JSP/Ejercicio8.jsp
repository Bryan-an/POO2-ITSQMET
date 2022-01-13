<%--
    Document   : Ejercicio8
    Created on : 24 dic. 2021, 07:57:56
    Author     : Bryan
--%>

<%@page import="java.util.Arrays"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ejercicio 8</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
    </head>
    <body>
        <%
            int[] numbers = new int[3];
            numbers[0] = Integer.parseInt(request.getParameter("n1"));
            numbers[1] = Integer.parseInt(request.getParameter("n2"));
            numbers[2] = Integer.parseInt(request.getParameter("n3"));

            Arrays.sort(numbers);

            int greater = numbers[2];
            int less = numbers[0];

            out.println("<div class='container text-center mt-5'>");
            out.println("<h3>");
            out.println("El " + greater + " es el número mayor");
            out.println("</h3>");
            out.println("<h3>");
            out.println("El " + less + " es el número menor");
            out.println("</h3>");
            out.println("</div>");
        %>
    </body>
</html>
