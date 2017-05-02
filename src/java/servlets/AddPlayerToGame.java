/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import bean.StuBasketEJB;
import entities.Game;
import entities.Player;
import entities.Playergame;
import entities.PlayergamePK;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author DAM
 */
public class AddPlayerToGame extends HttpServlet {
@EJB
    StuBasketEJB ejb;
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        if("enviar".equals(request.getParameter("submit"))){
            int playerId = Integer.parseInt(request.getParameter("player"));
            int gameId = Integer.parseInt(request.getParameter("game"));
            Player player = ejb.selectPlayerById(playerId);
            Game game = ejb.selectGameById(gameId);
            System.out.print(game.toString());
            int minutos = Integer.parseInt(request.getParameter("minutes"));
            int points = Integer.parseInt(request.getParameter("points"));
            int rebounds = Integer.parseInt(request.getParameter("rebounds"));
            int asists = Integer.parseInt(request.getParameter("asists"));
            int steals = Integer.parseInt(request.getParameter("steals"));
            int blocks = Integer.parseInt(request.getParameter("blocks"));
            int fieldgoalsattempted = Integer.parseInt(request.getParameter("fieldgoalsattempted"));
            int fieldgoalsmade = Integer.parseInt(request.getParameter("fieldgoalsmade"));
            int threepointattempted = Integer.parseInt(request.getParameter("threepointattempted"));
            int threepointmade = Integer.parseInt(request.getParameter("threepointmade"));
            int freethrowsattempted = Integer.parseInt(request.getParameter("freethrowsattempted"));
            int freethrowsmade = Integer.parseInt(request.getParameter("freethrowsmade"));
            PlayergamePK pk = new PlayergamePK();
            pk.setIdgame(gameId);
            pk.setIdplayer(playerId);
            Playergame pg = new Playergame();
            pg.setMinutes(minutos);pg.setPoints(points);pg.setAsists(asists);pg.setBlocks(blocks);pg.setSteals(steals);pg.setRebounds(rebounds);
            pg.setFieldgoalsattempted(fieldgoalsattempted);pg.setFieldgoalsmade(fieldgoalsmade);pg.setThreepointattempted(threepointattempted);pg.setThreepointmade(threepointmade);
            pg.setFreethrowsattempted(freethrowsattempted);pg.setFreethrowsmade(freethrowsmade);pg.setPlayer(player);pg.setGame(game);pg.setPlayergamePK(pk);
            if(ejb.insertPlayerGame(pg)){
              request.getRequestDispatcher("result.jsp").forward(request, response);
            } else{
              request.getRequestDispatcher("noresult.jsp").forward(request, response);
            }
        }
        List<Player> players = ejb.selectPlayerByInLineup();
        request.setAttribute("players", players);
        List<Game> games = ejb.selectAllGames();
        request.setAttribute("games", games);
        request.getRequestDispatcher("addPlayerToGame.jsp").forward(request, response);
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
