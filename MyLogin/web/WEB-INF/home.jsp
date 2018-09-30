<%-- 
    Document   : home
    Created on : 29-Sep-2018, 6:03:24 PM
    Author     : 669385
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>You're Logged In</title>
    </head>
    <body>
        <div><h1>Home Page!</h1>
        <h2>Hello ${username}</h2>
        </div>
        <div>
            <a href="login?logout">Logout</a>
        </div>
    </body>
</html>
