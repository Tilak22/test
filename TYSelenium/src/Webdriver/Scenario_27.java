package Webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario_27 
{
	static
	 {
		 System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		 
	 }
		public static void main(String[] args) 
		{
			// opening chromebrowser
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.bluestone.com");
			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
			WebElement subscribe = driver.findElement(By.xpath("//span[@class='subscribe']"));
			subscribe.click();
			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
			WebElement start = driver.findElement(By.xpath("//input[@class='btn btn-new col-xs-3']"));
			start.click();
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			driver.close();
			
		}		
}
