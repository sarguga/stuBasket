<%-- 
    Document   : newPlayersp
    Created on : 25-abr-2017, 17:30:26
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
        <h1>Crea un nuevo jugador</h1>
        
        <form action="NewTeamPlayer" method="POST">
            Nombre y apellido: <input type="text" name="name"/>
            Ciudad: <input type="text" name="city">
            Fecha de nacimiento: <input type="number" name="birth">
            <input type="submit" name="submit" value="enviar">
            
        </form>
    </body>
</html>
