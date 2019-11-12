package Webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenario_18 
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
		WebElement lgc = driver.findElement(By.xpath("//span[@data-details='all-jewellery-goldcoins-lakshmi,m']"));
		Actions act1 = new Actions(driver);
		act1.moveToElement(lgc).perform();
		WebElement gm = driver.findElement(By.xpath("//span[@data-p='gold-coins-weight-2gms,m']"));
		gm.click();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		WebElement title = driver.findElement(By.xpath("//h1[@class='title-5']"));
		String s = title.getText();
		if(s.equals("2 gram 24 KT Lakshmi Gold Coin"))
				{
			System.out.println("test case pass");
				}
		else{
			System.out.println("test case fail");
			
		}
	}

}
