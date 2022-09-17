package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class example5_keyword1_InvocationCount
{
	
	@Test(invocationCount=2)
	public void TC1() 
	{
		Reporter.log("running TC1",true);
	}

}
