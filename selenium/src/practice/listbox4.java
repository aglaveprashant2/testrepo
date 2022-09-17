package practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class listbox4 
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("file:///D:/Class/HTML/multiple_listbox.html");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	
	WebElement mul = driver.findElement(By.xpath("//select[@multiple='true']"));
	
	Select sel=new Select(mul);
	if (sel.isMultiple())
	{
		System.out.println("listbox is multiselectable");
		
	}
	else
	{
		System.out.println("listbox is not multiselectable");
	}
	sel.selectByIndex(0);
	sel.selectByIndex(2);
	Thread.sleep(2000);
	sel.deselectByIndex(2);
	WebElement first = sel.getFirstSelectedOption();
	System.out.println(first.getText());
	
	List<WebElement> all = sel.getAllSelectedOptions();

	for(WebElement selAll:all)
	{
		String text = selAll.getText();
		System.out.println(text);
	}
   driver.close();
}
}
