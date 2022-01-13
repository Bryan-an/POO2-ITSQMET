<%--
    Document   : Exercise9Front
    Created on : 31 dic. 2021, 07:28:30
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
        <title>Ejercicio 16</title>
    </head>
    <body>
        <div class="container my-5">
            <h1 class="text-center">Ejercicio 9</h1>
            <p class="text-center"> Construir un programa que permita validar la contraseña ingresada por el
                usuario, es decir, debería solicitar:
            </p>
            <p class="text-center">
                a. Ingreso de contraseñas
            </p>
            <p class="text-center">
                b. Confirmación de la contraseña
            </p>
            <p class="text-center">
                c. Verificación de que las los contraseñas ingresadas sean las mismas
            </p>
            <p class="text-center">
                d. Imprimir esta verificación
            </p>
            <div class="my-5">
                <form action="./JSP/Exercise16Back.jsp" method="GET">
                    <table class="table">
                        <tbody>
                            <tr>
                                <td>
                                    <label class="h3" for="password">Ingrese su contraseña:</label>
                                </td>
                                <td>
                                    <input type="password" name="password" required class="form-control"  >
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    <label class="h3" for="confirm-password">Ingrese de nuevo su contraseña:</label>
                                </td>
                                <td>
                                    <input type="password" name="confirm-password" required class="form-control"  >
                                </td>
                            </tr>

                            <tr>
                                <td colspan="2" class="text-center">
                                    <input type="submit" value="Verificar" class="btn btn-primary">
                                </td>
                            </tr>
                        </tbody>
                    </table>
                </form>
            </div>
        </div>
    </body>
</html>
