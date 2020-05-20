package com.class01;

import org.testng.annotations.Test;

public class TestNgDemo {
	
	// print alphabetical order 
	// step 1, 2, 3 are all one test case ---> one method is one test case
	//as package ---> calls batch execution == sequential execution
	
	@Test
	public void testOne() {
		System.out.println("Step 1");
		System.out.println("Step 2");
		System.out.println("Step 3");
	}
	
	@Test
	public void testTwo() {
		System.out.println("Test Case 2");
	}
	
	@Test
	public void testThree() {
		System.out.println("Test Case 3");
	}
	//as package ---> calls batch execution == sequential execution

}
