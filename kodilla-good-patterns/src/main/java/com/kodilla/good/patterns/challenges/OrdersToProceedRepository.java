package com.kodilla.good.patterns.challenges;

import java.util.ArrayList;
import java.util.List;

public class OrdersToProceedRepository implements OrderRepository {
    List<ProductRequest> ordersList = new ArrayList<>();
    public void createOrder(User user, Product product, int quantity) {
        ProductRequest order = new ProductRequest(user, product, quantity);
        ordersList.add(order);
        System.out.println("Order:\n" + order + "\nadded!");
    }

    public void removeOrder() {}

    public List<ProductRequest> getOrdersList() {
        return ordersList;
    }
}
