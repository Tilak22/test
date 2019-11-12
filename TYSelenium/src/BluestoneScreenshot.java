import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class BluestoneScreenshot {

	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("http://www.bluestone.com");
		  driver.findElement(By.xpath("//li[@class='store-block']")).click();
		  JavascriptExecutor jse = (JavascriptExecutor)driver;
		  jse.executeScript("window.scroll(0,500)");
		  List<WebElement> allmap = driver.findElements(By.xpath("//div[@class='map-wrap']"));
		  for(int i=0; i<allmap.size(); i++)
		  {
			  File src=allmap.get(i).getScreenshotAs(OutputType.FILE);
			  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			  File dst=new File("/photo/maps.System.currentTimeMillis()+.png");
			  FileUtils.copyFile(src, dst);
		  }
		  
	}

}
