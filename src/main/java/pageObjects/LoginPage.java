package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
  
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	
	WebDriver driver;
	
	By username = By.id("field_id__1");
	By password = By.id("field_id__2");
	By submitbutton = By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Language'])[1]/following::input[4]");
	By forgotpassword = By.xpath("//*[@id=\"login\"]/div[3]/small/a");
	
	
	
	public void enterUserName(String UserName) {
		driver.findElement(username).clear();
		driver.findElement(username).sendKeys(UserName);
	}
	
	public void enterPassword(String Password) {
		driver.findElement(password).clear();
		driver.findElement(password).sendKeys(Password);
	}
	
	public void submitLogin() {
		driver.findElement(submitbutton).click();
	}
	
	public void forgotPassword() {
		driver.findElement(forgotpassword).click();
	}


}
