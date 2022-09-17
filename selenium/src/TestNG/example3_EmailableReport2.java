package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class example3_EmailableReport2 
{
	@Test
	public void test1()             //test method or test case
	{
		Reporter.log("running Test case1", true);	
	}
	
	@Test
	public void test2()             //test method or test case
	{
		Reporter.log("running Test case2", true);
	}

}
