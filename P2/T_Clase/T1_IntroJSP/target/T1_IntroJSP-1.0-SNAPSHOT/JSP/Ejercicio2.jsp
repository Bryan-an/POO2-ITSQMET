<%--
    Document   : Ejercicio2
    Created on : 23 dic. 2021, 09:54:53
    Author     : Bryan
--%>

<%@page import="java.text.DecimalFormat"%>
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
            double price = Double.parseDouble(request.getParameter("price"));
            double amount = Double.parseDouble(request.getParameter("amount"));
            double subtotal = price * amount;
            double discount = 0;
            double total = 0;
            DecimalFormat formatter = new DecimalFormat("0.00");

            if (subtotal > 115) {
                discount = 20;
                total = subtotal * (1 - (discount / 100));
            } else if (subtotal > 100) {
                discount = 15;
                total = subtotal * (1 - (discount / 100));
            } else if (subtotal > 85) {
                discount = 10;
                total = subtotal * (1 - (discount / 100));
            } else {
                total = subtotal;
            }

            out.println("<div class='container w-50 my-5 table-hover'>");
            out.println("<table class='table table-striped'>");
            out.println("<tr>");
            out.println("<td>");
            out.println("<p class='h3'>");
            out.println("Cantidad:");
            out.println("</p>");
            out.println("</td>");
            out.println("<td>");
            out.println("<p class='h4'>");
            out.println((int) amount);
            out.println("</p>");
            out.println("</td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td>");
            out.println("<p class='h3'>");
            out.println("Precio:");
            out.println("</p>");
            out.println("</td>");
            out.println("<td>");
            out.println("<p class='h4'>");
            out.println(price);
            out.println("</p>");
            out.println("</td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td>");
            out.println("<p class='h3'>");
            out.println("Descuento:");
            out.println("</p>");
            out.println("</td>");
            out.println("<td>");
            out.println("<p class='h4'>");
            out.println(discount + "%");
            out.println("</p>");
            out.println("</td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td>");
            out.println("<p class='h3'>");
            out.println("Total:");
            out.println("</p>");
            out.println("</td>");
            out.println("<td>");
            out.println("<p class='h4'>");
            out.println("$ " + formatter.format(total));
            out.println("</p>");
            out.println("</td>");
            out.println("</tr>");
            out.println("</table>");
            out.println("</div>");
        %>
    </body>
</html>
