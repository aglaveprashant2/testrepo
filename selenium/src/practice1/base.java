package practice1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class base 
{
	WebDriver driver;
	public  void intialiseBrowser() throws Throwable
	{

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
	    driver=new ChromeDriver(options);
		driver.get(utility.getPropertyFileData("URL"));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
		

}
