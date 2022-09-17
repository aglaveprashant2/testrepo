package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class example7_Verification_HardAssert3_assertTrue
{
	//3. assertTrue
	
	@Test
	public void TC1()
	{
		boolean actResult=false;
		
		Assert.assertTrue(actResult, "actual Result is false");
	}
	
}
