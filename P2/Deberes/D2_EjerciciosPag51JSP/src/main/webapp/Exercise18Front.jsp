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
        <title>Ejercicio 18</title>
    </head>
    <body>
        <div class="container my-5">
            <h1 class="text-center">Ejercicio 18</h1>
            <p class="text-center">
                Realizar un programa que pida al usuario ingresar una frase y luego una letra
                con el fin de imprimir en pantallas cuantas veces se encontrĂ³ esa letra en la
                frase.
            </p>
            <div class="my-5">
                <form action="./JSP/Exercise18Back.jsp" method="GET">
                    <table class="table">
                        <tbody>
                            <tr>
                                <td>
                                    <label class="h3" for="phrase">Ingrese una frase:</label>
                                </td>
                                <td>
                                    <input type="text" name="phrase" required class="form-control">
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    <label class="h3" for="letter">Ingrese una letra:</label>
                                </td>
                                <td>
                                    <input type="text" name="letter" required class="form-control" pattern="^[a-zA-ZĂ¡Ă©Ă­Ă³ĂºĂ?Ă‰Ă?Ă“Ă?Ă±Ă‘]$"
                                           title="Ingrese una letra">
                                </td>
                            </tr>
                            <tr>
                                <td colspan="2" class="text-center">
                                    <input type="submit" value="Contar" class="btn btn-primary">
                                </td>
                            </tr>
                        </tbody>
                    </table>
                </form>
            </div>
        </div>
    </body>
</html>
