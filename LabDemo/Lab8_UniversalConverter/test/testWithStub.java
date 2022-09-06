package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testWithStub {

	@Test
	void testDistanceConverter() {
		Stub stub = new Stub();
		double expectedResult = 1000.0;
		assertEquals(expectedResult, stub.convert(1, "kilometer", "meter"));
	}

}
