<%-- 
    Document   : test
    Created on : 27-Aug-2020, 16:59:15
    Author     : mac
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%= 
            100+100+i 
          
        %>
        <% i = i + 5; %>
        <%! private int i = 20; %>
    </body>
</html>
