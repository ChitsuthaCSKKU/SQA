package sqa.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

class DetailedRepeatedTest {

	@BeforeEach
	void beforeEach(TestInfo testInfo, RepetitionInfo repetitionInfo) {
		int currentRepetition = repetitionInfo.getCurrentRepetition();
		int totalRepetitions =  repetitionInfo.getTotalRepetitions();
		String methodName = testInfo.getTestMethod().get().getName();
		System.out.println(methodName + ": " + currentRepetition + "/" + totalRepetitions);
	}
	
	@RepeatedTest(5)
	@DisplayName("Repeat this test for 5 times")
	void repeatedtest(TestInfo testInfo, RepetitionInfo repetitionInfo) {
		System.out.println(testInfo.getDisplayName() + ": " + repetitionInfo.getCurrentRepetition() + " of " + repetitionInfo.getTotalRepetitions());
	}
}
