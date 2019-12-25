package utility;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestResult;

public class TakeScreenShot {
	
	static WebDriver driver;
	public TakeScreenShot(WebDriver driver) {
		TakeScreenShot.driver = (WebDriver) driver;
	}
	
	/**
	 * 
	 * Method to take screenshot on test success or failure
	 * 
	 * @param result
	 * @param status
	 */
	public static void captureScreenShot(ITestResult result, String status) {
		String destDir = "";
		String methodName = result.getMethod().getRealClass().getSimpleName() + "."
				+ result.getMethod().getMethodName();
		System.out.println("Method Name:" + methodName);
		try {
			File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			DateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy__hh_mm_ssaa");

			// If status = fail then set folder name "screenshots/Failures"
			if (status.equalsIgnoreCase("fail")) {
				destDir = "Screenshots/Failures";
			}
			// If status = pass then set folder name "screenshots/Success"
			else if (status.equalsIgnoreCase("pass")) {
				destDir = "Screenshots/Success";
			}

			// To create folder to store screenshots
			new File(destDir).mkdirs();

			// Set file name with combination of test class name + date time.
			String destFile = methodName + " - " + dateFormat.format(new Date()) + ".png";

			FileHandler.copy(scrFile, new File(destDir + "/" + destFile));
		} catch (IOException e) {
			System.out.println("Exception while taking screenshot or copying the files to destination folder:" + ""
					+ e.toString());
		}
	}
}
