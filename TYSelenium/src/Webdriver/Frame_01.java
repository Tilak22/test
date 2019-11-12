package Webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_01 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("C:/Users/TILAK%20R/Downloads/frame.html");
		WebElement box1 = driver.findElement(By.xpath("//input[@id='t1']"));
		box1.sendKeys("hi");
		System.out.println("first input is" + box1);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		WebElement f1 = driver.findElement(By.xpath("//iframe[@id='f1']"));
		//switch from page to frame
		driver.switchTo().frame(f1);
		WebElement box2 = driver.findElement(By.xpath("//input[@id='t2']"));
		box2.sendKeys("hello");
		
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		WebElement f2 = driver.findElement(By.xpath("//iframe[@id='f2']"));
		driver.switchTo().frame(f2);
		WebElement box3 = driver.findElement(By.xpath("//input[@id='t3']"));
		box3.sendKeys("you are here");
		
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.switchTo().parentFrame();
		WebElement box02 = driver.findElement(By.xpath("//input[@id='t2']"));
		box02.clear();
		box02.sendKeys("good");
		
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.switchTo().defaultContent();
		WebElement box01 = driver.findElement(By.xpath("//input[@id='t1']"));
		box01.clear();
		box01.sendKeys("you are back");
		
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.quit();
	}

}
