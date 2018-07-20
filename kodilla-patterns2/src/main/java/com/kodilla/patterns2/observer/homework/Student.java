package com.kodilla.patterns2.observer.homework;

public class Student {
    private final String name;
    HomeworkContainer myHomeworks;

    public Student(String name) {
        this.name = name;
        myHomeworks = new HomeworkContainer(name + " homeworks");
    }
}
