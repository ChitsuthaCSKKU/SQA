package sqa.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class ExampleCsvSource {

	@ParameterizedTest
	@CsvSource({
	    "Durain, 1",
	    "Mangosteen, 2",
	    "'Mango, Linchee', 3",
	    "Guava, 0xF1",
	    "Custard apple,",
	    "Pomelo, 0"
	})
	@DisplayName("Use CsvSource to feed inputs")
	void testWithCsvSource(String thaifruit, int rank) {
	    assertNotNull(thaifruit);
	    assertNotEquals(0, rank);
	}

}