<%--
    Document   : Exercise5Front
    Created on : 30 dic. 2021, 13:25:08
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
        <title>Ejercicio 17</title>
    </head>
    <body>
        <div class="container my-5">
            <h1 class="text-center">Ejercicio 17</h1>
            <p class="text-center">
                Construir un programa que pida al usuario ingresar una palabra por teclado,
                mostrar cada letra separadas por un salto de línea desde la ultima letra hasta la
                primera de la palabra.
            </p>
            <div class="my-5">
                <form action="./JSP/Exercise17Back.jsp" method="GET">
                    <table class="table">
                        <tbody>
                            <tr>
                                <td>
                                    <label class="h3" for="word">Ingrese una palabra:</label>
                                </td>
                                <td>
                                    <input type="text" name="word" required class="form-control" pattern="^[a-zA-ZáéíóúÁÉÍÓÚñÑ]*$"
                                           title="Ingrese una palabra válida">
                                </td>
                            </tr>
                            <tr>
                                <td colspan="2" class="text-center">
                                    <input type="submit" value="Imprimir" class="btn btn-primary">
                                </td>
                            </tr>
                        </tbody>
                    </table>
                </form>
            </div>
        </div>
    </body>
</html>
