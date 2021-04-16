package jUnitTesting2package;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Addnumber {

	@Test
	void test() {
		LabTesting junit = new LabTesting();
		int result = junit.addNumber(20, 40);
		assertEquals(60, result);
	}

}
