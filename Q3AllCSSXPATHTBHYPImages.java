package com.selenium.assignment;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Q3AllCSSXPATHTBHYPImages {
	ChromeDriver driver;

	@Test
	public void GetXPathCSS() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\gangonik\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--disable-notifications");

		ops.setHeadless(true);
		driver = new ChromeDriver(ops);

		driver.get("https://opensource-demo.orangehrmlive.com");
		driver.manage().window().maximize();

		String title = driver.getTitle();
		System.out.println("Title of page OrangeHRM is " + title);

	}

}