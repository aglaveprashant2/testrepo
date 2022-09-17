package POM_With_DDF_Using_TestNG_BaseClass_UtilityClass_Final;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility
{
	     //@Author name: prashant
		// this method is use to get test data from excel sheet
		// need to pass 2 parameters ie. 1: rowIndex ,  2: colindex
	
	public static String gettestData(int rowindex,int colindex) throws EncryptedDocumentException, IOException
	{
		FileInputStream file=new FileInputStream("C:\\Users\\PRASHANT\\eclipse-workspace\\selenium\\TestData\\DDF.xlsx");
		 Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
		 String value = sh.getRow(rowindex).getCell(colindex).getStringCellValue();
		 return value;
	}
	

	//@Author name: Prashant
	// this method is use to capture Screenshot
	// need to pass 2 parameters ie. 1: driver ,  2: TCID

public static void capturescreenshot(WebDriver driver,int TCID) throws IOException
{
	File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File dst=new File("C:\\Users\\PRASHANT\\eclipse-workspace\\selenium\\Screenshots\\TestaseID"+TCID+".jpg");
	FileHandler.copy(src,dst);
}

public static String getPropertyFileData(String key) throws IOException
{
	Properties obj=new Properties();
	FileInputStream file=new FileInputStream("C:\\Users\\PRASHANT\\eclipse-workspace\\selenium\\POM_DDF_Final.properties");
	obj.load(file);
	String value = obj.getProperty(key);
	return value;
}
}
