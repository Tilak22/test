package testng;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(testng.TestListener.class)
public class Userops 
{
	@Test(alwaysRun=true)
	public void login()
	{
		System.out.println("user logged in");
	}
	@Test(invocationCount=3,groups={"smoke","regression"})
  public void createUser()
 {
	System.out.println("user created"); 
	}
	@Test(priority=1,groups="regression",enabled=false)
  public void edituser()
  {
	  System.out.println("edit user");
  }
	@Test(priority=2,dependsOnMethods="edit user",groups="smoke")
  public void deleteuser()
  {
	  System.out.println("delete user");
  }

}
