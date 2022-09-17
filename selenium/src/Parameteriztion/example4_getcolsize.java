package Parameteriztion;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class example4_getcolsize 
{
public static void main(String[] args) throws EncryptedDocumentException, IOException 
{
	FileInputStream file=new FileInputStream("D:\\Class\\Excel\\123.xlsx");
	
	int size = WorkbookFactory.create(file).getSheet("Sheet1").getRow(2).getLastCellNum();
	
	System.out.println(size);
}
}
