package Webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenario_17 
{
	static
	 {
	 System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	 
}

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		WebElement gc = driver.findElement(By.xpath("//li[@class='menuparent gold-coins']"));
		Actions act = new Actions(driver);
		act.moveToElement(gc).perform();
		
		WebElement gm = driver.findElement(By.xpath("//span[@data-p='gold-coins-weight-50gms,m']"));
		gm.click();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		WebElement a = driver.findElement(By.xpath("//h1[@class='title-5']"));
		String s = a.getText();
		if(s.equals("50 gram 24 KT Gold Coin"))
		{
			System.out.println("test case pass");
		}
		else
		{
			System.out.println("test case fail");
		}
		driver.close();


	}

}
