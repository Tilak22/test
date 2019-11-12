package Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript 
{
	static WebDriver driver;

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("http://www.google.com");
		  driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("java");
		  driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys(Keys.ENTER);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scroll(200,500)");

	}

	

}
