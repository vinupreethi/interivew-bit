package org.ZomatoForReview.model;

import org.ZomatoForReview.Observer.Observer;

import java.util.List;

public class User implements Observer {
    private String username;
    private String password;


    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    @Override
    public void update(String message) {
        System.out.println(message);
    }
}
