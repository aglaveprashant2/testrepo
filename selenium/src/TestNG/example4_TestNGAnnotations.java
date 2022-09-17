package TestNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class example4_TestNGAnnotations 
{
@BeforeClass
public void openbrowser()
{
	Reporter.log("open braowser", true);
}

@BeforeMethod
public void login()
{
	Reporter.log("login page", true);
}
@Test
public void TC1()
{
	Reporter.log("running TC1", true);
	
}
@Test
public void TC2()
{
	Reporter.log("running TC2", true);
	
}
@AfterMethod
public void logout()
{
	Reporter.log("logout", true);
}
@AfterClass
public void closebrowser()
{
	Reporter.log("Close Browser", true);
}
}
