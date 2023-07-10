package main;

public class Converter {

	public static void main(String[] args) {
		IntegerToRomanConverter integerToRoman = new IntegerToRomanConverter();
		
		int n = 9;
		String roman = integerToRoman.integerToRoman(n);
		System.out.println("Integer is: " + n);
		System.out.println("Roman numbers are: " + roman);
	}
}
