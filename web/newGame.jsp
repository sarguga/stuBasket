<%-- 
    Document   : newGame
    Created on : 28-abr-2017, 19:48:58
    Author     : DAM
--%>

<%@page import="java.util.List"%>
<%@page import="entities.Player"%>
<%@page import="entities.Rival"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/main.css" rel="stylesheet" type="text/css"/>
        <title>Nuevo Partido</title>
    </head>
    <body>
        <div id="ttlh1">
        <h1>Crear Nuevo partido</h1>
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
                    <li><a href="AddPlayerToGame">Añadir un jugador a un partido</a></li>
                    <li><a href="estadisticas.jsp">Estadisticas</a></li>
                </ul>
            </nav>
        </section>
        <!--END MENU --> 
        <%
        List<Rival> rivals = (List<Rival>) request.getAttribute("rivals");
        %>
        <div id="form">
        <form id="formulario" action="NewGame" method="POST">
            Victoria<br/>
            <input type="radio" name="victory" id="yes" value="yes">
            <label for="yes">Sí: </label>
            <input type="radio" name="victory" id="no" value="no">
            <label for="no">No: </label><br/>
            Local<br/>
            <input type="radio" name="local" id="yes" value="yes">
            <label for="yes">Sí: </label>
            <input type="radio" name="local" id="no" value="no">
            <label for="no">No: </label><br/>
            Rival:
            <select name="rival">
                <%for(Rival r : rivals){%>
                <option value="<%= r.getId()%>"><%= r.getTeamname()%></option>
                <%}%>           
            </select><br/>
            Fecha de nacimiento: <input type="text" name="birth"><br/>
            <input type="submit" name="submit" value="enviar">
        </form>
        </div>         
    </body>
</html>
