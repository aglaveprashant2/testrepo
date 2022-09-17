package practice1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class utility 
{
	//Author name= Ganesh
		//this method is use to get test data from excell sheet
		//need to pass two parameter 1.rowindex, colindex
		
		public static String getTestData(int rowIndex, int colIndex) throws IOException
		{
			FileInputStream file= new FileInputStream("C:\\Users\\PRASHANT\\eclipse-workspace\\selenium\\TestData\\DDF.xlsx");
			
			Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
			
			String value= sh.getRow(rowIndex).getCell(colIndex).getStringCellValue();
			
			return value;
		}
		
		//Author name= Gnaesh;
		//this method is use to take screen shot of test case
		//need to pass two parameters driver & TCID
		
		public static void captureScreenShot(WebDriver driver, int TCID) throws IOException
		{
		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest= new File("C:\\Users\\PRASHANT\\eclipse-workspace\\selenium\\Screenshots\\tc"+TCID+".jpg");
		
		FileHandler.copy(src, dest);
		
		}
		
		//Author name= Gnaesh
		//this method is used to getdata from propety file
		///need to pass parameter  key
		
		public static String getPropertyFileData(String Key) throws IOException
		
		{
			Properties obj= new Properties();
			
			FileInputStream file= new FileInputStream("C:\\Users\\PRASHANT\\eclipse-workspace\\selenium\\POM_DDF_Final.properties");
			obj.load(file);
			
			String value= obj.getProperty(Key);
			return value;
		}


}
