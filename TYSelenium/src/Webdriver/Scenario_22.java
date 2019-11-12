package Webdriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenario_22 {

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
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			WebElement search = driver.findElement(By.xpath("//input[@class='form-text typeahead']"));
			search.sendKeys("rings");
			WebElement button = driver.findElement(By.xpath("//input [@name='submit_search']"));
			button.click();
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			WebElement dt = driver.findElement(By.xpath("//section[@id='Delivery Time-form']"));
			Actions act = new Actions(driver);
			act.moveToElement((WebElement) dt).perform();
			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
			 List<WebElement> ndd = driver.findElements(By.xpath("//span[@data-displayname='next day delivery']"));
			 System.out.print("next day delivery of rings pending"+ndd.size());
			//ndd.click();
			driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
			driver.close();
	}

}
