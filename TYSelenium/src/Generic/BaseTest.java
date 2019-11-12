package Generic;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


public class BaseTest {

	
		@BeforeTest
		public void before()
		{
			System.out.println("Before Test");
		}

		@AfterTest
		public void after()
		{
		}
		
}


