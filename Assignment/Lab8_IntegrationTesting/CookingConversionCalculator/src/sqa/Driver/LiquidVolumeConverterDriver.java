package sqa.Driver;

import sqa.main.LiquidVolumeConverter;

public class LiquidVolumeConverterDriver {

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
	    LiquidVolumeConverter lv = new LiquidVolumeConverter();

	    check("1 cup -> ml", 250.0, lv.convert(1, "cup", "ml"), 1e-2);
	    check("1 cup -> oz", 8.0, lv.convert(1, "cup", "oz"), 1e-3);
	    check("1 oz -> ml", 29.574, lv.convert(1, "oz", "ml"), 1e-3);
	    check("1 liter -> quart", 1.057, lv.convert(1, "liter", "quart"), 1e-3);
	    check("invalid unit -> identity", 123.0, lv.convert(123, "banana", "rice"), 1e-9);

	    System.out.println("LiquidVolumeConverterDriver summary: pass=" + pass + " fail=" + fail);
	    if (fail > 0) System.exit(1);
	}

}
