package com.domgee.poke.models.data.forms;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class UserStorage {
    @NotNull
    private int friendId;

    @NotNull
    @Size(min=3, max=12)
    private String userName;

    @NotNull
    @Size(min=3, max=20)
    private String password;

    public UserStorage() {}

    public UserStorage(int friendId, String userName, String password) {
        this.friendId = friendId;
        this.userName = userName;
        this.password = password;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
