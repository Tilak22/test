package generic;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
@Listeners(generic.TestListener.class)
public class BaseTest implements IAUTOCONSTANTS
{
	public WebDriver driver;
	  static
	  {
		  WebDriverManager.chromedriver().setup();
//		  System.setProperty("CHROME_KEY","CHROME_VALUE");
//		  System.setProperty("GECKO_KEY","GECKO_VALUE");
		  
	  }
	  @BeforeMethod
	  public void initialization()
	  {
//		  driver=new ChromeDriver();
//		  driver.manage().window().maximize();
//		  driver.get(URL);
//		  driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		  
	  }
		@AfterMethod
		public void quit() throws InterruptedException
		{
//			Thread.sleep(IMPLICITTIMEOUT);
//			driver.quit();
		}
}
