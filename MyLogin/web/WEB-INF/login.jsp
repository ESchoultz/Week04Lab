<%-- 
    Document   : login
    Created on : Sep 28, 2018, 3:19:20 PM
    Author     : 669385
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Remember Me Login Page</title>
    </head>
    <body>
        <h1>Remember Me Login Page</h1>
        <form method="post" action="login">
            Username: <input type="text" name="username" value="${user.username}"><br>
            Password: <input type="text" name="password" value="${user.password}"><br>
            <input type="submit" value="Login">
        </form>
    </body>
</html>
