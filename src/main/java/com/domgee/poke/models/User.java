package com.domgee.poke.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class User {

    @Id
    @GeneratedValue
    private int id;

    @NotNull
    @Size(min=3, max=12)
    private String userName;

    @NotNull
    @Size(min=3, max=15)    /* TODO how do I hash this? */
    private String hashPassword;

    @NotNull
    private int salt;

    @NotNull
    @Size(min=1, max=2)
    private int playerLevel;

    @NotNull
    @Size(min=5, max=5)
    private int zipCode;

    private int miles;

    @Size(min=3, max=25)
    private String email;

    private String timeSpan;

    @OneToMany
    @JoinColumn(name="poke_id")
    private List<Poke> poke = new ArrayList<>();

    public User(){}

    public User(String userName, String hashPassword, int salt, int playerLevel, int zipCode, int miles, String email, String timeSpan) {
        this.userName = userName;
        this.hashPassword = hashPassword;
        this.salt = salt;
        this.playerLevel = playerLevel;
        this.zipCode = zipCode;
        this.miles = miles;
        this.email = email;
        this.timeSpan = timeSpan;
    }

    public int getId() {
        return id;
    }






//    @Override
//    public String toString() {
//        return getUserName().toString();
//    }
}

