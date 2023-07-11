package main;

import java.util.LinkedHashMap;  
import java.util.Map;  

public class IntegerToRomanConverter {
	
	public String integerToRoman(int num)   
	{  
		String result = "";
		
		LinkedHashMap<String, Integer> romanNumerals = new LinkedHashMap<String, Integer>();  
		//storing Roman numeral number and corresponding decimal values in HashMap  
		romanNumerals.put("M", 1000);  
		romanNumerals.put("CM", 900);  
		romanNumerals.put("D", 500);  
		romanNumerals.put("CD", 400);  
		romanNumerals.put("C", 100);  
		romanNumerals.put("XC", 90);  
		romanNumerals.put("L", 50);  
		romanNumerals.put("XL", 40);  
		romanNumerals.put("X", 10);  
		romanNumerals.put("IX", 9);  
		romanNumerals.put("V", 5);  
		romanNumerals.put("IV", 4);  
		romanNumerals.put("I", 1);  
	  
		for(Map.Entry<String, Integer> entry : romanNumerals.entrySet())  
		{  
			int matches = num/entry.getValue();  
			result = result + repeat(entry.getKey(), matches);  
			num = num % entry.getValue();  
		}  
		return result;  
	}
	
	public static String repeat(String romanNum, int decimal)   
	{  
		if(romanNum == null) {  
			return null;  
		}
		
		final StringBuilder sb = new StringBuilder();  
		
		for(int i = 0; i < decimal; i++) {  
			sb.append(romanNum);  
		}  
		//converts into string  
		return sb.toString();  
	}  
}
