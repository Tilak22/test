import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class CompleteScreenshot {

	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost/login.do");
		
		//take screenshot
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		//create source and destination file
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dst=new File("./photo/screenshot.png");
		
		//copy src to dst to write to storage
		FileUtils.copyFile(src, dst);
		driver.close();
		

	}

}
