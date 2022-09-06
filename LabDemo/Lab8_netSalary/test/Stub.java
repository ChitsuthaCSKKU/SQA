package test;

import main.DistanceConverter;

public class Stub extends DistanceConverter{
	
	//Convert from kilometer to meter
	@Override
	public double getMultiplier(String fromUnit, String toUnit) {
		return 1000.0;
	}
}
