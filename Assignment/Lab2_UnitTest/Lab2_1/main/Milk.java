package main;

import java.math.BigDecimal;

//Concrete decorators
public class Milk extends CoffeeDecorator {
	private final BigDecimal cost = new BigDecimal("0.5");
	private final String description = "Milk";

	public Milk(Coffee decoratedCoffee) {
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