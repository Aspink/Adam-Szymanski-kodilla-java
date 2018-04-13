package com.kodilla.good.patterns.challenges.food2door;

import java.util.LinkedList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        OrdersCollector ordersCollector = new OrdersCollector();

        switchOrders(ordersCollector);

        System.out.println("All orders processed. " + ordersCollector.ordersAccepted.size() + " orders accepted, " + ordersCollector.ordersRejected.size() + " orders rejected.");

    }

    public static void switchOrders(OrdersCollector ordersCollector) {
        while (ordersCollector.ordersToProceed.size() > 0) {
            InternalOrderDTO currentOrder = getFirst(ordersCollector);
            OrderProcessor processor = currentOrder.getProducer().getOrderProcessor(currentOrder);
            OrderDTO processedOrder = processor.process(currentOrder);
            validateAcceptation (processedOrder, ordersCollector);
        }
    }

    public static InternalOrderDTO getFirst(OrdersCollector ordersCollector) {
        InternalOrderDTO currentOrder = ordersCollector.ordersToProceed.get(0);
        ordersCollector.ordersToProceed.remove(0);
        return currentOrder;
    }

    public static void validateAcceptation (OrderDTO processedOrder, OrdersCollector ordersCollector) {
        if(processedOrder.isAccepted()) {
            ordersCollector.ordersAccepted.add(processedOrder.getOrder());
            System.out.println("Order added to accepted orders list\n");
        } else {
            ordersCollector.ordersRejected.add(processedOrder.getOrder());
            System.out.println("Order added to rejected orders list\n");
        }
    }
}
