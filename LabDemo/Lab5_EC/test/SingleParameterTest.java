package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class SingleParameterTest {

	@ParameterizedTest
	@MethodSource("stringThaiFruit")
	void testWithExplicitLocalMethodSource(String argument) {
	    assertNotNull(argument);
	}

	static Stream<String> stringThaiFruit() {
	    return Stream.of("durian", "mango", "mangosteen");
	}
	
	//**************************************************************
	@ParameterizedTest
	@MethodSource
	void testWithDefaultLocalMethodSource(String argument) {
	    assertNotNull(argument);
	}

	static Stream<String> testWithDefaultLocalMethodSource() {
	    return Stream.of("durian", "mango", "mangosteen");
	}	
}
