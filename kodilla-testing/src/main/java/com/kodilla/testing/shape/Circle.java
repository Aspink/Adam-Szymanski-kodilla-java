package com.kodilla.testing.shape;
//import java.lang.Math.*;
public class Circle implements Shape {
    private Double radius;

    public Circle(Double radius) {
        this.radius = radius;
    }

    public String getShapeName(){
        return "circle";
    }

    public double getField() {
        return (Math.PI * radius * radius);
    }
}
