package com.kodilla.good.patterns.challenges.food2door;

public class ExtraFoodShop implements Producer {

    public OrderProcessor getOrderProcessor(InternalOrderDTO currentOrder) {

        return new ExtraFoodShopOrderProcessor();
    }

    public String getName() {
        return "Extra Food Shop";
    }
}
