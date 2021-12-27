package org.test;

import org.junit.*;

public  class Facebook {

	@BeforeClass
	public static void beforeclass() {
		System.out.println("Before class");
		}
	
	@AfterClass
	public static void afterclass() {
		System.out.println("After class");
	}
	
	
	@Before
	public void before() {
		System.out.println("before");
	}
	
	@After
	public void after() {
		System.out.println("after");
	}
	
	
	@Test
	public void test1() {
		
		System.out.println("test1");

	}
	
	
	
	
}
