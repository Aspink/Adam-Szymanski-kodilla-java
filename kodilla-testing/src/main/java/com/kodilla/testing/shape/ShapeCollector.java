package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {
    ArrayList<Shape> shapes = new ArrayList<Shape>();



    public void addFigure(Shape shape){
        shapes.add(shape);
    }

    public boolean removeFigure(Shape shape) {
        boolean result = false;
        if (shapes.contains(shape)){
            shapes.remove(shape);
            result = true;
        }
        return result;

    }

    public Shape getFigure(int n) {
        if (n >= shapes.size()) {
            return null;
        } else {
            return shapes.get (n);
        }

    }

    public boolean showFigures() {
        if (shapes.size() == 0)return false;
        else {
            for (Shape shape: shapes) {
                System.out.println("Figure: " + shape.getShapeName() + ", figure field: " + shape.getField());

            }

            return true;
        }

    }
}
