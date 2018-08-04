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
}




















//    @Override
//    public String toString() {
//        return getUserName().toString();
//    }
//}

