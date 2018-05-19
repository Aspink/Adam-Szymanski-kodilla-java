package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String DRIVING = "DRIWING";
    public static final String PAINTING = "PAINTING";
    public static final String SHOPPING = "SHOPPING";

    public final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case SHOPPING:
                return new ShoppingTask("Shopping books", "books", 5);
            case PAINTING:
                return new PaintingTask("Painting the wall", "azure", "wall");
            case DRIVING:
                return new DrivingTask("Driving a truck", "Memphis", "truck");
            default:
                return null;
        }
    }
}
