package com.example.junit6_labdemo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class Test_MultiplicationUsingBeforeEach {

	Calculator calculator = new Calculator();
	
	@BeforeEach
	public void setUp() throws Exception {
		calculator = new Calculator();
	}
	
	@Test
	void test() {
		int output = calculator.square(5);
		assertEquals(25, output);
	}

}
