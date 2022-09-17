package webdriver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example5_nevigate  
{
public static void main(String[] args) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
	
	               WebDriver driver= new ChromeDriver();
	               
	               driver.navigate().to("https://msbte.org.in/");
	               
	               Thread.sleep(3000);
	               
	               driver.navigate().to("https://facebook.com");
	               
	               Thread.sleep(3000);
	               
	               driver.navigate().back();
	               
	               Thread.sleep(3000);
	               
	               driver.navigate().forward();
	               
	               Thread.sleep(3000);
	               
	               driver.navigate().refresh();
	               
	               
	               
}
}
