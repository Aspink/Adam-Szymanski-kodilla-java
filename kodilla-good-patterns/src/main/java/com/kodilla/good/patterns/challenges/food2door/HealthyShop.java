package com.kodilla.good.patterns.challenges.food2door;

public class HealthyShop implements Producer {

    public OrderProcessor getOrderProcessor(InternalOrderDTO currentOrder) {
        return new HealthyShopOrderProcessor();
    }

    public String getName() {
        return "Healthy Shop";
    }
}
