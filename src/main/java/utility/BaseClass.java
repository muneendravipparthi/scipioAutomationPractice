package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseClass {

	public static WebDriver driver = null;

	@BeforeTest
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "//BrowserDrivers//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://ce.scipioerp.com/humanres/control/main");
		driver.manage().window().maximize();
		System.out.println("========Executed Open Browser ======");
	}

	@AfterTest
	public void closeBrowser() {
		driver.quit();
	}

}
