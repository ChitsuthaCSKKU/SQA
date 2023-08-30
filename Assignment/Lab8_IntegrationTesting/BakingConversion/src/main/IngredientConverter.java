package main;

/*
 * Lab assignment#8 Integration testing
 * 
 * Convert value in one unit to other units
 * 
 * @author Asst.Prof. Chitsutha Soomlek, College of Computing, KKU
 * @version 1.0
 * 
 */


public class IngredientConverter {
	
	//Constructor
	public IngredientConverter() {
		
	}
	
	/*
	 * Convert an input from one unit to another unit
	 * 
	 * @parameter value = the input value to convert
	 * @parameter choice = selected choice (what to convert)
	 * @parameter fromUnit = the unit of the value, e.g, cup
	 * @parameter toUnit = the unit to convert the value to, e.g., gram
	 * @return the converted value
	*/
	public double convert(double value, String choice, String fromUnit, String toUnit) {
		double result = 0.0;
		
		LiquidConverter liquidConverter = new LiquidConverter();
		FlourConverter flourConverter = new FlourConverter();
		ButterConverter butterConverter = new ButterConverter();
		
		
		if (choice.equals("liquid")) {
			result = liquidConverter.convert(value, fromUnit, toUnit);
		} else if (choice.equals("flour")) {
			result = flourConverter.convert(value, fromUnit, toUnit);
		} else if (choice.equals("butter")) {
			result = butterConverter.convert(value, fromUnit, toUnit);
		} 
			
		return result;
	}
}
