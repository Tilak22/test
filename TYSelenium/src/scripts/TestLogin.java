package scripts;

import org.junit.Assert;
import org.testng.annotations.Test;

import Generic.BaseTest1;
import pages.LoginPage;

public class TestLogin extends BaseTest1
{
@Test
public void checklogin()
{
	LoginPage ln = new LoginPage(driver);
	ln.enterusername();
	ln.enterpassword();
	ln.login();
	Assert.assertEquals(ln.err(), "Username or Password is invalid. Please try again.");
	String str = ln.err();
	System.out.println(str);
}
}
