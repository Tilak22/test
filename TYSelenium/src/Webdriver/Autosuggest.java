package Webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggest {

	public static void main(String[] args)
	{
		String key="webdriver.chrome.driver";
		String value="./driver/chromedriver.exe";
		System.setProperty(key, value);
		WebDriver driver=new ChromeDriver();
		List<WebElement> ele = driver.findElements(By.name("q"));
		ele.sendKeys("java");
		String w1 = ele.getText();

	}

}
