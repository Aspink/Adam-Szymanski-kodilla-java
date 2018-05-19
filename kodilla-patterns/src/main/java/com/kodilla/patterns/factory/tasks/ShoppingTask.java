package com.kodilla.patterns.factory.tasks;

public class ShoppingTask implements Task {
    private final String taskName;
    private final String whatToBuy;
    private final double quantity;
    private boolean isDone = false;

    public ShoppingTask(final String taskName, final String whatToBuy, final double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
    }

    public void executeTask(){
        System.out.println("I'm buying " + (int)quantity + " " + whatToBuy);
        this.isDone = true;
    }

    public String getTaskName() {
        return taskName;
    }

    public boolean isTaskExecuted() {
        return isDone;
    }
}
