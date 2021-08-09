package test;

import static org.junit.jupiter.api.Assertions.*;

import java.time.temporal.ChronoUnit;
import java.util.Currency;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class ArgumentConversionTest {

	@ParameterizedTest
	@ValueSource(strings = "SECONDS")
	void testWithImplicitArgumentConversion_ChronoUnit(ChronoUnit argument) {  //Enum constant
		assertEquals("SECONDS", argument.name());
	}
	
	@ParameterizedTest
	@ValueSource(strings = "JPY")
	void testWithImplicitArgumentConversion_Currency(Currency argument) {  //Enum constant
		assertEquals("JPY", argument.toString());
	}
}
