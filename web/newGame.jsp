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
        <title>JSP Page</title>
    </head>
    <body>
        <%
        List<Rival> rivals = (List<Rival>) request.getAttribute("rivals");
        %>
        <form action="NewGame" method="POST">
            Victoria<br/>
            <input type="radio" name="victory" id="yes" value="yes">
            <label for="yes">Sí: </label>
            <br/> <br/>
            <input type="radio" name="victory" id="no" value="no">
            <label for="no">No: </label><br/>
            Local<br/>
            <input type="radio" name="local" id="yes" value="yes">
            <label for="yes">Sí: </label>
            <br/> <br/>
            <input type="radio" name="local" id="no" value="no">
            <label for="no">No: </label>
            <select name="rival">
                <%for(Rival r : rivals){%>
                <option value="<%= r.getId()%>"><%= r.getTeamname()%></option>
                <%}%>
                        
            </select>
            Fecha de nacimiento: <input type="text" name="birth">
            <input type="submit" name="submit" value="enviar">
            
        </form>
    </body>
</html>
