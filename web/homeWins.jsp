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
        <link href="css/main.css" rel="stylesheet" type="text/css"/>
        <title>¿?</title>
    </head>
     <%
        List<Game> games = (List<Game>) request.getAttribute("games");
    %>
    <body>
         <div id="ttlh1">
        <h1>Stats</h1><br/>
         </div>
         <!--MENU -->
        <section>
            <nav id="menu">
                <ul>
                    <li><a href="main.jsp">Inicio</a></li>
                    <li><a href="estadisticas.jsp">Estadisticas</a></li>
                </ul>
            </nav>
        </section>
        <!--END MENU -->
        <table id="tab">
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
         </div>
        </body>
</html>
