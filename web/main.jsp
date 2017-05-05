<%-- 
    Document   : main
    Created on : 28-mar-2017, 17:46:03
    Author     : DAM
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/main.css" rel="stylesheet" type="text/css"/>
        <script src="jquery-1.12.1.js" type="text/javascript"></script>
        <title>StuBasket APP</title>
    </head>
    <body>
        <!--TITLE -->
        <div id="ttlh1">
        <h1>Estadísticas de StuBasket</h1>
        </div>
        <!--END TITLE -->
        <!--MENU -->
        <section>
            <nav id="menu">
                <ul>
                    <li><a href="newPlayer.jsp">Añadir nuevo jugador</a></li>
                    <li><a href="newTeam.jsp">Añadir nuevo equipo rival</a></li>
                    <li><a href="newCoach.jsp">Añadir nuevo entrenador</a></li>
                    <li><a href="AddPlayerToTeam">Añadir jugador a la plantilla</a></li>
                    <li><a href="NewGame">Añadir nuevo partido</a></li>
                    <li><a href="AddPlayerToGame">Añadir un jugador a un partido</a></li>
                    <li><a href="estadisticas.jsp">Estadisticas</a></li>
                </ul>
            </nav>
        </section>
        <!--END MENU -->
        <!-- SLIDER -->
        <div class="w3-container">
        </div>
          <div class="w3-content w3-display-container">
          <div class="w3-display-container mySlides">
            <img src="img/1.jpg">
          </div>
          <div class="w3-display-container mySlides">
            <img src="img/2.jpg">
          </div>
          <div class="w3-display-container mySlides">
            <img src="img/3.jpg">
          </div>
          <div class="w3-display-container mySlides">
            <img src="img/4.jpg">
          </div>
          <div class="w3-display-container mySlides">
            <img src="img/5.jpg">
          </div>
              <div class="w3-display-container mySlides">
            <img src="img/6.jpg">
          </div>
          </div>
        <!--END SLIDER-->
        <!--AUTO SLIDER -->
          <script>
            var myIndex = 0;
            carousel();

            function carousel() {
                var i;
                var x = document.getElementsByClassName("mySlides");
                for (i = 0; i < x.length; i++) {
                   x[i].style.display = "none";  
                }
                myIndex++;
                if (myIndex > x.length) {myIndex = 1}    
                x[myIndex-1].style.display = "block";  
                setTimeout(carousel, 2000); // Change image every 2 seconds
            }
          </script>
          <!--END AUTO SLIDER -->
    </body>
</html>
