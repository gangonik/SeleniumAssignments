package com.selenium.assignment;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Q10ReadDBHeading {

	ChromeDriver driver;
	@Test
	public void DBHeading() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\gangonik\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--disable-notifications");
		//	ops.setHeadless(true);
		driver = new ChromeDriver(ops);

		driver.get("https://opensource-demo.orangehrmlive.com");
		driver.manage().window().maximize();
		
		driver.findElementByXPath("//input[@id='txtUsername']").sendKeys("Admin");
		driver.findElementByXPath("//input[@id='txtPassword']").sendKeys("admin123");

		driver.findElementByXPath("//input[@id='btnLogin']").click();
		String text = driver.findElementByXPath("//b[contains(text(),'Dashboard')]").getText();
		
		System.out.println("Text is "+ text);
		
		driver.close();
		
	}
}
