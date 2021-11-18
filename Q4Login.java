package com.selenium.assignment;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Q4Login {
	ChromeDriver driver;
	
	@Test
	public void Login() {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\gangonik\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--disable-notifications");
		ops.setHeadless(true);
		driver = new ChromeDriver(ops);
		
		driver.get("https://opensource-demo.orangehrmlive.com");
		driver.manage().window().maximize();
		
		driver.findElementByXPath("//input[@id='txtUsername']").sendKeys("Admin");
		driver.findElementByXPath("//input[@id='txtPassword']").sendKeys("admin123");
		
		driver.findElementByXPath("//input[@id='btnLogin']").click();
		
		
		String text = driver.findElementByXPath("//h1[contains(text(),'Dashboard')]").getText();
		
		Assert.assertEquals(text, "Dashboard");
		
		driver.close();
		
	}

}
