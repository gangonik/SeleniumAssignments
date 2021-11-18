package com.selenium.assignment;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.assertthat.selenium_shutterbug.core.Shutterbug;

public class Q13LoginandPIM extends Base {
	@Test
	public void LoginPIM() {
		driver.findElementByXPath("//input[@id='txtUsername']").sendKeys("Admin");
		driver.findElementByXPath("//input[@id='txtPassword']").sendKeys("admin123");
		driver.findElementByXPath("//input[@id='btnLogin']").click();
		
		driver.findElementByXPath("//b[contains(text(),'PIM')]").click();
		driver.findElementByXPath("//input[@id='empsearch_employee_name_empName']").sendKeys("Linda Anderson");
		driver.findElementByXPath("//input[@id='searchBtn']").click();
		
		String txt = driver.findElementByXPath("//a[contains(text(),'Anderson')]").getText();
		Assert.assertEquals(txt, "Anderson");
		
		Shutterbug.shootPage(driver).withName("AndersonPage").save();
	}

}
