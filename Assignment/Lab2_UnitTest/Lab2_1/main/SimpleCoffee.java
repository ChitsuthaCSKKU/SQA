package main;

import java.math.BigDecimal;

// Concrete component
class SimpleCoffee implements Coffee {
    private final BigDecimal cost = new BigDecimal("1.0");
    private final String description = "Simple coffee";

    @Override
    public BigDecimal getCost() {
        return cost;
    }

    @Override
    public String getDescription() {
        return description;
    }
}