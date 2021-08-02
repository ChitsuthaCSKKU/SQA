package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class TestCSVSourcesExample {

	@ParameterizedTest
	@CsvSource({
	    "Durain, 1",
	    "Mangosteen, 2",
	    "'Mango, Linchee', 3",
	    "Guava, 0xF1",
	    "Custard apple,",
	    "Pomelo, 0"
	})
	void testWithCsvSource(String thaifruit, int rank) {
	    assertNotNull(thaifruit);
	    assertNotEquals(0, rank);
	}

}
