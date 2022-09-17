package project1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TC4
{
public static void main(String[] args)
{
	System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	String pageTitle = driver.getTitle();
	System.out.println(pageTitle);
	
	WebElement menu = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
	
	Select sl=new Select(menu);
	sl.selectByIndex(2);
	List<WebElement> allopt = sl.getOptions();
	for (WebElement opt : allopt)
	{
		String text = opt.getText();
		System.out.println(text);
	}
	sl.getFirstSelectedOption();
}
}
