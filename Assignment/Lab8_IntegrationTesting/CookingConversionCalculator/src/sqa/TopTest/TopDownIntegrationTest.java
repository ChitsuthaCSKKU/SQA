package sqa.TopTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import sqa.main.CookingConversionCalculator;
import sqa.stub.LiquidVolumeConverterStub;
import sqa.stub.MassConverterStub;
import sqa.stub.TemperatureConverterStub;

class TopDownIntegrationTest {


	@Test
	void testTD1_Temperature_usingStub() {
	    CookingConversionCalculator calc = new CookingConversionCalculator() {
	        @Override
	        public double convert(double value, String choice, String fromUnit, String toUnit) {
	            if (choice.equals("temperature")) {
	                return new TemperatureConverterStub().convert(value, fromUnit, toUnit);
	            }
	            return super.convert(value, choice, fromUnit, toUnit);
	        }
	    };
	    double actual = calc.convert(30, "temperature", "celsius", "fahrenheit");
	    assertEquals(123.45, actual, 1e-4);
	}

	@Test
	void testTD1_Mass_usingStub() {
	    CookingConversionCalculator calc = new CookingConversionCalculator() {
	        @Override
	        public double convert(double value, String choice, String fromUnit, String toUnit) {
	            if (choice.equals("mass")) {
	                return new MassConverterStub().convert(value, fromUnit, toUnit);
	            }
	            return super.convert(value, choice, fromUnit, toUnit);
	        }
	    };
	    double actual = calc.convert(1, "mass", "cup", "gram");
	    assertEquals(999.99, actual, 1e-4);
	}

	@Test
	void testTD1_Liquid_usingStub() {
	    CookingConversionCalculator calc = new CookingConversionCalculator() {
	        @Override
	        public double convert(double value, String choice, String fromUnit, String toUnit) {
	            if (choice.equals("liquid")) {
	                return new LiquidVolumeConverterStub().convert(value, fromUnit, toUnit);
	            }
	            return super.convert(value, choice, fromUnit, toUnit);
	        }
	    };
	    double actual = calc.convert(1, "liquid", "oz", "ml");
	    assertEquals(555.55, actual, 1e-4);
	}


	@Test
	void testTD2_Temperature_real_only() {
	    CookingConversionCalculator calc = new CookingConversionCalculator() {
	        @Override
	        public double convert(double value, String choice, String fromUnit, String toUnit) {
	            if (choice.equals("mass")) {
	                return new MassConverterStub().convert(value, fromUnit, toUnit);
	            }
	            if (choice.equals("liquid")) {
	                return new LiquidVolumeConverterStub().convert(value, fromUnit, toUnit);
	            }
	            return super.convert(value, choice, fromUnit, toUnit); 
	        }
	    };
	    double actual = calc.convert(100, "temperature", "celsius", "fahrenheit");
	    assertEquals(212.0, actual, 1e-4);
	}


	@Test
	void testTD3_Mass_real_withLiquidStub() {
	    CookingConversionCalculator calc = new CookingConversionCalculator() {
	        @Override
	        public double convert(double value, String choice, String fromUnit, String toUnit) {
	            if (choice.equals("liquid")) {
	                return new LiquidVolumeConverterStub().convert(value, fromUnit, toUnit);
	            }
	            return super.convert(value, choice, fromUnit, toUnit); 
	        }
	    };
	    double actual = calc.convert(2, "mass", "tablespoon", "gram");
	    assertEquals(16.0, actual, 1e-4);
	}

	@Test
	void testTD3_Temperature_real_withLiquidStub() {
	    CookingConversionCalculator calc = new CookingConversionCalculator() {
	        @Override
	        public double convert(double value, String choice, String fromUnit, String toUnit) {
	            if (choice.equals("liquid")) {
	                return new LiquidVolumeConverterStub().convert(value, fromUnit, toUnit);
	            }
	            return super.convert(value, choice, fromUnit, toUnit);
	        }
	    };
	    double actual = calc.convert(32, "temperature", "fahrenheit", "celsius");
	    assertEquals(0.0, actual, 1e-4);
	}

	@Test
	void testTD3_Liquid_stub_stillActive() {
	    CookingConversionCalculator calc = new CookingConversionCalculator() {
	        @Override
	        public double convert(double value, String choice, String fromUnit, String toUnit) {
	            if (choice.equals("liquid")) {
	                return new LiquidVolumeConverterStub().convert(value, fromUnit, toUnit);
	            }
	            return super.convert(value, choice, fromUnit, toUnit);
	        }
	    };
	    double actual = calc.convert(1, "liquid", "oz", "ml");
	    assertEquals(555.55, actual, 1e-4);
	}


	@Test
	void testTD4_AllReal_Temperature() {
	    CookingConversionCalculator calc = new CookingConversionCalculator();
	    assertEquals(212.0, calc.convert(100, "temperature", "celsius", "fahrenheit"), 1e-4);
	}

	@Test
	void testTD4_AllReal_Mass() {
	    CookingConversionCalculator calc = new CookingConversionCalculator();
	    assertEquals(250.0, calc.convert(2, "mass", "cup", "gram"), 1e-4);
	}

	@Test
	void testTD4_AllReal_Liquid() {
	    CookingConversionCalculator calc = new CookingConversionCalculator();
	    assertEquals(29.574, calc.convert(1, "liquid", "oz", "ml"), 1e-3);
	}


	@Test
	void testInvalidChoice_returnsZero() {
	    CookingConversionCalculator calc = new CookingConversionCalculator();
	    assertEquals(0.0, calc.convert(5, "banana", "cup", "gram"), 0.0);
	}

}
