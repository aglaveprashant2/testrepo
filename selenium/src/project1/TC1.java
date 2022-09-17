package project1;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC1 
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.godaddy.com/");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	Dimension D=new Dimension(100,200);
	driver.manage().window().setSize(D);

}
}
