package sqa.Driver;

import sqa.main.MassConverter;

public class MassConverterDriver {

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
	    MassConverter m = new MassConverter();

	    check("2 cup -> gram", 250.0, m.convert(2, "cup", "gram"), 1e-2);
	    check("2 tablespoon -> gram", 16.0, m.convert(2, "tablespoon", "gram"), 1e-2);
	    check("1 oz -> gram", 28.349, m.convert(1, "oz", "gram"), 1e-3);
	    check("1 kilogram -> pound", 2.205, m.convert(1, "kilogram", "pound"), 1e-3);
	    check("invalid unit -> identity", 123.0, m.convert(123, "banana", "gram"), 1e-9);

	    System.out.println("MassConverterDriver summary: pass=" + pass + " fail=" + fail);
	    if (fail > 0) System.exit(1);
	}

}
