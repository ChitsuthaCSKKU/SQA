package main;

//Usage example
public class CoffeeShop {
 
	public static void main(String[] args) {
		// Simple coffee
		Coffee coffee = new SimpleCoffee();
		coffee = addCondiment(new Milk(coffee));
		coffee = addCondiment(new Vanilla(coffee));

		System.out.println("Cost: " + coffee.getCost());
		System.out.println("Description: " + coffee.getDescription());
    }

	private static Coffee addCondiment(Coffee coffee) {
		// Add more condiments here in the future
		return coffee;
	}
}