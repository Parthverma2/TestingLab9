package jUnitTesting2package;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class addstrings {

	@Test
	void test() {
		LabTesting junitStrings = new LabTesting();
		String result = junitStrings.addStrings("Be Happy"," Always Love Life");
		assertEquals("Be Happy Always Love Life", result);
	}

}
