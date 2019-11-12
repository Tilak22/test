package Webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser {

		static{
			String key="webdriver.chrome.driver";
			String value="./driver/chromedriver.exe";
			System.setProperty(key,value);
		}
		public static void main(String[] args) 
		{
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.google.com");
			String s1=driver.getTitle();
			System.out.println(s1);
			String s2=driver.getCurrentUrl();
			System.out.println(s2);
			String s3=driver.getPageSource();
			driver.close();
		}
	

}
