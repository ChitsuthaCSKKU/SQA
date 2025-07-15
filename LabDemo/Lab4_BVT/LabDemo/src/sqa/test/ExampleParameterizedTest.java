package sqa.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import sqa.main.Numbers;

class ExampleParameterizedTest {

	//Test simple values using @ValueSource
	@ParameterizedTest
	@ValueSource(ints = {1, 4, 5, -3, 10, Integer.MAX_VALUE})
	@DisplayName("Test Odd Number - Use @ValueSource")
	void test_isOddNumberWithValueSource(int number) {
		 assertTrue(Numbers.isOddNumber(number));
	}
	
	@ParameterizedTest
	@ValueSource(ints = {1, 4, 5, -3, 10, Integer.MAX_VALUE})
	@DisplayName("Even number - Use @ValueSource")
	void test_isEvenNumberWithValueSource(int number) {
		assertTrue(Numbers.isEvenNumber(number));
	}
	
	@ParameterizedTest
	@ValueSource(ints = {1, 4, 5, -3, 10, Integer.MAX_VALUE})
	@DisplayName("Test Zero - Use @ValueSource")
	void test_isZeroWithValueSource(int number) {
	    assertEquals(0, number);
	}

}
