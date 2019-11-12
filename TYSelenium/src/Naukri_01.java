import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Naukri_01   //closing complete browser
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		//ID of parent browser
		String parent_id = driver.getWindowHandle();
				System.out.println(parent_id);
				Set<String> all = driver.getWindowHandles();
				//to count no. of browsers
				int count = all.size();
				System.out.println(count);
				//get parent id of all browsers
				for(String b:all)
				{
					driver.switchTo().window(b);
					String title = driver.getTitle();
					System.out.println(title);
				driver.quit();
				}
	}

}
