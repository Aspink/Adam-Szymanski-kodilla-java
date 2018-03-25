package com.kodilla.good.patterns.challenges;

public class Boots implements Product {
    private String bootsModel;
    private double size;
    private String color;

    public Boots(String bootsModel, double size, String color) {
        this.bootsModel = bootsModel;
        this.size = size;
        this.color = color;
    }

    public String getBootsModel() {
        return bootsModel;
    }

    public double getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Boots model: '" + bootsModel + '\'' +
                ", size: " + size +
                ", color: " + color;
    }
}
