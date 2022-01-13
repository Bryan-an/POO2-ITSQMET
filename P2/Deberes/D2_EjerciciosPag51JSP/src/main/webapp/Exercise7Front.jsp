<%--
    Document   : Exercise7Front
    Created on : 30 dic. 2021, 13:59:38
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
        <title>Ejercicio 7</title>
    </head>
    <!--    7. Realizar un sistema que permita imprimir la sumatoria de los números múltiplos
            de siete entre en rango del cero a cien.-->
    <body>
        <div class="container my-5 text-center">
            <h1 >Ejercicio 7</h1>
            <p>Realizar un sistema que permita imprimir la sumatoria de los números múltiplos
                de siete entre en rango del cero a cien.</p>
            <div class="my-5">
                <form action="./JSP/Exercise7Back.jsp" method="GET">
                    <input type="submit" value="Imprimir" class="btn btn-primary">
                </form>
            </div>
        </div>
    </body>
</html>
