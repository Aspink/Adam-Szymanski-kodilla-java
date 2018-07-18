package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class SauceIslandOfJoyPizzaDecorator extends AbstractPizzaOrderDecorator {
    public SauceIslandOfJoyPizzaDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(1.50));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + sauce island of joy,";
    }
}
