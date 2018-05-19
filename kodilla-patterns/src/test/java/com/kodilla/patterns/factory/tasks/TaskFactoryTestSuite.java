package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testFactoryShopping() {
        //Given
        TaskFactory factory = new TaskFactory();
        Task shopping = factory.makeTask(TaskFactory.SHOPPING);

        //When
        String name = shopping.getTaskName();
        boolean isDone = shopping.isTaskExecuted();
        shopping.executeTask();

        //Then
        Assert.assertTrue(!isDone);
        Assert.assertEquals("Shopping books", name);
    }

    @Test
    public void testFactoryPainting() {
        //Given
        TaskFactory factory = new TaskFactory();
        Task painting = factory.makeTask(TaskFactory.PAINTING);

        //When
        painting.executeTask();

        //Then
        Assert.assertTrue(painting.isTaskExecuted());
        Assert.assertEquals("Painting the wall", painting.getTaskName());
    }

    @Test
    public void testFactoryDriving() {
        //Given
        TaskFactory factory = new TaskFactory();
        Task driving = factory.makeTask(TaskFactory.DRIVING);

        //When
        boolean isDone = driving.isTaskExecuted();
        driving.executeTask();

        //Then
        Assert.assertTrue(!isDone);
        Assert.assertTrue(driving.isTaskExecuted());
        Assert.assertEquals("Driving a truck", driving.getTaskName());
    }
}
