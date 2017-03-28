/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
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
@Table(name = "rival")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Rival.findAll", query = "SELECT r FROM Rival r"),
    @NamedQuery(name = "Rival.findById", query = "SELECT r FROM Rival r WHERE r.id = :id"),
    @NamedQuery(name = "Rival.findByTeamname", query = "SELECT r FROM Rival r WHERE r.teamname = :teamname"),
    @NamedQuery(name = "Rival.findByCity", query = "SELECT r FROM Rival r WHERE r.city = :city")})
public class Rival implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 25)
    @Column(name = "teamname")
    private String teamname;
    @Size(max = 25)
    @Column(name = "city")
    private String city;
    @OneToMany(mappedBy = "rival")
    private Collection<Game> gameCollection;

    public Rival() {
    }

    public Rival(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTeamname() {
        return teamname;
    }

    public void setTeamname(String teamname) {
        this.teamname = teamname;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @XmlTransient
    public Collection<Game> getGameCollection() {
        return gameCollection;
    }

    public void setGameCollection(Collection<Game> gameCollection) {
        this.gameCollection = gameCollection;
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
        if (!(object instanceof Rival)) {
            return false;
        }
        Rival other = (Rival) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Rival[ id=" + id + " ]";
    }
    
}
