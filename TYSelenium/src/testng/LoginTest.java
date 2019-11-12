package testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Generic.Actitime;
import Generic.BaseTest;

public class LoginTest extends BaseTest
{
	@Test
	public void logintoactitime() throws InterruptedException
	{
		Thread.sleep(3000);
		WebElement un = driver.findElement(By.xpath("//input[@id='username']"));
		un.sendKeys("admin");
		WebElement pw = driver.findElement(By.xpath("//input[@name='pwd']"));
		pw.sendKeys("manager");
		driver.findElement(By.id("loginButton"));
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.close();
	}

}
