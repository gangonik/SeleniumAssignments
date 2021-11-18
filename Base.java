package com.selenium.assignment;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base {
public static ChromeDriver driver;
	
	@BeforeMethod
	public void ProjectBase() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\gangonik\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--disable-notifications");
		//ops.setHeadless(true);
		driver = new ChromeDriver(ops);
		
		driver.get("https://opensource-demo.orangehrmlive.com");
		driver.manage().window().maximize();
}
	
	
	@AfterMethod
	public void teardown() {
		driver.close();
	}


	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}


	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		
	}


	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

}
