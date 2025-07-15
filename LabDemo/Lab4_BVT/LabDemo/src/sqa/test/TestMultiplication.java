package sqa.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import sqa.main.Multiplication;

class TestMultiplication {

	//TC01: number1 = 2, number2 = 5, expected result = 10
	@Test
	void testmultiply() {
		Multiplication multiplication = new Multiplication();
		int result = multiplication.multiply(2, 5);
			
		assertEquals(10, result);
	}
		
		
	//TC02: number = 5, expected result = 25
	@Test
	void testsquare() {
		Multiplication multiplication = new Multiplication();
		int result = multiplication.square(5);
			
		assertEquals(25, result);
	}
}
