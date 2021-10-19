package junit_tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Test;

import model.Member;

public class TestMember {

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test_Member_01() {
		Member member1 = new Member();
		Member member2 = new Member();
		assertEquals(false, member1== member2);
	}
	public void test_Member_02() {
		Member member1 = new Member();
		Member member2 = new Member();
		assertEquals(false, member1 != member2);
	}
}
