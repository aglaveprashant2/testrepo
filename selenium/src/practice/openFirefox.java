package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class openFirefox 
{
public static void main(String[]args) throws InterruptedException
{
	System.setProperty("webdriver.gecko.driver", "D:\\selenium\\geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://msbte.org.in/");
	Thread.sleep(3000);
	driver.close();
}
}
