<%--
    Document   : Calificaciones
    Created on : 23 dic. 2021, 09:12:04
    Author     : Bryan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <!--Realizar un sistema que permita ingresar tres calificaciones,
        mostrar la calificación final indicando si el alumno aprobó o reprobó
        la asignatura, considere:a.La calificación máxima es 10b.La calificación
        mínima es
        1c.Se aprueba la asignatura con al menos 7pts de promediod.
        Si el promedio el inferior a 7pts, entonces reprueba la asignatura.-->
        <div align="center">
            <fieldset>
                <legend align="center">Calificaciones</legend>
                <h1>Registro de Calificaciones</h1>
                <form action="./JSP/PromediarCalificaciones.jsp" method="POST">
                    <table>
                        <tr>
                            <td>
                                <label>1ra calificación:</label>
                            </td>
                            <td>
                                <input type="number" name="n1" required>
                            </td>
                        </tr>
                        <tr>
                            <td>
                                <label>2da calificación:</label>
                            </td>
                            <td>
                                <input type="number" name="n2" required>
                            </td>
                        </tr>
                        <tr>
                            <td>
                                <label>3ra calificación:</label>
                            </td>
                            <td>
                                <input type="number" name="n3" required>
                            </td>
                        </tr>
                        <tr>
                            <td>
                            </td>
                            <td>
                                <input type="submit" value="Promediar">
                            </td>
                        </tr>
                    </table>
                </form>
            </fieldset>
        </div>
    </body>
</html>
