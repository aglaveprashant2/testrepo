package listbos_practice;

import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class fifth_alphabetical 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/");
		
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		
		Thread.sleep(3000);
		// step1:
				WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
				
				Select s=new Select(month);
				
				List<WebElement> allopt = s.getOptions();
				
				TreeSet<String> tr=new TreeSet<String>();
				
				for(WebElement opt:allopt)
				{
					String text = opt.getText();
					tr.add(text);
				}
				
				for(String text:tr)
				{
					System.out.println(text);
				}
	}
	
				
}


