package sqa.stub;

public class MassConverterStub extends sqa.main.MassConverter {
	@Override
	public double convert(double value, String fromUnit, String toUnit) {
		return 999.99; 
	}

}
