package listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listbox3_printAllOptionsInListbox_month 
{
public static void main(String[] args) throws InterruptedException 
{
System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://en-gb.facebook.com/");
	
	driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
	  Thread.sleep(5000);
	
	WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
	
	Select s=new Select(month);
	
	List<WebElement> allopt = s.getOptions();
	
	for(WebElement s1:allopt)
	{
		          String text = s1.getText();
		          System.out.println(text);
	}
}
}
