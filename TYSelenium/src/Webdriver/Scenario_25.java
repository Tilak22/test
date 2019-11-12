package Webdriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenario_25 {

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
			WebElement search = driver.findElement(By.xpath("//input[@class='form-text typeahead']"));
			search.sendKeys("rings");
			WebElement button = driver.findElement(By.xpath("//input [@name='submit_search']"));
			button.click();
			WebElement gender = driver.findElement(By.xpath("//section[@id='Gender-form']"));
			Actions act = new Actions(driver);
			act.moveToElement(gender).perform();
			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
			 List<WebElement> female = driver.findElements(By.xpath("//span[@data-displayname='women']"));
			//female.click();
			System.out.println(female.size());
            driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
            driver.close();
			

	}

}
