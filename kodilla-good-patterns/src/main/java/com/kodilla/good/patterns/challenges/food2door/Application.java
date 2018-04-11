package com.kodilla.good.patterns.challenges.food2door;

import java.util.LinkedList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<InternalOrderDTO> ordersToProceed = OrdersGenerator.generate();
        List<InternalOrderDTO> ordersAccepted = new LinkedList<>();
        List<InternalOrderDTO> ordersRejected = new LinkedList<>();

        while (ordersToProceed.size() > 0) {
            InternalOrderDTO currentOrder = ordersToProceed.get(0);
            ordersToProceed.remove(0);
            OrderProcessor processor = currentOrder.getProducer().getOrderProcessor(currentOrder);
            OrderDTO processedOrder = processor.process(currentOrder);
            if(processedOrder.isAccepted()) {
                ordersAccepted.add(processedOrder.getOrder());
                System.out.println("Order added to accepted orders list\n");
            } else {
                ordersRejected.add(processedOrder.getOrder());
                System.out.println("Order added to rejected orders list\n");
            }
        }

        System.out.println("All orders processed. " + ordersAccepted.size() + " orders accepted, " + ordersRejected.size() + " orders rejected.");

    }
}
