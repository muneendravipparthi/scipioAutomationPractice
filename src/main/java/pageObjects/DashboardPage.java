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
	By Leaves = By.linkText("Leave");

	public void navigateToApplicants() {
		driver.findElement(Applicants).click();
	}
	
	public void navigateToLeaves() {
		driver.findElement(Leaves).click();
	}

}
