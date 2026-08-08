package sqa.test;

import sqa.main.DistanceConverter;

/*
 * A stub for testing the UniveralConverter class
 * 
 * @author Asst.Prof.Chitsutha Soomlek, College of Computing, KKU
 * @version 1.1
 */

public class Stub extends DistanceConverter{
	
	//Convert from kilometer to meter
	@Override
	public double getMultiplier(String fromUnit, String toUnit) {
		return 1000.0;
	}
}