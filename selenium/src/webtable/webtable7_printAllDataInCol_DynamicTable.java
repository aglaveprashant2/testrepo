package webtable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webtable7_printAllDataInCol_DynamicTable
{
public static void main(String[]args)
{
System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
	
	
    WebDriver driver=new ChromeDriver();
    
    driver.get("file://D:/Class/HTML/webtable.html");
    
     int rowsize = driver.findElements(By.xpath("//table[@border='10']/tbody/tr")).size();
     
     for(int i=1;i<=rowsize;i++)
     {
    	 if(i==1)
    	 {
    		String text = driver.findElement(By.xpath("//table[@border='10']//tr["+i+"]/th[3]")).getText();
    		System.out.println(text);
    	 }
    	 else
    	 {
    		 String text = driver.findElement(By.xpath("//table[@border='10']//tr["+i+"]/td[3]")).getText();
     		System.out.println(text);
    	 }
     }
    
    
}
}
