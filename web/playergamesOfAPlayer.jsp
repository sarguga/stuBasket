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
        <link href="css/main.css" rel="stylesheet" type="text/css"/>
        <title>JSP Page</title>
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
                    <li><a href="estadisticas.jsp">Estadisticas</a></li>
                </ul>
            </nav>
        </section>
        <!--END MENU -->
         <div id="form">
        <form id="formulario" action="AllGamesOfPlayer" method="POST">
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
