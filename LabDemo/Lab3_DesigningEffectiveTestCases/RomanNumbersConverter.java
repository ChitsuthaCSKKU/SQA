package main;

/* Last modified: July 25, 2021
Lab#3 - Designing Effective Test Cases

Roman numerals employ letters to represent numbers.
To convert a Roman-numerals input to its corresponding Arabic values, the program takes string and 
convert the string to an integer value.
I = 1
V = 5
X = 10
L = 50
C = 100
D = 500
M = 1000
*/

import java.text.CharacterIterator;
import java.text.StringCharacterIterator;
import java.util.Map;

public class RomanNumbersConverter {
	private final static Map<Character, Integer> RomanToArabic = 
            Map.of('I', 1, 'V', 5, 'X', 10, 'L', 50, 'C', 100, 'D', 500, 'M', 1000);

	//This method takes a Roman-numeral value, then, converts it to the corresponding integer
	public int asArabic(String romanNum) {
        final var iterator = new StringCharacterIterator(romanNum);

        var nextValue = 0;
        var result = 0;
        for (char romanChar = iterator.last(); romanChar != CharacterIterator.DONE; romanChar = iterator.previous()) {
            var currentValue = RomanToArabic.get(romanChar);
            var isSubtractive = currentValue < nextValue;			//When the current value is smaller than the next value, subtraction is applied.
            var factor = isSubtractive ? -1 : 1;					//When the current value is larger than the next value, addition is applied.
            result += factor * currentValue;

            nextValue = currentValue;
        }

        return result;
    }
}
