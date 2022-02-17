<%--
    Document   : ContactoVista
    Created on : 17 feb. 2022, 10:01:38
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
        <title>Contacto Vista</title>
    </head>
    <body>
        <div align="center">
            <h1>Contactos</h1>
            <hr>
            <h2>Buscar Contacto</h2>
            <table>
                <tr>
                    <td>
                        <label>Buscar contacto:</label>
                    </td>
                    <td>
                        <input type="text" id="buscarC">
                    </td>
                </tr>
                <tr>
                    <td></td>
                    <td>
                        <button type="button" class="btn btn-primary" onclick="buscarC()">
                            Buscar
                        </button>
                        <button type="button" class="btn btn-success" onclick="">
                            Insertar
                        </button>
                    </td>
                </tr>
            </table>
            <hr>
            <div class="container" id="tablaC">

            </div>
        </div>

        <script>
            window.onload = function () {
                buscarC();
            };

            function buscarC() {
                var b = document.getElementById("buscarC").value;

                $.ajax({
                    data: {
                        crud: "list",
                        txtBuscarC: b
                    },
                    url: "ContactoServlet",
                    async: true,
                    type: "GET",
                    dataType: "text",
                    success: function (datos) {
                        document.getElementById("tablaC").innerHTML = datos;
                    }
                });
            }
        </script>
    </body>
</html>
