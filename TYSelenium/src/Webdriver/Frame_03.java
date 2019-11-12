package Webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_03 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("C:/Users/TILAK%20R/Downloads/step2.html");
		WebElement box1 = driver.findElement(By.xpath("//input[@id='t3']"));
		box1.sendKeys("gone in 60 seconds");
		Thread.sleep(4000);
		//driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.close();

	}

}
