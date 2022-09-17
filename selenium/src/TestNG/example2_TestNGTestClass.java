package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class example2_TestNGTestClass
{

@Test	
public void Testcase1()
{
	System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver1.exe");
	
	 WebDriver driver =new ChromeDriver();
	 
	 driver.get("https://facebook.com/");
}
	
	
}
