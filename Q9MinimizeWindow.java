package com.selenium.assignment;

import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Q9MinimizeWindow {
	static ChromeDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\gangonik\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--disable-notifications");

		driver = new ChromeDriver(ops);

		driver.get("https://opensource-demo.orangehrmlive.com");
		driver.manage().window().maximize();
		Point p = new Point(0, 3000);

		driver.manage().window().setPosition(p);
		Thread.sleep(10000);
		driver.close();
	}

}
