package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class AnchoisPizzaDecorator extends AbstractPizzaOrderDecorator {
    public AnchoisPizzaDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(2.20));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " with Anchois,";
    }
}
