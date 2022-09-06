package test;

import main.UniversalConverter;

/*
 * A driver for testing the UniveralConverter class
 * 
 * @author Asst.Prof.Chitsutha Soomlek, College of Computing, KKU
 * @version 1.0
 */

public class Driver {

	/*
	 * The entry point to the UniversalConverter class
	 * 
	 * @parameter args = command-line arguments
	 */
	
	public static void main(String[] args)
	{
		double originalValue = 10.0;
		double convertedValue = 0.0;	//results of the universal converter
		String selectedChoice = "Distance";
		String from = "kilometer";
		String to = "meter";
		
		UniversalConverter converter = new UniversalConverter();
		
		convertedValue = converter.convert(originalValue, selectedChoice, from, to);
		System.out.println(originalValue + " " + from + " = " + convertedValue + " " + to);
	}
	
}
