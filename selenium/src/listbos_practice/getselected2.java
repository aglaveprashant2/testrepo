package listbos_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class getselected2 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("file://D:/Class/HTML/multiple_listbox.html");
		
				Thread.sleep(3000);
		
				WebElement sel = driver.findElement(By.xpath("//select[@multiple='true']"));
				
				Select s=new Select(sel);
				s.selectByIndex(0);
				s.selectByIndex(2);
				Thread.sleep(3000);
				
				s.deselectByIndex(0);
				
				Thread.sleep(3000);
				s.deselectAll();
	}
}
