package sqa.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import sqa.main.Multiplication;

class test_MultiplicationUsingBeforeEach {

	Multiplication testMultiplication;

	@BeforeEach
	public void setUp() throws Exception {
		testMultiplication = new Multiplication();
	}
	
	@Test
	void test() {
		int output = testMultiplication.square(5);
		assertEquals(25, output);
	}
}
