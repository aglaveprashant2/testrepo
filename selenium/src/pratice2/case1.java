package pratice2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class case1
{
public static void main(String[]args) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver1.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://fast.com/");
	driver.manage().window().maximize();
	Thread.sleep(8000);
	driver.close();
}
}

