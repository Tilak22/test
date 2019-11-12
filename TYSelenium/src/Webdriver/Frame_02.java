package Webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_02 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("C:/Users/TILAK%20R/Downloads/step1.html");
		WebElement box1 = driver.findElement(By.xpath("//input[@id='t2']"));
		box1.sendKeys("whats up");
		
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		WebElement f1 = driver.findElement(By.xpath("//iframe[@id='f2']"));
		//switch from page to frame
		driver.switchTo().frame(f1);
		WebElement box2 = driver.findElement(By.xpath("//input[@id='t3']"));
		box2.sendKeys("welcome");
		driver.switchTo().defaultContent();
		WebElement box01 = driver.findElement(By.xpath("//input[@id='t2']"));
		box01.clear();
		box01.sendKeys("wow");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.close();

	}

}
