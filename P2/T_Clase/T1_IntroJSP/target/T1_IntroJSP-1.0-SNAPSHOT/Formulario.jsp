<%--
    Document   : Formulario
    Created on : 23 dic. 2021, 07:17:03
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
        <div align="center">
            <h1>Datos personales</h1>
            <hr>
            <fieldset>
                <legend align="center">Datos</legend>
                <form action="./JSP/DatosPersonales.jsp" method="POST">
                    <table>
                        <tr>
                            <td>
                                <label>Cédula:</label>
                            </td>
                            <td>
                                <input type="text" name="cc" required>
                            </td>
                        </tr>
                        <tr>
                            <td>
                                <label>Nombres:</label>
                            </td>
                            <td>
                                <input type="text" name="nom" required>
                            </td>
                        </tr>
                        <tr>
                            <td>
                                <label>Apellido:</label>
                            </td>
                            <td>
                                <input type="text" name="ape" required>
                            </td>
                        </tr>
                        <tr>
                            <td>
                                <label>Correo:</label>
                            </td>
                            <td>
                                <input type="email" name="correo" required>
                            </td>
                        </tr>
                        <tr>
                            <td>
                                <label>Edad:</label>
                            </td>
                            <td>
                                <input type="number" name="edad" required max="100" min="17">
                            </td>
                        </tr>
                        <tr>
                            <td>
                            </td>
                            <td>
                                <button type="submit" class="btn btn-primary">Enviar</button>
                            </td>
                        </tr>
                    </table>
                </form>
            </fieldset>
        </div>
    </body>
</html>
