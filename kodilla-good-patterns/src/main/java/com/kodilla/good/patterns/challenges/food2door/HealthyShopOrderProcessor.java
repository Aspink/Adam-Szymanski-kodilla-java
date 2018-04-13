package com.kodilla.good.patterns.challenges.food2door;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class HealthyShopOrderProcessor implements OrderProcessor {

    public OrderDTO process(InternalOrderDTO currentOrder) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
        LocalTime pickupTime = LocalTime.now().plusMinutes(15);
        LocalTime closingTime = LocalTime.parse("20:00", formatter);

        System.out.println("Sending order to Healthy Shop:\n" + currentOrder);
        System.out.println("Sending pickup time: " + pickupTime.toString());
        if(pickupTime.isAfter(closingTime)) {
            System.out.println("Sorry, guys, it's too late! We invite you tomorrow!");
            System.out.println("Order rejected!");
            return new OrderDTO(currentOrder, false);
        }

        System.out.println("Order accepted!");
        return new OrderDTO(currentOrder, true);
    }
}
