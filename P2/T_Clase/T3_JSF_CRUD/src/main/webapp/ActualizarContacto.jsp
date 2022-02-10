<%--
    Document   : ActualizarContacto
    Created on : 10 feb. 2022, 07:16:31
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
        <title>Actualizar Contacto</title>
    </head>
    <body>
        <h1 align="center">Actualizar Contacto</h1>
        <div align="center">
            <form>
                <table>
                    <tr>
                        <td>
                            <label>ID:</label>
                        </td>
                        <td>
                            <input type="text" id="idC" required>
                            <button type="button" class="btn btn-success" onclick="buscarC()">Buscar</button>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <label>Nombres:</label>
                        </td>
                        <td>
                            <input type="text" id="nC" required>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <label>Apellidos:</label>
                        </td>
                        <td>
                            <input type="text" id="aC" required>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <label>Teléfono 1:</label>
                        </td>
                        <td>
                            <input type="number" id="t1C" required>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <label>Teléfono 2:</label>
                        </td>
                        <td>
                            <input type="number" id="t2C" required>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <label>Dirección:</label>
                        </td>
                        <td>
                            <textarea id="dC" required></textarea>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <label>Email:</label>
                        </td>
                        <td>
                            <input type="email" id="eC" required>
                        </td>
                    </tr>
                    <tr>
                        <td>
                        </td>
                        <td>
                            <button type="button" class="btn btn-primary" onclick="upC()">Actualizar</button>
                        </td>
                    </tr>
                </table>
            </form>
        </div>

        <script>
            function upC() {
                var id = document.getElementById("idC").value;
                var n = document.getElementById("nC").value;
                var a = document.getElementById("aC").value;
                var t1 = document.getElementById("t1C").value;
                var t2 = document.getElementById("t2C").value;
                var d = document.getElementById("dC").value;
                var e = document.getElementById("eC").value;

                $.ajax({
                    data: {
                        txtId: id,
                        txtN: n,
                        txtA: a,
                        txtT1: t1,
                        txtT2: t2,
                        txtD: d,
                        txtE: e
                    },
                    url: "ActualizarC",
                    async: true,
                    type: "POST",
                    dataType: "text",
                    success: function (datos) {
                        datos = datos.trim();

                        if (datos === "1") {
                            alert("Contacto actualizado");
                        } else {
                            alert("Contacto no actualizado");
                        }
                    }
                });

            }


            function buscarC() {
                var bC = document.getElementById("idC").value;

                $.ajax({
                    data: {
                        txtBuscarC: bC
                    },
                    url: "ListarC",
                    async: true,
                    type: "POST",
                    dataType: "text",
                    success: function (datos) {
                        var datosArr = datos.split("||");

                        document.getElementById("nC").value = datosArr[1];
                        document.getElementById("aC").value = datosArr[2];
                        document.getElementById("t1C").value = datosArr[3];
                        document.getElementById("t2C").value = datosArr[4];
                        document.getElementById("dC").value = datosArr[5];
                        document.getElementById("eC").value = datosArr[6];
                    }
                });
            }
        </script>
    </body>
</html>
