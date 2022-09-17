package excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class rowsize 
{
public static void main(String[] args) throws EncryptedDocumentException, IOException
{
	FileInputStream file = new FileInputStream ("D:\\Class\\Excel\\prash.xlsx");
	
	  int sh = WorkbookFactory.create(file).getSheet("Sheet1").getLastRowNum();
	 
	int size = sh+1;
	 
	 System.out.println(size);
}
}
