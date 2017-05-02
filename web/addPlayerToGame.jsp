<%-- 
    Document   : addPlayerToGame
    Created on : 28-abr-2017, 20:44:51
    Author     : DAM
--%>

<%@page import="entities.Game"%>
<%@page import="java.util.List"%>
<%@page import="entities.Player"%>
<%@page import="entities.Player"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <%
        List<Player> players = (List<Player>) request.getAttribute("players");
        List<Game> games = (List<Game>) request.getAttribute("games");
    %>
    <body>
        <form action="AddPlayerToGame" method="POST">
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
    </body>
</html>
