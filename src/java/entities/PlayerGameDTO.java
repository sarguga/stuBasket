/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author DAM
 */
public class PlayerGameDTO {
    
    private double points;
    private double asists;
    private double rebounds;
    private double steals;
    private double blocks;
    private double fieldgoalsattempted;
    private double fieldgoalsmade;
    private double threepointattempted;
    private double threepointmade;
    private double freethrowsattempted;
    private double freethrowsmade;    

    public PlayerGameDTO(double points, double asists, double rebounds, double steals, double blocks, double fieldgoalsattempted, double fieldgoalsmade, double threepointattempted, double threepointmade, double freethrowsattempted, double freethrowsmade) {
        this.points = points;
        this.asists = asists;
        this.rebounds = rebounds;
        this.steals = steals;
        this.blocks = blocks;
        this.fieldgoalsattempted = fieldgoalsattempted;
        this.fieldgoalsmade = fieldgoalsmade;
        this.threepointattempted = threepointattempted;
        this.threepointmade = threepointmade;
        this.freethrowsattempted = freethrowsattempted;
        this.freethrowsmade = freethrowsmade;
    }

    public double getPoints() {
        return points;
    }

    public void setPoints(double points) {
        this.points = points;
    }

    public double getAsists() {
        return asists;
    }

    public void setAsists(double asists) {
        this.asists = asists;
    }

    public double getRebounds() {
        return rebounds;
    }

    public void setRebounds(double rebounds) {
        this.rebounds = rebounds;
    }

    public double getSteals() {
        return steals;
    }

    public void setSteals(double steals) {
        this.steals = steals;
    }

    public double getBlocks() {
        return blocks;
    }

    public void setBlocks(double blocks) {
        this.blocks = blocks;
    }

    public double getFieldgoalsattempted() {
        return fieldgoalsattempted;
    }

    public void setFieldgoalsattempted(double fieldgoalsattempted) {
        this.fieldgoalsattempted = fieldgoalsattempted;
    }

    public double getFieldgoalsmade() {
        return fieldgoalsmade;
    }

    public void setFieldgoalsmade(double fieldgoalsmade) {
        this.fieldgoalsmade = fieldgoalsmade;
    }

    public double getThreepointattempted() {
        return threepointattempted;
    }

    public void setThreepointattempted(double threepointattempted) {
        this.threepointattempted = threepointattempted;
    }

    public double getThreepointmade() {
        return threepointmade;
    }

    public void setThreepointmade(double threepointmade) {
        this.threepointmade = threepointmade;
    }

    public double getFreethrowsattempted() {
        return freethrowsattempted;
    }

    public void setFreethrowsattempted(double freethrowsattempted) {
        this.freethrowsattempted = freethrowsattempted;
    }

    public double getFreethrowsmade() {
        return freethrowsmade;
    }

    public void setFreethrowsmade(double freethrowsmade) {
        this.freethrowsmade = freethrowsmade;
    }

    
    
}
