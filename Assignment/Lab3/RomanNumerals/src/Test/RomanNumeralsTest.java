package Test;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class RomanNumeralsTest {

    RomanNumerals converter = new RomanNumerals();

    // 1. Positive Test Scenarios

    // 1) Single digit เช่น I = 1, V = 5
    @Test
    void testSingleDigit() {
        assertEquals(1, converter.convertRomanNumToInt("I"));
        assertEquals(5, converter.convertRomanNumToInt("V"));
    }

    // 2) Two digits – first smaller than second เช่น IV = 4, IX = 9
    @Test
    void testTwoDigits_Subtractive() {
        assertEquals(4, converter.convertRomanNumToInt("IV"));
        assertEquals(9, converter.convertRomanNumToInt("IX"));
    }

    // 3) Two digits – first larger than second เช่น VI = 6, CI = 101
    @Test
    void testTwoDigits_Additive() {
        assertEquals(6, converter.convertRomanNumToInt("VI"));
        assertEquals(101, converter.convertRomanNumToInt("CI"));
    }

    // 4) Two digits – same number เช่น II = 2, XX = 20
    @Test
    void testTwoDigits_Same() {
        assertEquals(2, converter.convertRomanNumToInt("II"));
        assertEquals(20, converter.convertRomanNumToInt("XX"));
    }

    // 5) Multiple digits – same number เช่น III = 3, XXX = 30
    @Test
    void testMultipleDigits_Same() {
        assertEquals(3, converter.convertRomanNumToInt("III"));
        assertEquals(30, converter.convertRomanNumToInt("XXX"));
    }

    // 6) Multiple digits – first digit is larger than the rest เช่น XXVI = 26, XXVII = 27, LXVII = 67
    @Test
    void testMultipleDigits_FirstLargerThanRest() {
        assertEquals(26, converter.convertRomanNumToInt("XXVI"));
        assertEquals(27, converter.convertRomanNumToInt("XXVII"));
        assertEquals(67, converter.convertRomanNumToInt("LXVII"));
    }

    // 7) Multiple digits – first digit is largest, rest are mix of (2), (3), (4)
    // เช่น LXXIV = 74, LXXVI = 76, LXXVIII = 78, LXXXIV = 84
    @Test
    void testMultipleDigits_Combination() {
        assertEquals(74, converter.convertRomanNumToInt("LXXIV"));
        assertEquals(76, converter.convertRomanNumToInt("LXXVI"));
        assertEquals(78, converter.convertRomanNumToInt("LXXVIII"));
        assertEquals(84, converter.convertRomanNumToInt("LXXXIV"));
    }

    // 2. Negative Test Scenarios

    // 1) Not a Roman numeral number เช่น J, K
    @Test
    void testInvalidCharacters() {
    	
        //assertThrows(NullPointerException.class, () -> converter.convertRomanNumToInt("J"));
        //assertThrows(NullPointerException.class, () -> converter.convertRomanNumToInt("K"));
    	
    	assertThrows(IllegalArgumentException.class, () -> converter.convertRomanNumToInt("J"));
    	assertThrows(IllegalArgumentException.class, () -> converter.convertRomanNumToInt("K"));

    }

    // 2) Using wrong repeating digits เช่น VV != 10, LL != 100
    @Test
    void testWrongRepeatingDigits() {
        assertNotEquals(10, converter.convertRomanNumToInt("VV"));
        assertNotEquals(100, converter.convertRomanNumToInt("LL"));
    }

    // 3) Using more than three repeating roman numerals เช่น XXXX != 40, IIII != 4
    @Test
    void testTooManyRepeats() {
        assertNotEquals(40, converter.convertRomanNumToInt("XXXX"));
        assertNotEquals(4, converter.convertRomanNumToInt("IIII"));
    }
}
