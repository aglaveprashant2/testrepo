package webdriver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example1_get
{
public static void main(String[] args) 
{
	System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
	
	
	             WebDriver driver=new ChromeDriver();
	             
	             driver.get("https://msbte.org.in/");
	             
}
}
