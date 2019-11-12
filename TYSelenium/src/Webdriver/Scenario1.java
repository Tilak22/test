package Webdriver;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Scenario1 {

	public static void main(String[] args) 
	{
		String key="webdriver.chrome.driver";
		String value="./driver/chromedriver.exe";
		System.setProperty(key,value);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//Entering URL
		driver.get("https://www.bluestone.com");
		WebDriverWait wait = new WebDriverWait(driver,10);
		//Moving cursor to rings menu
		 WebElement ele = driver.findElement(By.xpath("//li[@class='menuparent repb'][1]"));
	   Actions act = new Actions(driver);
	act.moveToElement((WebElement) ele).perform();
	
	//selecting and clicking on the diamond ring
	 WebElement diamond = driver.findElement(By.xpath("//a[.='Diamond' and @title='Diamond Rings']"));
	 diamond.click();
	 
	 //getting price list by default
	 List<WebElement> priceList = driver.findElements(By.xpath("//span[@class='new price']"));
	 ArrayList<String> l1=new ArrayList<String>();
	 for(WebElement p1:priceList)
	 {
		 l1.add(p1.getText());
	 }
	   System.out.println("No of elements present in default price list:"+priceList.size());
	   WebElement sortBy = driver.findElement(By.xpath("//span[@class='view-by-wrap title style-outline i-right']"));
	   Actions act1 = new Actions(driver);
		act1.moveToElement((WebElement) sortBy).perform();
		WebElement sortlowhigh = driver.findElement(By.xpath("//a[@href='https://www.bluestone.com/jewellery/diamond-rings.html?sortby=pricelow']"));
		sortlowhigh.click();
	}
	
	
}

