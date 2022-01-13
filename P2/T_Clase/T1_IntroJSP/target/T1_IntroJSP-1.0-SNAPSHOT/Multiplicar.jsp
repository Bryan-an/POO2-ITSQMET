<%--
    Document   : Multiplicar
    Created on : 30 dic. 2021, 07:50:17
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
        <title>JSP Page</title>
    </head>
    <body>
        <h1 align="center">
            Tablas de multiplicar
        </h1>
        <div class="container" align="center">
            <form action="./JSP/TablaMultiplicar.jsp" method="GET">
                <table class="table">
                    <tr>
                        <td>
                            <label>
                                Ingresa el número de la tabla de multiplicar
                            </label>
                        </td>
                        <td>
                            <input type="number" name="num" required class="form-control">
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <label>
                                Hasta qué número deseas multiplicar
                            </label>
                        </td>
                        <td>
                            <input type="number" name="numFinal" required class="form-control">
                        </td>
                    </tr>
                    <tr>
                        <td></td>
                        <td>
                            <input type="submit" value="Multiplicar" class="btn btn-primary">
                        </td>
                    </tr>
                </table>
            </form>
        </div>
    </body>
</html>
