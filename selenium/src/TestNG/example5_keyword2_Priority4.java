package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class example5_keyword2_Priority4 
{
	@Test(priority=2)              //0  --duplicate
	public void TC1() 
	{
		Reporter.log("running TC1",true);
	}
	
	@Test(priority=2, invocationCount=5)             //0   --duplicate
	public void TC2() 
	{
		Reporter.log("running TC2",true);
	}
	
	@Test(priority=-1)     //-1
	public void TC3() 
	{
		Reporter.log("running TC3",true);
	}

}
