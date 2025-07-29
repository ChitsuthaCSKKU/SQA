package sqa.main;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CountWordClumpsTest {

    @Test
    void testNullInput() {
        assertEquals(0, CountWordClumps.countClumps(null));
    }

    @Test
    void testEmptyArray() {
        assertEquals(0, CountWordClumps.countClumps(new int[] {}));
    }

    @Test
    void testSingleElement() {
        assertEquals(0, CountWordClumps.countClumps(new int[] {1}));
    }

    @Test
    void testTwoSameElements() {
        assertEquals(1, CountWordClumps.countClumps(new int[] {1, 1}));
    }

    @Test
    void testTwoClumps() {
        assertEquals(1, CountWordClumps.countClumps(new int[] {1, 1, 2}));
    }

    @Test
    void testMultipleClumps() {
        assertEquals(2, CountWordClumps.countClumps(new int[] {1, 1, 2, 2, 3}));
    }
    @Test
    void testNoClumps() {
		assertEquals(0, CountWordClumps.countClumps(new int[] {1, 2, 3, 4}));
	}
    @Test
	void testComplexClumps() {
		assertEquals(3, CountWordClumps.countClumps(new int[] {1, 1, 2, 2, 2, 3, 3, 4}));
	}

	@Test
	void testAllSameElements() {
		assertEquals(1, CountWordClumps.countClumps(new int[] {1, 1, 1, 1}));
	}

	@Test
	void testAlternatingElements() {
		assertEquals(0, CountWordClumps.countClumps(new int[] {1, 2, 1, 2}));
	}
	@Test
	void testLargeArrayWithClumps() {
		assertEquals(5, CountWordClumps.countClumps(new int[] {1, 1, 2, 2, 3, 3, 4, 4, 5, 5}));
	}
	@Test
	void testLargeArrayWithoutClumps() {
		assertEquals(0, CountWordClumps.countClumps(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9}));
	}
}
