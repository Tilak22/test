import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class BrokenLinks01 
{
	

public static void main(String[] args) throws InterruptedException, IOException 
{
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("http://www.google.com");
	driver.findElement(By.name("q")).sendKeys("java",Keys.ENTER);
	
	//get the list of links
	Thread.sleep(3000);
	 List<WebElement> links = driver.findElements(By.tagName("a"));
	 
	 //check if link is broken
	 int count=0;
	 for(WebElement link:links){
		 String href = link.getAttribute("href");
				 if(href!=null)
				 {
					 URL url = new URL(href);
					 HttpURLConnection connection = (HttpURLConnection)(url.openConnection());
					 int respcode = connection.getResponseCode();
					 
					 if(respcode==200)
					 {
						 System.out.println(++count+"."+respcode+" ");
						 System.out.println(connection.getResponseMessage());
						 System.out.println("Link is active");
					 }
				 else{
					 System.out.println(++count+"."+respcode+" ");
				 System.out.println(connection.getResponseMessage());
				 System.out.println("Link is broken");
					 
				     }
	           }
         }
     driver.close();
    }
}
