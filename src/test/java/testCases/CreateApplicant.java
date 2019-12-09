package testCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageObjects.ApplicantsPage;
import pageObjects.DashboardPage;
import pageObjects.LoginPage;
import utility.BaseClass;
import utility.ExcelDataRead;

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

	@Test(priority = 2, dataProvider = "testDataProvide",dataProviderClass = ExcelDataRead.class)
	public void addApplicant(String ApplicantId, String EmployID, String JObReqId, String Status) throws InterruptedException {
		dashpage.navigateToApplicants();
		apppage.navigateToNewEmployeeApplication();
		apppage.enterApplicationId(ApplicantId);
		apppage.enterEmplPositionID(EmployID);
		apppage.enterJobRequisitionID(JObReqId);
		apppage.selectStatus(Status);
		Thread.sleep(30000);
	}
}
