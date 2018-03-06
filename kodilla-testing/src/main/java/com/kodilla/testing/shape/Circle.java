package com.kodilla.testing.shape;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Objects.equals(radius, circle.radius);
    }
}
