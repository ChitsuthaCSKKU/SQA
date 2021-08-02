package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

import main.Numbers;
import main.Strings;

class ParameterizedTestSimpleExample {

	//Test simple values using @ValueSource
	@ParameterizedTest
	@ValueSource(ints = {1, 4, 5, -3, 10, Integer.MAX_VALUE})
	void test_isOddNumberWithValueSource(int number) {
	    assertTrue(Numbers.isOddNumber(number));
	}
	
	@ParameterizedTest
	@ValueSource(ints = {1, 4, 5, -3, 10, Integer.MAX_VALUE})
	void test_isEvenNumberWithValueSource(int number) {
	    assertTrue(Numbers.isEvenNumber(number));
	}
	
	@ParameterizedTest
	@ValueSource(ints = {1, 4, 5, -3, 10, Integer.MAX_VALUE})
	void test_isZeroWithValueSource(int number) {
	    assertEquals(0, number);
	}
	
	@ParameterizedTest
	@ValueSource(strings = { "wow", "mom", "madam", "no lemon, no melon", "Eva, can I see bees in a cave" })
	void test_ispalindromeWithValueSource(String words) {
	    assertTrue(Strings.isPalindrome(words));
	}
	
	//Test null and/or empty values using @NullSource, @EmptySource, and @NullAndEmptySource
	@ParameterizedTest
	@NullSource
	void test_isNull_ShouldReturnTrueForNullInputs(String input) {
	    assertTrue(Strings.isNull(input));
	}
	
	@ParameterizedTest
	@EmptySource
	void test_isEmpty_ShouldReturnTrueForEmptyInputs(String input) {
		assertTrue(Strings.isEmpty(input));
	}
	
	@ParameterizedTest
	@NullSource
	@EmptySource
	@ValueSource(strings = { " ", "   ", "\t", "\n" })
	void test_nullEmptyAndBlankStrings(String input) {
	    assertTrue(Strings.isNull(input) || Strings.isEmpty(input));
	}
	
	@ParameterizedTest
	@NullAndEmptySource
	@ValueSource(strings = { " ", "   ", "\t", "\n" })
	void test_nullEmptyAndBlankStrings_WithNullAndEmptySource(String input) {
	    assertTrue(Strings.isNull(input) || Strings.isEmpty(input));
	}
	
}
