package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BoardTestSuite {
    @Test
    public void testTaskToDoAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        board.addToDo("Task3");
        board.addInProgress("Task2");
        board.addDone("Task1");
        //When
        String task3 =board.getToDoList().getTasks().get(0);
        //Then
        System.out.println("Task to do is: " + task3);
        Assert.assertEquals(task3,"Task3");
    }

    @Test
    public void testTaskInProgressAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        board.addToDo("Task3");
        board.addInProgress("Task2");
        board.addDone("Task1");
        //When
        String task2 =board.getInProgressList().getTasks().get(0);
        //Then
        System.out.println("Task in progress is: " + task2);
        Assert.assertEquals(task2,"Task2");
    }

    @Test
    public void testTaskDoneAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        board.addToDo("Task3");
        board.addInProgress("Task2");
        board.addDone("Task1");
        //When
        String task1 =board.getDoneList().getTasks().get(0);
        //Then
        System.out.println("Task done is: " + task1);
        Assert.assertEquals(task1,"Task1");
    }

}
