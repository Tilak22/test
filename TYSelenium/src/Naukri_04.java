import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Naukri_04 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		//ID of parent browser
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		
		Set<String> all = driver.getWindowHandles();
		int count = all.size();
		System.out.println(count);
		for(String a:all)
		{
			driver.switchTo().window(a);
			String title = driver.getTitle();
			System.out.println(title);
			String Amazon=title;
			if(a==Amazon)
			{
			driver.close();
			}
			
		}
	}

}
