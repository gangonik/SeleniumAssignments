package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class StepDefinition2  {
	public ChromeDriver driver;


	@Given("^Open OrangeHRP Url$")
	public void open_OrangeHRP_Url() throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\gangonik\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--disable-notifications");
		//ops.setHeadless(true);
		driver = new ChromeDriver(ops);

		driver.get("https://opensource-demo.orangehrmlive.com");
		driver.manage().window().maximize();
	}

	@Then("^Login to Orange Portal$")
	public void login_to_Orange_Portal() throws Throwable {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementByXPath("//input[@id='txtUsername']").sendKeys("Admin");
		driver.findElementByXPath("//input[@id='txtPassword']").sendKeys("admin123");
		driver.findElementByXPath("//input[@id='btnLogin']").click();
	}

		@Given("^Click on Admin Link$")
		public void click_on_Admin_Link() throws Throwable {
			driver.findElementByXPath("//b[contains(text(),'Admin')]").click();
			Thread.sleep(3000);
		}

		@Then("^Click on Job$")
		public void click_on_Job() throws Throwable {
			driver.findElementByXPath("//a[@id='menu_admin_Job']").click();

		}

		@Then("^validate text Job Title$")
		public void validate_text_Job_Title() throws Throwable {
			driver.findElementByLinkText("Job Titles").click();;
			String text = driver.findElementByXPath("//h1[contains(text(),'Job Titles')]").getText();
			System.out.println(text);
		}
	}
