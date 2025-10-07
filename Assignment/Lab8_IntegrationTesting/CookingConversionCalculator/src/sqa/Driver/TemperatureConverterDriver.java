package sqa.Driver;

import sqa.main.TemperatureConverter;

public class TemperatureConverterDriver {

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
	    TemperatureConverter t = new TemperatureConverter();

	    check("100 C -> F", 212.0, t.convert(100, "celsius", "fahrenheit"), 1e-4);
	    check("32 F -> C", 0.0, t.convert(32, "fahrenheit", "celsius"), 1e-4);
	    check("0 C -> F", 32.0, t.convert(0, "celsius", "fahrenheit"), 1e-4);
	    check("212 F -> C", 100.0, t.convert(212, "fahrenheit", "celsius"), 1e-4);

	    System.out.println("TemperatureConverterDriver summary: pass=" + pass + " fail=" + fail);
	    if (fail > 0) System.exit(1);
	}

}
