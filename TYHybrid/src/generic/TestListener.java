package generic;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class TestListener implements ITestListener
{
	ExtentHtmlReporter reporter ;
	ExtentReports report;
	ExtentTest test;

	@Override
	public void onFinish(ITestContext result) {
		report.flush();
		
	}

	@Override
	public void onStart(ITestContext result) {
		//create extenthtmlreporter object with html file path
	    reporter = new ExtentHtmlReporter("./report/myreport3.html");
		reporter.config().setDocumentTitle("Avengers");
		reporter.config().setReportName("thor");
		reporter.config().setTheme(Theme.DARK);
		
		
		//Create Extentreports object and attach to reporter
		report = new ExtentReports();
		report.attachReporter(reporter);
		report.setSystemInfo("test environment", "regression testing ");
		report.setSystemInfo("build", "1.2.3 ");
		report.setSystemInfo("Platform", "windows 7/8 ");
		report.setSystemInfo("Engineer", "Tilak.R ");
		 
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailure(ITestResult result) 
	{
		test.log(Status.FAIL, result.getTestClass().getName()+result.getMethod().getMethodName());
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		test.log(Status.SKIP, result.getTestClass().getName()+result.getMethod().getMethodName());
		
	}

	@Override
	public void onTestStart(ITestResult result) {
		test = report.createTest("alpha");
		test.log(Status.INFO, result.getTestClass().getName()+result.getMethod().getMethodName());
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		test.log(Status.PASS, result.getTestClass().getName()+result.getMethod().getMethodName());
		
	}

}
