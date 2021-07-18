package sqa;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SimpleJUnitTest {

	int results = 4;
	
	@Test
	void testFirstJUnit() {
		assertEquals(4, results);
	}
	
	@Test
	void testSecondJUnit() {
		assertEquals(4, 2*1);
	}

}
