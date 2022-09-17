package Parameteriztion;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel7_printAllDataInARow 
{
public static void main(String[] args) throws EncryptedDocumentException, IOException 
{
	FileInputStream file=new FileInputStream("D:\\Class\\Excel\\123.xlsx");
	
	Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
	
	       int lastcell = sh.getRow(2).getLastCellNum()-1;
	       
	       for (int i = 0; i <=lastcell; i++) 
	       {
			String value = sh.getRow(2).getCell(i).getStringCellValue();
			System.out.print(value+"  ");
		}
	
}
}
