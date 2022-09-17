package webdriver_methods;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example10_getSize
{
public static void main(String[] args) 
{
	System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://msbte.org.in/");
	
	
	
	Dimension d=driver.manage().window().getSize();
	System.out.println(d);
	
}
}
