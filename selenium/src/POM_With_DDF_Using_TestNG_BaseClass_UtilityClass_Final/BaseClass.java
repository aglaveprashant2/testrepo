package POM_With_DDF_Using_TestNG_BaseClass_UtilityClass_Final;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseClass 
{

	WebDriver driver;
	
	public void initilizebrowser() throws IOException
	{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
	    driver=new ChromeDriver(options);
		driver.get(Utility.getPropertyFileData("URL"));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
}
