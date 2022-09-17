package Links_all;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1 
{
public static void main(String[] args) 
{
	System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.flipkart.com/");
	
	List<WebElement> alllinks = driver.findElements(By.xpath("//a"));
	
	for (WebElement links : alllinks) 
	{
		String text = links.getText();
		System.out.println(text);
	}
	
	driver.close();
}
}
