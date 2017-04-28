<%-- 
    Document   : newCoach
    Created on : 28-abr-2017, 19:42:33
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
        <form action="NewCoach" method="POST">
            Nombre y apellido: <input type="text" name="name"/>
            Ciudad: <input type="text" name="city">
            Fecha de nacimiento: <input type="number" name="birth">
            <input type="submit" name="submit" value="enviar">
            
        </form>
    </body>
</html>
