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
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
        <script src = "https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity = "sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin = "anonymous" ></script>
        <title>JSP Page</title>
    </head>
    <body>
        <div align="center">
            <form action="IngresoC" method="POST">
                <table >
                    <tr>
                        <td>
                            Nombre:
                        </td>
                        <td>
                            <input type="text" name="txtN" id="txtN"/>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            Apellido:
                        </td>
                        <td>
                            <input type="text" name="txtA" id="txtA"/>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            Teléfono 1:
                        </td>
                        <td>
                            <input type="text" name="txtT1" id="txtT1"/>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            Teléfono 2:
                        </td>
                        <td>
                            <input type="text" name="txtT2" id="txtT2"/>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            Dirección:
                        </td>
                        <td>
                            <textarea name="txtD" id="txtD"></textarea>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            Correo:
                        </td>
                        <td>
                            <input type="email" name="txtE" id="txtE"/>
                        </td>
                    </tr>
                    <tr>
                        <td>
                        </td>
                        <td>
                            <input type="button" onclick="inData()" value="Ingresar"/>
                        </td>
                    </tr>
                </table>
            </form>
        </div>

        <script>
            function inData() {
                var n = document.getElementById("txtN").value;
                var a = document.getElementById("txtA").value;
                var t1 = document.getElementById("txtT1").value;
                var t2 = document.getElementById("txtT2").value;
                var d = document.getElementById("txtD").value;
                var c = document.getElementById("txtE").value;

                $.ajax({
                    data: {
                        txtN: n,
                        txtA: a,
                        txtT1: t1,
                        txtT2: t2,
                        txtD: d,
                        txtE: c
                    },
                    url: "IngresoC",
                    async: true,
                    type: "POST",
                    dataType: "text",
                    success: function (datos) {
                        if (datos.trim() === '1') {
                            alert("Contacto ingresado");
                        } else {
                            alert("Contacto no ingresado");
                        }
                    }
                });
            }
        </script>
    </body>
</html>
