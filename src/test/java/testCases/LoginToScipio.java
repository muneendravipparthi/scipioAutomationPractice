package testCases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageObjects.LoginPage;
import utility.BaseClass;

public class LoginToScipio extends BaseClass {
	LoginPage lp;
	
	@BeforeClass
	public void initialization() {
		lp = new LoginPage(driver);
	}
	
	
	@Test(priority = 1)
	public void loginWithValidCredintials() throws InterruptedException {	
		lp.enterUserName("admin");
		lp.enterPassword("scipio");
		lp.submitLogin();

		System.out.println("<<<<Test 1>>>>");

		Thread.sleep(3000);

		Assert.assertEquals(driver.getTitle(), "SCIPIO - Human Resources Manager: Human Resources");

	}


}
