package sqa.stub;

public class TemperatureConverterStub extends sqa.main.TemperatureConverter {
	@Override
	public double convert(double tempValue, String fromUnit, String toUnit) {
        return 123.45; 
    }
}
