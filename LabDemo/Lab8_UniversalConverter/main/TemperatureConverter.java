package main;

/*
 * Lab assignment#8 Integration testing
 * 
 * Convert units related to temperature from one unit to other units
 * 
 * @author Asst.Prof. Chitsutha Soomlek, College of Computing, KKU
 * @version 1.0
 * 
 */

public class TemperatureConverter {
	
	//Constructor
	public TemperatureConverter() {
		
	}

	/*
	 * Convert a temperature from one unit to another unit
	 * 
	 * @parameter tempValue = the value to convert
	 * @parameter fromUnit = the unit of the temperature, e.g, C
	 * @parameter toUnit = the unit to convert the temperature to, e.g., F
	 * @return the converted value
	 */
	public double convert(double tempValue, String fromUnit, String toUnit) {
		double result = 0.0;
		
		if (fromUnit.equals("C")) {
			if (toUnit.equals("F")) {
				result = tempValue*(9/5)+32;
			} else if (toUnit.equals("K")) {
				result = tempValue + 273.15;
			}
		} else if (fromUnit.equals("F")) {
			if (toUnit.equals("C")) {
				result = (tempValue-32) * (5/9);
			} else if (toUnit.equals("K")) {
				result = (tempValue-32) * (5/9) + 273.15;
			}
		} else if (fromUnit.equals("K")) {
			if (toUnit.equals("C")) {
				result = tempValue - 273.15;
			} else if (toUnit.equals("F")) {
				result = (tempValue-273.15) * (9/5) + 32;
			}		
		}
		
		return result;
	}
}
