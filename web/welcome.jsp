<%-- 
    Document   : welcome
    Created on : Sep 6, 2017, 6:59:24 PM
    Author     : alexsmith
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome Page</title>
    </head>
    <body>
        <h1>Welcome to the welcome page</h1>
        <form name="greetForm" id="greetForm" method="POST" action="greeter">
            Enter your name: <input type="text" value="Your Name Here" name="userName">
            <br>
            <input type="submit" name="submit" value="submit">
        </form>
    </body>
</html>
