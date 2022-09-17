package POM_With_Pagefactory_Using_DDF;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KiteLoginTest1 
{
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException 
	{
		FileInputStream file=new FileInputStream("D:\\Class\\Excel\\DDF.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		
		 WebDriver driver =new ChromeDriver();
		 
		 driver.get("https://kite.zerodha.com/");
		 
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.manage().window().maximize();
		 
		 KiteLogin1Page login=new KiteLogin1Page(driver);
		 login.inpKiteLogin1Pageusername(sh.getRow(0).getCell(0).getStringCellValue());
		 login.inpKiteLogin1Pagepassword(sh.getRow(0).getCell(1).getStringCellValue());
		 login.clickKiteLogin1PageloginBtn();
		 
		 KiteLogin2Page login1=new KiteLogin2Page(driver);
		 login1.inpKiteLogin2Pagepin(sh.getRow(0).getCell(2).getStringCellValue());
		 login1.clickKiteLogin2PagecontinueBtn();
		 
		 KiteHomePage home=new KiteHomePage(driver);
		 home.verifyuserId(sh.getRow(0).getCell(3).getStringCellValue());
		 
		 Thread.sleep(2000);
		 
		 driver.close();
		 
		 
	} 
}
