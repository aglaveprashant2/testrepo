package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example1_NormalTestClass 
{
public static void main(String[] args)
{
	System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
	
	 WebDriver driver =new ChromeDriver();
	 
	 driver.get("https://facebook.com/");
}
}
