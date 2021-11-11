package de.claudioaltamura.java.java12;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PatternMatchingExampleTest {

	@Test
	void test() {
		var patternMatchingExample = new PatternMatchingExample();

		Object obj = patternMatchingExample.compute();

		if (obj instanceof String) {
			// can use s directly here
			assertTrue(true);
		}

	}

}