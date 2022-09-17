package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class example12_MultibrowserTesting 
{

	@Parameters("browsername")
	@Test
	public void loginToApp(String browsername) throws InterruptedException
	{
		WebDriver driver=null;
		if (browsername.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
			 driver=new ChromeDriver();
		}else if (browsername.equals("firefox")) 
		{
			System.setProperty("webdriver.gecko.driver", "D:\\selenium\\geckodriver.exe");
		 driver=new FirefoxDriver();	
		}
		
		
		driver.manage().window().maximize();
		driver.get("https://msbte.org.in/");
		Thread.sleep(2000);
		driver.close();
		
	}
}
