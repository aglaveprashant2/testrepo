package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class example11_Parallel1
{
@Test
public void openapp() throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	
	Thread.sleep(3000);
	driver.close();
}
}
