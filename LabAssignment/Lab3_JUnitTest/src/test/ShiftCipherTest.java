import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ShiftCipherTest {
	
	private ShiftCipher cipher;
	
	@BeforeEach
    void setUp() {
        cipher = new ShiftCipher();
    }
	
	
	@Test
    void TC01() {

        String message = "SOFTWARE";
        int key = 3;
        
        String result = cipher.shift(message, key);
        assertEquals("VRIWZDUH", result, "TC01 Failed: Uppercase string not shifted correctly.");
    }
	
	@Test
    void TC02() {

        String message = "software";
        int key = 3;
        
        String result = cipher.shift(message, key);
        assertEquals("vriwzduh", result, "TC02 Failed: Lowercase string not converted and shifted correctly.");
    }

    @Test
    void TC03() {

        String message = "Agent67";
        int key = 3;
        
        String result = cipher.shift(message, key);
        assertEquals("DJHQW007", result, "TC03 Failed: Numbers were modified or case conversion failed.");
    }
    
    @Test
    void TC04() {
        // Arrange
        String message = null;
        int key = 3;
        
        assertThrows(IllegalArgumentException.class, () -> {
            cipher.shift(message, key);
        }, "TC04 Failed: Expected IllegalArgumentException for null message.");
    }

}
