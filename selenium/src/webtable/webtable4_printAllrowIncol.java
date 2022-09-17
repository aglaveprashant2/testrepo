package webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webtable4_printAllrowIncol
{
public static void main(String[] args) 
{
System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
	
	
    WebDriver driver=new ChromeDriver();
    
    driver.get("file://D:/Class/HTML/webtable.html");
    
    List<WebElement> col = driver.findElements(By.xpath("//table[@border='10']//tr[1]/th"));
    
    for (WebElement element : col)
    {
		String text = element.getText();
		System.out.print(text+" ");
	}
}
}
