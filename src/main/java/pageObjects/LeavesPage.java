package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LeavesPage {
	WebDriver driver;
	public LeavesPage(WebDriver driver) {
		this.driver = driver;
	}
	
	By newLeave = By.linkText("New Leave");
	By searchUser = By.xpath("//*[@id=\"EditEmplLeave\"]/div[1]/div/div/div/div/div[2]/div/div/div/span");
	By findbtninserchpopup = By.id("lookupSubmitButton");
	By selectuserfromlist = By.xpath("//*[@id=\"table_1\"]/tbody/tr[1]/td[1]/a");
	
	public void clickNewLeaveBtn() {
		driver.findElement(newLeave).click();
	}
	
	public void enterUserId() throws InterruptedException {
		driver.findElement(searchUser).click();
		Thread.sleep(3000);
		driver.findElement(findbtninserchpopup).click();
		Thread.sleep(3000);
		driver.findElement(selectuserfromlist).click();
	}
}
