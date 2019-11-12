package testng;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;


public class TestListener implements ITestListener
{

	@Override
	public void onFinish(ITestContext arg0) 
	{
		Reporter.log("test finished",true);
		
	}

	@Override
	public void onStart(ITestContext arg0) {
		Reporter.log("test will start",true);
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		
	}

	@Override
	public void onTestFailure(ITestResult arg0) {
		Reporter.log("test failed",true);
		
	}

	@Override
	public void onTestSkipped(ITestResult arg0) 
	{
		Reporter.log("test skipped",true);
		
	}

	@Override
	public void onTestStart(ITestResult arg0) 
	{
		Reporter.log("test started",true);
		
	}

	@Override
	public void onTestSuccess(ITestResult arg0)
	{
		Reporter.log("test success",true);
		
	}

	

	}


