package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ArgumentsProvider;
import org.junit.jupiter.params.provider.ArgumentsSource;

import test.resources.*;

class CustomArgumentTest {

	@ParameterizedTest
	@ArgumentsSource(MyArgumentsProvider.class)
	void testWithArgumentsSource(String argument) {
	    assertNotNull(argument);
	}
}
