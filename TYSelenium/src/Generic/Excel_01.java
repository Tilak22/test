package Generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.usermodel.Row.MissingCellPolicy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Excel_01 
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException 
	{
		String path = ("./data/input.xlsx");
		FileInputStream file = new FileInputStream(path);
		Workbook wb = WorkbookFactory.create(file);
		
          Object row= null;
          Object cell = null;
           //to fetch all rows and columns
           for(int i=0; i<=s.getLastRowNum()+1;i++)
           {
        	    Row a = s.getRow(i);
        	    System.out.println(a);
        	    if(a==null)
        	    
        	    	a=s.createRow(i);
        	    for(int j=0;j<a.getLastCellNum();j++)
   			 {
   				 String val = a.getCell(j, MissingCellPolicy.CREATE_NULL_AS_BLANK).toString();
   				 System.out.println(val+"\t");
        	    
           }
           System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("http://localhost/login.do");
			driver.manage().window().maximize();
			WebElement user=driver.findElement(By.id("username"));
			user.sendKeys();
			Thread.sleep(3000);
			WebElement pass=driver.findElement(By.name("pwd"));
			pass.sendKeys();
			Thread.sleep(3000);
			driver.findElement(By.id("loginButton")).click();
			if(s.equals("Username or Password is invalid. Please try again."))
			{
		System.out.println("test case pass");
			}
	else{
		System.out.println("test case fail");
	}
		
			
			
           
	}

}

