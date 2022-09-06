package main;

/*
 * Lab assignment#8 Integration testing
 * 
 * Convert units related to weight from one unit to other units
 * 
 * @author Asst.Prof. Chitsutha Soomlek, College of Computing, KKU
 * @version 1.0
 * 
 */

public class WeightConverter {
	
	//Constructor
	public WeightConverter() {
		
	}

	/*
	 * Convert a mass value from one unit to another unit
	 * 
	 * @parameter massValue = the value to convert
	 * @parameter fromUnit = the unit of the mass value, e.g, kilogram
	 * @parameter toUnit = the unit to convert the mass value to, e.g., lbs
	 * @return the converted value
	 */
	public double convert(double massValue, String fromUnit, String toUnit) {
		double result = 0.0;
		
		result = massValue*getMultiplier(fromUnit, toUnit);
		
		return result;
	}
	
	
	/*
	 * Get the multiplier required during the conversion process
	 * 
	 * @parameter fromUnit = the unit of the weight value, e.g, kilogram
	 * @parameter toUnit = the unit to convert the distance value to, e.g., lbs
	 * @return the multiplier that "fromUnit" needs to be multiplied to get "toUnit"
	 */
	public double getMultiplier(String fromUnit, String toUnit) {
		double multiplier = 1.0;
		
		if (fromUnit.equals("kilogram")) {
			if (toUnit.equals("gram")) {
				multiplier = 1.0/1000;
			} else if (toUnit.equals("lbs")) {
				multiplier = 2.205;
			} else if (toUnit.equals("ounce")) {
				multiplier = 35.274;
			}
		} else if (fromUnit.equals("gram")) {
			if (toUnit.equals("kilogram")) {
				multiplier = 1000;
			} else if (toUnit.equals("lbs")) {
				multiplier = 0.0022;
			} else if (toUnit.equals("ounce")) {
				multiplier = 0.035;
			}
		} else if (fromUnit.equals("lbs")) {
			if (toUnit.equals("kilogram")) {
				multiplier = 1.0/2.205;
			} else if (toUnit.equals("gram")) {
				multiplier = 1000.0/2.205;
			} else if (toUnit.equals("ounce")) {
				multiplier = 16;
			}
		} else if (fromUnit.equals("once")) {
			if (toUnit.equals("kilogram")) {
				multiplier = 1.0/35.274;
			} else if (toUnit.equals("gram")) {
				multiplier = 28.35;
			} else if (toUnit.equals("lbs")) {
				multiplier = 1.0/16;
			}
		}
		
		return multiplier;
	}
}
