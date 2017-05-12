<%-- 
    Document   : homeWins
    Created on : 09-may-2017, 20:39:44
    Author     : DAM
--%>

<%@page import="entities.Game"%>
<%@page import="java.util.List"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
     <%
        List<Game> games = (List<Game>) request.getAttribute("games");
    %>
    <body>
        <h1>Media los jugadores</h1><br/>
        <table border="1">
            <tr><td>
                    Fecha
                </td>
                <td>
                    Rival
                </td>
            </tr>
            <%
                for(Game game : games){
                    
                
            %>
            <tr>
                <td><%= game.getDategame()%></td>
                <td><%= game.getRival().getTeamname()%></td>
            </tr>
            <% } %>     
        </table>
        </body>
</html>
