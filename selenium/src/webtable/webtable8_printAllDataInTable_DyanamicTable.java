package webtable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webtable8_printAllDataInTable_DyanamicTable 
{
public static void main(String[] args) 
{
System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
	
	
    WebDriver driver=new ChromeDriver();
    
    driver.get("file://D:/Class/HTML/webtable.html");
    int rowsize = driver.findElements(By.xpath("//table[@border='10']/tbody/tr")).size();
  //outer for loop for rows
    for (int i = 1; i <=rowsize; i++) 
	{
		int Colsize;
		if(i==1)
		{
			 Colsize = driver.findElements(By.xpath("//table[@border='10']/tbody/tr["+i+"]/th")).size();
		}
		else
		{
			 Colsize = driver.findElements(By.xpath("//table[@border='10']/tbody/tr["+i+"]/td")).size();
		}
		
		
		//inner for loop for cols
		for(int j=1; j<=Colsize; j++)
		{
			if(i==1)
			{
				String text = driver.findElement(By.xpath("//table[@border='10']//tr["+i+"]/th["+j+"]")).getText();
				System.out.print(text+ " ");
			}
			else
			{
				String text = driver.findElement(By.xpath("//table[@border='10']//tr["+i+"]/td["+j+"]")).getText();
				System.out.print(text+ " ");
			}
			
		}
		System.out.println();
	}

}
}
