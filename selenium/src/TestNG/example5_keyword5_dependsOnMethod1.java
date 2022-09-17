package TestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class example5_keyword5_dependsOnMethod1 
{

	@Test
	public void login()
	{
		Reporter.log("login",true);
		Assert.fail();
	}
	
	@Test(dependsOnMethods= {"login"})
	public void logout()
	{
		Reporter.log("logout", true);
	}
}
