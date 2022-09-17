package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class example9_disbaleTCExecution2_From_Suite 
{
@Test

public void TC1()
{
	Reporter.log("Running TC1", true);
}

@Test
public void TC2()
{
	Reporter.log("Running TC2", true);
}

@Test
public void TC3()
{
	Reporter.log("Running TC3 ",true);
}
}
