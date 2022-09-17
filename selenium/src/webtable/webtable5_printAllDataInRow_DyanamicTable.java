package webtable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webtable5_printAllDataInRow_DyanamicTable 
{
public static void main(String[] args) 
{
System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
	
	
    WebDriver driver=new ChromeDriver();
    
    driver.get("file://D:/Class/HTML/webtable.html");
    
int colSize = driver.findElements(By.xpath("//table[@border='10']//tr[1]/th")).size();
	
	for(int i=1; i<=colSize; i++) 
	{											//runtime xpath
		//String text = driver.findElement(By.xpath("//@border='10']//tr[2]//td["+i+"]")).getText();
		String text = driver.findElement(By.xpath("//table[@border='10']//tr[1]//th["+i+"]")).getText();
		System.out.print(text+ "  ");
	}

}
}
