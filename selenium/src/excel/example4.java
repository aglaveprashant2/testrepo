package excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class example4 
{
public static void main(String[] args) throws EncryptedDocumentException, IOException 
{
FileInputStream file=new FileInputStream("D:\\Class\\Excel\\new.xlsx");
	
	Sheet sh = WorkbookFactory.create(file).getSheet("first");
	
	int lstc = sh.getLastRowNum();
	
	for (int i = 0; i <=lstc; i++) 
	{
		String value = sh.getRow(i).getCell(0).getStringCellValue();
		
		System.out.println(value);
	}
}
}
