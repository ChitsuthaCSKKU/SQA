package com.example.junit6_labdemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

class ExampleCsvFileSourceTest {

	@ParameterizedTest
	@CsvFileSource(files = "src/test/resources/thaifruitrank.csv", numLinesToSkip = 1)
	@DisplayName("Get test data from .csv file")
	void testWithCsvFileSourceFromFile(String fruit, int rank) {
	    assertNotNull(fruit);
	    assertNotEquals(0, rank);
	}
}
