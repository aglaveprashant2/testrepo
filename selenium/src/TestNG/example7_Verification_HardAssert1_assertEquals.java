package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class example7_Verification_HardAssert1_assertEquals
{
	//1. assertEquals
	
	@Test
	public void TC1()
	{
		String actResult="Hi";
		String expResult="Hello";
		Assert.assertEquals(actResult, expResult);
	}
	
	
}
