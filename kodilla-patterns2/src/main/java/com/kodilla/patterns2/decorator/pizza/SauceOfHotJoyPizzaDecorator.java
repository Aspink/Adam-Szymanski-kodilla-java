package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class SauceOfHotJoyPizzaDecorator extends AbstractPizzaOrderDecorator {
    public SauceOfHotJoyPizzaDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(1.20));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + a sauce of hot joy,";
    }
}
