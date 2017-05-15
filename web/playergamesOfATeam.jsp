<%-- 
    Document   : playergamesOfATeam
    Created on : 09-may-2017, 17:59:36
    Author     : DAM
--%>

<%@page import="entities.Rival"%>
<%@page import="java.util.List"%>
<%@page import="entities.Player"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/main.css" rel="stylesheet" type="text/css"/>
        <title>¡!</title>
    </head>
    <%
        List<Rival> teams = (List<Rival>) request.getAttribute("teams");
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
       <form id="tab" action="AllGamesOfTeam" method="POST">
            <select name="team">
                <%for(Rival t : teams){%>
                <option value="<%= t.getId()%>"><%= t.getTeamname()%></option>
                <%}%>
                        
            </select>
            <input type="submit" name="submit" value="enviar">   
        </form>
    </body>
</html>
