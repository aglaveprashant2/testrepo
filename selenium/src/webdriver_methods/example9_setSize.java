package webdriver_methods;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example9_setSize
{
public static void main(String[] args) 
{
	System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://msbte.org.in/");
	
	Dimension d=new Dimension(400, 800);   //w, h
	
	driver.manage().window().setSize(d);
	
}
}
