<%--
    Document   : EliminarContacto
    Created on : 10 feb. 2022, 09:43:54
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
        <title>Eliminar Contacto</title>
    </head>
    <body>
        <h1 align="center">Eliminar Contacto</h1>
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
                            <input type="text" id="nC" required readonly>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <label>Apellidos:</label>
                        </td>
                        <td>
                            <input type="text" id="aC" required readonly>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <label>Teléfono 1:</label>
                        </td>
                        <td>
                            <input type="number" id="t1C" required readonly>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <label>Teléfono 2:</label>
                        </td>
                        <td>
                            <input type="number" id="t2C" required readonly>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <label>Dirección:</label>
                        </td>
                        <td>
                            <textarea id="dC" required readonly></textarea>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <label>Email:</label>
                        </td>
                        <td>
                            <input type="email" id="eC" required readonly>
                        </td>
                    </tr>
                    <tr>
                        <td>
                        </td>
                        <td>
                            <button type="button" class="btn btn-primary" onclick="deleteContact()">Eliminar</button>
                        </td>
                    </tr>
                </table>
            </form>
        </div>

        <script>
            function deleteContact() {
                var id = document.getElementById("idC").value;

                $.ajax({
                    data: {
                        txtId: id
                    },
                    url: "EliminarC",
                    async: true,
                    type: "POST",
                    dataType: "text",
                    success: function (datos) {
                        datos = datos.trim();

                        if (datos === "1") {
                            alert("Contacto eliminado");
                        } else {
                            alert("Contacto no eliminado");
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
