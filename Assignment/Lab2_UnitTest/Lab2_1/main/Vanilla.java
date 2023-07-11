package main;

import java.math.BigDecimal;

class Vanilla extends CoffeeDecorator {
    private final BigDecimal cost = new BigDecimal("0.7");
    private final String description = "Vanilla";

    public Vanilla(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public BigDecimal getCost() {
        return decoratedCoffee.getCost().add(cost);
    }

    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription() + ", " + description;
    }
}