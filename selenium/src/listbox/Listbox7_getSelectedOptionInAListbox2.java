package listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listbox7_getSelectedOptionInAListbox2
{
public static void main(String []args) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://en-gb.facebook.com/");
	
	    driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
	    Thread.sleep(3000);
	    
	    WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
	    
	              Select s =new Select(year);
	              
	              String text = s.getFirstSelectedOption().getText();
	              System.out.println(text);
}
}
