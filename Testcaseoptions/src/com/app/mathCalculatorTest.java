package com.app;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class mathCalculatorTest {
	int num1, num2;
	mathCalculator obj = new mathCalculator();

	@Before
	public void setUp() throws Exception {
		mathCalculator obj = new mathCalculator();
		num1=10;
		num2=20;
	}

	@Test
	public void testAdd() {
		assertEquals(30, obj.add(num1, num2));
	}
	
	@Ignore
	@Test
	public void testMultiply() {
		assertEquals(200, obj.multiply(num2, num1));
	}

}
