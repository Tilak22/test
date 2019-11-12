package testng;

import junit.framework.Assert;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(testng.GetQuotes01.class)
public class UserOps02 
{
	@Test(alwaysRun=true)
	public void login()
	{
		System.out.println("user logged in");
	}
	@Test(invocationCount=3)
  public void createuser()
 {
	System.out.println("user created"); 
	}
	@Test(priority=1)
  public void edituser()
  {
	  System.out.println("edit user");
	  
  }
	@Test(priority=2,dependsOnMethods="edituser")
  public void deleteuser()
  {
	  System.out.println("delete user");
  }

}


