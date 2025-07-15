package sqa.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import java.time.Month;
import java.util.EnumSet;

class ExampleTestEnumSource {

	enum Size{S, M, L, XL;
		
		public String getSize() {
		    switch(this) {
		      case S:
		        return "small";

		      case M:
		        return "medium";

		      case L:
		        return "large";

		      case XL:
		        return "extra large";

		      default:
		        return null;
		      }
		}
	}
	
	@ParameterizedTest
	@EnumSource(Size.class)
	@DisplayName("Use @EnumSource")
	void test_getActualSize(Size size) {
		assertEquals("large", size.getSize());
	}
	
	@ParameterizedTest
	@EnumSource(value = Size.class)
	@DisplayName("Use @EnumSource with value attribute")
	void test_isAvailable(Size size) {
		assertEquals("large", size.getSize());
	}
	
	@ParameterizedTest
	@EnumSource(value = Month.class, names = {"APRIL", "JUNE", "SEPTEMBER", "NOVEMBER"})
	@DisplayName("Use @EnumSource with name attribute")
	void test_is30DaysLong(Month month) {
	    final boolean isALeapYear = false;
	    assertEquals(30, month.length(isALeapYear));
	}
	
	@ParameterizedTest
	@EnumSource(value = Month.class, names = {"FEBRUARY", "APRIL", "JUNE", "SEPTEMBER", "NOVEMBER"}, mode = EnumSource.Mode.EXCLUDE)
	@DisplayName("Use @EnumSource with name and mode attributes")
	void test_is31DaysLong(Month month) {
	    final boolean isALeapYear = false;
	    assertEquals(31, month.length(isALeapYear));
	}
	
	@ParameterizedTest
	@EnumSource(value = Month.class, names = ".+BER", mode = EnumSource.Mode.MATCH_ALL)
	@DisplayName("Use @EnumSource with regular expression")
	void test_isEndingWithBER(Month month) {
	    EnumSet<Month> months =
	      EnumSet.of(Month.SEPTEMBER, Month.OCTOBER, Month.NOVEMBER, Month.DECEMBER);
	    assertTrue(months.contains(month));
	}
	
}
