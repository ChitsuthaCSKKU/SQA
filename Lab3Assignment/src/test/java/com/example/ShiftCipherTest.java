package com.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ShiftCipherTest {
	
	private ShiftCipher cipher;
	

	
	
	@Test
    void TC01() {
		cipher = new ShiftCipher();
        String message = "SOFTWARE";
        int key = 3;
        
        String result = cipher.shift(message, key);
        assertEquals("ZVMADHYL", result);
    }
	
	@Test
    void TC02() {
		cipher = new ShiftCipher();
        String message = "software";
        int key = 3;
        
        String result = cipher.shift(message, key);
        assertEquals("zvmadhyl", result);
    }

    @Test
    void TC03() {
    	cipher = new ShiftCipher();
        String message = "AGENT67";
        int key = 3;
        
        String result = cipher.shift(message, key);
        assertEquals("DJHQW67", result);
    }
    
    @Test
    void TC04() {
    	cipher = new ShiftCipher();
        String message = "XYZ";
        int key = 3;
        
        String result = cipher.shift(message, key);
        assertEquals("ABC", result);
    }
}
