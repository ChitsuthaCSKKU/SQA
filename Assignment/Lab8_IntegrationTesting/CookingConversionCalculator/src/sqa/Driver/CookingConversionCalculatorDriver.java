package sqa.Driver;

import sqa.main.CookingConversionCalculator;

public class CookingConversionCalculatorDriver {

	private static int pass = 0, fail = 0;

	private static void check(String name, double expected, double actual, double eps) {
	    if (Math.abs(expected - actual) <= eps) {
	        pass++;
	        System.out.println("[PASS] " + name + " expected=" + expected + " actual=" + actual);
	    } else {
	        fail++;
	        System.out.println("[FAIL] " + name + " expected=" + expected + " actual=" + actual);
	    }
	}

	public static void main(String[] args) {
	    CookingConversionCalculator calc = new CookingConversionCalculator();

	    // mass path
	    check("calc mass: 2 cup -> gram", 250.0, calc.convert(2, "mass", "cup", "gram"), 1e-2);
	    check("calc mass: 2 tablespoon -> gram", 16.0, calc.convert(2, "mass", "tablespoon", "gram"), 1e-2);

	    // liquid path
	    check("calc liquid: 1 cup -> ml", 250.0, calc.convert(1, "liquid", "cup", "ml"), 1e-2);
	    check("calc liquid: 1 oz -> ml", 29.574, calc.convert(1, "liquid", "oz", "ml"), 1e-3);

	    // temperature path
	    check("calc temp: 100 C -> F", 212.0, calc.convert(100, "temperature", "celsius", "fahrenheit"), 1e-4);
	    check("calc temp: 32 F -> C", 0.0, calc.convert(32, "temperature", "fahrenheit", "celsius"), 1e-4);

	    // invalid choice
	    check("calc invalid choice -> 0.0", 0.0, calc.convert(5, "banana", "cup", "gram"), 0.0);

	    System.out.println("CookingConversionCalculatorDriver summary: pass=" + pass + " fail=" + fail);
	    if (fail > 0) System.exit(1);
	}

}
