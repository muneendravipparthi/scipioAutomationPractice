package testCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageObjects.ApplicantsPage;
import pageObjects.DashboardPage;
import pageObjects.LeavesPage;
import utility.BaseClass;

public class CreateLeave extends BaseClass {
	BaseClass baseclass;
	WebDriver driver;
	DashboardPage dashboard;
	LeavesPage leavepage;
	
	@BeforeClass
	public void initialization() {
		baseclass = new BaseClass();
		driver = BaseClass.driver;
		dashboard = new DashboardPage(driver);
		leavepage = new LeavesPage(driver);
	}
	
	@Test
	public void createLeaveRequest() throws InterruptedException {
		dashboard.navigateToLeaves();
		leavepage.clickNewLeaveBtn();
		Thread.sleep(5000);
		leavepage.enterUserId();
		Thread.sleep(5000);
	}
	
	
}
