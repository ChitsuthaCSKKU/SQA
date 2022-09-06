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

public class UniversalConverter {

	//Constructor
	public UniversalConverter() {
		
	}
	
	/*
	 * Convert a value from one unit to another unit
	 * 
	 * @parameter value = the value to convert
	 * @parameter choice = selected choice (what to convert)
	 * @parameter fromUnit = the unit of the value, e.g, meter
	 * @parameter toUnit = the unit to convert the value to, e.g., kilometer
	 * @return the converted value
	*/
	public double convert(double value, String choice, String fromUnit, String toUnit) {
		double result = 0.0;
		DistanceConverter distanceConverter = new DistanceConverter();
		WeightConverter weightConverter = new WeightConverter();
		TemperatureConverter tempConverter = new TemperatureConverter();
		
		if (choice.equals("Distance")) {
			result = distanceConverter.convert(value, fromUnit, toUnit);
		} else if (choice.equals("Weight")) {
			result = weightConverter.convert(value, fromUnit, toUnit);
		} else if (choice.equals("Temperature")) {
			result = tempConverter.convert(value, fromUnit, toUnit);
		}
			
		return result;
	}
	
}
