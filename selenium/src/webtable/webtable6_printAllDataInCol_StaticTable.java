package webtable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webtable6_printAllDataInCol_StaticTable 
{
public static void main(String[]args)
{
System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
	
	
    WebDriver driver=new ChromeDriver();
    
    driver.get("file://D:/Class/HTML/webtable.html");
    
    for (int i =1; i <=4; i++) 
    {
	if (i==1)
	{
		String text = driver.findElement(By.xpath("//table[@border='10']//tr["+i+"]/th[3]")).getText();
		System.out.println(text);
	}else
	{
    	String text = driver.findElement(By.xpath("//table[@border='10']//tr["+i+"]/td[3]")).getText();
	System.out.println(text);
	}
}
}
}