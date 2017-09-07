<%-- 
    Document   : response
    Created on : Sep 6, 2017, 7:17:01 PM
    Author     : alexsmith
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Hello Response</title>
    </head>
    <body>
        <h2>Here is your personalized greeting</h2>
        <%  
            
            Object msgObj = request.getAttribute("greetMsg");
            String msg = "Undefined";
            if(msgObj != null){
                msg = msgObj.toString();
            }
            out.println("<p>" + msg + "</p>");
           
            
        %>
            
    </body>
</html>
