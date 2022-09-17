package TestNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class example7_Verification_SoftAssert1
{
@Test
	public void TC1()
{
	String actResult="hello";
	String expResult="Hi";
	
	SoftAssert soft= new SoftAssert();
	
	soft.assertEquals(actResult, expResult,"verification 1 failed");
	
	String actResult1="hi";
	String expResult1="hi";
	soft.assertEquals(actResult1, expResult1,"verification 2 failed");
	
	soft.assertAll();
}
}
