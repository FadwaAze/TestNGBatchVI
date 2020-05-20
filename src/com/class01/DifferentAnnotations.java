package com.class01;

import org.testng.annotations.*;

public class DifferentAnnotations {
	/*
	 * run logically 
	 * beforeMethod runs before real test
	 * then real test case
	 * then after method run 
	 * Before Suite
      * Before Class
       *Before Method
       *Actual Test is running.....
       *After Class
       *After Method
	 */
	
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method");
	}
	
	
	@AfterMethod
	public void aftermethod() {
		System.out.println("After Method");
	}
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before Suite");
	}
	
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("After Suite");
	}
	
	@Test 
	public void test() {
		System.out.println("Actual Test is running.....");
		
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class");
	}
	
	
	@AfterMethod
	public void afterClass() {
		System.out.println("After Class");
	}
	
	
	
	

}
