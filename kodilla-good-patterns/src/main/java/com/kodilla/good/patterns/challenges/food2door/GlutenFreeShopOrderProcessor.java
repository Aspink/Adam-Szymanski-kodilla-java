package com.kodilla.good.patterns.challenges.food2door;

public class GlutenFreeShopOrderProcessor implements OrderProcessor {

    public OrderDTO process(InternalOrderDTO currentOrder) {
        System.out.println("Sending order to Gluten Free Shop:\n" + currentOrder);
        System.out.println("We do not have this, unfortunately!\nOrder rejected!");

        return new OrderDTO(currentOrder, false);
    }

}
