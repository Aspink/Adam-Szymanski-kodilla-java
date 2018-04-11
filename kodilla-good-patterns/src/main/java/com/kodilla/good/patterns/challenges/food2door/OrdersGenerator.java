package com.kodilla.good.patterns.challenges.food2door;

import java.util.LinkedList;
import java.util.List;

public class OrdersGenerator {

    public  static List<InternalOrderDTO> generate() {
        Producer extraFoodShop = new ExtraFoodShop();
        Producer glutenFreeShop = new GlutenFreeShop();
        Producer healthyShop = new HealthyShop();

        Product quinoaSeeds50g = new Product("Quinoa seeds 50 g bag");
        Product glutenFreeBread = new Product("Gluten free bread");
        Product avocado = new Product("Avocado");

        InternalOrderDTO order1 = new InternalOrderDTO(extraFoodShop, quinoaSeeds50g, 1);
        InternalOrderDTO order2 = new InternalOrderDTO(glutenFreeShop, glutenFreeBread, 3);
        InternalOrderDTO order3 = new InternalOrderDTO(healthyShop, avocado, 5);

        List<InternalOrderDTO> ordersList = new LinkedList<>();
        ordersList.add(order1);
        ordersList.add(order2);
        ordersList.add(order3);

        return ordersList;
    }
}
