package com.kodilla.good.patterns.challenges.food2door;

public class ExtraFoodShopOrderProcessor implements OrderProcessor {
    public OrderDTO process(InternalOrderDTO currentOrder) {

        System.out.println("Sending order to Extra Food Shop:\n" + currentOrder);
        System.out.println("Order accepted!");

        return new OrderDTO(currentOrder, true);
    }
}
