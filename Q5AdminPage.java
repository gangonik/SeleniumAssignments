package com.selenium.assignment;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Q5AdminPage {
	ChromeDriver driver;
	@Test
	public void TestAdmin() {
		
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
		
		driver.findElementByXPath("//b[contains(text(),'Admin')]").click();
		String um = driver.findElementByXPath("//a[@id='menu_admin_UserManagement']").getText();
		System.out.println(um);
		Assert.assertEquals(um, "User Management");
		
		driver.findElementByXPath("//a[@id='menu_admin_Job']").click();
		String job = driver.findElementByXPath("//a[@id='menu_admin_Job']").getText();
		System.out.println(job);
		Assert.assertEquals(job, "Job");
		
		
		driver.findElementByXPath("//a[@id='menu_admin_Organization']").click();
		String org = driver.findElementByXPath("//a[@id='menu_admin_Organization']").getText();
		System.out.println(org);
		Assert.assertEquals(org, "Organization");
		
		
		driver.findElementByXPath("//a[@id='menu_admin_Qualifications']").click();
		String Qua = driver.findElementByXPath("//a[@id='menu_admin_Qualifications']").getText();
		System.out.println(Qua);
		Assert.assertEquals(Qua, "Qualifications");
		
		
		driver.close();
	}
		

}
