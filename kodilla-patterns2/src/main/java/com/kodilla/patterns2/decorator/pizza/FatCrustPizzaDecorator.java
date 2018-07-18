package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class FatCrustPizzaDecorator extends AbstractPizzaOrderDecorator {
    public FatCrustPizzaDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(0.00));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " on a fat crust,";
    }
}
