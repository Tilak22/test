package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(testng.GetSysinfo.class)
public class SysInfo 
{
@Test
public void gettext() throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://localhost/login.do");
	WebElement un = driver.findElement(By.xpath("//input[@id='username']"));
	un.sendKeys("admin");
	WebElement pw = driver.findElement(By.xpath("//input[@name='pwd']"));
	pw.sendKeys("manager");
	driver.findElement(By.id("loginButton")).click();
	Thread.sleep(5000);
}
}
