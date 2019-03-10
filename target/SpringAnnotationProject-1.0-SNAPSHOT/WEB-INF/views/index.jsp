<%-- 
    Document   : index
    Created on : Mar 10, 2019, 6:12:06 PM
    Author     : ssubik
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>JDBC Color</h1>
        <ul>
            <c:forEach var = "color" item = "${colors}">
                <li>
                    ${color.name}
                </li>>
            </c:foreach>
        </ul>
    </body>
</html>
