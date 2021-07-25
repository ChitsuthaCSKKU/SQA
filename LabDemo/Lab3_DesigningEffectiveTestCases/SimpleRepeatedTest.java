package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

class SimpleRepeatedTest {

	@RepeatedTest(5)
	@DisplayName("Simple Repetition")
	void simplerepeatedTest() {
		System.out.println("Executing repeated test");
	}
	
	@RepeatedTest(value = 5, name = RepeatedTest.LONG_DISPLAY_NAME)
	@DisplayName("Long Display")
	void longnamerepeatedTest() {
		System.out.println("Executing repeated test with long name");
	}
	
	@RepeatedTest(value = 5, name = RepeatedTest.SHORT_DISPLAY_NAME)
	@DisplayName("Short Display")
	void shortnamerepeatedTest() {
		System.out.println("Executing repeated test with short name");
	}
	
	@RepeatedTest(value = 5, name = "{displayName} {currentRepetition}/{totalRepetitions}")
	@DisplayName("Custom Display Name")
	void customnamerepeatedTest() {
		System.out.println("Executing repeated test with custom display name");
	}


}
