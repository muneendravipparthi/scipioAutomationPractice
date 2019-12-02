package testCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageObjects.ApplicantsPage;
import pageObjects.DashboardPage;
import pageObjects.LoginPage;
import utility.BaseClass;

public class CreateApplicant extends BaseClass {
	DashboardPage dashpage;
	ApplicantsPage apppage;
	BaseClass baseclass;
	WebDriver driver;

	@BeforeClass
	public void initialization() {
		baseclass = new BaseClass();
		driver = BaseClass.driver;
		dashpage = new DashboardPage(driver);
		apppage = new ApplicantsPage(driver);
	}

	@Test(priority = 2)
	public void addApplicant() throws InterruptedException {
		dashpage.navigateToApplicants();
		apppage.navigateToNewEmployeeApplication();
		apppage.enterApplicationId("Input applicant Id");
		apppage.enterEmplPositionID("demo Employee ID");
		apppage.enterJobRequisitionID("Demo Job Reqisition Id");
		apppage.selectStatus("Planned For");
		Thread.sleep(30000);
	}
}
