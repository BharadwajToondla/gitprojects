package com.app;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestTwo {
	@BeforeClass
	public static void load() {
		System.out.println("Second One-Time Before");
	}
	@Before
	public void setUp()
	{
		System.out.println("from before");
	}
	@Test
	public void testA() {
		System.out.println("from test A");
	}
	@Test(timeout=5000)
	public void testB() {
		System.out.println("from test B");
	}
	
	@After
	public void finish() {
		System.out.println("From after");
	}
	
	@AfterClass
	public static void close()
	{
		System.out.println("one time after");
	}

}
