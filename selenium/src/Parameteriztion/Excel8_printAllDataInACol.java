package Parameteriztion;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel8_printAllDataInACol 
{
public static void main(String[] args) throws EncryptedDocumentException, IOException 
{
	FileInputStream file=new FileInputStream("D:\\Class\\Excel\\123.xlsx");
	Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
	        int lastrw = sh.getLastRowNum();
	        //System.out.println(lastrw);
	        
	        for (int i = 0; i < lastrw; i++)
	        {
				String value = sh.getRow(i).getCell(0).getStringCellValue();
				System.out.println(value);
			}
}
}
