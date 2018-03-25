package com.kodilla.good.patterns.challenges;

public class User {
    private String name;
    private String surName;
    private String userName;

    public User(String name, String surName, String userName) {
        this.name = name;
        this.surName = surName;
        this.userName = userName;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public String getUserName() {
        return userName;
    }

    @Override
    public String toString() {
        return name + " " + surName + ", userName: " + userName;
    }
}
