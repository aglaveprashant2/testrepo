package POM_with_Pagefactory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KiteLoginTest 
{
public static void main(String[] args) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://kite.zerodha.com/");
	
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	
	KiteLogin1Page login=new KiteLogin1Page(driver);
	login.username();
	login.password();
	login.clickTologin();
	
	KiteLogin2Page login2=new KiteLogin2Page(driver);
	login2.enterpin();
	login2.clicktocnt();
	
	KiteHomePage home=new KiteHomePage(driver);
	home.verify();
	
	Thread.sleep(3000);
	
	driver.close();
	
}
}
