/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author DAM
 */
@Entity
@Table(name = "game")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Game.findAll", query = "SELECT g FROM Game g"),
    @NamedQuery(name = "Game.findById", query = "SELECT g FROM Game g WHERE g.id = :id"),
    @NamedQuery(name = "Game.findByWin", query = "SELECT g FROM Game g WHERE g.win = :win"),
    @NamedQuery(name = "Game.findByHome", query = "SELECT g FROM Game g WHERE g.home = :home"),
    @NamedQuery(name = "Game.findByDategame", query = "SELECT g FROM Game g WHERE g.dategame = :dategame")})
public class Game implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "win")
    private Integer win;
    @Column(name = "home")
    private Integer home;
    @Size(max = 100)
    @Column(name = "dategame")
    private String dategame;
    @JoinColumn(name = "rival", referencedColumnName = "id")
    @ManyToOne
    private Rival rival;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "game")
    private Collection<Playergame> playergameCollection;

    public Game() {
    }

    public Game(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getWin() {
        return win;
    }

    public void setWin(Integer win) {
        this.win = win;
    }

    public Integer getHome() {
        return home;
    }

    public void setHome(Integer home) {
        this.home = home;
    }

    public String getDategame() {
        return dategame;
    }

    public void setDategame(String dategame) {
        this.dategame = dategame;
    }

    public Rival getRival() {
        return rival;
    }

    public void setRival(Rival rival) {
        this.rival = rival;
    }

    @XmlTransient
    public Collection<Playergame> getPlayergameCollection() {
        return playergameCollection;
    }

    public void setPlayergameCollection(Collection<Playergame> playergameCollection) {
        this.playergameCollection = playergameCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Game)) {
            return false;
        }
        Game other = (Game) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Game[ id=" + id + " ]";
    }
    
}
