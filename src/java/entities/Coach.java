/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author DAM
 */
@Entity
@Table(name = "coach")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Coach.findAll", query = "SELECT c FROM Coach c"),
    @NamedQuery(name = "Coach.findById", query = "SELECT c FROM Coach c WHERE c.id = :id"),
    @NamedQuery(name = "Coach.findByCoachname", query = "SELECT c FROM Coach c WHERE c.coachname = :coachname"),
    @NamedQuery(name = "Coach.findByCity", query = "SELECT c FROM Coach c WHERE c.city = :city"),
    @NamedQuery(name = "Coach.findByBirth", query = "SELECT c FROM Coach c WHERE c.birth = :birth")})
public class Coach implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 25)
    @Column(name = "coachname")
    private String coachname;
    @Size(max = 25)
    @Column(name = "city")
    private String city;
    @Column(name = "birth")
    private Integer birth;

    public Coach() {
    }

    public Coach(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCoachname() {
        return coachname;
    }

    public void setCoachname(String coachname) {
        this.coachname = coachname;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Coach)) {
            return false;
        }
        Coach other = (Coach) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Coach[ id=" + id + " ]";
    }
    
}
