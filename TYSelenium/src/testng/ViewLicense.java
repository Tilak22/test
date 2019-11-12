package testng;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

public class ViewLicense
{
	@Test
	public void gettext() throws Exception
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost/login.do");
		
		driver.findElement(By.xpath("//a[@id='licenseLink']")).click();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		Set<String> all = driver.getWindowHandles();
		for(String b:all)
		{
			driver.switchTo().window(b);
		
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			jse.executeScript("window.scrollBy(0,1000)");
		}
		    WebElement ele = driver.findElement(By.xpath("//p[5]"));
		    String txt = ele.getText();
		    String[] ch = txt.split("\"");
		    int row=0;
		     for(String c:ch)
		     {
		    	 if(!(c.startsWith(")")||c.endsWith("(")))
		    	 {
		    		 System.out.println(c);
		    		 writeXL(row++,c);
		    	 }
		     }
		     }
		     private void writeXL(int row, String value) throws Exception 
		     {
		    String path=("./data/input.xlsx");
			FileInputStream file = new FileInputStream(path);
			Workbook wb = WorkbookFactory.create(file);
			wb.getSheet("Sheet3").createRow(row).createCell(0).setCellValue(value);
			wb.write(new FileOutputStream(path));
			
		
		
		}
	}


	

