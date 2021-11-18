package com.selenium.assignment;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Q6Q7BeforeSuite {
	ChromeDriver driver;
	@BeforeSuite
	public void BeforeSuiteMethod() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\gangonik\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--disable-notifications");
		//ops.setHeadless(true);
		driver = new ChromeDriver(ops);
		
		}
	@Test(priority=1)
	public void testurl() {
		driver.get("https://opensource-demo.orangehrmlive.com");
		driver.manage().window().maximize();
		
		driver.findElementByXPath("//input[@id='txtUsername']").sendKeys("Admin");
		driver.findElementByXPath("//input[@id='txtPassword']").sendKeys("admin123");
		
		driver.findElementByXPath("//input[@id='btnLogin']").click();
		
		
		driver.close();
	}

}
