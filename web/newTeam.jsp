<%-- 
    Document   : newTeam
    Created on : 27-abr-2017, 18:56:16
    Author     : DAM
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="NewTeam" method="POST">
            Nombre: <input type="text" name="name"/>
            Ciudad: <input type="text" name="city">
            <input type="submit" name="submit" value="enviar">
            
        </form>
    </body>
</html>
