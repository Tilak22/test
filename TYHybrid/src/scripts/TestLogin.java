package scripts;

import generic.BaseTest;

import org.testng.annotations.Test;

import pages.LoginPage;

public class TestLogin extends BaseTest
{
	@Test
	public void login()
	{
		LoginPage ln = new LoginPage(driver);
		ln.enterusername();
		ln.enterpassword();
		//ln.clicklogin();
		driver.close();
		
	}

}
