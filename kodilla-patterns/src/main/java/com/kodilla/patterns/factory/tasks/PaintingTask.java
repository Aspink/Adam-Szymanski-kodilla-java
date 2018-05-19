package com.kodilla.patterns.factory.tasks;

public class PaintingTask implements Task {
    private final String taskName;
    private final String color;
    private final String whatToPaint;
    private boolean isDone = false;

    public PaintingTask(final String taskName, final String color, final String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
    }

    public void executeTask() {
        System.out.println("I'm painting the " + whatToPaint + " in " + color);
        isDone = true;
    }

    public String getTaskName() {
        return taskName;
    }

    public boolean isTaskExecuted() {
        return isDone;
    }
}
