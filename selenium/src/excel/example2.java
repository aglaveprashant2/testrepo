package excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class example2 
{
public static void main(String[] args) throws EncryptedDocumentException, IOException
{
	FileInputStream file=new FileInputStream("D:\\Class\\Excel\\new.xlsx");
	
	String text = WorkbookFactory.create(file).getSheet("first").getRow(0).getCell(1).getStringCellValue();
	
	System.out.println(text);
}
}
