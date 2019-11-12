,,,,,,,,,,,,,,,,package Generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseTest1 
{
	public WebDriver driver;
  static
  {
	  System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	  
  }
  @BeforeMethod
  public void initialization()
  {
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("http://localhost/login.do");
	  driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	  
  }
	@AfterMethod
	public void quit()
	{
		driver.quit();
	}
		
}
