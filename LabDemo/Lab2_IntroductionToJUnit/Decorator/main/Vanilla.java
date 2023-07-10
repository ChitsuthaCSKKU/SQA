package main;

class Vanilla extends CoffeeDecorator {
    public Vanilla(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    public double getCost() {
        return super.getCost() + 0.7;
    }

    public String getDescription() {
        return super.getDescription() + ", Vanilla";
    }
}