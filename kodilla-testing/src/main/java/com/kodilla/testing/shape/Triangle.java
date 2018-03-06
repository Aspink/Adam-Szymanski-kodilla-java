package com.kodilla.testing.shape;

import java.util.Objects;

public class Triangle implements Shape {
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public String getShapeName(){
        return "triangle";
    }

    public double getField() {
        double p = (a + b + c) / 2;
        double haronField = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return haronField;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return ((Double.compare(triangle.a, a) == 0) &&
                (((Double.compare(triangle.b, b) == 0) && (Double.compare(triangle.c, c) == 0)) ||
                        ((Double.compare(triangle.b, c) == 0) && (Double.compare(triangle.c, b) == 0)))) ||
                ((Double.compare(triangle.a, c) == 0) &&
                        (((Double.compare(triangle.b, b) == 0) && (Double.compare(triangle.c, a) == 0)) ||
                                ((Double.compare(triangle.b, a) == 0) && Double.compare(triangle.c, b) == 0))) ||
                ((Double.compare(triangle.a, b) == 0) &&
                        (((Double.compare(triangle.b, a) == 0) && (Double.compare(triangle.c, c) == 0)) ||
                                ((Double.compare(triangle.b, c) == 0) && Double.compare(triangle.c, a) == 0))) ;


    }

    @Override
    public int hashCode() {

        return Objects.hash(a, b, c);
    }
}
