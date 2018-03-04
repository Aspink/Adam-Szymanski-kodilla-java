package com.kodilla.testing.shape;

public class Triangle implements Shape {
    private double baseLength;
    private double height;

    public Triangle(double baseLength, double height) {
        this.baseLength = baseLength;
        this.height = height;
    }

    public String getShapeName(){
        return "triangle";
    }

    public double getField() {
        return 0.5 * baseLength * height;
    }
}
