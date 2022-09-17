package TestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class example5_keyword5_dependsOnMethod2 
{

	@Test
	public void login1()
	{
		Reporter.log("Login1", true);
	}
	
	@Test
	public void login2()
	{
		Reporter.log("Login2", true);
		Assert.fail();
	}
	
	@Test(dependsOnMethods= {"login1","login2"})
	public void logout()
	{
		Reporter.log("logout",true);
	}
	
}
