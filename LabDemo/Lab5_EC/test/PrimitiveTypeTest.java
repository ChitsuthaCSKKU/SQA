package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.IntStream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class PrimitiveTypeTest {

	@ParameterizedTest
	@MethodSource("range")
	void testWithRangeMethodSource(int argument) {
	    assertNotEquals(9, argument);
	}

	static IntStream range() {
	    return IntStream.range(0, 30).skip(10);
	}
}
