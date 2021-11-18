package com.selenium.assignment;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Q2PrintTitle {
	ChromeDriver driver;
	@Test
	public void PrintTitle() {
		try {		
			
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\gangonik\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
			ChromeOptions ops = new ChromeOptions();
			ops.addArguments("--disable-notifications");
			//ops.addArguments("--headless");
			ops.setHeadless(true);
			driver = new ChromeDriver(ops);
			
			driver.get("https://opensource-demo.orangehrmlive.com");
			driver.manage().window().maximize();
			
			String title = driver.getTitle();
			System.out.println("Title of page OrangeHRM is " + title);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			driver.close();
		}
	}

}
