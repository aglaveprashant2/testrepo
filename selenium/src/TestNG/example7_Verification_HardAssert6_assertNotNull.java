package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class example7_Verification_HardAssert6_assertNotNull 
{
	//6. assertNotNull
			@Test
			public void TC1()
			{	
				String result = "hgdh";
				
				Assert.assertNotNull(result, "act result is null: ");	
			}	
}
