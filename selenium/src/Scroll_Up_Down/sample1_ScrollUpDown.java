package Scroll_Up_Down;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample1_ScrollUpDown
{
public static void main(String[] args) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("http://demo.guru99.com/test/guru99home/");
	driver.manage().window().maximize();
	
	((JavascriptExecutor)driver).executeScript("window.scrollBy(0,1500)");
	
	Thread.sleep(3000);		
	
	//scroll up--> 2nd parameter -ve value
	((JavascriptExecutor)driver).executeScript("window.scrollBy(0, -500)");
		
	

//	Thread.sleep(3000);
//	// scroll right  --> 1st parameter +ve value
//	((JavascriptExecutor)driver).executeScript("window.scrollBy(300,0)");
//	
//	
//	Thread.sleep(3000);
//	//left  --> 1st parameter -ve value
//	((JavascriptExecutor)driver).executeScript("window.scrollBy(-300,0)");


}
}
