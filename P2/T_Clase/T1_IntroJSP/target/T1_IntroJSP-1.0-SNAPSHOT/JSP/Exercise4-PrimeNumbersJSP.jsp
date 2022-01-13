<%--
    Document   : Ejercicio4-PrimeNumbers
    Created on : 30 dic. 2021, 09:25:33
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

        <%
            int initialNumber = Integer.parseInt(request.getParameter("initialNumber"));
            int number = initialNumber;

            do {
                if (isPrime(number)) {
                    out.println(number);

                }

                number++;
            } while (number != 100);
        %>
        <%!
            public boolean isPrime(int number) {
                int dividersCount = 2;

                for (int i = 2; i < number; i++) {
                    if (number % i == 0) {
                        dividersCount++;
                        break;
                    }
                }

                return dividersCount == 2;
            }
        %>
    </body>
</html>
