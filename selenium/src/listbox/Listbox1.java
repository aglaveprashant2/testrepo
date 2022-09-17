package listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listbox1
{
public static void main(String[]args) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
	
	WebDriver  driver=new ChromeDriver();
	
	driver.get("https://en-gb.facebook.com/");
	

	// click on Create New Account btn
	
	driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
	
	Thread.sleep(3000);
	//step1: 
	          WebElement month= driver.findElement(By.xpath("//select[@id='month']"));
	         
	          
	//step2:
	          
	          Select s=new Select(month);
	          
	//step3:
	         // s.selectByValue("6");      //String value
	         s.selectByVisibleText("Jun");  //String text
	        //  s.selectByIndex(6);     // int index
}
}
