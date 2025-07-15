package sqa.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

class SimpleRepeatedTest {

	@RepeatedTest(5)
	@DisplayName("Repeat the test for 5 times")
	void simplerepeatedtest() {
		System.out.println("This test is repeated 5 times.");
	}
	
	
	@RepeatedTest(value=5, name=RepeatedTest.LONG_DISPLAY_NAME)
	@DisplayName("Long Display Name")
	void longdisplaynameRepeatedTest() {
		System.out.println("Show long display name and repeat for 5 times.");
	}
	
	@RepeatedTest(value=5, name=RepeatedTest.SHORT_DISPLAY_NAME)
	@DisplayName("Short Display")
	void shortdisplaynameRepeatedTest() {
		System.out.println("Show short display name and repeat for 5 times.");
	}

}
