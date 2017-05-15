<%-- 
    Document   : newCoach
    Created on : 28-abr-2017, 19:42:33
    Author     : DAM
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/main.css" rel="stylesheet" type="text/css"/>
        <title>Nuevo Entrenador</title>
    </head>
    <body>
        <div id="ttlh1">
        <h1>Crea un Entrenador</h1>
        </div>
        <!--MENU -->
        <section>
            <nav id="menu">
                <ul>
                    <li><a href="main.jsp">Inicio</a></li>
                    <li><a href="newPlayer.jsp">Añadir nuevo jugador</a></li>
                    <li><a href="newTeam.jsp">Añadir nuevo equipo rival</a></li>
                    <li><a href="AddPlayerToTeam">Añadir jugador a la plantilla</a></li>
                    <li><a href="NewGame">Añadir nuevo partido</a></li>
                    <li><a href="AddPlayerToGame">Añadir un jugador a un partido</a></li>
                    <li><a href="estadisticas.jsp">Estadisticas</a></li>
                </ul>
            </nav>
        </section>
        <!--END MENU -->
         <div id="form">
        <form id="formulario" action="NewCoach" method="POST">
            Nombre y apellido: <input type="text" name="name"/><br/>
            Ciudad: <input type="text" name="city"><br/>
            Fecha de nacimiento: <input type="number" name="birth"><br/>
            <input type="submit" name="submit" value="enviar">
        </form>
         </div>     
    </body>
</html>
