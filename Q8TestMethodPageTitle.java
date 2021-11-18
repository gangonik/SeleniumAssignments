package com.selenium.assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Q8TestMethodPageTitle {
	ChromeDriver driver;

	@BeforeMethod
	public void LaunchBrw() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\gangonik\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--disable-notifications");
		// ops.setHeadless(true);
		driver = new ChromeDriver(ops);
	}

	@Test(priority = 1)
	public void TestMethodTitleAdmin() {
		driver.get("https://opensource-demo.orangehrmlive.com");
		driver.manage().window().maximize();
		driver.findElementByXPath("//input[@id='txtUsername']").sendKeys("Admin");
		driver.findElementByXPath("//input[@id='txtPassword']").sendKeys("admin123");

		driver.findElementByXPath("//input[@id='btnLogin']").click();
		driver.findElementByXPath("//b[contains(text(),'Admin')]").click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String title = driver.getTitle();
		System.out.println("Title of page Admin is " + title);
	}

	@Test(priority = 5)
	public void TestMethodTitlePIM() {
		driver.get("https://opensource-demo.orangehrmlive.com");
		driver.manage().window().maximize();
		driver.findElementByXPath("//input[@id='txtUsername']").sendKeys("Admin");
		driver.findElementByXPath("//input[@id='txtPassword']").sendKeys("admin123");

		driver.findElementByXPath("//input[@id='btnLogin']").click();
		driver.findElementByXPath("//b[contains(text(),'PIM')]").click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String title = driver.getTitle();
		System.out.println("Title of page  PIM is  " + title);
	}

	@Test(priority = 6)
	public void TestMethodTitleLeave() {
		driver.get("https://opensource-demo.orangehrmlive.com");
		driver.manage().window().maximize();
		driver.findElementByXPath("//input[@id='txtUsername']").sendKeys("Admin");
		driver.findElementByXPath("//input[@id='txtPassword']").sendKeys("admin123");

		driver.findElementByXPath("//input[@id='btnLogin']").click();
		driver.findElementByXPath("//b[contains(text(),'Leave')]").click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String title = driver.getTitle();
		System.out.println("Title of page Leave  is " + title);
	}

	@Test(priority = 2)
	public void TestMethodTitleDashboard() {
		driver.get("https://opensource-demo.orangehrmlive.com");
		driver.manage().window().maximize();
		driver.findElementByXPath("//input[@id='txtUsername']").sendKeys("Admin");
		driver.findElementByXPath("//input[@id='txtPassword']").sendKeys("admin123");

		driver.findElementByXPath("//input[@id='btnLogin']").click();
		driver.findElementByXPath("//b[contains(text(),'Dashboard')]").click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String title = driver.getTitle();
		System.out.println("Title of page DB  is " + title);
	}

	@Test(priority = 3)
	public void TestMethodTitleDirectory() {
		driver.get("https://opensource-demo.orangehrmlive.com");
		driver.manage().window().maximize();
		driver.findElementByXPath("//input[@id='txtUsername']").sendKeys("Admin");
		driver.findElementByXPath("//input[@id='txtPassword']").sendKeys("admin123");

		driver.findElementByXPath("//input[@id='btnLogin']").click();
		driver.findElementByXPath("//b[contains(text(),'Directory')]").click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String title = driver.getTitle();
		System.out.println("Title of page Directory is " + title);
	}

	@Test(priority = 4)
	public void TestMethodTitleMaintanence() {
		driver.get("https://opensource-demo.orangehrmlive.com");
		driver.manage().window().maximize();
		driver.findElementByXPath("//input[@id='txtUsername']").sendKeys("Admin");
		driver.findElementByXPath("//input[@id='txtPassword']").sendKeys("admin123");

		driver.findElementByXPath("//input[@id='btnLogin']").click();
		driver.findElementByXPath("//b[contains(text(),'Maintenance')]").click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String title = driver.getTitle();
		System.out.println("Title of page Maintenance is " + title);
	}

	@AfterMethod
	public void TearDown() {
		driver.close();
	}

}
