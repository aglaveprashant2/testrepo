package practice1;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class test extends base
{
	
	login1 l1;
	login2 l2;
	login3 l3;
	int TCID;
	
	@BeforeClass
	public void openBrowser() throws Throwable
	{
		Reporter.log("Open browser",true);
		intialiseBrowser();
		
		 l1= new login1(driver);
		 l2= new login2(driver);
		 l3= new login3(driver);
		
	}
	
	@BeforeMethod()
	public void KitelogintoAppliation() throws Throwable
	{
		Reporter.log("login application", true);
		l1.inpKiteusername(utility.getPropertyFileData("UN"));
		l1.inpKitepasword(utility.getPropertyFileData("PWD"));
		l1.clickkitelogin();
		
		
		l2.inpKitepin(utility.getPropertyFileData("Pin"));
		l2.clickKitecontinuebutton();
	}
	
	@Test()
	public void KiteverfyID() throws Throwable
	{
		Reporter.log("test class running", true);
		String actid= l3.verifyKiteuserid();
		String expid= utility.getTestData(0,3);
		Assert.assertEquals(actid, expid," BOTH USRID RESULT DIFFERNENT");
	}
	
	@AfterMethod()
	
	public void Kitelogoutapplication(ITestResult result) throws Throwable
	{
		TCID= 300;
		Reporter.log("Logout the application & capture screenshot", true);
		
		if(result.getStatus()==ITestResult.FAILURE)
		{
			utility.captureScreenShot(driver, TCID);
		}
	}
	
	@AfterClass
	public void KitecloseBrowser()
	{
		Reporter.log("close browser", true);
		
		l1= null;
		l2 =null;
		l3=null;
		driver.close();
	}

}
