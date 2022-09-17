package webdriver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example7_getTitle {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");

		// System.out.println(driver.getTitle());

		String actTitle = driver.getTitle();
		String expTitle = "Google";
		
		if(actTitle.equals(expTitle))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}

	}
}

