package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class example7_Verification_HardAssert5_assertNull 
{
	//5. assertNull
		@Test
		public void TC1()
		{	
			String result = null;
			
			Assert.assertNull(result, "act result is not null: ");	
		}	

}
