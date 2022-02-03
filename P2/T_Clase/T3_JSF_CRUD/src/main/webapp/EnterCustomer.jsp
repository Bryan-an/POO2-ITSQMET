<%--
    Document   : EnterCustomer
    Created on : 3 feb. 2022, 11:12:17
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
        <title>Examen Segundo Parcial</title>
    </head>
    <body>
        <div class="container">
            <h1 class="text-center my-3">Examen Segundo Parcial</h1>
            <form id="form">
                <table class="table table-borderless w-50 m-auto">
                    <tr>
                        <td>
                            <div class="form-group">
                                <label>Nombre:</label>
                                <input type="text" id="name" class="form-control" required>
                            </div>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <div class="form-group">
                                <label>Apellido paterno:</label>
                                <input type="text" id="last-name-1" class="form-control" required>
                            </div>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <div class="form-group">
                                <label>Apellido materno:</label>
                                <input type="text" id="last-name-2" class="form-control" required>
                            </div>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <div class="form-group">
                                <label>Teléfono:</label>
                                <input type="text" id="phone" class="form-control" required>
                            </div>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <div class="form-group">
                                <label>Correo electrónico:</label>
                                <input type="email" id="email" class="form-control" required>
                            </div>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <div class="text-center">
                                <input type="submit" class="btn btn-primary" value="Enviar">
                            </div>
                        </td>
                    </tr>
                </table>
            </form>
        </div>

        <script>
            const form = document.getElementById("form");
            const nameInput = document.getElementById("name");
            const lastName1Input = document.getElementById("last-name-1");
            const lastName2Input = document.getElementById("last-name-2");
            const phoneInput = document.getElementById("phone");
            const emailInput = document.getElementById("email");

            const resetForm = () => {
                nameInput.value = "";
                lastName1Input.value = "";
                lastName2Input.value = "";
                phoneInput.value = "";
                emailInput.value = "";
            };

            form.addEventListener("submit", (e) => {
                $.ajax({
                    data: {
                        name: nameInput.value,
                        lastName1: lastName1Input.value,
                        lastName2: lastName2Input.value,
                        phone: phoneInput.value,
                        email: emailInput.value
                    },
                    url: "CustomerEntry",
                    async: true,
                    type: "POST",
                    dataType: "text",
                    success: (message) => {
                        if (message.trim() === '1') {
                            alert("Cliente ingresado");
                            resetForm();
                        } else {
                            alert("Cliente no ingresado");
                        }
                    }
                });

                e.preventDefault();
            });
        </script>
    </body>
</html>
