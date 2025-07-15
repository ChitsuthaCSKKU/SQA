package sqa.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

class ExampleCsvFileSource {

	@ParameterizedTest
	@CsvFileSource(files = "src/sqa/test/resources/thaifruitrank.csv", numLinesToSkip = 1)
	@DisplayName("Get test data from .csv file")
	void testWithCsvFileSourceFromFile(String fruit, int rank) {
	    assertNotNull(fruit);
	    assertNotEquals(0, rank);
	}
}