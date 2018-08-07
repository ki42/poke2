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
    private int friendId;

    @NotNull
    @Size(min=3, max=12)
    private String userName;

    @NotNull
    @Size(min=3, max=15)    /* TODO how do I hash this? */
    private String hashPassword;

    @NotNull
    private int salt;

    @NotNull
    private int playerLevel;

    @NotNull
    private int zipCode;

    private int miles;

    private String email;

    private String timeSpan;

    @OneToMany
    @JoinColumn(name="user_id")
    private List<Poke> poke = new ArrayList<>();

    public User(){}

    public User(int friendId, String userName, String hashPassword, int salt, int playerLevel, int zipCode, int miles, String email, String timeSpan) {
        this.friendId = friendId;
        this.userName = userName;
        this.hashPassword = hashPassword;
        this.salt = salt;
        this.playerLevel = playerLevel;
        this.zipCode = zipCode;
        this.miles = miles;
        this.email = email;
        this.timeSpan = timeSpan;
    }

    public User(int friendId, String userName, String hashPassword, int salt) {
        this.friendId = friendId;
        this.userName = userName;
        this.hashPassword = hashPassword;
        this.salt = salt;
    }

    public User(int friendId, String userName, String hashPassword) {
        this.friendId = friendId;
        this.userName = userName;
        this.hashPassword = hashPassword;
    }

    public int getId() {
        return id;
    }

    public int getFriendId() {
        return friendId;
    }

    public void setFriendId(int friendId) {
        this.friendId = friendId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getHashPassword() {
        return hashPassword;
    }

    public void setHashPassword(String hashPassword) {
        this.hashPassword = hashPassword;
    }

    public int getSalt() {
        return salt;
    }

    public void setSalt(int salt) {
        this.salt = salt;
    }

    public int getPlayerLevel() {
        return playerLevel;
    }

    public void setPlayerLevel(int playerLevel) {
        this.playerLevel = playerLevel;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public int getMiles() {
        return miles;
    }

    public void setMiles(int miles) {
        this.miles = miles;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTimeSpan() {
        return timeSpan;
    }

    public void setTimeSpan(String timeSpan) {
        this.timeSpan = timeSpan;
    }

    public List<Poke> getPoke() {
        return poke;
    }

    public void setPoke(List<Poke> poke) {
        this.poke = poke;
    }

//    @Override
//    public String toString() {
//        return getUserName().toString();
//    }
}

