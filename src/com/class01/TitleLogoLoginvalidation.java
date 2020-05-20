package com.class01;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.utils.CommonMethods;
import com.utils.ConfigsReader;

public class TitleLogoLoginvalidation extends CommonMethods {
	
	@BeforeMethod
	public void openAndNavigate() throws InterruptedException {
		setUp();
		Thread.sleep(2000);
	}
	
	
	@AfterMethod
	public void quitbrowser() {
		tearDown();
	}
	
	
	@Test
	public void titleValidation() {
		String expectedTitle="Human Management System";
		String actualTitle=driver.getTitle();
		if(expectedTitle.equals(actualTitle)) {
			System.out.println("titleValidation Passed");
		}else {
			System.out.println("titleValidation failed");
		}
	}

	
	
	
	@Test
	public void logoValidation() throws InterruptedException {
		String logoPath="//div[@id='divLogo']/img";
		WebElement logo=driver.findElement(By.xpath(logoPath));
		boolean isDisplayed= logo.isDisplayed();
		if(isDisplayed) {
			System.out.println("logoValidation passed");
		}else {
			System.out.println("logoValidation failed");
		}
		Thread.sleep(2000);
	}
	
	
	
	
	
	@Test
	public void validLogin() throws InterruptedException {
		WebElement username=driver.findElement(By.id("txtUsername"));
		sendText(username, ConfigsReader.getProperty("username"));
		WebElement password=driver.findElement(By.id("txtPassword"));
		sendText(password, ConfigsReader.getProperty("password"));
		click(driver.findElement(By.id("btnLogin")));
		Thread.sleep(2000);
	}
	
	
	

}
