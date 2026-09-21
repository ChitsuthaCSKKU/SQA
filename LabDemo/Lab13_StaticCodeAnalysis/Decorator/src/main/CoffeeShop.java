package main;

public class CoffeeShop {
    public static void main(String[] args) {
        // Simple coffee
        Coffee coffee = new SimpleCoffee();
        System.out.println("Cost: " + coffee.getCost() + ", Description: " + coffee.getDescription());

        // Coffee with milk
        Coffee coffeeWithMilk = new Milk(coffee);
        System.out.println("Cost: " + coffeeWithMilk.getCost() + ", Description: " + coffeeWithMilk.getDescription());

        // Coffee with milk and vanilla
        Coffee coffeeWithMilkAndVanilla = new Vanilla(coffeeWithMilk);
        System.out.println("Cost: " + coffeeWithMilkAndVanilla.getCost() + ", Description: " + coffeeWithMilkAndVanilla.getDescription());
    }
}