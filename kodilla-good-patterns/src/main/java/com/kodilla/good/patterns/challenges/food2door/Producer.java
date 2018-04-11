package com.kodilla.good.patterns.challenges.food2door;

public interface Producer {
    public OrderProcessor getOrderProcessor(InternalOrderDTO currentOrder);
    public String getName();
}
