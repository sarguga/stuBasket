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
@Table(name = "player")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Player.findAll", query = "SELECT p FROM Player p"),
    @NamedQuery(name = "Player.findById", query = "SELECT p FROM Player p WHERE p.id = :id"),
    @NamedQuery(name = "Player.findByPlayername", query = "SELECT p FROM Player p WHERE p.playername = :playername"),
    @NamedQuery(name = "Player.findByCity", query = "SELECT p FROM Player p WHERE p.city = :city"),
    @NamedQuery(name = "Player.findByBirth", query = "SELECT p FROM Player p WHERE p.birth = :birth")})
public class Player implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 25)
    @Column(name = "playername")
    private String playername;
    @Size(max = 25)
    @Column(name = "city")
    private String city;
    @Column(name = "birth")
    private Integer birth;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "player")
    private Collection<Playergame> playergameCollection;

    public Player() {
    }

    public Player(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPlayername() {
        return playername;
    }

    public void setPlayername(String playername) {
        this.playername = playername;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getBirth() {
        return birth;
    }

    public void setBirth(Integer birth) {
        this.birth = birth;
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
        if (!(object instanceof Player)) {
            return false;
        }
        Player other = (Player) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Player[ id=" + id + " ]";
    }
    
}
