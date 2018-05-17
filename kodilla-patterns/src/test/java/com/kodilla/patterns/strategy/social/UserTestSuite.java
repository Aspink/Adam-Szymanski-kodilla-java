package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User robert = new Millenials("Robert Roy McGregor");
        User patrick = new YGeneration("Patrick  O'Connor");
        User allan = new ZGeneration("Allan Krupa");

        //When
        String robertPublisher = robert.sharePost();
        System.out.println("Robert usually uses: " + robertPublisher);
        String patrickPublisher = patrick.sharePost();
        System.out.println("Patrick usually uses: " + patrickPublisher);
        String allanPublisher = allan.sharePost();
        System.out.println("Allan usually uses: " + allanPublisher);

        //Then
        Assert.assertEquals("Facebook", robertPublisher);
        Assert.assertEquals("Twitter", patrickPublisher);
        Assert.assertEquals("Snapchat", allanPublisher);
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User rocky = new Millenials("Rocky Balboa");

        //When
        String rockyPublisher = rocky.sharePost();
        System.out.println("Rocky usually uses: " + rockyPublisher);
        rocky.setSharingStrategy(new SnapchatPublisher());
        rockyPublisher = rocky.sharePost();
        System.out.println("Rocky now uses: " + rockyPublisher);

        //Then
        Assert.assertEquals("Snapchat", rockyPublisher);
    }
}
