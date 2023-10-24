package com.calculator.test;

import static org.junit.Assert.*;

import org.junit.Test;

public class UnitTest {

	@Test
	public void testMultiplication() {
		Dollar five = new Dollar(5);
		five.times(2);
		assertEquals(10, five.amount);
	}

}
