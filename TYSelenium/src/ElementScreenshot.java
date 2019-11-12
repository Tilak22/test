import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ElementScreenshot {

	public static void main(String[] args) throws IOException, AWTException 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost/login.do");
		File src=driver.findElement(By.xpath("//img[@src='/img/default/login/timer.png?hash=1389259578']")).getScreenshotAs(OutputType.FILE);
		File dst=new File("./photo/logo.png");
		
		FileUtils.copyFile(src, dst);
		
		driver.close();

	}

}
