package main;

/*
 * Lab assignment#8 Integration testing
 * 
 * Convert units related to distance froom one unit to other units
 * 
 * @author Asst.Prof. Chitsutha Soomlek, College of Computing, KKU
 * @version 1.0
 * 
 */

public class DistanceConverter {
	
	//Constructor
	public DistanceConverter() {
		
	}

	/*
	 * Convert a distance value from one unit to another unit
	 * 
	 * @parameter distanceValue = the value to convert
	 * @parameter fromUnit = the unit of the distance value, e.g, meter
	 * @parameter toUnit = the unit to convert the distance value to, e.g., kilometer
	 * @return the converted value
	 */
	public double convert(double distanceValue, String fromUnit, String toUnit) {
		double result = 0.0;
		
		result = distanceValue*getMultiplier(fromUnit, toUnit);
		
		return result;
	}
	
	
	/*
	 * Get the multiplier required during the conversion process
	 * 
	 * @parameter fromUnit = the unit of the distance value, e.g, meter
	 * @parameter toUnit = the unit to convert the distance value to, e.g., kilometer
	 * @return the multiplier that "fromUnit" needs to be multiplied to get "toUnit"
	 */
	public double getMultiplier(String fromUnit, String toUnit) {
		double multiplier = 1.0;
		
		if (fromUnit.equals("kilometer"))
		{   if (toUnit.equals("meter")) {
				multiplier = 1000;
			} else if (toUnit.equals("mile")) {
				multiplier = 0.621;
			} else if (toUnit.equals("inch")) {
				multiplier = 39370;
			}
		} else if (fromUnit.equals("meter")) {
			if (toUnit.equals("kilometer")) {
				multiplier = 1.0/1000;
			} else if (toUnit.equals("mile")) {
				multiplier = 0.621/1000;
			} else if (toUnit.equals("inch")) {
				multiplier = 39370.0/1000;
			}
		} else if (fromUnit.equals("mile")) {
			if (toUnit.equals("kilometer")) {
				multiplier = 1.609;
			} else if (toUnit.equals("meter")) {
				multiplier = 1609;
			} else if (toUnit.equals("inch")) {
				multiplier = 63360.0;
			}
		} else if (fromUnit.equals("inch")) {
			if (toUnit.equals("kilometer")) {
				multiplier = 2.54/100000;
			} else if (toUnit.equals("meter")) {
				multiplier = 2.54/1000;
			} else if (toUnit.equals("mile")) {
				multiplier = 1.0/63360;
			}
		}
		
		return multiplier;
	}
}
