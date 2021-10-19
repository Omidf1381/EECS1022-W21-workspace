package junit_tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Test;

import model.ArrayUtilities;

public class TestArrayUtilities {

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		
		int[] input = {2,3,4,5};
		int[] expected = {2,5,9,14};
		int[] result = ArrayUtilities.getIntermediateSums(input);
		assertArrayEquals(expected, result);
		
	}
}

