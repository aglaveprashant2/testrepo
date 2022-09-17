package listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listbox8_getAllSelectedOptionInAListbox
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
				s.selectByIndex(1);
				
				List<WebElement> allopt = s.getAllSelectedOptions();
				
				for(WebElement s1:allopt)
				{
					System.out.println(s1.getText());
				}
		
	}
}
