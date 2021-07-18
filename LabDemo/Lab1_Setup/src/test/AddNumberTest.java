package lab1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AddNumberTest {
	
	@Test
	  void myFirstTest() {
	  assertEquals(4, 2 + 2);
	}

	@Test
	public void addFiveTo20() {
		int result = new AddNumber().addFive(20);
		Assertions.assertEquals(25, result);;
	}

}
