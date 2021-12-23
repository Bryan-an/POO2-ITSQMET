<%--
    Document   : Ejercicio3
    Created on : 23 dic. 2021, 10:30:27
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
        <div>
            <%
                String nom, ape;
                int horast;
                double salario, valorHora;

                nom = request.getParameter("name");
                ape = request.getParameter("lastname");
                horast = Integer.parseInt(request.getParameter("horast"));

                if (horast <= 40) {
                    valorHora = 5;
                    salario = horast * valorHora;
                } else {
                    valorHora = 8;
                    salario = horast * valorHora;
                }

                out.println("<div class='container bg-dark text-white'>");
                out.println("<div class='row'>");
                out.println("<div class='col-md-2'> </div>");
                out.println("<div align ='center' class='col-md-8'>");
                out.println("<h1>INFORMACIÓN EMPLEADO</h1>");
                out.println("<table class='table table-dark table-striped table-hover' style='text-align:center'>");
                out.println("<tr>");
                out.println("<td><label>Nombres</label>");
                out.println("</td>");
                out.println("<td><h3>" + nom + "</h3>");
                out.println("</td>");
                out.println("</tr>");
                out.println("<tr>");
                out.println("<td><label>Apellidos</label>");
                out.println("</td>");
                out.println("<td><h3>" + ape + "</h3>");
                out.println("</td>");
                out.println("</tr>");
                out.println("<tr>");
                out.println("<td><label>Horas trabajadas</label>");
                out.println("</td>");
                out.println("<td><h3>" + horast + "</h3>");
                out.println("</td>");
                out.println("</tr>");
                out.println("<td><label>Salario por hora</label>");
                out.println("</td>");
                out.println("<td><h3>$" + valorHora + "/hora</h3>");
                out.println("</td>");
                out.println("</tr>");
                out.println("<td><label>Salario total</label>");
                out.println("</td>");
                out.println("<td><h3>" + salario + "</h3>");
                out.println("</td>");
                out.println("</tr>");
                out.println("</table>");
                out.println("</div>");
                out.println("<div class='col-md-2 '> </div>");
                out.println("</div>");
                out.println("</div>");


            %>
        </div>
    </body>
</html>
