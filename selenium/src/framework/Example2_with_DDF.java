package framework;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Example2_with_DDF 
{
public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException
{
System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
	
	ChromeOptions option=new ChromeOptions();
	option.addArguments("--disable-notifications");
	
     WebDriver driver=new ChromeDriver(option);
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	driver.get("https://kite.zerodha.com/");
	
	FileInputStream file=new FileInputStream("D:\\Class\\Excel\\DDF.xlsx");
	Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
	
	//UN
	String Un = sh.getRow(0).getCell(0).getStringCellValue();
	driver.findElement(By.xpath("//input[@id='userid']")).sendKeys(Un);
	Thread.sleep(2000);
	
	//password
	
	String pwd = sh.getRow(0).getCell(1).getStringCellValue();
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys(pwd);
	
	//login
		driver.findElement(By.xpath("//button[text()='Login ']")).click();
		Thread.sleep(2000);
		
	//pin
	
		String pin = sh.getRow(0).getCell(2).getStringCellValue();
		driver.findElement(By.xpath("//input[@id='pin']")).sendKeys(pin);
		Thread.sleep(2000);
		
		//continue
		driver.findElement(By.xpath("//button[text()='Continue ']")).click();
		
		
		String actuserId = driver.findElement(By.xpath("//span[text()='DV1510']")).getText();
		
		String expuserId="DV1510";
		
		if(actuserId.equals(expuserId))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
	
}

}
