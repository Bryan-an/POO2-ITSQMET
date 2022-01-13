<%--
    Document   : Ejercicio4
    Created on : 23 dic. 2021, 11:14:27
    Author     : Bryan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ejercicio 4</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
    </head>
    <body>
        <!-- 4. Realizar un sistema que permita dar descuento a clientes con membresía de
            una tienda en línea de comida conociendo que:
            a. Clientes con membresía A: 10% de descuento
            b. Clientes con membresía B: 8% de descuento
            c. Clientes con membresía C: 6% de descuento -->
        <div class="container w-50 my-5">
            <form action="./JSP/Ejercicio4.jsp" method="POST">
                <table class="table">
                    <div class="form-group">
                        <tr>
                            <td>
                                <label class="h4">Membresía:</label>
                            </td>
                            <td>
                                <select name="membership" class="form-control" required>
                                    <option value="" selected>Elija su membresía</option>
                                    <option value="a">A</option>
                                    <option value="b">B</option>
                                    <option value="c">C</option>
                                </select>
                            </td>
                        </tr>
                        <tr>
                            <td>
                            </td>
                            <td>
                                <input type="submit" value="Enviar" class="btn btn-primary" >
                            </td>
                        </tr>
                    </div>
                </table>
            </form>
        </div>
    </body>
</html>
