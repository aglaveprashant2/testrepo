package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example1_sendkey 
{
public static void main(String[] args) 
{
	System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver.exe");
	
	          WebDriver driver =new ChromeDriver();	
	          
	          driver.get("https://accounts.google.com/ServiceLogin/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
	          
	          driver.findElement(By.xpath("//input[@type='email']")).sendKeys("9975350872");
}
}
