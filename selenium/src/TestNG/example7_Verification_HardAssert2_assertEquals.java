package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class example7_Verification_HardAssert2_assertEquals
{
	//2. assertNotEquals
	@Test
	public void TC1()
	{
		String actResult="Hi";
		String expResult="Hi";
		
		Assert.assertNotEquals(actResult, expResult,"both results are same: ");
	}
}
