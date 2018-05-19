package com.kodilla.patterns.factory.tasks;

public class DrivingTask implements Task {
    private final String taskName;
    private final String where;
    private final String using;
    private boolean isDone = false;

    public DrivingTask(final String taskName, final String where, final String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }

    public void executeTask() {
        System.out.println("I am driving a " + using + " to " + where);
        isDone = true;
    }

    public String getTaskName() {
        return taskName;
    }

    public boolean isTaskExecuted() {
        return isDone;
    }
}
