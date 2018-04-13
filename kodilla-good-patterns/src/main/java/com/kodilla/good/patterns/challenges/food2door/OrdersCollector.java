package com.kodilla.good.patterns.challenges.food2door;

import java.util.LinkedList;
import java.util.List;

public class OrdersCollector {
    List<InternalOrderDTO> ordersToProceed = OrdersGenerator.generate();
    List<InternalOrderDTO> ordersAccepted = new LinkedList<>();
    List<InternalOrderDTO> ordersRejected = new LinkedList<>();
}
