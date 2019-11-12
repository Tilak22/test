package Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Openactitime {

	public static void main(String[] args) 
	
		{
			String key="webdriver.chrome.driver";
			String value="./driver/chromedriver.exe";
			System.setProperty(key, value);
			WebDriver driver=new ChromeDriver();
			driver.get("http://localhost/user/submit_tt.do");
			driver.manage().window().maximize();
			String s1=driver.getTitle();
			System.out.println(s1);
			String s2=driver.getCurrentUrl();
			System.out.println(s2);
			driver.navigate().forward();
			driver.navigate().back();
			WebElement user=driver.findElement(By.id("username"));
			user.sendKeys("admin");
			WebElement user1=driver.findElement(By.name("username"));
			user1.sendKeys("manager");
			driver.findElement(By.id("loginButton")).click();
			By x = By.id(null);
			
		}

	

}
