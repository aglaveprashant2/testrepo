package practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class listbox1 
{
	public static void main(String[]args)
	{
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		
		Select sel=new Select(month);
		
		List<WebElement> all = sel.getOptions();
		
		int total = all.size();
		System.out.println(total);
		for(WebElement list:all)
		{
			String text = list.getText();
			System.out.println(text);
		}
		
}
}