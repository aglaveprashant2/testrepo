package Parameteriztion;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class example3_getrowsize 
{
public static void main(String[] args) throws EncryptedDocumentException, IOException
{
	FileInputStream file =new FileInputStream("D:\\Class\\Excel\\123.xlsx");
	
	int lastrw = WorkbookFactory.create(file).getSheet("Sheet1").getLastRowNum();
	
	System.out.println(lastrw);
	
	int size=lastrw+1;
	System.out.println(size);
}
}
