package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class example10_grouping2 
{
	@Test(groups="orders")
	public void TC7()
	{
		Reporter.log("running TC7",true);
	}

	@Test(groups="orders")
	public void TC8()
	{
		Reporter.log("running TC8",true);
	}
		
	@Test(groups="profile")
	public void TC9()
	{
		Reporter.log("running TC9",true);
	}
	@Test(groups="profile")
	public void TC10()
	{
		Reporter.log("running TC10",true);
	}

	@Test(groups="funds")
	public void TC11()
	{
		Reporter.log("running TC11",true);
	}
		
	@Test(groups="funds")
	public void TC12()
	{
		Reporter.log("running TC12",true);

	}
}
