package com.kodilla.testing.forum.statistics;

import static java.lang.Double.NaN;

public class ForumStatistics {
    int usersQuantity;
    int postsQuantity;
    int commentsQuantity;
    double averagePostsPerUser;
    double averageCommentsPerUser;
    double averageCommentsPerPost;

    public void calculateAdvStatistics(Statistics statistics) {
        this.usersQuantity = statistics.usersNames().size();
        this.postsQuantity = statistics.postsCount();
        this.commentsQuantity = statistics.commentsCount();
        if (usersQuantity == 0) {
            this.averagePostsPerUser = NaN;
        } else {
            this.averagePostsPerUser = (double)postsQuantity/usersQuantity;
        }
        if (usersQuantity == 0) {
            this.averageCommentsPerUser = NaN;
        } else {
            this.averageCommentsPerUser = (double)commentsQuantity/usersQuantity;
        }
        if (postsQuantity == 0) {
            this.averageCommentsPerPost = NaN;
        } else {
            this.averageCommentsPerPost = (double)commentsQuantity/postsQuantity;
        }

    }

    public void showStatistics() {
        System.out.println("Quantity of users: " + usersQuantity);
        System.out.println("Quantity of posts: " + postsQuantity);
        System.out.println("Quantity of comments: " + commentsQuantity);
        System.out.println("Average quantity of posts per user: " + averagePostsPerUser);
        System.out.println("Average quantity of comments per user: " + averageCommentsPerUser);
        System.out.println("Average quantity of comments per post" + averageCommentsPerPost);
    }
}
