<%--
    Document   : SerieFibonacci
    Created on : 30 dic. 2021, 07:26:20
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
            int a = 0;
            int b = 1;
            int c;
            int posFinal = Integer.parseInt(request.getParameter("posFi"));
            // [0][1][1][2][3][5][8][13][21][34][55][..]
            // [a][b][c] - pasada 1
            //    [a][b][c] -pasada 2
            //       [a][b][c]

//            for (int i = 0; i < posFinal; i++) {
//                c = a + b;
//
//                if (i == 0) {
//                    out.println("a: " + a);
//                    out.println("b: " + b);
//                    out.println("c: " + c);
//                } else {
//                    out.println("c: " + c);
//                }
//
//                a = b;
//                b = c;
//            }
            int i = 0;
            while (i < posFinal) {
                c = a + b;

                if (i == 0) {
                    out.println("a: " + a);
                    out.println("b: " + b);
                    out.println("c: " + c);
                } else {
                    out.println("c: " + c);
                }

                a = b;
                b = c;

                i++;
            }
        %>
    </body>
</html>
