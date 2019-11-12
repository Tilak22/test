package Webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart_02 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		WebElement search = driver.findElement(By.xpath("//input[@type='text']"));
		search.sendKeys("iphone");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[@class='vh79eN']")).submit();
		for(int i=0; i<=5;i++)
		{
		String a=("//div[@class='_3wU53n']"+"[i]");
		String b=("//div[@class='_3auQ3N _2GcJzG']"+"[i]");
		String c=("//div[@class='_1vC4OE _2rQ-NK']"+"[i]");
		String d=("//div[@class='_3_G5Wj']"+"[i])");
		
		System.out.println("item name is"+ a.);
		System.out.println("Actual price is"+ b);
		System.out.println("discount price is"+ c);
		System.out.println("emi options" + d);
		}
	}

}
