package com.kodilla.testing.forum.statistics;

import org.junit.*;
import org.mockito.stubbing.OngoingStubbing;

import java.util.List;

import static java.lang.Double.NaN;
import static java.lang.Double.isNaN;
import static org.mockito.Mockito.RETURNS_DEEP_STUBS;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CalculateAdvStatisticsTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void testCalculateAveragePostPerUserWithMock_0_0() {
        //Given
        Statistics statisticsMock = mock(Statistics.class, RETURNS_DEEP_STUBS);
        when (statisticsMock.usersNames().size()).thenReturn(0);
        when (statisticsMock.postsCount()).thenReturn(0);
        when (statisticsMock.commentsCount()).thenReturn(0);

        ForumStatistics forumStatistics = new ForumStatistics();
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //When
        double averagePostsPerUser = forumStatistics.averagePostsPerUser;

        //Then
        Assert.assertTrue(isNaN(averagePostsPerUser));
    }

    @Test
    public void testCalculateAveragePostPerUserWithMock_1000_0() {
        //Given
        Statistics statisticsMock = mock(Statistics.class, RETURNS_DEEP_STUBS);
        when (statisticsMock.usersNames().size()).thenReturn(0);
        when (statisticsMock.postsCount()).thenReturn(1000);
        when (statisticsMock.commentsCount()).thenReturn(0);

        ForumStatistics forumStatistics = new ForumStatistics();
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //When
        double averagePostsPerUser = forumStatistics.averagePostsPerUser;

        //Then
        Assert.assertTrue(isNaN(averagePostsPerUser));
    }
    @Test
    public void testCalculateAveragePostPerUserWithMock_0_100() {
        //Given
        Statistics statisticsMock = mock(Statistics.class, RETURNS_DEEP_STUBS);
        when (statisticsMock.usersNames().size()).thenReturn(100);
        when (statisticsMock.postsCount()).thenReturn(0);
        when (statisticsMock.commentsCount()).thenReturn(0);

        ForumStatistics forumStatistics = new ForumStatistics();
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //When
        double averagePostsPerUser = forumStatistics.averagePostsPerUser;

        //Then
        Assert.assertEquals(0, averagePostsPerUser, 0.0000001);
    }

    @Test
    public void testCalculateAveragePostPerUserWithMock_1000_100() {
        //Given
        Statistics statisticsMock = mock(Statistics.class, RETURNS_DEEP_STUBS);
        when (statisticsMock.usersNames().size()).thenReturn(100);
        when (statisticsMock.postsCount()).thenReturn(1000);
        when (statisticsMock.commentsCount()).thenReturn(0);

        ForumStatistics forumStatistics = new ForumStatistics();
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //When
        double averagePostsPerUser = forumStatistics.averagePostsPerUser;

        //Then
        Assert.assertEquals(10, averagePostsPerUser, 0.0000001);
    }

    @Test
    public void testCalculateAverageCommentsPerUserWithMock_0_0() {
        //Given
        Statistics statisticsMock = mock(Statistics.class, RETURNS_DEEP_STUBS);
        when (statisticsMock.usersNames().size()).thenReturn(0);
        when (statisticsMock.postsCount()).thenReturn(0);
        when (statisticsMock.commentsCount()).thenReturn(0);

        ForumStatistics forumStatistics = new ForumStatistics();
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //When
        double result = forumStatistics.averageCommentsPerUser;

        //Then
        Assert.assertTrue(isNaN(result));
    }

    @Test
    public void testCalculateAverageCommentsPerUserWithMock_1000_0() {
        //Given
        Statistics statisticsMock = mock(Statistics.class, RETURNS_DEEP_STUBS);
        when (statisticsMock.usersNames().size()).thenReturn(0);
        when (statisticsMock.postsCount()).thenReturn(1000);
        when (statisticsMock.commentsCount()).thenReturn(1000);

        ForumStatistics forumStatistics = new ForumStatistics();
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //When
        double result = forumStatistics.averageCommentsPerUser;

        //Then
        Assert.assertTrue(isNaN(result));
    }
    @Test
    public void testCalculateAverageCommentsPerUserWithMock_0_100() {
        //Given
        Statistics statisticsMock = mock(Statistics.class, RETURNS_DEEP_STUBS);
        when (statisticsMock.usersNames().size()).thenReturn(100);
        when (statisticsMock.postsCount()).thenReturn(0);
        when (statisticsMock.commentsCount()).thenReturn(0);

        ForumStatistics forumStatistics = new ForumStatistics();
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //When
        double result = forumStatistics.averageCommentsPerUser;

        //Then
        Assert.assertEquals(0, result, 0.0000001);
    }

    @Test
    public void testCalculateAverageCommentsPerUserWithMock_1000_100() {
        //Given
        Statistics statisticsMock = mock(Statistics.class, RETURNS_DEEP_STUBS);
        when (statisticsMock.usersNames().size()).thenReturn(100);
        when (statisticsMock.postsCount()).thenReturn(1000);
        when (statisticsMock.commentsCount()).thenReturn(1000);

        ForumStatistics forumStatistics = new ForumStatistics();
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //When
        double result = forumStatistics.averageCommentsPerUser;

        //Then
        Assert.assertEquals(10, result, 0.0000001);
    }

    @Test
    public void testCalculateAverageCommentsPerPostWithMock_0_0() {
        //Given
        Statistics statisticsMock = mock(Statistics.class, RETURNS_DEEP_STUBS);
        when (statisticsMock.usersNames().size()).thenReturn(0);
        when (statisticsMock.postsCount()).thenReturn(0);
        when (statisticsMock.commentsCount()).thenReturn(0);

        ForumStatistics forumStatistics = new ForumStatistics();
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //When
        double result = forumStatistics.averageCommentsPerPost;

        //Then
        Assert.assertTrue(isNaN(result));
    }

    @Test
    public void testCalculateAverageCommentsPerPostWithMock_1000_0() {
        //Given
        Statistics statisticsMock = mock(Statistics.class, RETURNS_DEEP_STUBS);
        when (statisticsMock.usersNames().size()).thenReturn(0);
        when (statisticsMock.postsCount()).thenReturn(0);
        when (statisticsMock.commentsCount()).thenReturn(1000);

        ForumStatistics forumStatistics = new ForumStatistics();
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //When
        double result = forumStatistics.averageCommentsPerPost;

        //Then
        Assert.assertTrue(isNaN(result));
    }
    @Test
    public void testCalculateAverageCommentsPerPostWithMock_0_100() {
        //Given
        Statistics statisticsMock = mock(Statistics.class, RETURNS_DEEP_STUBS);
        when (statisticsMock.usersNames().size()).thenReturn(100);
        when (statisticsMock.postsCount()).thenReturn(100);
        when (statisticsMock.commentsCount()).thenReturn(0);

        ForumStatistics forumStatistics = new ForumStatistics();
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //When
        double result = forumStatistics.averageCommentsPerPost;

        //Then
        Assert.assertEquals(0, result, 0.0000001);
    }

    @Test
    public void testCalculateAverageCommentsPerPostWithMock_1000_100() {
        //Given
        Statistics statisticsMock = mock(Statistics.class, RETURNS_DEEP_STUBS);
        when (statisticsMock.usersNames().size()).thenReturn(100);
        when (statisticsMock.postsCount()).thenReturn(100);
        when (statisticsMock.commentsCount()).thenReturn(1000);

        ForumStatistics forumStatistics = new ForumStatistics();
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //When
        double result = forumStatistics.averageCommentsPerPost;

        //Then
        Assert.assertEquals(10, result, 0.0000001);
    }

    @Test
    public void testCalculateAverageCommentsPerPostWithMock_100_1000() {
        //Given
        Statistics statisticsMock = mock(Statistics.class, RETURNS_DEEP_STUBS);
        when (statisticsMock.usersNames().size()).thenReturn(100);
        when (statisticsMock.postsCount()).thenReturn(1000);
        when (statisticsMock.commentsCount()).thenReturn(100);

        ForumStatistics forumStatistics = new ForumStatistics();
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //When
        double result = forumStatistics.averageCommentsPerPost;

        //Then
        Assert.assertEquals(0.1, result, 0.0000001);
    }


}
