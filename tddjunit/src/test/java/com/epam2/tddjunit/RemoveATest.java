package com.epam2.tddjunit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RemoveATest {
    /*TODO list for my feature
     * 
     * 1. 2 chars : AB => B - success
     * 2. 4 chars : ABCD => BCD -success
     * 3. n chars : ABCDEFGHIJ => BCDEFGHIJ - success
     * 4. 1 char : A => "" - success
     * 5. empty char : "" => ""
     */
	RemoveA removeA ;
	
	@BeforeEach
	void setUp() {
		removeA = new RemoveA();
	}
	@Test
	void test2Chars() {
		assertEquals("B", removeA.remove("AB"));
	}
	
	@Test
	void test4Chars() {
		assertEquals("BCD", removeA.remove("ABCD"));
	}
	
	@Test
	void testNChars() {
		assertEquals("BCDEFGHIJ", removeA.remove("ABCDEFGHIJ"));
	}
	
	@Test
	void test1Char() {
		assertEquals("", removeA.remove("A"));
	}
	
	@Test
	void testEmptyChar() {
		assertEquals("", removeA.remove(""));
	}

}
