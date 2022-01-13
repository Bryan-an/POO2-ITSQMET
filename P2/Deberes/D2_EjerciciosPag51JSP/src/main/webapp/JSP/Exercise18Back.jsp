<%--
    Document   : Exercise5Back.jsp
    Created on : 30 dic. 2021, 13:25:32
    Author     : Bryan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
        <title>Ejercicio 18</title>
    </head>
    <body>
        <%
            char[] phrase = request.getParameter("phrase").toCharArray();
            char letter = request.getParameter("letter").charAt(0);
            int count = 0;

            for (int i = 0; i < phrase.length; i++) {
                if (phrase[i] == letter) {
                    count++;
                }
            }

            String result = count == 0 ? "No se encontro la letra \"" + letter + "\" en la frase"
                    : "La letra \"" + letter + "\" se encontró " + count + " veces en la frase";

            out.println("<div class='container text-center py-5'>");
            out.println("<h3>");
            out.println(result);
            out.println("</h3>");
            out.println("</div>");
        %>
    </body>
</html>
