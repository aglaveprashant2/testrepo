package webdriver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example6_getTitle {
public static void main(String[] args) throws InterruptedException  {
	
System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.google.com/");
	
//	String title = driver.getTitle();
//	System.out.println(title);
	
	
	System.out.println(driver.getTitle());
	
}
}
