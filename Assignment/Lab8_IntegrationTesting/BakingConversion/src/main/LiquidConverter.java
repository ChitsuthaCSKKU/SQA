package main;
/*
 * Lab assignment#8 Integration testing
 * 
 * Convert a liquid ingredient from one unit to other units
 * 
 * @author Asst.Prof. Chitsutha Soomlek, College of Computing, KKU
 * @version 1.0
 * 
 */

public class LiquidConverter {
	
	public LiquidConverter() {
		
	}
	
	/*
	 * Convert a input value from one unit to another unit
	 * 
	 * @parameter liquidValue = the value to convert
	 * @parameter fromUnit = the unit of the liquid value, e.g, metric cup
	 * @parameter toUnit = the unit to convert the liquid value to, e.g., ml
	 * @return the converted value
	 */
	public double convert(double liquidValue, String fromUnit, String toUnit) {
		double result = 0.0;
		
		result = liquidValue*getMultiplier(fromUnit, toUnit);
		
		return result;
	}
	
	/*
	 * Get the multiplier required during the conversion process
	 * 
	 * @parameter fromUnit = the unit of the liquid value, e.g, metric cup
	 * @parameter toUnit = the unit to convert the liquid value to, e.g., ml
	 * @return the multiplier that "fromUnit" needs to be multiplied to get "toUnit"
	 */
	public double getMultiplier(String fromUnit, String toUnit) {
		double multiplier = 1.0;
		
		if (fromUnit.equals("cup")) {
			if (toUnit.equals("ml")) {
				multiplier = 250;
			} else if (toUnit.equals("oz"))
			{	multiplier = 8;
			}
		}
		else if (fromUnit.equals("tablespoon")) {
			if (toUnit.equals("ml")) {
				multiplier = 15;
			}
		}
		else if (fromUnit.equals("teaspoon")) {
			if (toUnit.equals("ml")) {
				multiplier = 5;
			}
		}
					
		return multiplier;
	}
}
