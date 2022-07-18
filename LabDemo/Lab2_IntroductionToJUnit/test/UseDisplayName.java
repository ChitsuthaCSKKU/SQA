package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import main.Multiplication;

class UseDisplayName {
	
	@Test
	@DisplayName("TC01: number1 = 2, number2 = 5, expected result = 10")
	void testmultiply() {
		Multiplication multiplication = new Multiplication();
		int result = multiplication.multiply(2, 5);
		
		assertEquals(10, result);
	}
	
	@Test
	@DisplayName("TC02: number = 5, expected result = 25")
	void testsquare() {
		Multiplication multiplication = new Multiplication();
		int result = multiplication.square(5);
		
		assertEquals(25, result);
	}

}
