package Webdriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenario_21 
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
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement search = driver.findElement(By.xpath("//input[@class='form-text typeahead']"));
		search.sendKeys("rings");
		WebElement button = driver.findElement(By.xpath("//input [@name='submit_search']"));
		button.click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 WebElement price = driver.findElement(By.xpath("//section [@id='Price-form']"));
		 Actions act = new Actions(driver);
			act.moveToElement((WebElement) price).perform();
			//to select below 10000 rs
			WebElement sel = driver.findElement(By.xpath("//span [@data-displayname='below rs 10000']"));
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			sel.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.close();
		
	}

}
