package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage {
	WebDriver driver;
	public DashboardPage(WebDriver driver) {
		this.driver = driver;
	}

	By Applicants = By.linkText("Applications");
	By EmployeesOrApplicants = By.linkText("Employees/Applicants");

	public void navigateToApplicants() {
		driver.findElement(Applicants).click();
	}

}
