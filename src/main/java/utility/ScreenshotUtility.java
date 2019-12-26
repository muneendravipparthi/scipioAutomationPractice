package utility;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ScreenshotUtility implements ITestListener {

	// This method will execute before starting of Test suite.
	public void onStart(ITestContext tr) {

	}

	// This method will execute, Once the Test suite is finished.
	public void onFinish(ITestContext tr) {

	}

	// This method will execute when the test case is passed.
	public void onTestSuccess(ITestResult tr) {
		TakeScreenShot.captureScreenShot(tr, "pass");
	}

	// This method will execute when test case fails.
	public void onTestFailure(ITestResult tr) {
		TakeScreenShot.captureScreenShot(tr, "fail");

	}

	// This method will execute before the main test start (@Test)
	public void onTestStart(ITestResult tr) {

	}

	// This method will execute only if any of the main test(@Test) get skipped
	public void onTestSkipped(ITestResult tr) {

	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult tr) {

	}

}
