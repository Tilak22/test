package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(testng.GetQuotes01.class)
public class LicenseAggr 
{
@Test
public void gettext()
{
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://localhost/login.do");
	driver.findElement(By.xpath("//input[@class='licenseLink']")).click();
	
	String parent = driver.getWindowHandle();
}
}
