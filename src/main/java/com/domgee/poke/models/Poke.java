package com.domgee.poke.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Poke {

    @Id
    @GeneratedValue
    private int id;

    @NotNull
    @ManyToOne       /* Many poke to only one Poke in the poke name table.   */
    private PokeNames pokeNames;

    @Size(max = 4)
    private int haveCP;

    @Size(max = 4)
    private int haveHP;

    @Size(max = 4)
    private int wantCPLow;

    @Size(max = 4)
    private int wantCPHigh;

    @Size(max = 4)
    private int wantHPLow;

    @Size(max = 4)
    private int wantHPHigh;

    @Size(max = 1)
    private int shiny;   /* 0 not, 1 yes */

    @Size(max = 1)
    private int specialForm;   /* 0 not, 1 yes */

    @Size(max = 1)
    private int size;   /* 0 small, 1 regular, 2 large */

    @Size(max = 250)   /* TODO: how do I hash this? */
    private String notes;

    @ManyToOne /* Many poke in this table, only one user for each */
    private User user;

    public Poke(PokeNames pokeNames, int haveCP, int haveHP, int wantCPLow, int wantCPHigh, int wantHPLow, int wantHPHigh, int shiny, int specialForm, int size, String notes, User user) {
        this.pokeNames = pokeNames;
        this.haveCP = haveCP;
        this.haveHP = haveHP;
        this.wantCPLow = wantCPLow;
        this.wantCPHigh = wantCPHigh;
        this.wantHPLow = wantHPLow;
        this.wantHPHigh = wantHPHigh;
        this.shiny = shiny;
        this.specialForm = specialForm;
        this.size = size;
        this.notes = notes;
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public PokeNames getPokeNames() {
        return pokeNames;
    }

    public void setPokeNames(PokeNames pokeNames) {
        this.pokeNames = pokeNames;
    }

    public int getHaveCP() {
        return haveCP;
    }

    public void setHaveCP(int haveCP) {
        this.haveCP = haveCP;
    }

    public int getHaveHP() {
        return haveHP;
    }

    public void setHaveHP(int haveHP) {
        this.haveHP = haveHP;
    }

    public int getWantCPLow() {
        return wantCPLow;
    }

    public void setWantCPLow(int wantCPLow) {
        this.wantCPLow = wantCPLow;
    }

    public int getWantCPHigh() {
        return wantCPHigh;
    }

    public void setWantCPHigh(int wantCPHigh) {
        this.wantCPHigh = wantCPHigh;
    }

    public int getWantHPLow() {
        return wantHPLow;
    }

    public void setWantHPLow(int wantHPLow) {
        this.wantHPLow = wantHPLow;
    }

    public int getWantHPHigh() {
        return wantHPHigh;
    }

    public void setWantHPHigh(int wantHPHigh) {
        this.wantHPHigh = wantHPHigh;
    }

    public int getShiny() {
        return shiny;
    }

    public void setShiny(int shiny) {
        this.shiny = shiny;
    }

    public int getSpecialForm() {
        return specialForm;
    }

    public void setSpecialForm(int specialForm) {
        this.specialForm = specialForm;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}




















//    @Override
//    public String toString() {
//        return getUserName().toString();
//    }
//}

