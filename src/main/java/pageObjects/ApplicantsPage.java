package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class ApplicantsPage {
	public ApplicantsPage(WebDriver driver) {
		this.driver = driver;
	}

	WebDriver driver;

	By NewEmployeeApplication = By.linkText("New Employment Application");
	By applicationId = By.name("applicationId");
	By emplPositionID = By.name("emplPositionId");
	By jobRequisitionID = By.name("jobRequisitionId");
	By status = By.name("statusId");
	By applyingPartyID = By.name("applyingPartyId");
	By referredByPartyID = By.name("referredByPartyId");
	By employmentAppSourceTypeID = By.name("employmentAppSourceTypeId");
	By applicationDate = By.name("applicationDate_i18n");
	By createbtn = By.id("AddEmploymentApp_submitAction");

	public void navigateToNewEmployeeApplication() {
		driver.findElement(NewEmployeeApplication).click();
	}

	public void enterApplicationId(String value) {
		driver.findElement(applicationId).sendKeys(value);
	}

	public void enterEmplPositionID(String EmplPositionID) {
		driver.findElement(emplPositionID).sendKeys(EmplPositionID);
	}

	public void enterJobRequisitionID(String JobRequisitionID) {
		driver.findElement(jobRequisitionID).sendKeys(JobRequisitionID);
	}

	public void selectStatus(String Status) {
		new Select(driver.findElement(status)).selectByVisibleText(Status);
	}
}
