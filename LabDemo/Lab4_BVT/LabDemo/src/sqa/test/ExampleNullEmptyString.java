package sqa.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

import sqa.main.Strings;

class ExampleNullEmptyString {
	
	//Test string using @ValueSource
	@ParameterizedTest
	@ValueSource(strings = { "wow", "mom", "madam", "no lemon, no melon", "Eva, can I see bees in a cave" })
	@DisplayName("Parindome")
	void test_ispalindromeWithValueSource(String words) {
	    assertTrue(Strings.isPalindrome(words));
	}
	
	//Test null and/or empty values using @NullSource, @EmptySource, and @NullAndEmptySource
	@ParameterizedTest
	@NullSource
	@DisplayName("Use @NullSource")
	void test_isNull_ShouldReturnTrueForNullInputs(String input) {
		assertTrue(Strings.isNull(input));
	}
	
	@ParameterizedTest
	@EmptySource
	@DisplayName("Use @EmptySource")
	void test_isEmpty_ShouldReturnTrueForEmptyInputs(String input) {
		assertTrue(Strings.isEmpty(input));
	}
	
	@ParameterizedTest
	@NullSource
	@EmptySource
	@ValueSource(strings = { " ", "   ", "\t", "\n" })
	@DisplayName("Use @NullSource and @EmptySource")
	void test_nullEmptyAndBlankStrings(String input) {
	    assertTrue(Strings.isNull(input) || Strings.isEmpty(input));
	}
	
	@ParameterizedTest
	@NullAndEmptySource
	@ValueSource(strings = { " ", "   ", "\t", "\n" })
	@DisplayName("Use @NullAndEmptySource")
	void test_nullEmptyAndBlankStrings_WithNullAndEmptySource(String input) {
	    assertTrue(Strings.isNull(input) || Strings.isEmpty(input));
	}

}