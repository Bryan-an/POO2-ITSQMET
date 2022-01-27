<%--
    Document   : IngresarContacto
    Created on : 27 ene. 2022, 10:25:08
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
        <div align="center">
            <form action="Ingreso" method="POST">
                <table >
                    <tr>
                        <td>
                            Nombre:
                        </td>
                        <td>
                            <input type="text" name="txtN"/>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            Apellido:
                        </td>
                        <td>
                            <input type="text" name="txtA"/>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            Teléfono 1:
                        </td>
                        <td>
                            <input type="text" name="txtT1"/>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            Teléfono 2:
                        </td>
                        <td>
                            <input type="text" name="txtT2"/>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            Dirección:
                        </td>
                        <td>
                            <textarea name="txtD"></textarea>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            Correo:
                        </td>
                        <td>
                            <input type="email" name="txtE"/>
                        </td>
                    </tr>
                    <tr>
                        <td>
                        </td>
                        <td>
                            <input type="submit" value="Ingresar"/>
                        </td>
                    </tr>
                </table>
            </form>
        </div>
    </body>
</html>
