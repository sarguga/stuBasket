<%-- 
    Document   : addPlayerToGame
    Created on : 28-abr-2017, 20:44:51
    Author     : DAM
--%>

<%@page import="entities.Rival"%>
<%@page import="entities.Game"%>
<%@page import="java.util.List"%>
<%@page import="entities.Player"%>
<%@page import="entities.Player"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/main.css" rel="stylesheet" type="text/css"/>
        <title>Añadir jugador a un partido</title>
    </head>
    <%
        List<Player> players = (List<Player>) request.getAttribute("players");
        List<Game> games = (List<Game>) request.getAttribute("games");
    %>
    <body>
        <div id="ttlh1">
        <h1>Añadir jugador a un partido</h1>
        </div>
        <!--MENU -->
        <section>
            <nav id="menu">
                <ul>
                    <li><a href="main.jsp">Inicio</a></li>
                    <li><a href="newPlayer.jsp">Añadir nuevo jugador</a></li>
                    <li><a href="newTeam.jsp">Añadir nuevo equipo rival</a></li>
                    <li><a href="newCoach.jsp">Añadir nuevo entrenador</a></li>
                    <li><a href="AddPlayerToTeam">Añadir jugador a la plantilla</a></li>
                    <li><a href="NewGame">Añadir nuevo partido</a></li>
                    <li><a href="estadisticas.jsp">Estadisticas</a></li>
                </ul>
            </nav>
        </section>
        <!--END MENU --> 
        <%
        List<Rival> rivals = (List<Rival>) request.getAttribute("rivals");
        %>
        <div id="form">
        <form id="formulario" action="AddPlayerToGame" method="POST">
            Player: <select name="player">
                <%for(Player p : players){%>
                <option value="<%= p.getId()%>"><%= p.getPlayername()%></option>
                <%}%>
                        
            </select><br/>
            Game: <select name="game">
                <%for(Game g : games){%>
                <option value="<%= g.getId()%>"><%= g.getRival().getTeamname()+" - "+g.getDategame()%></option>
                <%}%>
                        
            </select><br/>
            Minutes: <input type="number" name="minutes"/><br/>
            Points <input type="number" name="points"/><br/>
            Rebounds: <input type="number" name="rebounds"/><br/>
            Asists: <input type="number" name="asists"/><br/>
            Steals: <input type="number" name="steals"/><br/>
            Blocks: <input type="number" name="blocks"/><br/>
            Field Goals attempted: <input type="number" name="fieldgoalsattempted"/><br/>
            Field Goals made: <input type="number" name="fieldgoalsmade"/><br/>
            Three Point attempted: <input type="number" name="threepointattempted"/><br/>
            Three Point made <input type="number" name="threepointmade"/><br/>
            Free throws attempted <input type="number" name="freethrowsattempted"/><br/>
            Free throws made <input type="number" name="freethrowsmade"/><br/>
            
            <input type="submit" name="submit" value="enviar">
        </form>
        </div>
    </body>
</html>
