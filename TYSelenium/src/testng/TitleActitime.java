package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class TitleActitime 
{
static
{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	public static void main(String[] args) 
	{
		//create extenthtmlreporter object with html file path
		ExtentHtmlReporter reporter = new ExtentHtmlReporter("./report/myreport2.html");
		reporter.config().setDocumentTitle("Flash");
		reporter.config().setReportName("Barry Allen");
		reporter.config().setTheme(Theme.DARK);
		
		
		//Create Extentreports object and attach to reporter
		ExtentReports report = new ExtentReports();
		report.attachReporter(reporter);
		report.setSystemInfo("test environment", "smoke testing ");
		report.setSystemInfo("build", "1.2.3 ");
		report.setSystemInfo("Platform", "windows 8 ");
		report.setSystemInfo("Engineer", "Tilak.R ");
		ExtentTest test = report.createTest("alpha");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost/login.do");
		String atitle = driver.getTitle();
		System.out.println(atitle);
		
		String etitle = "actiTIME - Login";
		Assert.assertEquals(atitle, etitle);
		test.log(Status.PASS, "justpass");
		report.flush();
		driver.close();
		

	}

}
