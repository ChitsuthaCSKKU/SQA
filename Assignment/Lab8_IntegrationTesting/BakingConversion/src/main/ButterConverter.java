package main;
/*
 * Lab assignment#8 Integration testing
 * 
 * Convert the weight of butter from one unit to other units
 * 
 * @author Asst.Prof. Chitsutha Soomlek, College of Computing, KKU
 * @version 1.0
 * 
 */
public class ButterConverter {
	
	//Constructor
	public ButterConverter() {
		
	}
	
	/*
	 * Convert a input value from one unit to another unit
	 * 
	 * @parameter butterValue = the value to convert
	 * @parameter fromUnit = the unit of the butter value, e.g, cup
	 * @parameter toUnit = the unit to convert the flour value to, e.g., gram
	 * @return the converted value
	 */
	public double convert(double flourValue, String fromUnit, String toUnit) {
		double result = 0.0;
		
		result = flourValue*getMultiplier(fromUnit, toUnit);
		
		return result;
	}
	
	/*
	 * Get the multiplier required during the conversion process
	 * 
	 * @parameter fromUnit = the unit of the butter value, e.g, cup
	 * @parameter toUnit = the unit to convert the butter value to, e.g., gram
	 * @return the multiplier that "fromUnit" needs to be multiplied to get "toUnit"
	 */
	public double getMultiplier(String fromUnit, String toUnit) {
		double multiplier = 1.0;
		
		if (fromUnit.equals("cup")) {
			if (toUnit.equals("gram")) {
				multiplier = 227;
			}
		}
		else if (fromUnit.equals("tablespoon")) {
			if (toUnit.equals("gram")) {
				multiplier = 14;
			}
		}
		else if (fromUnit.equals("teaspoon")) {
			if (toUnit.equals("gram")) {
				multiplier = 5;
			}
		}
					
		return multiplier;
	}

}
