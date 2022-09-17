package project1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC3
{
public static void main(String[] args)
{
	System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://in.godaddy.com/");
	driver.manage().window().maximize();
	
	String url = driver.getCurrentUrl();
	System.out.println(url);
	String expectedurl="https://in.godaddy.com/";
	if(expectedurl.equals(url) )
	{
		System.out.println("Test Pass");
	}
	else
	{
		System.out.println("Test Fail");
	}
	
	String source = driver.getPageSource();
	System.out.println(source);
	driver.close();
}
}
