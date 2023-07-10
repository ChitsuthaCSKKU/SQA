package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import main.Multiplication;

class UseBeforeEach {

	Multiplication multiplication;
	
	@BeforeEach
	void setUp() {
		multiplication = new Multiplication();
	}

	@Test
	@DisplayName("TC01: number1 = 2, number2 = 5, expected result = 10")
	void testmultiply() {
		int result = multiplication.multiply(2, 5);
		
		assertEquals(10, result);
	}
	
	//@Disabled
	@Test
	@DisplayName("TC02: number = 5, expected result = 25")
	void testsquare() {
		int result = multiplication.square(5);
		
		assertEquals(25, result);
	}


}
