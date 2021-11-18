package com.selenium.assignment;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(com.selenium.assignment.ListenersImplementation.class)

public class Q11Q12TestListner extends Base {
	
	@Test(retryAnalyzer = RetrySetup.class)
	public void TestListener() throws IOException {
		driver.findElementByXPath("//input[@id='txtUsername']").sendKeys("Admin");
		driver.findElementByXPath("//input[@id='txtPassword']").sendKeys("admin123");
		driver.findElementByXPath("//input[@id='btnXXXXXXLogin']").click();
		String text = driver.findElementByXPath("//h1[contains(text(),'Dashboard')]").getText();
		Assert.assertEquals(text, "Dashboard");
		
	}
	
	@Test
	public void TestListener2() throws IOException {
		driver.findElementByXPath("//input[@id='txtUsername']").sendKeys("Admin");
		driver.findElementByXPath("//input[@id='txtPassword']").sendKeys("admin123");
		driver.findElementByXPath("//input[@id='btnLogin']").click();
		String text = driver.findElementByXPath("//h1[contains(text(),'Dashboard')]").getText();
		Assert.assertEquals(text, "Dashboard");
		
	}


}
