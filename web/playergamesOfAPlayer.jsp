<%-- 
    Document   : playergamesOfAPlayer
    Created on : 05-may-2017, 19:36:23
    Author     : DAM
--%>

<%@page import="java.util.List"%>
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
    %>
    <body>
        <form action="AllGamesOfPlayer" method="POST">
            <select name="player">
                <%for(Player p : players){%>
                <option value="<%= p.getId()%>"><%= p.getPlayername()%></option>
                <%}%>
                        
            </select>
            <input type="submit" name="submit" value="enviar">
            
        </form>
    </body>
</html>
