package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class MultipleParametersTest {

	@ParameterizedTest
	@MethodSource("stringIntAndListProvider")
	void testWithMultiArgMethodSource(String str, int num, List<String> list) {
	    assertEquals(6, str.length());
	    assertTrue(num >=1 && num <=3);
	    assertEquals(3, list.size());
	}

	static Stream<Arguments> stringIntAndListProvider() {
		return Stream.of(
			Arguments.arguments("durian", 1, Arrays.asList("regular", "premium", "export")),
			Arguments.arguments("mango", 2, Arrays.asList("m", "l", "xl")),
			Arguments.arguments("mangosteen", 3, Arrays.asList("s", "m", "l"))
	    );
	}
}
