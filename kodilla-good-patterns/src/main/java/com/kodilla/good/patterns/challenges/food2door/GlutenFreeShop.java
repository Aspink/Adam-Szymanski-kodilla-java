package com.kodilla.good.patterns.challenges.food2door;

public class GlutenFreeShop implements Producer {

    public OrderProcessor getOrderProcessor(InternalOrderDTO currentOrder) {
        return new GlutenFreeShopOrderProcessor();
    }

    public String getName() {
        return "Gluten Free Shop";
    }
}
