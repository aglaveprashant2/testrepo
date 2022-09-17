package listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listbox4_getSizeOfListbox_month
{
public static void main(String[] args) throws InterruptedException
{
System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://en-gb.facebook.com/");
	
	driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
	  Thread.sleep(3000);
	
	WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
	
	Select s=new Select(month);
	    
//	       List<WebElement> allopt = s.getOptions();
//	       
//	       int value = allopt.size();
//	       System.out.println(value);

	      int size = s.getOptions().size();
	      System.out.println(size);
}
}
