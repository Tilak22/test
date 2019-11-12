package Webdriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart_01 
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
		List<WebElement> itemname = driver.findElements(By.xpath("//div[@class='_3wU53n']"));
		List<WebElement> Actualprice = driver.findElements(By.xpath("//div[@class='_3auQ3N _2GcJzG']"));
		List<WebElement> Discountprice = driver.findElements(By.xpath("//div[@class='_1vC4OE _2rQ-NK']"));
	List<WebElement> emioption=driver.findElements(By.xpath("//div[@class='col col-5-12 _2o7WAb']"));
	int count = itemname.size();
	for(int i=0; i<count; i++)
	{
		int count1 = Actualprice.size();
		for(int j=0; j<count1; j++)
		{
			int count2 = Discountprice.size();
			for(int k=0; j<count2; k++)
			{
				
				int count3 =emioption.size();
				for(int l=0; j<count3; k++)
				{
			if(i!=j||k==l)
			{
				System.out.println(itemname.get(i).getText());  
				System.out.println(Actualprice.get(j).getText());
				System.out.println(Discountprice.get(k).getText());
				System.out.println(emioption.get(l).getText());
			}
			
			}
		}
		
	}
	}
}
}

