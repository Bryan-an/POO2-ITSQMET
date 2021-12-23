<%--
    Document   : Ejercicio2
    Created on : 23 dic. 2021, 09:41:35
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
        <!--Hacer un sistema para una tienda de gafas de sol, el cual necesita como
        parámetros de entrada la cantidad y el precio. Al pagar el total de la factura el
        sistema debe considerar:
        a. Si el monto total es superior a $85 tiene un descuento del 10% del total
        de la factura
        b. Si el monto total es superior a $100 tiene un descuento del 15% del total
        de la factura
        49
        c. Si el monto total es superior a $115 tiene un descuento del 20% del total
        de la factura

        -->
        <div class="container w-50 my-5">
            <form action="./JSP/Ejercicio2.jsp" method="POST">
                <table class="table">
                    <div class="form-group">
                        <tr>
                            <td>
                                <label>Cantidad:</label>
                            </td>
                            <td>
                                <input type="number" name="amount" min="1" class="form-control" required>
                            </td>
                        </tr>
                        <tr>
                            <td>
                                <label>Precio:</label>
                            </td>
                            <td>
                                <input type="text" name="price" min="1" class="form-control" pattern="^\d+(\.\d{1,2})?$" title="Ingrese un número decimal" required>
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
