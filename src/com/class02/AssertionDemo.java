
package com.class02;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.pages.LoginpageElements;
import com.utils.CommonMethods;

public class AssertionDemo extends CommonMethods{
	@BeforeMethod
	public void openBrowserAndNavigate() {
		setUp();

	}

	@AfterMethod
	public void quitBrowser() {
		tearDown();

	}

	@Test
	public void titleValidation() {
		String expectedTitle ="Human Management System";
		String actualTitle=driver.getTitle();
		
		// 1 way without throwing msg
		//Assert.assertEquals(actualTitle, expectedTitle);
		
		
		//2way --> you are giving msg
		Assert.assertEquals(actualTitle, expectedTitle, "Title does not match");
		//if the (hard) assertion fails, the statement after assertion  will not be executed
		System.out.println("Text after assertion");
		
	}
	
	
	@Test
	public void logoValidation() {
		LoginpageElements login = new LoginpageElements();
		boolean logoDisplayed=login.logo.isDisplayed();
		
		// 1st way
		//Assert.assertEquals(logoDisplayed, true, "Logo is not displayed");
		
		// 2sd way
		Assert.assertTrue(logoDisplayed, "Logo is not displayed");
		
	}
	
	
	
	
}