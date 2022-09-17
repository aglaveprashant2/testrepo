package POM_With_DDF_Using_TestNG;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class KiteLoginTest2 
{

	KiteLogin1Page login1;
	KiteLogin2Page login2;
	KiteHomePage home;
	Sheet sh;
	WebDriver driver;
	
	
	@BeforeClass
	public void openbrowser() throws EncryptedDocumentException, IOException
	{
		FileInputStream file=new FileInputStream("D:\\Class\\Excel\\DDF.xlsx");
		 sh = WorkbookFactory.create(file).getSheet("Sheet1");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver1.exe");
	    driver=new ChromeDriver(options);
		driver.get("https://kite.zerodha.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		login1=new KiteLogin1Page(driver);
		login2=new KiteLogin2Page(driver);
		home=new KiteHomePage(driver);
	}
	
	@BeforeMethod
	public void loginToApp()
	{
		login1.inpKiteLogin1PageUserName(sh.getRow(0).getCell(0).getStringCellValue());
		login1.inpKiteLogin1PagePassword(sh.getRow(0).getCell(1).getStringCellValue());
		login1.clickKiteLogin1Page();
		login2.inpKiteLogin2Page(sh.getRow(0).getCell(2).getStringCellValue());
		login2.clickKiteLogin2Page();
	}
	
	@Test
	public void verifyUserId()
	{
		String actText = home.getKiteHomepageuserId();
		String expText = sh.getRow(0).getCell(3).getStringCellValue();
		
		Assert.assertEquals(actText, expText,"actText and expText are different");
	}
	
	
	@AfterMethod
	public void logoutFromApplication()
	{
		Reporter.log("logout from application", true);
	}
	

	@AfterClass
	public void closebrowser()
	{
		login1=null;
		login2=null;
		home=null;
		driver.close();
	}
	
}

