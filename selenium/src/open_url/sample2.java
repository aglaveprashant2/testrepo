package open_url;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample2 
{
public static void main(String[] args)
{
	System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
	
	  WebDriver driver =new ChromeDriver();
	  driver.get("https://msbte.org.in/");
}
}