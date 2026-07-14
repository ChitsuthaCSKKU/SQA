package com.example.junit6_labdemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestMultiplication {

	    //TC01: number1 = 2, number2 = 5, expected result = 10
		@Test
		void testmultiply() {
			Calculator calculator = new Calculator();
			int result = calculator.multiply(2, 5);
				
			assertEquals(10, result);
		}
			
			
		//TC02: number = 5, expected result = 25
		@Test
		void testsquare() {
			Calculator calculator = new Calculator();
			int result = calculator.square(5);
				
			assertEquals(25, result);
		}

}
