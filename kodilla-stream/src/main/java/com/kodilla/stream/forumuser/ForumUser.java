package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {
    private final int userId;
    private final String userName;
    private final char userSex;
    private final LocalDate dateOfBirth;
    private final int postQuantity;

    public ForumUser(int userId, String userName, char userSex, LocalDate dateOfBirth, int postQuantity) {
        this.userId = userId;
        this.userName = userName;
        this.userSex = userSex;
        this.dateOfBirth = dateOfBirth;
        this.postQuantity = postQuantity;
    }

    public int getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public char getUserSex() {
        return userSex;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getPostQuantity() {
        return postQuantity;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userSex=" + userSex +
                ", dateOfBirth=" + dateOfBirth +
                ", postQuantity=" + postQuantity +
                '}';
    }
}
