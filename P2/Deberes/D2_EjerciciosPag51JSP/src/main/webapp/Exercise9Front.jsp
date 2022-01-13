<%--
    Document   : Exercise9Front
    Created on : 31 dic. 2021, 07:28:30
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
        <title>Ejercicio 9</title>
    </head>
    <body>
        <div class="container my-5">
            <h1 class="text-center">Ejercicio 9</h1>
            <p class="text-center"> Construir un sistema que solicite al usuario al menos 3 números, el sistema
                debería realizar lo siguiente:
            </p>
            <p class="text-center">
                a. Contar la cantidad de números ingresados
            </p>
            <p class="text-center">
                b. Controlar que sean números enteros positivos
            </p>
            <p class="text-center">
                c. Realizar el promedio
            </p>
            <p class="text-center">
                d. Imprimir promedios
            </p>
            <div class="my-5">
                <form action="./JSP/Exercise9Back.jsp" method="GET">
                    <table class="table">
                        <tbody>
                            <tr>
                                <td>
                                    <label class="h3">Ingrese las calificaciones</label>
                                </td>
                                <td>
                                    <div id="numbers-container">
                                        <input type="hidden" value="3" id="inputs-count" name="inputs-count" >
                                        <input type="number" name="num1" required class="form-control"  style="margin-bottom: 5px" min="1">
                                        <input type="number" name="num2" required class="form-control"  style="margin-bottom: 5px" min="1">
                                        <input type="number" name="num3" required class="form-control"  style="margin-bottom: 5px" min="1">
                                    </div>
                                    <button type="button"  class="btn btn-primary my-2" onclick="addMoreNumbers()">Agregar más números</button>
                                </td>
                            </tr>
                            <tr>
                                <td colspan="2" class="text-center">
                                    <input type="submit" value="Calcular" class="btn btn-primary">
                                </td>
                            </tr>
                        </tbody>
                    </table>
                </form>
            </div>
        </div>

        <script type="text/javascript">
            let inputsCount = 3;
            const numbersContainer = document.getElementById("numbers-container");
            const inputHidden = document.getElementById("inputs-count");

            function addMoreNumbers() {
                const input = document.createElement("input");
                inputsCount++;

                input.type = "number";
                input.name = "num" + inputsCount;
                input.required = true;
                input.className = "form-control";
                input.style = "margin-bottom: 5px";
                input.min = 1;

                numbersContainer.appendChild(input);
                inputHidden.value = inputsCount;
            }
        </script>
    </body>
</html>
