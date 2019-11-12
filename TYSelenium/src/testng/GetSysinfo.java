package testng;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class GetSysinfo implements ITestListener
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
			reporter = new ExtentHtmlReporter("./report/myreport5.html");
			reporter.config().setDocumentTitle("DC");
			reporter.config().setReportName("thor");
			reporter.config().setTheme(Theme.DARK);
			
			
			//Create Extentreports object and attach to reporter
			report = new ExtentReports();
			report.attachReporter(reporter);
			report.setSystemInfo("test environment", "functional testing ");
			report.setSystemInfo("build", "1.2.3 ");
			report.setSystemInfo("Platform", "windows 7/8/10 ");
			report.setSystemInfo("Engineer", "Tilak.R ");
			
		}

		@Override
		public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void onTestFailure(ITestResult result) {
			test.log(Status.FAIL, result.getTestClass().getName()+result.getMethod().getMethodName());
			
		}

		@Override
		public void onTestSkipped(ITestResult result) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void onTestStart(ITestResult result) {
			test=report.createTest(result.getTestClass().getName()+result.getMethod().getMethodName());
			test.log(Status.INFO, "started");
			
		}

		@Override
		public void onTestSuccess(ITestResult result) {
			test.log(Status.PASS, result.getTestClass().getName()+result.getMethod().getMethodName());
			
		}

	}

