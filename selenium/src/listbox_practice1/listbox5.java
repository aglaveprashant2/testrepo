package listbox_practice1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class listbox5 
{
public static void main(String[]args) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://twitter.com/login");
	
	
	
driver.findElement(By.xpath("(//a[@class='css-4rbku5 css-18t94o4 css-901oao css-16my406 r-1n1174f r-1loqt21 r-poiln3 r-bcqeeo r-qvutc0'])[2]")).click();
Thread.sleep(3000);
	
	WebElement month = driver.findElement(By.xpath("//select[@class='r-30o5oe r-1niwhzg r-17gur6a r-1yadl64 r-18jsvk2 r-1loqt21 r-1qd0xha r-1inkyih r-rjixqe r-crgep1 r-1wzrnnt r-1ny4l3l r-t60dpp r-xd6kpl r-1pn2ns4 r-ttdzmv']"));

	Select sel=new Select(month);
sel.selectByIndex(1);

List<WebElement> opt = sel.getOptions();

for (WebElement element : opt)
{
	String text = element.getText();
	System.out.println(text);
}
}
}
