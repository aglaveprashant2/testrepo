package webdriver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example2_close 
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
	
	                 WebDriver driver=new ChromeDriver();
	                 
	                 driver.get("https://msbte.org.in/");
	                 
	                 Thread.sleep(3000);
	                 
	                 driver.close();
	                 
	                  
}
}
