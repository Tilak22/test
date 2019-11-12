package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage
{
	@FindBy(id="username")
	private WebElement username;
	@FindBy(name="pwd")
	private WebElement password;
	@FindBy(id="loginButton")
	private WebElement loginbutton;
	@FindBy(xpath="//span[contains(text(),'invalid')]")
	private WebElement error;
	public void enterusername()
	{
		username.sendKeys("admin");
	}
	public void enterpassword()
	{
		password.sendKeys("manager");
	}
	public void login()
	{
		loginbutton.click();
	}
	public String err()
	{
		System.out.println(error.getText());
	       return error.getText();
		
	}
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
}


