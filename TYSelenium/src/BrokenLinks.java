import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class BrokenLinks 
{
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/cromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		driver.findElement(By.name("q")).sendKeys("java",Keys.ENTER);
		
		//get the list of links
		Thread.sleep(3000);
		 List<WebElement> links = driver.findElements(By.tagName("a"));

	}

}
