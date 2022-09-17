package POM_With_DDF_Using_TestNG_BaseClass_UtilityClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseClass 
{

	WebDriver driver;
	
	public void initilizebrowser()
	{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
	    driver=new ChromeDriver(options);
		driver.get("https://kite.zerodha.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
}
