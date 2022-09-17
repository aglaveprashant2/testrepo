package Parameteriztion;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class example6_boolean 
{
public static void main(String[] args) throws EncryptedDocumentException, IOException
{
	FileInputStream file=new FileInputStream("D:\\Class\\Excel\\123.xlsx");
	
	boolean value = WorkbookFactory.create(file).getSheet("Sheet1").getRow(3).getCell(3).getBooleanCellValue();
	
	System.out.println(value);
}
}
