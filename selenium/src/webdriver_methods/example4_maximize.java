package webdriver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example4_maximize 
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
	
	                 WebDriver driver=new ChromeDriver();
	                 
	                 driver.get("https://msbte.org.in/");
	                 
	                 driver.manage().window().maximize();                 
	                    
}
}
