package sqa.main;

/*
 * Lab assignment#8 Integration testing
 * 
 * Convert the weight of mass from one unit to other units
 * 
 * @author Asst.Prof. Chitsutha Soomlek, College of Computing, KKU
 * @version 1.0
 * 
 */

public class MassConverter {
	
	//Constructor
	public MassConverter() {
		
	}
	
	
	/*
	 * Convert a input value from one unit to another unit
	 * 
	 * @parameter massValue = the value to convert
	 * @parameter fromUnit = the unit of the flour value, e.g, cup
	 * @parameter toUnit = the unit to convert the flour value to, e.g., gram
	 * @return the converted value
	 */
	public double convert(double massValue, String fromUnit, String toUnit) {
		double result = 0.0;
		
		result = massValue*getConversionFactor(fromUnit, toUnit);
		
		return result;
	}
	
	
	/*
	 * Get the conversion factor required during the conversion process
	 * 
	 * @parameter fromUnit = the unit of the flour value, e.g, cup
	 * @parameter toUnit = the unit to convert the flour value to, e.g., gram
	 * @return the multiplier that "fromUnit" needs to be multiplied to get "toUnit"
	 */
	public double getConversionFactor(String fromUnit, String toUnit) {
		double multiplier = 1.0;
		
		if (fromUnit.equals("cup")) {
			if (toUnit.equals("gram")) {
				multiplier = 125;
			}
		}
		else if (fromUnit.equals("tablespoon")) {
			if (toUnit.equals("gram")) {
				multiplier = 8;
			}
		}
		else if (fromUnit.equals("teaspoon")) {
			if (toUnit.equals("gram")) {
				multiplier = 3;
			}
		}
		else if (fromUnit.equals("oz")) {
			if (toUnit.equals("gram")) {
				multiplier = 28.349;
			}
		}
		else if (fromUnit.equals("pound")) {
			if (toUnit.equals("kilogram")) {
				multiplier = 0.454;
			}
		}
		else if (fromUnit.equals("gram")) {
			if (toUnit.equals("oz")) {
				multiplier = 0.035;
			}
		}
		else if (fromUnit.equals("kilogram")) {
			if (toUnit.equals("pound")) {
				multiplier = 2.205;
			}
		}
					
		return multiplier;
	}

}
