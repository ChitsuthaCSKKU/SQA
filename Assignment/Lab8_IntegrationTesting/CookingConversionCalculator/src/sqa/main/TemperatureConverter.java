package sqa.main;

/*
 * Lab assignment#8 Integration testing
 * 
 * Convert temperature from celsius to fahrenheit and vice versa.
 * 
 * @author Asst.Prof. Chitsutha Soomlek, College of Computing, KKU
 * @version 1.0
 * 
 */

public class TemperatureConverter {
	
	//Constructor
	public TemperatureConverter(){
		
	}
	
	/*
	 * Convert a input value from one unit to another unit
	 * 
	 * @parameter tempValue = the value to convert
	 * @parameter fromUnit = the unit of the temperature value, e.g, celsius
	 * @parameter toUnit = the unit to convert the temperature value to, e.g., fahrenheit
	 * @return the converted value
	 */
	
	public double convert(double tempValue, String fromUnit, String toUnit) {
		double result = 0.0;
		
		if (fromUnit.equals("fahrenheit")) {
			if (toUnit.equals("celsius")) {
				result = (tempValue - 32)*(5/9);
			} 
		}
		else if (fromUnit.equals("celsiusfahrenheit")) {
			if (toUnit.equals("fahrenheit")) {
				result = (tempValue*(9/5)) + 32;
			} 
		}
		
		return result;
	}
	
}
