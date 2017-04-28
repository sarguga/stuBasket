<%-- 
    Document   : main
    Created on : 28-mar-2017, 17:46:03
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
        <h1>Estadísticas de StuBasket</h1>
        
        <a href="newPlayer.jsp">Añadir nuevo jugador</a><br/>
        <a href="newTeam.jsp">Añadir nuevo equipo rival</a><br/>
        <a href="newCoach.jsp">Añadir nuevo entrenador</a><br/>
        <form action="AddPlayerToTeam">
            Añadir jugador a la plantilla <input type="submit" value="Añadir"/>
        </form>
        <a href="NewGame">Añadir nuevo partido</a><br/>
    </body>
</html>
