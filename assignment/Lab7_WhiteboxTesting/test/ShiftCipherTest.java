package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.ShiftCipher;

class ShiftCipherTest {
	
	ShiftCipher cipher = new ShiftCipher();

	@Test
	void test_shift() {
		String result = cipher.shift("ABCD", 3);
		assertEquals("DEFG", result);
	}

}
