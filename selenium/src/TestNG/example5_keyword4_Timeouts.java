package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class example5_keyword4_Timeouts 
{
 
	@Test(timeOut=5000)
	public void TC1() throws InterruptedException
	{
		Reporter.log("running TC1 ", true);
		Thread.sleep(5000);
	}
	
	
}
