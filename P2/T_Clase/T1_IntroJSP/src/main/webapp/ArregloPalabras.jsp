<%--
    Document   : ArregloPalabras
    Created on : 6 ene. 2022, 09:37:36
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
        <title>JSP Page</title>
    </head>
    <body>
        <div align="center" class="container">
            <h3 class="my-5">Ingresa las 5 palabras</h3>
            <form action="" method="">
                <table class="table">
                    <tbody id="resp">
                        <tr>
                            <td>
                                <label>Ingresa la palabra:</label>
                            </td>
                            <td>
                                <input type="text" id="p1" required class="form-control"/>
                            </td>
                        </tr>

                    </tbody>
                    <tfoot>
                        <tr>
                            <td></td>
                            <td>
                                <input type="button" value="Agregar palabras" onclick="add()" class="btn btn-warning"/>
                            </td>
                        </tr>
                        <tr>
                            <td>
                            </td>
                            <td>
                                <button type="submit" class="btn btn-primary">Mostrar</button>
                            </td>
                        </tr>
                    </tfoot>
                </table>
            </form>
        </div>

        <script>
//            const resp = document.getElementById("resp");
//
//            let inputCount = 1;
//
//            function add() {
//                if (inputCount < 5) {
//                    const tr = document.createElement("tr");
//                    const tdLabel = document.createElement("td");
//                    const tdInput = document.createElement("td");
//                    const label = document.createElement("label");
//                    const input = document.createElement("input");
//
//                    label.innerText = "Ingresa la palabra:";
//                    input.type = "text";
//                    input.id = "p" + inputCount++;
//                    input.required = true;
//                    input.className = "form-control";
//
//                    tdLabel.appendChild(label);
//                    tdInput.appendChild(input);
//                    tr.appendChild(tdLabel);
//                    tr.appendChild(tdInput);
//
//                    resp.appendChild(tr);
//                }
//            }

            var bandera = 2;

            function add() {
                if (bandera <= 5) {
                    var fila = "<tr>";
                    fila += "<td>";
                    fila += "<label>Ingresa la palabra";
                    fila += "</label>";
                    fila += "</td>";
                    fila += "<td>";
                    fila += "<input type='text' id='p" + bandera + "' required class='form-control'>";
                    fila += "</td>";
                    fila += "</tr>";
                    document.getElementById("resp").innerHTML += fila;
                    bandera++;
                }
            }
        </script>
    </body>
</html>
