package webtable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webtable4_printAllDataInRow_StaticTable
{
public static void main(String[] args)
{
System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
	
	
    WebDriver driver=new ChromeDriver();
    
    driver.get("file://D:/Class/HTML/webtable.html");
    
    for (int i = 1; i <=3; i++) 
    {
    	//runtime xpath
    	
    	String text = driver.findElement(By.xpath("//table[@border='10']//tr[2]/td["+i+"]")).getText();
    	System.out.print(text+" ");
	}
}
}
