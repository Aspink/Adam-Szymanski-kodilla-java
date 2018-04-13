package com.kodilla.good.patterns.challenges.food2door;

public class GlutenFreeShopOrderProcessor implements OrderProcessor {

    public OrderDTO process(InternalOrderDTO currentOrder) {

        System.out.println("Sending order to Gluten Free Shop:\n" + currentOrder);

        if(currentOrder.getProduct().getProductName().equals("Gluten free bread")) {
            System.out.println("We do not have this, unfortunately!\nOrder rejected!");

            return new OrderDTO(currentOrder, false);
        }

        System.out.println("Yes, we got it!\nOrder accepted!");

        return new OrderDTO(currentOrder, true);
    }

}
