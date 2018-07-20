package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer {
    private final String name;
    private int updateCount;

    public Mentor(String username) {
        this.name = username;
    }
    @Override
    public void update(HomeworkContainer homeworkContainer) {
        System.out.println(name + ": New homeworks in " + homeworkContainer.getName() + "\n" +
                " (total: " + homeworkContainer.getHomeworks().size() + " homeworks)");
        updateCount++;
    }

    public String getName() {
        return name;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
