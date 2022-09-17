package POM_With_DDF_Using_TestNG_BaseClass_UtilityClass_Final;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class KiteLoginTest2 extends BaseClass
{
	KiteLogin1Page  login1;
	KiteLogin2Page login2;
	KiteHomePage home;
	int TCID;
	
	@BeforeClass
	public void openbrowser() throws IOException
	{
		initilizebrowser();
		login1=new KiteLogin1Page(driver);
		login2=new KiteLogin2Page(driver);
		home=new KiteHomePage(driver);
	}

	@BeforeMethod
	public void loginToApplicaton() throws EncryptedDocumentException, IOException
	{
		login1.inpKiteLogin1Pageusername(Utility.getPropertyFileData("UN"));
		login1.inpKiteLogin1Pagepassword(Utility.getPropertyFileData("PWD"));
		login1.clickKiteLogin1Pagelogin();
		login2.inpKiteLogin2Pagepin(Utility.getPropertyFileData("Pin"));
		login2.clickKiteLogin2Pagecontinue();
	}
	
	@Test
	public void verifyuserId() throws EncryptedDocumentException, IOException
	{
		TCID=500;
		Reporter.log("verify User ID: ",true);
		String actText = home.getKiteHomepageuserId();
		String expText = Utility.gettestData(0,3);
		Assert.assertEquals(actText,expText,"actual Text & Expected Text are Different");
		
	}
	
	@AfterMethod
	public void logoutFromApplication(ITestResult result) throws IOException
	{
		Reporter.log("logout from application", true);
		
		if(result.getStatus()==ITestResult.FAILURE)
		{
			Utility.capturescreenshot(driver, TCID);
		}
	}
	@AfterClass
	public void closeBrowser()
	{
		login1=null;
		login2=null;
		home=null;
		driver.close();
	}

}


