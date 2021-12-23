<%--
Document : Ejercicio3
Created on : 23 dic. 2021, 9:44:15
Author : User
--%>



<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ingreso Salario</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
    </head>
    <body>
        <div align="center" class="container bg-dark text-white">
            <h1>Ingreso de información</h1>
            <hr>
            <fieldset>
                <legend align="center">Información empleado</legend>
            </fieldset>
            <!-- action -->
            <form action="./JSP/Ejercicio3.jsp" method="POST">
                <table class="table table-dark table-striped table-hover" style="text-align:center" >
                    <tr>
                        <td>
                            <label>Nombres:</label>
                        </td>
                        <td>
                            <input type="text" name="name" required=""/>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <label>Apellidos:</label>
                        </td>
                        <td>
                            <input type="text" name="lastname" required=""/>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <label>Horas trabajadas:</label>
                        </td>
                        <td>
                            <input type="number" name="horast" required="" min="0" max="168"/>
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
            </hr>



        </div>
    </body>
</html>