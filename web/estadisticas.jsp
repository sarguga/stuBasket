<%-- 
    Document   : estadisticas
    Created on : 02-may-2017, 17:59:35
    Author     : DAM
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/main.css" rel="stylesheet" type="text/css"/>
        <title>Estadisticas</title>
    </head>
    <body>
        <div id="ttlh1">
        <h1>Estadísticas</h1>
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
                    <li><a href="AddPlayerToGame">Añadir un jugador a un partido</a></li>
                </ul>
            </nav>
        </section>
        <!--END MENU --> 
        <div id="form">
            <div id="stats">
                <a href="AveragePlayers">Media de todos los jugadores</a><br/>
                <a href="AveragePlayersInLineup">Media de todos los jugadores en plantilla</a><br/>
                <a href="AllGamesOfPlayer">Estadisticas de un jugador</a><br/>
                <a href="AverageAllPlayers">Estadisticas de los jugadores</a><br/>
                <a href="AverageAllPlayersWin">Estadisticas de los jugadores cuando el equipo gana</a><br/>
                <a href="AverageAllPlayersDefeat">Estadisticas de los jugadores cuando el equipo pierde</a><br/>
                <a href="AverageAllPlayersHome">Estadisticas de los jugadores cuando el equipo juega en casa</a><br/>
                <a href="AverageAllPlayersAway">Estadisticas de los jugadores cuando el equipo juega fuera</a><br/>
                <a href="AllGamesOfTeam">Estadisticas contra un rival</a><br/>
                <a href="HomeWinsGames">Partidos ganados en casa</a><br/>
                <a href="HomeDefeats">Partidos perdidos en casa</a><br/>
                <a href="AwayWins">Partidos ganados fuera</a><br/>
                <a href="AwayDefeats">Partidos perdidos fuera</a><br/>
            </div>
        </div>
    </body>
</html>
