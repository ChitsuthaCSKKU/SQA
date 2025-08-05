package sqa.main;

/*
 * Lab assignment#8 Integration testing
 * 
 * Converting a value between systems of measurement
 * 
 * @author Asst.Prof. Chitsutha Soomlek, College of Computing, KKU
 * @version 1.0
 * 
 */


public class CookingConversionCalculator {
	
	//Constructor
	public CookingConversionCalculator() {
			
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
		
		
		TemperatureConverter tempConverter = new TemperatureConverter();
		MassConverter massConverter = new MassConverter();
		LiquidVolumeConverter liquidConverter = new LiquidVolumeConverter();
		
		
		if (choice.equals("temperature")) {
			result = tempConverter.convert(value, fromUnit, toUnit);
		} else if (choice.equals("mass")) {
			result = massConverter.convert(value, fromUnit, toUnit);
		} else if (choice.equals("liquid")) {
			result = liquidConverter.convert(value, fromUnit, toUnit);
		} 
		
		return result;
	}

}
