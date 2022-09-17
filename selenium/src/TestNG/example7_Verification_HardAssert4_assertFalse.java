package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class example7_Verification_HardAssert4_assertFalse
{
	//4. assertFalse
		@Test
		public void TC1()
		{	
			boolean actResult=false;
			
			Assert.assertFalse(actResult, "act result is true: ");	
		}	

}
