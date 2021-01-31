package junit_test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import model.Grade;

class TestGrade {

	@Test
	void test() {
		String result = Grade.getLetterGrade1(63);
		assertEquals("C", result );
	}

}
