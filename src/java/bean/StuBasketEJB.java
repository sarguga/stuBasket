/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import entities.Coach;
import entities.Game;
import entities.Player;
import entities.PlayerGameDTO;
import entities.Playergame;
import entities.PlayergamePK;
import entities.Rival;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;

/**
 *
 * @author DAM
 */
@Stateless
public class StuBasketEJB {

    @PersistenceUnit
    EntityManagerFactory emf;
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
    public boolean insertPlayer(Player p){
        EntityManager em = emf.createEntityManager();
        em.persist(p);
        return true;

    }
    
    public boolean insertCoach(Coach c){
        EntityManager em = emf.createEntityManager();
        em.persist(c);
        return true;

    }
    
    public boolean insertGame(Game g){
        EntityManager em = emf.createEntityManager();
        em.persist(g);
        return true;

    }
    
    public boolean insertPlayerGame(Playergame pg){
        EntityManager em = emf.createEntityManager();
        PlayergamePK pk = new PlayergamePK(); 
        pk.setIdgame(pg.getGame().getId());
        pk.setIdplayer(pg.getPlayer().getId());
        Playergame exists = em.find(Playergame.class, pk);
        if (exists==null){
            em.persist(pg);
            return true;
        } else {
            return false;
        }
        

    }
    
    public boolean insertTeam(Rival r){
        EntityManager em = emf.createEntityManager();
        em.persist(r);
        return true;
    }
    
    public Rival selectTeamById(int id){
        EntityManager em = emf.createEntityManager();
        Rival r = em.find(Rival.class, id);
        return r;
    }
    
    public Player selectPlayerById(int id){
        EntityManager em = emf.createEntityManager();
        Player p = em.find(Player.class, id);
        return p;
    }
    
    public Coach selectCoachById(int id){
        EntityManager em = emf.createEntityManager();
        Coach c = em.find(Coach.class, id);
        return c;
    }
    
    public Rival selectRivalById(int id){
        EntityManager em = emf.createEntityManager();
        Rival r = em.find(Rival.class, id);
        return r;
    }
    
    public Game selectGameById(int id){
        EntityManager em = emf.createEntityManager();
        Game g = em.find(Game.class, id);
        return g;
    }
    
    /*public List<Playergame> selectPlayerGameByPlayer(Player p){
        EntityManager em = emf.createEntityManager();
        Query q = em.createQuery("select pg from Playergame pg where pg.idplayer = :id");
        q.setParameter("id", p.getId());
        return q.getResultList();
    }
    
    public List<Playergame> selectPlayerGame(Game g, Player p){
        EntityManager em = emf.createEntityManager();
        Query q = em.createQuery("select pg from Playergame pg where pg.idgame = :id");
        q.setParameter("id", g.getId());
        return q.getResultList();
    }*/
    
    
    public List<Player> selectPlayerByNotInLineup(){
        EntityManager em = emf.createEntityManager();
        Query q = em.createQuery("select p from Player p where p.enplantilla = 0");
        return q.getResultList();
    }
    
    public List<Rival> selectAllRival(){
        EntityManager em = emf.createEntityManager();
        Query q = em.createQuery("select r from Rival r");
        return q.getResultList();
    }
    
    public List<Game> selectAllGames(){
        EntityManager em = emf.createEntityManager();
        Query q = em.createQuery("select g from Game g");
        return q.getResultList();
    }
    
    public boolean addPlayerToLineup(Player p){
        EntityManager em = emf.createEntityManager();
        /*Query q = em.createQuery("select p from Player p where p.id = :id");
        q.setParameter("id", p.getId());*/
        Player player = selectPlayerById(p.getId());
        player.setEnplantilla(1);
        em.persist(player);
        return true;
    }

    public List<Player> selectPlayerByInLineup() {
        EntityManager em = emf.createEntityManager();
        Query q = em.createQuery("select p from Player p where p.enplantilla = 1");
        return q.getResultList();
    }
    
    public PlayerGameDTO AveragePlayers() {
        double points = 0;
        double asists = 0;
        double rebounds = 0;
        double steals = 0;
        double blocks = 0;
        double fieldgoalsattempted = 0;
        double fieldgoalsmade = 0;
        double threepointattempted = 0;
        double threepointmade = 0;
        double freethrowsattempted = 0;
        double freethrowsmade = 0; 
        int count=0;
        EntityManager em = emf.createEntityManager();
        Query q = em.createQuery("select pg from Playergame pg");
        List<Playergame> playersgame = q.getResultList();
        for (Playergame pg : playersgame){
            points+=pg.getPoints();
            asists+=pg.getAsists();
            rebounds+=pg.getRebounds();
            steals+=pg.getSteals();
            blocks+=pg.getBlocks();
            fieldgoalsattempted+=pg.getFieldgoalsattempted();
            fieldgoalsmade+=pg.getFieldgoalsmade();
            threepointattempted+=pg.getThreepointattempted();
            threepointmade+=pg.getThreepointmade();
            freethrowsattempted+=pg.getFreethrowsattempted();
            freethrowsmade+=pg.getFreethrowsmade();
            
            count++;
        }
        
        PlayerGameDTO pgdto = new PlayerGameDTO(points/count, asists/count, rebounds/count, steals/count, blocks/count, fieldgoalsattempted/count, fieldgoalsmade/count, threepointattempted/count, threepointmade/count, freethrowsattempted/count, freethrowsmade/count);
        return pgdto;
    }
    
    public PlayerGameDTO AveragePlayersInLineup() {
        double points = 0;
        double asists = 0;
        double rebounds = 0;
        double steals = 0;
        double blocks = 0;
        double fieldgoalsattempted = 0;
        double fieldgoalsmade = 0;
        double threepointattempted = 0;
        double threepointmade = 0;
        double freethrowsattempted = 0;
        double freethrowsmade = 0; 
        int count=0;
        EntityManager em = emf.createEntityManager();
        Query q = em.createQuery("select pg from Playergame pg, Player p where p.id=pg.idplayer and p.enplantilla=1");
        List<Playergame> playersgame = q.getResultList();
        for (Playergame pg : playersgame){
            points+=pg.getPoints();
            asists+=pg.getAsists();
            rebounds+=pg.getRebounds();
            steals+=pg.getSteals();
            blocks+=pg.getBlocks();
            fieldgoalsattempted+=pg.getFieldgoalsattempted();
            fieldgoalsmade+=pg.getFieldgoalsmade();
            threepointattempted+=pg.getThreepointattempted();
            threepointmade+=pg.getThreepointmade();
            freethrowsattempted+=pg.getFreethrowsattempted();
            freethrowsmade+=pg.getFreethrowsmade();
            
            count++;
        }
        
        PlayerGameDTO pgdto = new PlayerGameDTO(points/count, asists/count, rebounds/count, steals/count, blocks/count, fieldgoalsattempted/count, fieldgoalsmade/count, threepointattempted/count, threepointmade/count, freethrowsattempted/count, freethrowsmade/count);
        return pgdto;
    }
    
}
