/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author DAM
 */
@Entity
@Table(name = "playergame")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Playergame.findAll", query = "SELECT p FROM Playergame p"),
    @NamedQuery(name = "Playergame.findByIdplayer", query = "SELECT p FROM Playergame p WHERE p.playergamePK.idplayer = :idplayer"),
    @NamedQuery(name = "Playergame.findByIdgame", query = "SELECT p FROM Playergame p WHERE p.playergamePK.idgame = :idgame"),
    @NamedQuery(name = "Playergame.findByMinutes", query = "SELECT p FROM Playergame p WHERE p.minutes = :minutes"),
    @NamedQuery(name = "Playergame.findByPoints", query = "SELECT p FROM Playergame p WHERE p.points = :points"),
    @NamedQuery(name = "Playergame.findByRebounds", query = "SELECT p FROM Playergame p WHERE p.rebounds = :rebounds"),
    @NamedQuery(name = "Playergame.findByAsists", query = "SELECT p FROM Playergame p WHERE p.asists = :asists"),
    @NamedQuery(name = "Playergame.findBySteals", query = "SELECT p FROM Playergame p WHERE p.steals = :steals"),
    @NamedQuery(name = "Playergame.findByBlocks", query = "SELECT p FROM Playergame p WHERE p.blocks = :blocks"),
    @NamedQuery(name = "Playergame.findByFieldgoalsattempted", query = "SELECT p FROM Playergame p WHERE p.fieldgoalsattempted = :fieldgoalsattempted"),
    @NamedQuery(name = "Playergame.findByFieldgoalsmade", query = "SELECT p FROM Playergame p WHERE p.fieldgoalsmade = :fieldgoalsmade"),
    @NamedQuery(name = "Playergame.findByThreepointattempted", query = "SELECT p FROM Playergame p WHERE p.threepointattempted = :threepointattempted"),
    @NamedQuery(name = "Playergame.findByThreepointmade", query = "SELECT p FROM Playergame p WHERE p.threepointmade = :threepointmade"),
    @NamedQuery(name = "Playergame.findByFreethrowsattempted", query = "SELECT p FROM Playergame p WHERE p.freethrowsattempted = :freethrowsattempted"),
    @NamedQuery(name = "Playergame.findByFreethrowsmade", query = "SELECT p FROM Playergame p WHERE p.freethrowsmade = :freethrowsmade")})
public class Playergame implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PlayergamePK playergamePK;
    @Column(name = "minutes")
    private Integer minutes;
    @Column(name = "points")
    private Integer points;
    @Column(name = "rebounds")
    private Integer rebounds;
    @Column(name = "asists")
    private Integer asists;
    @Column(name = "steals")
    private Integer steals;
    @Column(name = "blocks")
    private Integer blocks;
    @Column(name = "fieldgoalsattempted")
    private Integer fieldgoalsattempted;
    @Column(name = "fieldgoalsmade")
    private Integer fieldgoalsmade;
    @Column(name = "threepointattempted")
    private Integer threepointattempted;
    @Column(name = "threepointmade")
    private Integer threepointmade;
    @Column(name = "freethrowsattempted")
    private Integer freethrowsattempted;
    @Column(name = "freethrowsmade")
    private Integer freethrowsmade;
    @JoinColumn(name = "idplayer", referencedColumnName = "id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Player player;
    @JoinColumn(name = "idgame", referencedColumnName = "id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Game game;

    public Playergame() {
    }

    public Playergame(PlayergamePK playergamePK) {
        this.playergamePK = playergamePK;
    }

    public Playergame(int idplayer, int idgame) {
        this.playergamePK = new PlayergamePK(idplayer, idgame);
    }

    public Playergame(Integer minutes, Integer points, Integer rebounds, Integer asists, Integer steals, Integer blocks, Integer fieldgoalsattempted, Integer fieldgoalsmade, Integer threepointattempted, Integer threepointmade, Integer freethrowsattempted, Integer freethrowsmade, Player player, Game game) {
        this.minutes = minutes;
        this.points = points;
        this.rebounds = rebounds;
        this.asists = asists;
        this.steals = steals;
        this.blocks = blocks;
        this.fieldgoalsattempted = fieldgoalsattempted;
        this.fieldgoalsmade = fieldgoalsmade;
        this.threepointattempted = threepointattempted;
        this.threepointmade = threepointmade;
        this.freethrowsattempted = freethrowsattempted;
        this.freethrowsmade = freethrowsmade;
        this.player = player;
        this.game = game;
    }

    public PlayergamePK getPlayergamePK() {
        return playergamePK;
    }

    public void setPlayergamePK(PlayergamePK playergamePK) {
        this.playergamePK = playergamePK;
    }

    public Integer getMinutes() {
        return minutes;
    }

    public void setMinutes(Integer minutes) {
        this.minutes = minutes;
    }

    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }

    public Integer getRebounds() {
        return rebounds;
    }

    public void setRebounds(Integer rebounds) {
        this.rebounds = rebounds;
    }

    public Integer getAsists() {
        return asists;
    }

    public void setAsists(Integer asists) {
        this.asists = asists;
    }

    public Integer getSteals() {
        return steals;
    }

    public void setSteals(Integer steals) {
        this.steals = steals;
    }

    public Integer getBlocks() {
        return blocks;
    }

    public void setBlocks(Integer blocks) {
        this.blocks = blocks;
    }

    public Integer getFieldgoalsattempted() {
        return fieldgoalsattempted;
    }

    public void setFieldgoalsattempted(Integer fieldgoalsattempted) {
        this.fieldgoalsattempted = fieldgoalsattempted;
    }

    public Integer getFieldgoalsmade() {
        return fieldgoalsmade;
    }

    public void setFieldgoalsmade(Integer fieldgoalsmade) {
        this.fieldgoalsmade = fieldgoalsmade;
    }

    public Integer getThreepointattempted() {
        return threepointattempted;
    }

    public void setThreepointattempted(Integer threepointattempted) {
        this.threepointattempted = threepointattempted;
    }

    public Integer getThreepointmade() {
        return threepointmade;
    }

    public void setThreepointmade(Integer threepointmade) {
        this.threepointmade = threepointmade;
    }

    public Integer getFreethrowsattempted() {
        return freethrowsattempted;
    }

    public void setFreethrowsattempted(Integer freethrowsattempted) {
        this.freethrowsattempted = freethrowsattempted;
    }

    public Integer getFreethrowsmade() {
        return freethrowsmade;
    }

    public void setFreethrowsmade(Integer freethrowsmade) {
        this.freethrowsmade = freethrowsmade;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (playergamePK != null ? playergamePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Playergame)) {
            return false;
        }
        Playergame other = (Playergame) object;
        if ((this.playergamePK == null && other.playergamePK != null) || (this.playergamePK != null && !this.playergamePK.equals(other.playergamePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Playergame[ playergamePK=" + playergamePK + " ]";
    }
    
}
