/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author DAM
 */
@Embeddable
public class PlayergamePK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "idplayer")
    private int idplayer;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idgame")
    private int idgame;

    public PlayergamePK() {
    }

    public PlayergamePK(int idplayer, int idgame) {
        this.idplayer = idplayer;
        this.idgame = idgame;
    }

    public int getIdplayer() {
        return idplayer;
    }

    public void setIdplayer(int idplayer) {
        this.idplayer = idplayer;
    }

    public int getIdgame() {
        return idgame;
    }

    public void setIdgame(int idgame) {
        this.idgame = idgame;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idplayer;
        hash += (int) idgame;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PlayergamePK)) {
            return false;
        }
        PlayergamePK other = (PlayergamePK) object;
        if (this.idplayer != other.idplayer) {
            return false;
        }
        if (this.idgame != other.idgame) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.PlayergamePK[ idplayer=" + idplayer + ", idgame=" + idgame + " ]";
    }
    
}
