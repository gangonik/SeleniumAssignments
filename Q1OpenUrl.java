package com.selenium.assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class Q1OpenUrl {
	
	public static WebDriver Browser(String Browser) {
		WebDriver driver = null;
		switch(Browser){
		case("chrome"):
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\gangonik\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
			driver = new ChromeDriver();
			ChromeOptions ops = new ChromeOptions();
			ops.addArguments("--disable-notifications");
		break;
		
		case("firefox"):
			System.setProperty("webdriver.gecko.driver", "C:\\SeleniumWorkSpace\\SeleniumWorkSpace\\SDET\\drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
			FirefoxOptions fps = new FirefoxOptions();
			fps.addArguments("--disable-notifications");
		break;
		
		case("ie"):
			System.setProperty("webdriver.ie.driver", "C:\\SeleniumWorkSpace\\SeleniumWorkSpace\\SDET\\drivers\\chromedriver.exe");
			driver = new InternetExplorerDriver();
		break;
		
		case("edge"):
			System.setProperty("webdriver.edge.driver", "C:\\SeleniumWorkSpace\\SeleniumWorkSpace\\SDET\\drivers\\msedgedriver.exe");
			driver = new InternetExplorerDriver();
		break;
		}
		return driver;
		
	}
	@Test
	public static void openurl(String browser) {
		WebDriver driver = Q1OpenUrl.Browser(browser);
		driver.get("https://opensource-demo.orangehrmlive.com");
		driver.manage().window().maximize();
		
	}

}
