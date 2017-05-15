<%-- 
    Document   : addPlayerToTeam
    Created on : 27-abr-2017, 19:02:01
    Author     : DAM
--%>

<%@page import="entities.Player"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/main.css" rel="stylesheet" type="text/css"/>
        <title>Añadir jugador a la plantilla</title>
    </head>
    <%
        List<Player> players = (List<Player>) request.getAttribute("players");
    %>
    <body>
    <div id="ttlh1">
        <h1>Añadir jugador a la plantilla</h1>
        </div>
        <!--MENU -->
        <section>
            <nav id="menu">
                <ul>
                    <li><a href="main.jsp">Inicio</a></li>
                    <li><a href="newPlayer.jsp">Añadir nuevo jugador</a></li>
                    <li><a href="newTeam.jsp">Añadir nuevo equipo rival</a></li>
                    <li><a href="newCoach.jsp">Añadir nuevo entrenador</a></li>
                    <li><a href="NewGame">Añadir nuevo partido</a></li>
                    <li><a href="AddPlayerToGame">Añadir un jugador a un partido</a></li>
                    <li><a href="estadisticas.jsp">Estadisticas</a></li>
                </ul>
            </nav>
        </section>
        <!--END MENU -->    
         <div id="form">
        <form id="formulario" action="AddPlayerToTeam" method="POST">
            <select name="player">
                <%for(Player p : players){%>
                <option value="<%= p.getId()%>"><%= p.getPlayername()%></option>
                <%}%>       
            </select>
            <input type="submit" name="submit" value="enviar">
        </form>
         </div>       
    </body>
</html>
