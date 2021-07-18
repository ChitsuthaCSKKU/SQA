package labdemo;

/* 18 July 2021
Demo class to be used in Lab#2
Roman numerals employ letters to represent numbers.
To convert a Roman-numerals input to its corresponding number, the program takes string and convert the string
to an integer value.
*/

import java.util.HashMap;
import java.util.Map;

public class RomanNumerals {
	private static Map<Character, Integer> map;
	
	static {
		map = new HashMap<>();
		map.put('I', 1);			//I = 1
		map.put('V', 5);			//V = 5
		map.put('X', 10);			//X = 10
		map.put('L', 50);			//L = 50
		map.put('C', 100);			//C= 100
		map.put('D', 500);			//D = 500
		map.put('M', 1000);			//M = 1000		
	}

	//This method takes a Roman-numeral value, then, converts it to the correponding integer 
	public int convertRomanNumToInt(String romanNumber)
	{	int convertedNumber = 0;
		int inputLength = romanNumber.length();
		
		for (int i = 0; i < inputLength; i++)
		{	int currentNumber = map.get(romanNumber.charAt(i));		//map current character to number
			int nextNumber = i+1 < inputLength ? map.get(romanNumber.charAt(i+1)) : 0;	//get the adjacent character
			
			if (currentNumber > nextNumber) 
			{	convertedNumber += currentNumber;
				
			} else {
				convertedNumber -= currentNumber;
			}
						
		}
	
		return convertedNumber;
		
	}
}
