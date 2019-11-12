package scripts;

import java.io.IOException;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.FWUtils;

public class TestExcel extends BaseTest
{

	@Test
	public void writexl() throws IOException
	{
		FWUtils.writeexcel(XLDATA, "Sheet1", 0, 0, "username");
		FWUtils.writeexcel(XLDATA, "Sheet1", 0, 1, "password");
		FWUtils.writeexcel(XLDATA, "Sheet1", 1, 0, "admin");
		FWUtils.writeexcel(XLDATA, "Sheet1", 1, 1, " ");
		FWUtils.writeexcel(XLDATA, "Sheet1", 2, 0, "admin");
		FWUtils.writeexcel(XLDATA, "Sheet1", 2, 1, "manager");
		
	}
	@Test
	public void readxl() throws Exception
	{
		
	for(int i=0; i<3;i++)
	{
		String one = FWUtils.readexcel(XLDATA, "Sheet1", i, 0);
		String two = FWUtils.readexcel(XLDATA, "Sheet1", i, 1);
		System.out.println(one+"\t"+two);
	}
	}
	
}
