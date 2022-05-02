package com.zensar;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ArithmeticTest {
	
	Arithmetic arithmetic = null;
	@BeforeClass
	public static void beforeClass() {
		System.out.println("Inside beforeClass()");
	}
	@Before
	public void before() {
		this.arithmetic = new Arithmetic();
		
	}
	@After
	public void after() {
		this.arithmetic = null;
	}
	@AfterClass
	public static void afterClass() {
		System.out.println("Inside afterClass()");
	}

	@Test
	public void testAdd() {
		assertEquals(arithmetic.add(5,  10), 15);
	}
	@Test
	public void testAdd2() {
		assertEquals(arithmetic.add(50,  20), 70);
	}
	@Test
	public void testDivide() {
		assertEquals(arithmetic.divide(50,  10), 5);
	}
}
