<%-- 
    Document   : averageAllPlayers
    Created on : 05-may-2017, 19:05:45
    Author     : DAM
--%>

<%@page import="java.util.List"%>
<%@page import="entities.EstadisticasDTO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <%
        List<EstadisticasDTO> estadisticas = (List<EstadisticasDTO>) request.getAttribute("estadisticas");
    %>
    <body>
        <h1>Media los jugadores</h1><br/>
        <table border="1">
            <tr>
                <td>
                    Jugador
                </td>
                <td>
                    Puntos
                </td>
                <td>
                    Asistencias
                </td>
                <td>
                    Rebotes
                </td>
                <td>
                    Robos
                </td>
                <td>
                    Tapones
                </td>
                <td>
                    Tiros intentados
                </td>
                <td>
                    Tiros anotados
                </td>
                <td>
                    Triples intentados
                </td>
                <td>
                    Triples anotados
                </td>
                <td>
                    Tiros libres intentados
                </td>
                <td>
                    Tiros libres anotados
                </td>
            </tr>
            <%
                for(EstadisticasDTO estadistica : estadisticas){
                    
                
            %>
            <tr>
                <td><%= estadistica.getPlayer().getPlayername()%></td>
                <td><%= estadistica.getPoints()%></td>
                <td><%= estadistica.getAsists()%></td>
                <td><%= estadistica.getRebounds()%></td>
                <td><%= estadistica.getSteals()%></td>
                <td><%= estadistica.getBlocks()%></td>
                <td><%= estadistica.getFieldgoalsattempted()%></td>
                <td><%= estadistica.getFieldgoalsmade()%></td>
                <td><%= estadistica.getThreepointattempted()%></td>
                <td><%= estadistica.getThreepointmade()%></td>
                <td><%= estadistica.getFreethrowsattempted()%></td>
                <td><%= estadistica.getFreethrowsmade()%></td>
            </tr>
            <% } %>     
        </table>
        </body>
</html>
