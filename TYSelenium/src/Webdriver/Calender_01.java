package Webdriver;

import java.time.LocalDate;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Calender_01 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://timeanddate.com");
		WebElement c = driver.findElement(By.xpath("//a[@href='/date/']"));
		Actions act = new Actions(driver);
		act.moveToElement(c).perform();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@href='/date/duration.html']")).click();
		
		LocalDate ld = LocalDate.now();
		System.out.println(ld);
		int v = ld.getDayOfMonth();
		System.out.println(v);
		String s1 = Integer.toString(v);
		WebElement date = driver.findElement(By.xpath("//input[@id='d1']"));
		date.sendKeys(s1);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		//
		 
		int v1 = ld.getMonthValue();
		System.out.println(v1);
		String s2 = Integer.toString(v1);
		WebElement month = driver.findElement(By.xpath("//input[@id='m1']"));
		month.sendKeys(s2);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		int v2 = ld.getYear();
		System.out.println(v2);
		String s3 = Integer.toString(v2);
		WebElement year = driver.findElement(By.xpath("//input[@id='y1']"));
		year.sendKeys(s3);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		LocalDate f = ld.plusDays(50);
		System.out.println(f);
		int v4 = f.getDayOfMonth();
		System.out.println(v4);
		String s4 = Integer.toString(v4);
		WebElement date1 = driver.findElement(By.xpath("//input[@id='d2']"));
		date1.sendKeys(s4);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		int v5 = f.getMonthValue();
		System.out.println(v5);
		String s5 = Integer.toString(v5);
		WebElement month1 = driver.findElement(By.xpath("//input[@id='m2']"));
		month1.sendKeys(s5);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		int v6 = f.getYear();
		System.out.println(v2);
		String s6 = Integer.toString(v6);
		WebElement year1 = driver.findElement(By.xpath("//input[@id='y2']"));
		year1.sendKeys(s6);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@id='subbut2']")).submit();
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		driver.close();
	}

}
