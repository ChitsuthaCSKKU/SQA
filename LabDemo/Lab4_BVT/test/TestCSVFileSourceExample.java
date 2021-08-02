package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

class TestCSVFileSourceExample {

	@ParameterizedTest
	@CsvFileSource(files = "src/test/resources/thaifruitrank.csv", numLinesToSkip = 1)
	void testWithCsvFileSourceFromFile(String fruit, int rank) {
	    assertNotNull(fruit);
	    assertNotEquals(0, rank);
	}
}
