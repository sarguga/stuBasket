<%-- 
    Document   : averagePlayers
    Created on : 04-may-2017, 19:16:01
    Author     : DAM
--%>

<%@page import="entities.PlayerGameDTO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/main.css" rel="stylesheet" type="text/css"/>
        <title>Media jugadores en la plantilla</title>
    </head>
    <%
        PlayerGameDTO players = (PlayerGameDTO) request.getAttribute("playergame");
    %>
    <body>
        <div id="ttlh1">
       <h1>Media de todos los jugadores en la plantilla</h1>
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
            <div id="formulario">
                Puntos: <%= players.getPoints()%><br/>
                Asistencias: <%= players.getAsists()%><br/>
                Rebotes: <%= players.getRebounds()%><br/>
                Robos: <%= players.getSteals()%><br/>
                Tapones: <%= players.getBlocks()%><br/>
                Tiros intentados: <%= players.getFieldgoalsattempted()%><br/>
                Tiros anotados: <%= players.getFieldgoalsmade()%><br/>
                Triples intentados: <%= players.getThreepointattempted()%><br/>
                Triples anotados: <%= players.getThreepointmade()%><br/>
                Tiros libres intentados: <%= players.getFreethrowsattempted()%><br/>
                Tiros libres anotados: <%= players.getFreethrowsmade()%><br/>  
            </div>
        </div>
    </body>
</html>